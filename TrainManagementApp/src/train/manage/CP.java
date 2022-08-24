package train.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	
	static Connection con;
	
    public static Connection createC() {
    try {
    	
    	//load the driver
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	//create the connection
    	String user = "root";
    	String password = "Rosh0139*";
    	String url = "jdbc:mysql://localhost:3306/manage_train_booking";
    	
    	
    	
    	con=DriverManager.getConnection(url, user, password);
    	
    } catch (Exception e) {
    	//TODO: handle exception
    	e.printStackTrace();
    	
    }
    
    return con;
    
}

}
