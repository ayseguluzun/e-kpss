/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.e_kpss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Burcu
 */
public class kayitformu extends javax.swing.JFrame {
    
    
     public static Connection baglanti;
    
    public String link ="jdbc:mysql://localhost:3306/e_kpss?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&useSSL=false&serverTimezone=UTC";
    public String kullanici_adi = "root"; 
    public String sifre = "";

    
    String yol=null;
    
    private Object jOptionPane;
    /**
     * Creates new form NewJFrame
     */
    public kayitformu() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jtex_isim = new javax.swing.JTextField();
        jtex_soyisim = new javax.swing.JTextField();
        jtex_tc = new javax.swing.JTextField();
        jtex_meslek = new javax.swing.JTextField();
        jtex_telefon = new javax.swing.JTextField();
        jcombo_il = new javax.swing.JComboBox<>();
        jformtex_dogum = new javax.swing.JFormattedTextField();
        jtex_email = new javax.swing.JTextField();
        jradio_kadın = new javax.swing.JRadioButton();
        jradio_erkek = new javax.swing.JRadioButton();
        jtex_kullanici_adi = new javax.swing.JTextField();
        jtex_sifre = new javax.swing.JTextField();
        jtex_sifre_tekrar = new javax.swing.JTextField();
        button_kaydol = new javax.swing.JButton();
        button_kapat = new javax.swing.JButton();
        button_temizle = new javax.swing.JButton();
        tc_kimlik = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl_telefon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jl_cinsiyet = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtex_isim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtex_isimActionPerformed(evt);
            }
        });
        jPanel1.add(jtex_isim, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 250, 33));
        jPanel1.add(jtex_soyisim, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 250, 30));

        jtex_tc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtex_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtex_tcActionPerformed(evt);
            }
        });
        jtex_tc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtex_tcKeyPressed(evt);
            }
        });
        jPanel1.add(jtex_tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 250, 34));

        jtex_meslek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtex_meslekActionPerformed(evt);
            }
        });
        jPanel1.add(jtex_meslek, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 250, 32));

        jtex_telefon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtex_telefonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtex_telefonKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtex_telefonKeyTyped(evt);
            }
        });
        jPanel1.add(jtex_telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 250, 29));

        jcombo_il.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "adana", "adıyaman", "burdur", "gaziantep", "hatay", "istanbul", "kahramanmaraş", "konya", "mersin", "tokat", "uşak", "van", "zonguldak" }));
        jcombo_il.setToolTipText("");
        jcombo_il.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcombo_ilActionPerformed(evt);
            }
        });
        jPanel1.add(jcombo_il, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 250, 35));

        try {
            jformtex_dogum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jformtex_dogum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 250, 30));

        jtex_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtex_emailActionPerformed(evt);
            }
        });
        jPanel1.add(jtex_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 250, 30));

        buttonGroup1.add(jradio_kadın);
        jradio_kadın.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jradio_kadın.setText(" KADIN");
        jradio_kadın.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradio_kadınActionPerformed(evt);
            }
        });
        jPanel1.add(jradio_kadın, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 89, -1));

        buttonGroup1.add(jradio_erkek);
        jradio_erkek.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jradio_erkek.setText(" ERKEK");
        jPanel1.add(jradio_erkek, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 90, -1));
        jPanel1.add(jtex_kullanici_adi, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 250, 27));

        jtex_sifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtex_sifreActionPerformed(evt);
            }
        });
        jPanel1.add(jtex_sifre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 250, 28));
        jPanel1.add(jtex_sifre_tekrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 250, 28));

        button_kaydol.setBackground(new java.awt.Color(0, 0, 0));
        button_kaydol.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        button_kaydol.setForeground(new java.awt.Color(255, 255, 255));
        button_kaydol.setText("KAYIT OL");
        button_kaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kaydolActionPerformed(evt);
            }
        });
        jPanel1.add(button_kaydol, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 121, -1));

        button_kapat.setBackground(new java.awt.Color(0, 0, 0));
        button_kapat.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        button_kapat.setForeground(new java.awt.Color(255, 255, 255));
        button_kapat.setText("KAPAT");
        button_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kapatActionPerformed(evt);
            }
        });
        jPanel1.add(button_kapat, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 120, -1));

        button_temizle.setBackground(new java.awt.Color(0, 0, 0));
        button_temizle.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        button_temizle.setForeground(new java.awt.Color(255, 255, 255));
        button_temizle.setText("TEMİZLE");
        button_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_temizleActionPerformed(evt);
            }
        });
        jPanel1.add(button_temizle, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 120, -1));

        tc_kimlik.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tc_kimlik.setText("T.C Kimlik No:");
        jPanel1.add(tc_kimlik, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 450, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("İSİM :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 450, 28));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("SOYİSİM:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 440, 24));

        jl_telefon.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_telefon.setText("TELEFON:");
        jPanel1.add(jl_telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 476, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("MESLEK:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 517, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("YAŞANILAN İL:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 440, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("DOĞUM TARİHİ:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 430, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("E-mail:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 162, -1));

        jl_cinsiyet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jl_cinsiyet.setText("Cinsiyet:");
        jPanel1.add(jl_cinsiyet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 99, 31));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("KULLANICI ADI:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 162, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("ŞİFRE BELİRLEYİN:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 162, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("ŞİFREYİ TEKRAR GİRİN:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("KAYIT FORMU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jradio_kadınActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradio_kadınActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jradio_kadınActionPerformed

    private void jtex_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtex_tcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtex_tcActionPerformed

    private void jtex_sifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtex_sifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtex_sifreActionPerformed

    private void jtex_telefonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtex_telefonKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jtex_telefonKeyTyped

    private void jcombo_ilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcombo_ilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcombo_ilActionPerformed

    private void button_kaydolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kaydolActionPerformed

        baglanti_olustur();
        //kayitformundaki boÅŸ alanlarÄ± tespit etme
        String tckimlik=jtex_tc.getText();
        String isim=jtex_isim.getText();
        String soyisim=jtex_soyisim.getText();
        String telefon=jtex_telefon.getText();
        String meslek=jtex_meslek.getText();
        String dogumTarihi=jformtex_dogum.getText();
        String email=jtex_email.getText();
        String kullanici_adi=jtex_kullanici_adi.getText();
        String sifre= jtex_sifre.getText();
        String sifreTekrar=jtex_sifre_tekrar.getText();

        if(tckimlik.isEmpty() || isim.isEmpty() || soyisim.isEmpty() || telefon.isEmpty() || meslek.isEmpty() || dogumTarihi.isEmpty() || email.isEmpty() ||
            kullanici_adi.isEmpty() || sifre.isEmpty() || sifreTekrar.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Formun Tamamını± Doldurun","Hata",JOptionPane.ERROR_MESSAGE);

        }
        else if(!sifre.equals(sifreTekrar)){
            JOptionPane.showMessageDialog(this,"Şifreler Eşleşmiyor!","Hata",JOptionPane.ERROR_MESSAGE);

        }
        else{
            JOptionPane.showMessageDialog(this,"Kayıt Oluşturuldu/Ana Sayfaya Yönlendiriliyorsunuz..","KAYIT BAŞARILI",JOptionPane.PLAIN_MESSAGE);
            new girisekrani().setVisible(true);
            ekle();
            dispose();
        }
        baglanti_kapat();
    }//GEN-LAST:event_button_kaydolActionPerformed

    private void button_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_temizleActionPerformed
        // TODO add your handling code here:
        temizle();
    }//GEN-LAST:event_button_temizleActionPerformed

    private void button_kapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kapatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_button_kapatActionPerformed

    private void jtex_isimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtex_isimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtex_isimActionPerformed

    private void jtex_meslekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtex_meslekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtex_meslekActionPerformed

    private void jtex_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtex_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtex_emailActionPerformed

    private void jtex_telefonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtex_telefonKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtex_telefonKeyReleased

    private void jtex_telefonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtex_telefonKeyPressed
        // TODO add your handling code here:
        String number=jtex_telefon.getText();
        int length=number.length();
        char c =evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9' ){
            if(length<11){
            jtex_telefon.setEditable(true);
            }else{
                jtex_telefon.setEditable(false);
            }
        
        }
    }//GEN-LAST:event_jtex_telefonKeyPressed

    private void jtex_tcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtex_tcKeyPressed
        // TODO add your handling code here:
         String tc_number=jtex_tc.getText();
        int length=tc_number.length();
        char c =evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9' ){
            if(length<11){
            jtex_tc.setEditable(true);
            }else{
                jtex_tc.setEditable(false);
            }
        
        }
    }//GEN-LAST:event_jtex_tcKeyPressed

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
            java.util.logging.Logger.getLogger(kayitformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kayitformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kayitformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kayitformu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kayitformu().setVisible(true);
            }
        });
    }
    
    public void baglanti_olustur(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            baglanti = DriverManager.getConnection(link,kullanici_adi,sifre);
            //JOptionPane.showMessageDialog(null, "Başarılı");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(kayitformu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(kayitformu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public void baglanti_kapat(){
        try {
            baglanti.close();
        } catch (SQLException ex) {
            Logger.getLogger(kayitformu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void ekle(){
        String t2,t3,t5,t7,t8,t10,t11,t12;
        long tckimlik;
        long telefon;
        
        t2=jtex_isim.getText();
        t3=jtex_soyisim.getText();
        t5=jtex_meslek.getText();
        t7=jformtex_dogum.getText();
        t8=jtex_email.getText();
        t10=jtex_kullanici_adi.getText();
        t11=jtex_sifre.getText();
        t12=jtex_sifre_tekrar.getText();
        
       tckimlik=Long.parseLong(jtex_tc.getText().trim()); 
       telefon=Long.parseLong(jtex_telefon.getText().trim());
        
       
        String cinsiyet= "";
        String yasanilanSehir="";
        
        if(jradio_kadın.isSelected()==true)
        {
            cinsiyet="KADIN";
        }
        if(jradio_erkek.isSelected()==true){
            cinsiyet="ERKEK";
        }
        if(jcombo_il.getSelectedIndex()==0){
            yasanilanSehir="adana";
        }
         if(jcombo_il.getSelectedIndex()==1){
            yasanilanSehir="adıyaman";
        }
          if(jcombo_il.getSelectedIndex()==2){
            yasanilanSehir="burdur";
        }
           if(jcombo_il.getSelectedIndex()==3){
            yasanilanSehir="gaziantep";
        }
            if(jcombo_il.getSelectedIndex()==4){
            yasanilanSehir="hatay";
        }
             if(jcombo_il.getSelectedIndex()==5){
            yasanilanSehir="istanbul";
        }
              if(jcombo_il.getSelectedIndex()==6){
            yasanilanSehir="kahramanmaraş";
        }
               if(jcombo_il.getSelectedIndex()==7){
            yasanilanSehir="konya";
        }
                if(jcombo_il.getSelectedIndex()==8){
            yasanilanSehir="mersin";
        }
                 if(jcombo_il.getSelectedIndex()==9){
            yasanilanSehir="tokat";
        }
                  if(jcombo_il.getSelectedIndex()==10){
            yasanilanSehir="uşak";
        }
                   if(jcombo_il.getSelectedIndex()==11){
            yasanilanSehir="van";
        }
                    if(jcombo_il.getSelectedIndex()==12){
            yasanilanSehir="zonguldak";
        }
                    
        
        String eklesorgusu="INSERT INTO kullanici(tc_kimlik,ad,soyad,telefon,meslek,yasanilan_il,dogum_tarihi,email,cinsiyet,kullanici_adi,sifre,sifre_tekrar) values("+tckimlik+",'"+t2+"','"+t3+"','"+telefon+"','"+t5+"','"+yasanilanSehir+"','"+t7+"','"+t8+"','"+cinsiyet+"','"+t10+"','"+t11+"','"+t12+"')";
        
       try{
           
          
           Statement abc=baglanti.createStatement();
           abc.execute(eklesorgusu);
           System.out.println("veritabanına veri eklendi");
          
       }
           
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, ex);
           System.out.println(ex.toString());
           System.out.println("veritabanına veri eklenemedi");
       }

        
    }
    
    public void temizle(){
        jtex_tc.setText("");
        jtex_isim.setText("");
        jtex_soyisim.setText("");
        jtex_telefon.setText("");
        jtex_meslek.setText("");
        jformtex_dogum.setText("");
        jtex_email.setText("");
        jtex_kullanici_adi.setText("");
        jtex_sifre.setText("");
        jtex_sifre_tekrar.setText("");
        buttonGroup1.clearSelection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_kapat;
    private javax.swing.JButton button_kaydol;
    private javax.swing.JButton button_temizle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcombo_il;
    private javax.swing.JFormattedTextField jformtex_dogum;
    private javax.swing.JLabel jl_cinsiyet;
    private javax.swing.JLabel jl_telefon;
    private javax.swing.JRadioButton jradio_erkek;
    private javax.swing.JRadioButton jradio_kadın;
    private javax.swing.JTextField jtex_email;
    private javax.swing.JTextField jtex_isim;
    private javax.swing.JTextField jtex_kullanici_adi;
    private javax.swing.JTextField jtex_meslek;
    private javax.swing.JTextField jtex_sifre;
    private javax.swing.JTextField jtex_sifre_tekrar;
    private javax.swing.JTextField jtex_soyisim;
    private javax.swing.JTextField jtex_tc;
    private javax.swing.JTextField jtex_telefon;
    private javax.swing.JLabel tc_kimlik;
    // End of variables declaration//GEN-END:variables
}
