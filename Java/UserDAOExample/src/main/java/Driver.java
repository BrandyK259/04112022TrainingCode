import com.revature.dao.UserDAO;
import com.revature.dao.UserDAOImpl;
import com.revature.model.User;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDAO userDao = new UserDAOImpl();
		User u = userDao.getUser("Brandy");
		System.out.println("User " + u.username + ":");
		System.out.println("First Name: " + u.firstName);
		System.out.println("Last Name: " + u.lastName);
		System.out.println("Birthday: " + u.birthMonth);
		
	}

}
