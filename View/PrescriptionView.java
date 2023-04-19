package View;

import Controller.Create_DB;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

public class PrescriptionView extends javax.swing.JPanel {

    /**
     * Creates new form PrescriptionView
     */
    public PrescriptionView() {
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

        // SR added initialization
        dconn = new Create_DB();
        model = new DefaultTableModel();
        model2 = new DefaultTableModel();

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        docIDLabel = new javax.swing.JLabel();
        pNameLabel = new javax.swing.JLabel();
        HCNumLabel = new javax.swing.JLabel();
        pNameInput = new javax.swing.JTextField();
        docIdInput = new javax.swing.JTextField();
        HcInput = new javax.swing.JTextField();
        pageLabel = new javax.swing.JLabel();
        drugNameInput = new javax.swing.JTextField();
        drugQuantityInput = new javax.swing.JTextField();
        drugNameLabel = new javax.swing.JLabel();
        drugQuantityLabel = new javax.swing.JLabel();
        createPrescriptionButton = new javax.swing.JButton();
        deletePrescriptionButton = new javax.swing.JButton();
        updatePrescriptionButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        unresolvedTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        docIDLabel1 = new javax.swing.JLabel();
        medSSNInput = new javax.swing.JTextField();

        docIDLabel.setText("Document ID");

        pNameLabel.setText("Patient Name");

        HCNumLabel.setText("HC #");

        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Patient Prescription");


        drugNameLabel.setText("Drug Name");

        drugQuantityLabel.setText("Quantity");

        createPrescriptionButton.setText("Create");
        createPrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPrescriptionButtonActionPerformed(evt);
            }
        });

        deletePrescriptionButton.setText("Delete");
        //+++++++++Samuel added
        deletePrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        //complete

        updatePrescriptionButton.setText("Update");
        //+++++++++Samuel added
        updatePrescriptionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        //complete

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });


        jTable1.setModel(model);
        jScrollPane1.setViewportView(jTable1);

        data2 = dconn.unresolvedPrescription();
        model2.setDataVector(data2,colNames2);


        unresolvedTable.setModel(model2);
        jScrollPane3.setViewportView(unresolvedTable);

        jLabel1.setText("Pharmacies with Unfulfilled Prescriptions");


        backButton.setText("Exit");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        docIDLabel1.setText("Medical SSN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(drugNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(drugNameLabel))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(drugQuantityLabel)
                                                                        .addComponent(drugQuantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(createPrescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(49, 49, 49)
                                                                .addComponent(updatePrescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(49, 49, 49)
                                                                .addComponent(deletePrescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(37, 37, 37)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(49, 49, 49)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(medSSNInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(docIDLabel1))
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(docIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                                                                                .addComponent(searchButton))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pNameLabel)
                                                                .addGap(135, 135, 135)
                                                                .addComponent(HCNumLabel)
                                                                .addGap(194, 194, 194)
                                                                .addComponent(docIDLabel))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(48, 48, 48))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(backButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(437, 437, 437)
                                                .addComponent(pageLabel)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(pageLabel)
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pNameLabel)
                                        .addComponent(HCNumLabel)
                                        .addComponent(docIDLabel))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(HcInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(docIdInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(searchButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(docIDLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(medSSNInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(drugNameLabel)
                                        .addComponent(drugQuantityLabel))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(drugNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(drugQuantityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(108, 108, 108)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(createPrescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(updatePrescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(deletePrescriptionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(51, 51, 51)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(backButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>

    //+++++++++Samuel editted+++++++++++++
    private void searchButtonActionPerformed(ActionEvent evt) {
        if (pNameInput.getText().equals("") && HcInput.getText().equals("") && docIdInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter at least one search criteria");
        } else {

            data = dconn.searchPrescription(docIdInput.getText(), pNameInput.getText(), HcInput.getText(), drugNameInput.getText());
            model.setDataVector(data, colNames);
        }


    }

    private void createPrescriptionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (HcInput.getText().equals("")
                || drugQuantityInput.getText().equals("")
                || drugNameInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter HealthCare number, Drug and Quantity");
        } else {

            dconn.InsertPrescription(Integer.parseInt(HcInput.getText()), Integer.parseInt(drugQuantityInput.getText()), drugNameInput.getText(), medSSNInput.getText());
            data = dconn.searchPrescription(docIdInput.getText(), pNameInput.getText(), HcInput.getText(), drugNameInput.getText());
            model.setDataVector(data, colNames);
        }

    }

    //++++++Samuel added
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (docIdInput.getText().equals(""))
                 {
            JOptionPane.showMessageDialog(null, "Please enter Document ID");
        } else {
            dconn.DeletePrescription(Integer.parseInt(docIdInput.getText()));
            data = dconn.searchPrescription(docIdInput.getText(), pNameInput.getText(), HcInput.getText(), drugNameInput.getText());
            model.setDataVector(data, colNames);
        }
    }

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt){
        if (docIdInput.getText().equals("")
                || drugQuantityInput.getText().equals("")
                || drugNameInput.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter Document ID");
        } else {
            dconn.UpdatePrescription(Integer.parseInt(drugQuantityInput.getText()),drugNameInput.getText(),Integer.parseInt(docIdInput.getText()));
            data = dconn.searchPrescription(docIdInput.getText(), pNameInput.getText(), HcInput.getText(), drugNameInput.getText());
            model.setDataVector(data, colNames);
        }

    }
    //+++++editing completed+++++++++

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setLoginView(new LoginView());
        mainView.setCard(0);
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel HCNumLabel;
    private javax.swing.JTextField HcInput;
    private javax.swing.JButton backButton;
    private javax.swing.JButton createPrescriptionButton;
    private javax.swing.JButton deletePrescriptionButton;
    private javax.swing.JLabel docIDLabel;
    private javax.swing.JLabel docIDLabel1;
    private javax.swing.JTextField docIdInput;
    private javax.swing.JTextField drugNameInput;
    private javax.swing.JLabel drugNameLabel;
    private javax.swing.JTextField drugQuantityInput;
    private javax.swing.JLabel drugQuantityLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField medSSNInput;
    private javax.swing.JTextField pNameInput;
    private javax.swing.JLabel pNameLabel;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable unresolvedTable;
    private javax.swing.JButton updatePrescriptionButton;

    // SR Added declarations
    private Create_DB dconn;
    private Object[][] data;

    private Object[][] data2;
    private String[] colNames = {"Quantity","Drug Name", "DocumentID", "Patient Name"};
    private String[] colNames2 = {"Pharmacy","Street Address", "City", "Province"};

    private DefaultTableModel model;
    private DefaultTableModel model2;
    // End of variables declaration
}
