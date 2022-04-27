package dao;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO implements DAOInterface<User, String>{
    /* The 'Algorithm'
     *
     * 1. Create PreparedStatement
     * 2. Set the ?s for the PreparedStatement using inputs
     * 3. Execute query and , if relevant, get ResultSet
     * 4. If I have one, process ResultSet
     */

    @Override
    public void create(User element) {
        Connection connection = ConnectionManager.getConnection();
        try{
            //Step 1:
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO users " +
                        "VALUES (?,?,?,?,?)");

            //Step 2:
            statement.setString(1, element.username);
            statement.setString(2, element.password);
            statement.setString(3, element.firstName);
            statement.setString(4, element.lastName);
            statement.setString(5, element.birthMonth);

            //Step 3:
            statement.execute();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public User get(String id) {
        Connection connection = ConnectionManager.getConnection();
        try {
            //Step 1:
            PreparedStatement statement = connection.prepareStatement(
                        "SELECT * " +
                            "FROM users " +
                            "WHERE username = ?");

            //Step 2:
            statement.setString(1, id);

            //Step 3:
            // .executeQuery expects a result set, while .execute doesn't expect any result
            ResultSet rs = statement.executeQuery();

            //Step 4:
            if (rs.next()){
                User u = new User();
                u.username = id; // rs.getString("ussername"); would be equivalent code here
                u.password = rs.getString("password");
                u.firstName = rs.getString("first_name");
                u.lastName = rs.getString("last_name");
                u.birthMonth = rs.getString("birth_month");

                return u;
            }

        }catch(Exception e){
            e.printStackTrace();
        }
            return null;
    }

    @Override
    public void update(User element) {
        Connection connection = ConnectionManager.getConnection();

        try{
            //Step 1:

            // Don't need to set the username as it is the primary key and will not change
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE users " +
                        "SET password = ?, first_name = ?, last_name = ?, birth_month = ? " +
                        "WHERE username = ?");

            //Step 2:
            statement.setString(1, element.password);
            statement.setString(2, element.firstName);
            statement.setString(3, element.lastName);
            statement.setString(4, element.birthMonth);
            statement.setString(5, element.username);

            //Step 3:
            statement.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(User element) {
        Connection connection = ConnectionManager.getConnection();

        try {
            //Step 1:
            PreparedStatement statement = connection.prepareStatement(
                        "DELETE FROM users " +
                            "WHERE username = ?");

            //Step 2:
            statement.setString(1, element.username);

            //Step 3:
            statement.execute();

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
