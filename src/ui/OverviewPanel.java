/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package ui;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.MainSystem;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author meghanshubhatt
 */
public class OverviewPanel extends javax.swing.JPanel {

    /** Creates new form OverviewPanel */
    private JPanel userProcessContainer;
    private PatientDirectory patientDirectory;
    private MainSystem system;
    public OverviewPanel(JPanel userProcessContainer,PatientDirectory patientDirectory, MainSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patientDirectory = patientDirectory;
        this.system = system;
        fillCombo();
        refreshTable();
        
    }
    
    public void refreshTable(){
    
 
        
    int rowCount = tblOverview.getRowCount();
    DefaultTableModel model = (DefaultTableModel) tblOverview.getModel();
    for(int i=rowCount-1;i>=0;i--){
        model.removeRow(i);
    }
        System.out.println(communityCombo.getSelectedItem());
       
    
    for (Patient p : patientDirectory.getPatientList()){
        if (p.getPerson().getHouse().getCommunity().getCity().equals(cityCombo.getSelectedItem())   && p.getPerson().getHouse().getCommunity().getCommunityName().equals((communityCombo.getSelectedItem()))){
        if (!p.getEncounterHistory().get(p.getEncounterHistory().size()-1).getVitalSigns().isIsNormal()){
        Object row[] = new Object[5];
        row[0] = p.getPerson().getPersonId();
        row[1] = p.getPerson().getFullName();
        row[2] = p.getPerson().getHouse().getCommunity().getCity();
        row[3] = p.getPerson().getHouse().getCommunity().getCommunityName();
        row[4] = p.getEncounterHistory().get(p.getEncounterHistory().size()-1).getVitalSigns().isIsNormal();
        model.addRow(row);
        
        }}
    }
    
      
    
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOverview = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        communityCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cityCombo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Overview - List of Adnormal Patients");

        tblOverview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Patient Name", "City Name", "Community Name", "Health Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOverview);

        jLabel3.setText("Community Name: ");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("City Name: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(communityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(communityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(cityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //fillCombo();
        refreshTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cityCombo;
    private javax.swing.JComboBox<String> communityCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOverview;
    // End of variables declaration//GEN-END:variables

    private void fillCombo() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        
        for (Patient p : patientDirectory.getPatientList()){
        if (!p.getEncounterHistory().get(p.getEncounterHistory().size()-1).getVitalSigns().isIsNormal()){
            cityCombo.addItem(p.getPerson().getHouse().getCommunity().getCity());
            
        }
        }
        
        
        for (Patient p : patientDirectory.getPatientList()){
        if (!p.getEncounterHistory().get(p.getEncounterHistory().size()-1).getVitalSigns().isIsNormal()){
            communityCombo.addItem(p.getPerson().getHouse().getCommunity().getCommunityName());
            
        }
        }
        
    }

}
