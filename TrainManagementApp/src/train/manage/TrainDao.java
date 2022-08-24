package train.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TrainDao {
	
	public static boolean insertTrainToDB(Train st)
	{
		boolean f= false;
		
		try {
			
			//jdbc code....
			Connection con= CP.createC();
	        String q= "insert into train(tid, tname, ttime, tcity) values(? ,? ,?, ?)";
	        //preparedStatement
	        PreparedStatement pstmt= con.prepareStatement(q);
	        //set the value of parameter
	        pstmt.setInt(1, st.getTrainId());
	        pstmt.setString(2, st.getTrainname());
	        pstmt.setString(3, st.getTraintime());
	        pstmt.setString(4, st.getTraincity());
	        
	       //execute 
	      pstmt.executeUpdate();
	      f=true;
	      
	      
	       	} catch (Exception e) {
			// TODO: Handle exception
			e.printStackTrace();
			
		}
		return f;
		
		
		}

}

