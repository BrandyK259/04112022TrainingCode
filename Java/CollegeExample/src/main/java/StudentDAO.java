import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;

//
public class StudentDAO implements DAOInterface{

	// This creates an instance of out getConnection() method from the Connection Manager
	private Connection conn = ConnectionManager.getConnection();
	
	// This method returns all students
	public ArrayList<StudentModel> getAllStudents(){
		
		try {
			
			// This creates a new statement called statement that uses a connection to the DB
			Statement statement = conn.createStatement();
			
			// Capitalization of the query terms may or may not be required SELECT vs seLecT
			ResultSet rs = statement.executeQuery("SELECT * FROM student");
			
			// This is our arrayList for storing our results
			ArrayList<StudentModel> students = new ArrayList<StudentModel>();
			
			// This loop runs so long as there is another row in rs
			while(rs.next()) {
				
				// Assign the variable names used in the StudentModel class to the the data retrieved from the result set
				// Make sure to use the column name in the database as the string for the result set search
				
				// [datatype] [name] = rs.get[datatype] ("[databaseColumnName]")
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				int age = rs.getInt("age");
				Date date = rs.getDate("birthday");
				String favColor = rs.getString("fav_color");
				
				// This adds each new student to our student list (array)
				students.add(new StudentModel(id, firstName,lastName, age, date, favColor));
			}
			
			return students;
		}
		catch(SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	// This method will add a new student to the database
	/*public void addStudent(StudentModel newStudent) {
		
		try {
			// This is our query to be executed
			String query = "INSERT into Student (first_name, last_name, age, birthday, fav_color) VALUES (?, ?, ?, ?, ?)";
			
			//Create a prepared statement to run our query through our connection
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			// Set the values for the placeholders in the query
			pstmt.setString(1, newStudent.firstName);
			pstmt.setString(2, newStudent.lastName);
			pstmt.setInt(3, newStudent.age);
			pstmt.setDate(4, newStudent.date);
			pstmt.setString(5, newStudent.favColor);
			
			// .execute is used for non-select queries where a return is not expected
			// examples. = update, insert, delete
			pstmt.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}*/	
		// This method adds a new student to the database using callable statement
		public void addStudent (StudentModel newStudent) {
			try {
				CallableStatement cs = conn.prepareCall("{call insertStudent(?,?,?,?,?)}");
				
				cs.setString(1, newStudent.firstName);
				cs.setString(2, newStudent.lastName);
				cs.setInt(3, newStudent.age);
				cs.setDate(4, newStudent.date);
				cs.setString(5, newStudent.favColor);
				
				cs.execute();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	
}

