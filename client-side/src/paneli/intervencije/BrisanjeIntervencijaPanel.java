/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BrisanjeIntervencijaPanel.java
 *
 * Created on Apr 26, 2012, 1:04:42 AM
 */
package paneli.intervencije;

import kontrolerKI.intervencije.BrisanjeIntervencijaKI;

/**
 *
 * @author Rus
 */
public class BrisanjeIntervencijaPanel extends javax.swing.JPanel {

    /**
     * Creates new form BrisanjeIntervencijaPanel
     */
    public BrisanjeIntervencijaPanel() {
        initComponents();
        BrisanjeIntervencijaKI.vratiObjekat().postaviSveKomponente(this, jcbRadniciPretraga, jlObavestenje, jmiDetaljiIntervencije, jmiObrisiIntervenciju, jpmObrisiIntervenciju, jrbRadnik, jrbRegistracija, jtblPromenaIntervencije, jtfPretraga);
        BrisanjeIntervencijaKI.vratiObjekat().srediPopUpMenu();
        BrisanjeIntervencijaKI.vratiObjekat().napuniCombo();
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
        jpmObrisiIntervenciju = new javax.swing.JPopupMenu();
        jmiDetaljiIntervencije = new javax.swing.JMenuItem();
        jmiObrisiIntervenciju = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jrbRegistracija = new javax.swing.JRadioButton();
        jrbRadnik = new javax.swing.JRadioButton();
        jtfPretraga = new javax.swing.JTextField();
        jbtPronadji = new javax.swing.JButton();
        jbtObrisiPodatke = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblPromenaIntervencije = new javax.swing.JTable();
        jlObavestenje = new javax.swing.JLabel();
        jcbRadniciPretraga = new javax.swing.JComboBox();
        jbtPonisti = new javax.swing.JButton();
        jbtPrikaziSveIntervencije = new javax.swing.JButton();

        jmiDetaljiIntervencije.setText("jMenuItem1");
        jmiDetaljiIntervencije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDetaljiIntervencijeActionPerformed(evt);
            }
        });
        jpmObrisiIntervenciju.add(jmiDetaljiIntervencije);

        jmiObrisiIntervenciju.setText("jMenuItem1");
        jmiObrisiIntervenciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiObrisiIntervencijuActionPerformed(evt);
            }
        });
        jpmObrisiIntervenciju.add(jmiObrisiIntervenciju);

        setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 1, true), "Brisanje intervencija", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Brisanje podataka o intervencijama:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 1, true), "Pretraga intervencija", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 0))); // NOI18N

        buttonGroup1.add(jrbRegistracija);
        jrbRegistracija.setSelected(true);
        jrbRegistracija.setText("Registarski broj automobila");
        jrbRegistracija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRegistracijaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbRadnik);
        jrbRadnik.setText("Radnik");
        jrbRadnik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRadnikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbRegistracija)
                    .addComponent(jrbRadnik))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbRegistracija)
                .addGap(18, 18, 18)
                .addComponent(jrbRadnik)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jtfPretraga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPretragaKeyReleased(evt);
            }
        });

        jbtPronadji.setText("Pronađi");
        jbtPronadji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPronadjiActionPerformed(evt);
            }
        });

        jbtObrisiPodatke.setText("Obriši podatke");
        jbtObrisiPodatke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtObrisiPodatkeActionPerformed(evt);
            }
        });

        jtblPromenaIntervencije.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sifra intervencije", "Radnik", "Automobil", "Datum intervencije"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblPromenaIntervencije.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtblPromenaIntervencijeMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtblPromenaIntervencije);

        jbtPonisti.setText("Poništi");
        jbtPonisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPonistiActionPerformed(evt);
            }
        });

        jbtPrikaziSveIntervencije.setText("Prikaži sve");
        jbtPrikaziSveIntervencije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPrikaziSveIntervencijeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jcbRadniciPretraga, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtfPretraga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                            .addComponent(jlObavestenje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(101, 101, 101)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbtPrikaziSveIntervencije, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbtPronadji, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jbtObrisiPodatke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbtPonisti, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtPronadji))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtPrikaziSveIntervencije)
                            .addComponent(jlObavestenje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbRadniciPretraga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtObrisiPodatke))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtPonisti))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPretragaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPretragaKeyReleased
        BrisanjeIntervencijaKI.vratiObjekat().jtfPretragaKeyReleased(evt);
    }//GEN-LAST:event_jtfPretragaKeyReleased

    private void jbtPronadjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPronadjiActionPerformed
        BrisanjeIntervencijaKI.vratiObjekat().jbtPronadjiActionPerformed();
    }//GEN-LAST:event_jbtPronadjiActionPerformed

    private void jtblPromenaIntervencijeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblPromenaIntervencijeMousePressed
        BrisanjeIntervencijaKI.vratiObjekat().jtblPromenaIntervencijeMousePressed(evt);
    }//GEN-LAST:event_jtblPromenaIntervencijeMousePressed

    private void jmiDetaljiIntervencijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDetaljiIntervencijeActionPerformed
        BrisanjeIntervencijaKI.vratiObjekat().jmiDetaljiIntervencijeActionPerformed();
    }//GEN-LAST:event_jmiDetaljiIntervencijeActionPerformed

    private void jmiObrisiIntervencijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiObrisiIntervencijuActionPerformed
        BrisanjeIntervencijaKI.vratiObjekat().jmiObrisiIntervencijuActionPerformed();
    }//GEN-LAST:event_jmiObrisiIntervencijuActionPerformed

    private void jrbRegistracijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRegistracijaActionPerformed
        BrisanjeIntervencijaKI.vratiObjekat().jrbRegistracijaActionPerformed();
    }//GEN-LAST:event_jrbRegistracijaActionPerformed

    private void jrbRadnikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRadnikActionPerformed
        BrisanjeIntervencijaKI.vratiObjekat().jrbRadnikActionPerformed();
    }//GEN-LAST:event_jrbRadnikActionPerformed

    private void jbtObrisiPodatkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtObrisiPodatkeActionPerformed
        BrisanjeIntervencijaKI.vratiObjekat().jbtObrisiPodatkeActionPerformed();
    }//GEN-LAST:event_jbtObrisiPodatkeActionPerformed

    private void jbtPonistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPonistiActionPerformed
        BrisanjeIntervencijaKI.vratiObjekat().jbtPonistiActionPerformed();
    }//GEN-LAST:event_jbtPonistiActionPerformed

    private void jbtPrikaziSveIntervencijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPrikaziSveIntervencijeActionPerformed
        BrisanjeIntervencijaKI.vratiObjekat().jbtPrikaziSveIntervencijeActionPerformed();
    }//GEN-LAST:event_jbtPrikaziSveIntervencijeActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtObrisiPodatke;
    private javax.swing.JButton jbtPonisti;
    private javax.swing.JButton jbtPrikaziSveIntervencije;
    private javax.swing.JButton jbtPronadji;
    private javax.swing.JComboBox jcbRadniciPretraga;
    private javax.swing.JLabel jlObavestenje;
    private javax.swing.JMenuItem jmiDetaljiIntervencije;
    private javax.swing.JMenuItem jmiObrisiIntervenciju;
    private javax.swing.JPopupMenu jpmObrisiIntervenciju;
    private javax.swing.JRadioButton jrbRadnik;
    private javax.swing.JRadioButton jrbRegistracija;
    private javax.swing.JTable jtblPromenaIntervencije;
    private javax.swing.JTextField jtfPretraga;
    // End of variables declaration//GEN-END:variables
}
