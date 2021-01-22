package projetjava;

import java.sql.*;
import java.util.Random;

public class login_signModal {
    private int id;
    private String fullname;
    private String email;
    private String password;
    private String phone = null;
    public static String phoneStatic;
	private String cin;
    private String datenaissance;
    private String adresse;
    private  int token=0;
    public static  int tokenn=0;
    // card number
    private String card_number;
    private float solde ;

    public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}
    public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public  int getToken() {
		return token;
	}

	public  void setToken(int token) {
		this.token = token;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public Boolean verifyLogin(String login, String pass) throws SQLException, ClassNotFoundException {
        Connection con = ConnectionDB.my_connect();

        System.out.println("good:" + pass);

        String string_sql2 = "SELECT * FROM users WHERE email =? AND password =? LIMIT 1;";

        try (Statement statm = con.createStatement()) {
            PreparedStatement verlogin =
                    con.prepareStatement(string_sql2);
            verlogin.setString(1, login);
            verlogin.setString(2, pass);
            try (ResultSet res = verlogin.executeQuery()) {
                boolean b = res.last();
                int count = res.getRow();
                res.beforeFirst();
                if (count > 0) {
                    my_Session.setState(1);
                    while (res.next()) {
                        int id = res.getInt("id");
                        my_Session.setId(id);
                        String email = res.getString("Email");
                        my_Session.setEmail(email);
                        my_Session.fullname = res.getString("fullname");
                        setPhone(res.getString("phone"));
                        phoneStatic = res.getString("phone");
                        my_Session.phoneStatic =  res.getString("phone");

                    }
                    return true;

                } else {
                    System.out.println("No user found !");
                    return false;
                }
            }
        }
        //   System.out.println("SELECT * FROM users WHERE (username =? OR email=? ) AND password =? LIMIT 1");
    }

    public boolean registeruser() throws SQLException, ClassNotFoundException {
        Connection con = ConnectionDB.my_connect();
        String registerQuery = "INSERT INTO `users` ( `cin`, `fullname`, `Email`, `Password`, `phone`, " +
                "`adresse`, `datenaissance`) VALUES (? , ?, " +
                "?, ?, ?, ?, ?);  ";
        PreparedStatement registerUser =
                con.prepareStatement(registerQuery);
        registerUser.setString(1, cin);
        registerUser.setString(2, fullname);
        registerUser.setString(3, email);
        registerUser.setString(4, password);
        registerUser.setString(5, phone);
        registerUser.setString(6, adresse);
        registerUser.setString(7, datenaissance);
        int row = registerUser.executeUpdate();
        if (row > 0) {
            my_Session.setEmail(email);
            my_Session.setState(1);
            my_Session.setId(this.id);
            my_Session.fullname = fullname;
            phoneStatic = phone;
            my_Session.phoneStatic = phone;
            return true;
        } else {
            System.out.println("No user Added !");
            return false;
        }
    }
    
    
    /********************************
     *  get Number Phone FROM 
     *
     *@author Amine NAFID
     ********************************/

     public boolean  checkphone(int id) throws ClassNotFoundException
     {   // select from data base
    	 
    	 try(Connection con = ConnectionDB.my_connect()) {
         	
             PreparedStatement sql = con.prepareStatement("SELECT * FROM users WHERE id = ? ");
             sql.setInt(1,id);
            
             ResultSet rs = sql.executeQuery();
             if(rs.next()){
            	 
                 setPhone(rs.getString("phone"));
                 System.out.println(this.phone);
                 setEmail(rs.getString("Email"));
                 setFullname(rs.getString("fullname"));
                 setId(rs.getInt("id"));
                 // set TOKEN WITH RANDOM VALUE
                 token=new Random().nextInt(9999) +1000;
                 
                 System.out.print(token);
                 
                 return true;
             }
             else{
            	 System.out.println(id);
                 return false;
             }
         } catch (SQLException e) {
         	 System.out.println("An error occurred. Maybe user/password is invalid");
              e.printStackTrace();
         }
        
		return false;
    	 
     }
     public static void genereToken(){
         tokenn=new Random().nextInt(9999) +1000;

         System.out.print(tokenn);
     }
     /********************************* 
      * check  card's informations .
      * 
      * @author Amine NAFID
      * *******************************/
     public boolean  chekCardNumber(String card_num,String cvv,String date_exp) throws ClassNotFoundException, SQLException
     {   
    	 
    	 try {
    		 // Set Connection
    		 Connection con = ConnectionDB.my_connect();
             PreparedStatement sql = con.prepareStatement("SELECT * FROM card WHERE card_number = ? AND cvv=? AND date_expiration=?");
             sql.setString(1,card_num);
             sql.setString(2,cvv);
             sql.setString(3,date_exp);

             ResultSet rs = sql.executeQuery();
             if(rs.next()){
            	 // retrieve id user 
                 id = rs.getInt("user_id");
                 card_number =rs.getString("card_number");
                 solde=rs.getFloat("solde");

                 return true;
             }
             else{

                 return false;
             }
         } catch (SQLException e) {
         	 System.out.println("An error occurred. Maybe user/password is invalid");
              e.printStackTrace();
         }
        
		return false;
    	 
    	 
     }
     
     /********************************* 
      * update  the sold
      * 
      * @author Amine NAFID
      * *******************************/
     
     /********************************* 
      * update  the sold
      * version 1.0
      * @author Amine NAFID
      * *******************************/
     
     public boolean updateSolde(int id_user,float price_fact) throws ClassNotFoundException
 	{
 		try(Connection con = ConnectionDB.my_connect()) {
 			
          	System.out.print("connecting succefully");
             PreparedStatement sql = con.prepareStatement("UPDATE card set solde = ? WHERE user_id = ? ");
             sql.setFloat(1,solde-price_fact);
             sql.setInt(2,id_user);
            
            if( sql.executeUpdate()>0)
            {   
         	   System.out.print("updating succefully");

         	   return true;
            }else {
             return false;}
             
            
         } catch (SQLException e) {
         	 System.out.println("An error occurred. Maybe user/password is invalid");
              e.printStackTrace();
         }
        
 		return false;
 	}
     
     /********************************* 
      * update  the sold
      * version 2.0
      * @author Amine NAFID
      * *******************************/
     
     public boolean updateSoldeAccount(int id_user,float price_fact) throws ClassNotFoundException
 	{
 		try(Connection con = ConnectionDB.my_connect()) {
 			
             PreparedStatement sql = con.prepareStatement("UPDATE compte set Solde = ? WHERE id_user = ? ");
             sql.setFloat(1,solde-price_fact);
             sql.setInt(2,id_user);
            
            if( sql.executeUpdate()>0)
            {   
         	   System.out.print("updating succefully");

         	   return true;
            }else {
             return false;}
             
            
         } catch (SQLException e) {
         	 System.out.println("An error occurred. Maybe user/password is invalid");
              e.printStackTrace();
         }
        
 		return false;
 	}
     
     
     
     public boolean checkSolde(float price) throws ClassNotFoundException {
    	 
    	 try(Connection con = ConnectionDB.my_connect()) {
  			
              PreparedStatement sql = con.prepareStatement("SELECT * FROM compte where id_user =?");
              new my_Session();
              sql.setInt(1,my_Session.getId());//Integer.parseInt(my_Session.getId())
              ResultSet rs = sql.executeQuery();
              if(rs.next()){
                 
                  solde=rs.getFloat("Solde");

              }
             if(price>solde)
             {
            	 return false;
             }else {
   			  token=new Random().nextInt(9999)  +1000;
   			  System.out.println("tkon :"+token);

            	 return true;
             }
              
             
          } catch (SQLException e) {
          	 System.out.println("An error occurred. Maybe user/password is invalid");
               e.printStackTrace();
          }
    	 
    	 return false;
    	 
     }
    
   
    
}
