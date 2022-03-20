/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.City;
import model.Community;
import model.House;
import model.MainSystem;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author meghanshubhatt
 */
public class AddPersonPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPersonPanel
     */
    
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private City city;
    private MainSystem system;
    public AddPersonPanel(JPanel upc, PersonDirectory pd, City cty, MainSystem sys) {
        initComponents();
        userProcessContainer = upc;
        personDirectory = pd;
        city = cty;
        system = sys;
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtPhonenumber = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtHouseName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHouseAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHouseNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        genderCombo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Last Name: ");

        jLabel2.setText("Phone Number: ");

        jLabel3.setText("First Name: ");

        jLabel4.setText("Gender:");

        jLabel5.setText("Age: ");

        txtPhonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhonenumberActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel7.setText("House Name: ");

        jLabel8.setText("House Number: ");

        jLabel9.setText("House Address: ");

        jLabel10.setText("City Name ");

        jLabel11.setText("Community Name");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("Create a Person !");

        genderCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHouseName, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(txtHouseAddress)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)
                        .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 127, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnBack)
                        .addGap(256, 256, 256)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(Save)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtFname, txtHouseAddress, txtHouseName, txtLname, txtPhonenumber});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtHouseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(genderCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtHouseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPhonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(Save)
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAge, txtFname, txtHouseAddress, txtHouseName, txtLname, txtPhonenumber});

    }// </editor-fold>//GEN-END:initComponents

    private void txtPhonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhonenumberActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        //Person person = personDirectory.addPerson();
        Person person = new Person();
        
        // FIRST NAME
           if (txtFname.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "First Name is Empty!");
            txtFname.grabFocus();
            return;
            }
        else
           {
              person.setfName(txtFname.getText());
                       };
                       
        // LAST NAME
         if (txtLname.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Last Name is Empty!");
            txtLname.grabFocus();
            return;
            }
        else
           {
              person.setlName(txtLname.getText());
                       };
        
        // AGE
                try{
            int age = Integer.parseInt(txtAge.getText());

            if (age < 0)
            {
                JOptionPane.showMessageDialog(this, "Input Valid Age !");
                txtAge.grabFocus();
                return;

            }

            person.setAge(Integer.parseInt(txtAge.getText()));
        }
        catch(NumberFormatException e)
        {JOptionPane.showMessageDialog(this, "Input Valid Age !");
            txtAge.grabFocus();
            return;
        }
        
        
       
        person.setGender(genderCombo.getSelectedItem().toString());
        
        // PHONE NUMBER
        
                
                try{
            long phoneNumber = Long.parseLong(txtPhonenumber.getText());

            if (String.valueOf(phoneNumber).length() != 10)
            {
                JOptionPane.showMessageDialog(this, "Input Valid Telephone Number !");
                txtPhonenumber.grabFocus();
                return;

            }
            
            person.setPhoneNumber(Long.parseLong(txtPhonenumber.getText()));
        }
        catch(NumberFormatException e)
        {JOptionPane.showMessageDialog(this, "Input Valid Telephone Number !");
            txtPhonenumber.grabFocus();
            return;
        }
        
                /// CITY
                
         if (txtCityName.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "City is Empty!");
            txtCityName.grabFocus();
            return;
        }
        else
        { city = system.addCity(txtCityName.getText());}
        
         // COMMUNITY - HOME
         
        boolean flag = true; 
         
         try {
         
         int housenumber = Integer.parseInt(txtHouseNumber.getText());    
         
         if (txtCommunityName.getText().trim().isEmpty() || txtHouseName.getText().trim().isEmpty() || txtHouseAddress.getText().trim().isEmpty()
                 || txtHouseAddress.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Input Data is Empty!");
            flag=false;
            return;
        }
             System.out.println("ui.AddPersonPanel.SaveActionPerformed()");
         if (flag==true){
         Community community  = city.AddCommunity(txtCommunityName.getText());
        
        community.setCity(city.getCityName());
             

        House house = community.makeHouse();
        
        house.setHouseName(txtHouseName.getText());
        house.setHouseNumber(Integer.parseInt(txtHouseNumber.getText()));
        house.setHouseAddress(txtHouseAddress.getText());
   
        house.setCommunity(community);
        person.setHouse(house);
        personDirectory.addNewPerson(person);
        personDirectory.saveFile();
           JOptionPane.showMessageDialog(null, "Person added successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
         }
         
         }
         catch(NumberFormatException e) {
         JOptionPane.showMessageDialog(this, "Input Valid Home Number !");
          
            return;}
         
         


        
        
        
     
        
    }//GEN-LAST:event_SaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    
    
    private void backAction(){
        userProcessContainer.remove(this);
        Component [] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length-1];
        ManagePerson mp = (ManagePerson) c;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox<String> genderCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtHouseAddress;
    private javax.swing.JTextField txtHouseName;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPhonenumber;
    // End of variables declaration//GEN-END:variables
}
