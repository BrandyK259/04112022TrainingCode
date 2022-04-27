import java.util.ArrayList;


public interface DAOInterface {

	public ArrayList<StudentModel> getAllStudents();
	
	public void addStudent(StudentModel newStudent);
	
	//public void addClass(ClassModel newClass);
}
