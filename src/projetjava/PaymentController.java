package projetjava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;


public class PaymentController {
	
	PaymentCardView card_view ;
    VerificationPayment verifiy_view;
    FactureView facture_view;

    static login_signModal lgmodal;
    static FactureModel  FcModel;
    //static CompteModel CpModel;

    
    public PaymentController(PaymentCardView card_view ) {
		super();
		this. card_view =  card_view;
		lgmodal =new login_signModal();
		FcModel =new FactureModel();

	}
    
    public PaymentController(VerificationPayment verifiy_view ) {
		super();
		this. verifiy_view = verifiy_view;

	}
    
    public PaymentController(FactureView facture_view ) {
		super();
		this.facture_view = facture_view;
		FcModel =new FactureModel();

	}
    
   
    
    // retrieve phone number 
    public String retrievePhone() {
    	 
    	return lgmodal.getPhone();
    }
    
    
    public int retrieveToken() {
   	 
    	return lgmodal.getToken();
    }
    
    
    public String retrieveCardNumber() {
      	 
    	return lgmodal.getCard_number();
    }
    
    
    public static String retrieveRefFacture() {
     	 
    	return FactureModel.getNum_facture() ;
    }
    
    
    public static String retrieveDatePyment() {
    	 
    	return FactureModel.getDate_pyment() ;
    }
    
    
    public int retrieveRecuPyment() {
   	 
    	return FactureModel.getRecu_pyment() ;
    }
    
    
    public String retrieveEmail() {
      	 
    	return lgmodal.getEmail();
    }
    
    public Float retrieveSolde() {
     	 
    	return lgmodal.getSolde();
    }
    
    
    public String retrieveFullname() {
     	 
    	return lgmodal.getFullname();
    }
    
    public String retrievePrice() {
    	 
    	return FactureModel.getPrice() ;
    }
    
    public int retrieveId() {
   	 
    	return lgmodal.getId() ;
    }
    
    
    
	 
    public PaymentController() {
		super();
		
	}
    /********************************************
     *  
     * get number by  the  informations of the card
     *
     ***********************************************/ 
    
    public void loadNumber(String card_number,String cvv,String date_exp,String ref) throws ClassNotFoundException, SQLException {
    	if(!lgmodal.chekCardNumber(card_number,cvv,date_exp)){
    		
    		card_view.setErrorMessage("There are No sush Card, Try again");

    	}else if(!FcModel.checkBillReference(ref)) {
    		
    		card_view.setErrorMessage("R�f�rence De facture n'est pas valide !.");

    	}else if(Float.parseFloat(FactureModel.getPrice())>lgmodal.getSolde()) {
    		
    		card_view.setErrorMessage("Votre Solde est inssifusant !");

    	}else {
    		
    		if(lgmodal.checkphone(lgmodal.getId())) {
    			Date date=new Date();
    			// set date of payment
    			FactureModel.setDate_pyment(date.toString());
                //generate the Verification window
    			VerificationPayment view =new VerificationPayment();
                view.setVisible(true);
    		}else {
    			card_view.setErrorMessage("This user does not exist !");
    		}
    		 
    	}

    }
    
    /*************************************
     * 
     * Verify token
     * @throws ClassNotFoundException 
     * 
     *************************************/
    
    public boolean verifyToken(int  token) throws ClassNotFoundException
    {
    	if(lgmodal.getToken()!=token && login_signModal.tokenn!=token )
    	{
    		verifiy_view.setErrorMessage("Invalide Code");	
    		return false;
    		
    	}else {

    		verifiy_view.setSuccesMessage("The Payment has been done succesfully");

    		new FactureView().setVisible(true);
    		return true;
    		    		
    	}
    }
    
    /*************************************************
     * 
     * Verify reference  bill from  data base (api facture)
     * @throws SQLException 
     * @throws ClassNotFoundException 
     *
     ************************************************/
    
    public boolean verifyRefFacture(String ref  ) throws ClassNotFoundException, SQLException
    {
    	if(!FcModel.checkBillReference(ref) )
    	{
             return false;    		
    	}else {
             return true ;    		
    	}
    }
    

	public login_signModal getLgmodal() {
		return lgmodal;
	}

	public void setLgmodal(login_signModal lgmodal) {
		this.lgmodal = lgmodal;
	}
    
   
    
	

}
