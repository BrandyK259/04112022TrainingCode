import java.sql.Date;

public class StudentModel {

	// these correspond to columns in out database
	public int id;
	public String firstName;
	public String lastName;
	public int age;
	public Date date;
	public String favColor;
	
	// This is a constructor that maps the database value to the variables in our code
	
	//parameters need to match the column names and types
	public StudentModel(int id, String firstName, String lastName, int age, Date birthday, String favColor) {
		//this.variable name = databaseColumnName
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.date = birthday;
		this.favColor = favColor;
	}
	
	// Default constructor
	public StudentModel() {
	}

	
	@Override
	public String toString() {
		return "\tSTUDENT #" + id + "\n\n\tfirstName: " + firstName + "\n\tlastName: " + lastName + "\n\tage: " + age
				+ "\n\tfavColor: " + favColor + "\n\tdate: " + date + "\n\n\n";
	}

	
}
