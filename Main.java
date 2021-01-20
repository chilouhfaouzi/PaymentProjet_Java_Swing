/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 * @author Fawzi
 */
public class Main {


    public static void main(String[] args) {
        
        WelcomeVue welcVue = new WelcomeVue();
        login_signVue lg = new login_signVue();
        PaymentCardView paycard = new  PaymentCardView();
        welcVue.turn_on();
        WelcomeController welcCont = new WelcomeController(welcVue,lg,paycard);
        welcVue.getBank_btn().addActionListener(welcCont);
        welcVue.getCart_btn().addActionListener(welcCont);
        login_signModal lgm = new login_signModal();
        login_signController lgc = new login_signController(lg, lgm);
        lg.getLogin_b().addActionListener(lgc);
        lg.getSign_btn().addActionListener(lgc);
        
        
    }

}
