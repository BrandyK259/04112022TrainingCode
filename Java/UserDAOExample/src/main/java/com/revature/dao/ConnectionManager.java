package com.revature.dao;
import java.sql.Connection;
import java.sql.DriverManager;

// this is the class where I will make a connection to the database
public class ConnectionManager {

	// lowercase connection is the NAME, Connection with capital C
	// is what it IS aka the data type
	private static Connection connection;
	
	// connection string format is httpprotocol:sqltype://serverURL:portNumber/databaseName
	// for postgresql we use port 5432
	// this is our connection data
	private static String 	connectionString = "jdbc:postgresql://salt.db.elephantsql.com:5432/bheufjfa",
			username = "bheufjfa",
			password = "eW0jYYdl-lW0hZ22v3Rrc2I1BYYCtDuI";
	
	// Make connection to database
	// *my note* Connection is the return type
	public static Connection getConnection() {
		
		// This will not compile without being in a try/catch block
		try {
			
			if(connection == null || connection.isClosed()) {
				
				// This ensures that the driver class is loaded before we try to use it
				// It will fail without it, it needs the maven dependency added in the pom.xml file
				Class.forName("org.postgresql.Driver");
				
				 // This says to use the DriverManager to make sure there is a suitable
				 //   driver to make the connection string work
				
				 // This will call the postgre driver to set up the output/intput io stream to pass 
				 //   data between the application and the database
				connection = DriverManager.getConnection(connectionString, username, password);
			}
			return connection;
		}
		catch(Exception e){
			return null;
		}
	}
}
