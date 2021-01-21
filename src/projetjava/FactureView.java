package projetjava;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.awt.event.ActionEvent;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amine
 */
public class FactureView extends javax.swing.JFrame {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PaymentController controller =new PaymentController(this);
    /**
     * Creates new form factureInformations
     */
    public FactureView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        code_autori = new javax.swing.JLabel();
        code_autorisation = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        code_autorisation1 = new javax.swing.JLabel();
        code_autorisation2 = new javax.swing.JLabel();
        method_pyment = new javax.swing.JLabel();
        carte_payment = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        code_autorisation3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        code_autorisation4 = new javax.swing.JLabel();
        code_autorisation5 = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        method_pyment3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        num_pay = new javax.swing.JLabel();
        code_autorisation6 = new javax.swing.JLabel();
        num_facture = new javax.swing.JLabel();
        code_autorisation8 = new javax.swing.JLabel();
        method_pyment5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recu De Peiment", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(51, 153, 255))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("    DETAIL DE PAIEMENT");
        jLabel5.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText(" Date De Paiement :");

        code_autori.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        if(controller.retrieveToken()!=0){
            code_autori.setText(""+controller.retrieveToken());

        }else{
            code_autori.setText(""+login_signModal.tokenn);
        }

        code_autorisation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        code_autorisation.setText(" Code d'autorisation :");

        date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        date.setText(""+PaymentController.retrieveDatePyment());

        code_autorisation1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        code_autorisation1.setText(" M�thode De Paiement :");

