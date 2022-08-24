import java.io.BufferedReader;                                                                                                                       
import java.io.IOException;                                                                                                                          
import java.io.InputStreamReader;
import train.manage.Train;
import train.manage.TrainDao;

public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("welcome to Train Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		while(true)  
		{
			  System.out.println("PRESS 1 TO  ADD ticket");                                                                                              
			  System.out.println("PRESS 2 TO  DELETE ticket");                                                                                           
			  System.out.println("PRESS 3 TO  DISPLAY ticket");                                                                                          
			  System.out.println("PRESS 4 TO  EXIT App");                                                                                                
			  int c=Integer.parseInt(br.readLine()) ; 
		
			  if(c==1)                                                                                                                                   
			    {                                                                                                                                        
			            //add ticket...                                                                                                                  
	            System.out.println("Enter train name : ");                                                                                               
	            String name=br.readLine();                                                                                                               
		                                                                                                                                                 
	            System.out.println("Enter train time : ");                                                                                               
			    String time=br.readLine();                                                                                                               
			                                                                                                                                             
			    System.out.println("Enter train city : ");                                                                                               
		        String city=br.readLine();                                                                                                               
			                                                                                                                                             
		        //create train object to store train                                                                                                     
		        Train st =  new Train(name, time, city);
		       boolean answer = TrainDao.insertTrainToDB(st);
		        if (answer)
		        {
		        	System.out.println("successfully added...");
		        }else 
		        {
		        	System.out.println("somthing went wrong try again...");
		        }
		                                                                                                                                                 
			    System.out.println(st);
			    
			    } else if (c==2)                                                                                                                         
		        {                                                                                                                                        
		               //delete ticket..                                                                                                                 
	            }else if(c==3)                                                                                                                           
	            {                                                                                                                                        
		               // display ticket                                                                                                                 
	            } else if(c==4)                                                                                                                          
	            {                                                                                                                                        
		           // exit                                                                                                                               
		            break;                                                                                                                               
		         }else{                                                                                                                                  
		        	                                                                                                                                     
		        }                                                                                                                                        
			}                                                                                                                                            
		      System.out.println("Thank you for using my App");                                                                                          
		}                                                                                                                                                
	                                                                                                                                                     
	}                                                                                                                                                    
	                                                                                                                                                     
	                                                                                    
	


