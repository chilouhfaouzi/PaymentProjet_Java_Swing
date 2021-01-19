package projetjava;

import java.sql.*;
import java.util.Random;

public class login_signModal {
    private int id;
    private String fullname;
    private String email;
    private String password;
    private String phone;
    private String cin;
    private String datenaissance;
    private String adresse;
    private int token=0;
    // card number
    private String card_number;


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
                        String id = res.getString("id");
                        my_Session.setId(id);
                        String email = res.getString("Email");
                        my_Session.setEmail(email);

                        System.out.println("id: " + id + " , Email: " + my_Session.getEmail() + ", " + count);
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
                 setEmail(rs.getString("Email"));
                 setFullname(rs.getString("fullname"));
                 // set TOKEN WITH RANDOM VALUE
                 token=new Random().nextInt(10001);
                 
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
    
   
    
}
