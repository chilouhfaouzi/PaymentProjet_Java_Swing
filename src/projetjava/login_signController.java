package projetjava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class login_signController implements ActionListener {
    login_signVue lgvue;
    login_signModal lgmodal;

    public login_signController(login_signVue lgvue, login_signModal lgmodal) {
        this.lgvue = lgvue;
        this.lgmodal = lgmodal;
    }

    public login_signVue getLgvue() {
        return lgvue;
    }

    public void setLgvue(login_signVue lgvue) {
        this.lgvue = lgvue;
    }

    public login_signModal getLgmodal() {
        return lgmodal;
    }

    public void setLgmodal(login_signModal lgmodal) {
        this.lgmodal = lgmodal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Login")) {
            Boolean test = false;
            try {
                test = lgmodal.verifyLogin(lgvue.getUsername().getText(), lgvue.getPassword().getText());
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            if (test) {
                testFrame testFr = new testFrame();
                testFr.my_run();
                lgvue.turn_off();
            } else {
                JOptionPane.showMessageDialog(getLgvue(),"Oopps ! Email ou mot de passe non valide !");

                System.out.println("cant");
            }
        } else {
            boolean testRegister = false;
            lgmodal.setFullname(lgvue.getNom().getText());
            lgmodal.setCin(lgvue.getCin().getText());
            lgmodal.setEmail(lgvue.getEmail().getText());
            lgmodal.setPassword(lgvue.getRe_password().getText());
            lgmodal.setPhone(lgvue.getPhone().getText());
            lgmodal.setDatenaissance(lgvue.getDateNaissance().getText());
            lgmodal.setAdresse(lgvue.getAdresse().getText());
            try {
                testRegister = lgmodal.registeruser();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }
            if (testRegister ) {
                testFrame testFr = new testFrame();

                testFr.my_run();
                lgvue.turn_off();
            } else {
                JOptionPane.showMessageDialog(getLgvue(),"Oopps! Veuillez remplir tous les champs avec des valeurs valides !");
                System.out.println("cant");
            }
        }
    }
}

