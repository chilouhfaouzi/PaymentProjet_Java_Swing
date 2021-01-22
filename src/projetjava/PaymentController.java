package projetjava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;


public class PaymentController {
	
	PaymentCardView card_view ;
    VerificationPayment verifiy_view;
    FactureView facture_view;
    recharge_Mobile recharge;
    eau_electricite eau_elec;
    my_assurance assurance;
    autre_factures autrefact;



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
    
    public PaymentController(recharge_Mobile recharge) {
		super();
	
		FcModel =new FactureModel();
		this.recharge= recharge;
		lgmodal=new login_signModal();
		new my_Session();
		lgmodal.setPhone(my_Session.getPhone());
		
	}
    
    public PaymentController( eau_electricite eau_elec) {
		super();
	
		FcModel =new FactureModel();
		this.eau_elec= eau_elec;
		lgmodal=new login_signModal();
		new my_Session();
		lgmodal.setPhone(my_Session.getPhone());
		
	}
    public PaymentController( autre_factures autre_fact) {
		super();
	
		FcModel =new FactureModel();
		this.autrefact= autre_fact;
		lgmodal=new login_signModal();
		new my_Session();
		lgmodal.setPhone(my_Session.getPhone());
		
	}
    
    public PaymentController( my_assurance assurance) {
		super();
	
		FcModel =new FactureModel();
		this.assurance= assurance;
		lgmodal=new login_signModal();
		new my_Session();
		lgmodal.setPhone(my_Session.getPhone());
		
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
    		
    		card_view.setErrorMessage("Référence De facture n'est pas valide !.");

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
    		new my_Session();
			if(my_Session.getState()==1)
    		{
	    		lgmodal.updateSoldeAccount(my_Session.getId(),Float.parseFloat(FactureModel.getPrice()));

    		}else
    		lgmodal.updateSolde(lgmodal.getId(), Float.parseFloat(FactureModel.getPrice()));

    		    		
    		if(my_Session.recharge==0){
				new FactureView().setVisible(true);
				
			}
    		else{
    			new RechargeFactureView().setVisible(true);
			}
    		return true;
    	}
    	
    }
    
    /********************************************
     *  
     * method payRechrge
     * @throws Exception 
     * version 1.0
     ***********************************************/ 
    
    public void payerRecharge(float price) throws Exception {
    	 if(!lgmodal.checkSolde(price)) {
    		
    		recharge.setErrorMessage("Votre Solde est inssifusant !");

    	}else {

    			Date date=new Date();
    			// set date of payment
    			FactureModel.setDate_pyment(date.toString());
    			FactureModel.setPrice(""+price);;

                //generate the Verification window
    			VerificationPayment view =new VerificationPayment();
                view.setVisible(true);
    	}

    }
    
    /********************************************
     *  
     * method payer facture eau et electricité
     * @throws Exception 
     * version 1.0
     ***********************************************/ 
    
    public void payerEauElectricite(String ref) throws Exception {
          if(!FcModel.checkBillReference(ref)) {
    		
        	  if(this.eau_elec!=null) {
      			
          		eau_elec.setErrorMessage("Cette Reference n'existe pas!.");}
          		else if(this.assurance!=null) {
          			System.out.print("grrrrrrrr");
              		assurance.setErrorMessage("Cette Reference n'existe pas!");
              		}
          		else
              		autrefact.setErrorMessage("Cette Reference n'existe pas!");

    	}else if(!lgmodal.checkSolde(Float.parseFloat(FactureModel.getPrice()))) {
    		
    		eau_elec.setErrorMessage("Votre Solde est inssifusant !");

    	}else {

    			Date date=new Date();
    			// set date of payment
    			FactureModel.setDate_pyment(date.toString());

                //generate the Verification window
    			VerificationPayment view =new VerificationPayment();
                view.setVisible(true);
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
