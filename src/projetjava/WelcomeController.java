
package projetjava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Fawzi
 */
public class WelcomeController implements ActionListener  {

    WelcomeVue welcomeVue = new WelcomeVue();
    login_signVue lgv = new login_signVue();
    PaymentCardView payCardvue = new PaymentCardView();


    public WelcomeController(WelcomeVue welcomeVue, login_signVue lgv,  PaymentCardView payCardvue) {
        this.welcomeVue = welcomeVue;
        this.lgv = lgv;
        this.payCardvue = payCardvue;
    }

    public WelcomeVue getWelcomeVue() {
        return welcomeVue;
    }

    public void setWelcomeVue(WelcomeVue welcomeVue) {
        this.welcomeVue = welcomeVue;
    }

    public  PaymentCardView getPayCard() {
        return payCardvue;
    }

    public void setPayCard( PaymentCardView payCard) {
        this.payCardvue = payCard;
    }

  public void AfficheCartPage(){

    payCardvue.turn_on();
    welcomeVue.turn_off();
  }
    public void afficheLogin(){
        lgv.turn_on();
        welcomeVue.turn_off();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if(e.getActionCommand().equals("Votre Compte ")){
            afficheLogin();
        }
        else{
            AfficheCartPage();
        }

    }
}