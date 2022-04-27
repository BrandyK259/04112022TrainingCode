import java.util.ArrayList;
import java.sql.Date;

public class Driver {

	public static void main(String[] args) {

		// Create an instance of the DAO so that we may call its methods
		StudentDAO studentDAO = new StudentDAO();
		
		//Create an empty arrayList to store all our students from our getAllStudents method which returns an arrayList
		ArrayList<StudentModel> students = studentDAO.getAllStudents();
		
		// Each StudentModel in the array will print out their toString()
		for(StudentModel i : students) {
			System.out.println(i);
		}
		
		// This line of code added a row to our student table
		//studentDAO.addStudent(new StudentModel(0,"Albus", "Dumbledore", 150, Date.valueOf("1992-12-14"), "Green"));
		studentDAO.addStudent(new StudentModel(0,"Ginny", "Weasley", 22, Date.valueOf("1999-12-14"), "Purple"));
	}

}