        code_autorisation2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        code_autorisation2.setText(" N° de Carte Paeiment :");
        /*
         * Method paiement
         ********************/
        method_pyment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        method_pyment.setText("VISA");
        /*
         * N� de Carte Paeiment :
         ********************/
        carte_payment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        carte_payment.setText(""+controller.retrieveCardNumber());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        				.addComponent(code_autorisation, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        				.addComponent(code_autorisation1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        				.addComponent(code_autorisation2, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(code_autori, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        				.addComponent(method_pyment, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        				.addComponent(carte_payment, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        				.addComponent(date, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(date, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(code_autorisation, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(code_autori, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(method_pyment, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(code_autorisation1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(carte_payment, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(code_autorisation2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel4.setLayout(jPanel4Layout);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("  INFORMATION DU CLIENT");
        jLabel6.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(" Nom :");

        email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        if(controller.retrieveEmail()!=null){
            email.setText(controller.retrieveEmail());
        }else{
            email.setText(my_Session.Email);
        }


        code_autorisation3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        code_autorisation3.setText(" Email :");

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name.setText(controller.retrieveFullname());
        if(controller.retrieveFullname()!=null){
            name.setText(controller.retrieveFullname());
        }else{
            name.setText(my_Session.fullname);
        }

        code_autorisation4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        code_autorisation4.setText(" N� Tel :");

        code_autorisation5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        code_autorisation5.setText(" N� de Carte Paeiment :");

        tel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        if(controller.retrievePhone()!=null){
            tel.setText(controller.retrievePhone());
        }else{
            tel.setText(my_Session.phoneStatic);
        }
        method_pyment3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        method_pyment3.setText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(code_autorisation5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(method_pyment3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code_autorisation3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code_autorisation4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code_autorisation3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code_autorisation4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(method_pyment3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(code_autorisation5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("  DETAIL DE LA COMMANDE");
        jLabel7.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText(" N� De Facture :");

        num_pay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        num_pay.setText(""+controller.retrieveRecuPyment());

        code_autorisation6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        code_autorisation6.setText(" N� De Recu De Paiement :");

        num_facture.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        num_facture.setText(""+controller.retrieveRefFacture());

        code_autorisation8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        code_autorisation8.setText(" N� de Carte Paeiment :");

        method_pyment5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        method_pyment5.setText(""+controller.retrieveCardNumber());
        
        JLabel label_price = new JLabel();
        label_price.setText("  Prix Total  :");
        label_price.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        JLabel price = new JLabel();
        price.setText(controller.retrievePrice()+" DH");
        price.setFont(new Font("Tahoma", Font.PLAIN, 12));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6Layout.setHorizontalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel6Layout.createSequentialGroup()
        					.addComponent(code_autorisation8, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(method_pyment5, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap(82, Short.MAX_VALUE))
        				.addGroup(jPanel6Layout.createSequentialGroup()
        					.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
        						.addComponent(code_autorisation6))
        					.addGroup(jPanel6Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel6Layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
        							.addComponent(num_facture, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        							.addGap(67))
        						.addGroup(jPanel6Layout.createSequentialGroup()
        							.addGap(18)
        							.addComponent(num_pay, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        							.addGap(0, 73, Short.MAX_VALUE))))))
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(label_price, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(price, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(num_facture, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(code_autorisation6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(num_pay, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(label_price, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(price, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel6Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(method_pyment5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(code_autorisation8, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6.setLayout(jPanel6Layout);

        jLabel9.setText("BoukiPay \u00C2\u00A9 Copyright 2021");
        
        /*************************
         * Boutton Imprimer 
         ************************/
        JButton login_b = new JButton();
        login_b.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		PrinterJob pjob = PrinterJob.getPrinterJob();
        		PageFormat preformat = pjob.defaultPage();
        		preformat.setOrientation(PageFormat.LANDSCAPE);
        		PageFormat postformat = pjob.pageDialog(preformat);
        		//If user does not hit cancel then print.
        		if (preformat != postformat) {
        		    //Set print component
        		    pjob.setPrintable(new Printable() {

						@Override
						public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
								throws PrinterException {

							if(pageIndex>0) {
								return Printable.NO_SUCH_PAGE;
							}
							Graphics2D gr= (Graphics2D)graphics;
							gr.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
							gr.scale(0.24, 0.24);
							jPanel1.paint(gr);
							return Printable.PAGE_EXISTS;
							
							
						}
        		    	
        		    });
        		    
        		    boolean ok=pjob.printDialog();
        		    if(ok) {
        		    	
        		    		try {
								pjob.print();
							} catch (PrinterException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
        		    	
        		    }
        		}
        	}
        });
        login_b.setText("Imprimer ");
        login_b.setForeground(Color.WHITE);
        login_b.setFont(new Font("Dialog", Font.PLAIN, 18));
        login_b.setBackground(new Color(41, 128, 185));
        /**
         * Boutton de Retour
         * ***/
        login_b_1 = new JButton();
        login_b_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		new PaymentCardView().setVisible(true);
        	}
        });
        login_b_1.setText("Retour");
        login_b_1.setForeground(Color.WHITE);
        login_b_1.setFont(new Font("Dialog", Font.PLAIN, 18));
        login_b_1.setBackground(new Color(34, 139, 34));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(366)
        			.addComponent(login_b, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
        			.addGap(43)
        			.addComponent(login_b_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(306, Short.MAX_VALUE))
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap(441, Short.MAX_VALUE)
        			.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
        			.addGap(367))
        		.addGroup(Alignment.LEADING, jPanel3Layout.createSequentialGroup()
        			.addGap(23)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jPanel6, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jPanel4, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
        			.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(32))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(46)
        					.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(login_b, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(208)
        					.addComponent(login_b_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        			.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 3, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Votre Paiement a été accepté");
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\amine\\Desktop\\success-icon.png"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(252)
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblNewLabel)
        			.addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        				.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(993, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FactureView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FactureView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FactureView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FactureView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FactureView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel code_autori;
    private javax.swing.JLabel code_autorisation;
    private javax.swing.JLabel code_autorisation1;
    private javax.swing.JLabel code_autorisation2;
    private javax.swing.JLabel code_autorisation3;
    private javax.swing.JLabel code_autorisation4;
    private javax.swing.JLabel code_autorisation5;
    private javax.swing.JLabel code_autorisation6;
    private javax.swing.JLabel code_autorisation8;
    private javax.swing.JLabel date;
    private javax.swing.JLabel email;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel method_pyment;
    private javax.swing.JLabel carte_payment;
    private javax.swing.JLabel method_pyment3;
    private javax.swing.JLabel method_pyment5;
    private javax.swing.JLabel name;
    private javax.swing.JLabel num_facture;
    private javax.swing.JLabel num_pay;
    private javax.swing.JLabel tel;
    private JLabel lblNewLabel;
    private JButton login_b_1;
}


