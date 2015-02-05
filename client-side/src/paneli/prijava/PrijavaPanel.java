/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrijavaPanel.java
 *
 * Created on Apr 25, 2012, 11:48:33 PM
 */
package paneli.prijava;

import kontrolerKI.prijava.PrijavaKI;

/**
 *
 * @author Rus
 */
public class PrijavaPanel extends javax.swing.JPanel {

    /**
     * Creates new form PrijavaPanel
     */
    public PrijavaPanel() {
        initComponents();
        PrijavaKI.vratiObjekat().postaviSveKomponente(this, jlKorisnickoIme, jlSifra, jpfSifra, jtfKorisnicko);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfKorisnicko = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbtPrijava = new javax.swing.JButton();
        jpfSifra = new javax.swing.JPasswordField();
        jlKorisnickoIme = new javax.swing.JLabel();
        jlSifra = new javax.swing.JLabel();
        jbtOtkazi = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true), "Prijava zaposlenog", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 255)));

        jLabel1.setText("Korisničko ime:");

        jtfKorisnicko.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfKorisnickoKeyReleased(evt);
            }
        });

        jLabel2.setText("Šifra:");

        jbtPrijava.setText("Prijava");
        jbtPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPrijavaActionPerformed(evt);
            }
        });

        jpfSifra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpfSifraKeyReleased(evt);
            }
        });

        jbtOtkazi.setText("Zatvori");
        jbtOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOtkaziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jbtPrijava)
                        .addGap(32, 32, 32)
                        .addComponent(jbtOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpfSifra, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jtfKorisnicko, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlSifra, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jlKorisnickoIme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jtfKorisnicko, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jpfSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jlSifra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtPrijava)
                    .addComponent(jbtOtkazi))
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOtkaziActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtOtkaziActionPerformed

    private void jtfKorisnickoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfKorisnickoKeyReleased
        PrijavaKI.vratiObjekat().jtfKorisnickoKeyReleased(evt);
    }//GEN-LAST:event_jtfKorisnickoKeyReleased

    private void jbtPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPrijavaActionPerformed
        PrijavaKI.vratiObjekat().jbtPrijavaActionPerformed();
    }//GEN-LAST:event_jbtPrijavaActionPerformed

    private void jpfSifraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfSifraKeyReleased
        PrijavaKI.vratiObjekat().jpfSifraKeyReleased(evt);
    }//GEN-LAST:event_jpfSifraKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtOtkazi;
    private javax.swing.JButton jbtPrijava;
    private javax.swing.JLabel jlKorisnickoIme;
    private javax.swing.JLabel jlSifra;
    private javax.swing.JPasswordField jpfSifra;
    private javax.swing.JTextField jtfKorisnicko;
    // End of variables declaration//GEN-END:variables
}
