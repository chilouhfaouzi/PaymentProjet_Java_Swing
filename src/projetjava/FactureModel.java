package projetjava;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FactureModel {
	
	private static String num_facture;
	private static String date_pyment;
	static private int   Recu_pyment=756117666;
	private static String price;
	
	 /********************************* 
     * check  reference facture informations .
     * 
     * @author Amine NAFID
     * *******************************/
    /**
     * @param ref
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public boolean  checkBillReference(String ref) throws ClassNotFoundException, SQLException
    {   
	   	 try {
	   		 // Set Connection
	   		 Connection con = ConnectionDB.my_connect();
	            PreparedStatement sql = con.prepareStatement("SELECT * FROM api_factures WHERE Ref_fact = ? ");
	           
	            sql.setString(1,ref);
	            ResultSet rs = sql.executeQuery();
	            
	            
	            if(rs.next()){
	            	setNum_facture( rs.getString("Ref_fact"));
	            	setPrice(rs.getString("prix"));
	            	// set status
	
	                return true;
	            }
	            else{
	
	                return false;
	            }
	        } catch (SQLException e) {
	        	 System.out.println("An error occurred. Maybe user/password is invalid");
	             e.printStackTrace();
	        }
	       
		return true;
   	 
   	 
    }
	
	
	
	public static String getNum_facture() {
		return num_facture;
	}


	public static void setNum_facture(String num_facture) {
		FactureModel.num_facture = num_facture;
	}


	public static String getDate_pyment() {
		return date_pyment;
	}
	
	
	public static void setDate_pyment(String date_pyment) {
		FactureModel.date_pyment = date_pyment;
	}
	
	
	public static int getRecu_pyment() {
		return Recu_pyment;
	}
	
	
	public static void setRecu_pyment(int recu_pyment) {
		Recu_pyment = recu_pyment;
	}


	public static String getPrice() {
		return price;
	}


	public static void setPrice(String price) {
		FactureModel.price = price;
	}
	
	
	
	
	
	
	
	

}
