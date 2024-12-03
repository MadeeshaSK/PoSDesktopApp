//@author MADEESHA
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;


public class CustomerView extends javax.swing.JFrame {

    public CustomerView() {
        initComponents();
        searchAllData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        customerId = new javax.swing.JTextField();
        customerIdLable = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        customerNameLable = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        customerAddressLable = new javax.swing.JLabel();
        customerAddress = new javax.swing.JTextField();
        customerContactLable = new javax.swing.JLabel();
        customerContact = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        removeButoon = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        wrapper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setOpaque(true);

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                " ID", "Name", "Address", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTable);
        if (customerTable.getColumnModel().getColumnCount() > 0) {
            customerTable.getColumnModel().getColumn(0).setResizable(false);
            customerTable.getColumnModel().getColumn(1).setResizable(false);
            customerTable.getColumnModel().getColumn(2).setResizable(false);
            customerTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 650, 260));

        customerId.setBackground(new java.awt.Color(255, 255, 255));
        customerId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerId.setForeground(new java.awt.Color(0, 0, 51));
        customerId.setToolTipText("");
        customerId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        customerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdActionPerformed(evt);
            }
        });
        jPanel1.add(customerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 250, 40));

        customerIdLable.setBackground(new java.awt.Color(255, 255, 255));
        customerIdLable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerIdLable.setForeground(new java.awt.Color(0, 0, 51));
        customerIdLable.setText("  Customer Id");
        customerIdLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        customerIdLable.setOpaque(true);
        jPanel1.add(customerIdLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, 40));

        heading.setBackground(new java.awt.Color(51, 51, 255));
        heading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Customers");
        heading.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51), 3));
        heading.setOpaque(true);
        jPanel1.add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 140, 50));

        customerNameLable.setBackground(new java.awt.Color(255, 255, 255));
        customerNameLable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerNameLable.setForeground(new java.awt.Color(0, 0, 51));
        customerNameLable.setText("  Customer Name");
        customerNameLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        customerNameLable.setOpaque(true);
        jPanel1.add(customerNameLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 180, 40));

        customerName.setBackground(new java.awt.Color(255, 255, 255));
        customerName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerName.setForeground(new java.awt.Color(0, 0, 51));
        customerName.setToolTipText("");
        customerName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        customerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameActionPerformed(evt);
            }
        });
        jPanel1.add(customerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 250, 40));

        customerAddressLable.setBackground(new java.awt.Color(255, 255, 255));
        customerAddressLable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerAddressLable.setForeground(new java.awt.Color(0, 0, 51));
        customerAddressLable.setText("  Customer Address");
        customerAddressLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        customerAddressLable.setOpaque(true);
        jPanel1.add(customerAddressLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 180, 40));

        customerAddress.setBackground(new java.awt.Color(255, 255, 255));
        customerAddress.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerAddress.setForeground(new java.awt.Color(0, 0, 51));
        customerAddress.setToolTipText("");
        customerAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        customerAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerAddressActionPerformed(evt);
            }
        });
        jPanel1.add(customerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 250, 40));

        customerContactLable.setBackground(new java.awt.Color(255, 255, 255));
        customerContactLable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerContactLable.setForeground(new java.awt.Color(0, 0, 51));
        customerContactLable.setText("  Customer Contact");
        customerContactLable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        customerContactLable.setOpaque(true);
        jPanel1.add(customerContactLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 180, 40));

        customerContact.setBackground(new java.awt.Color(255, 255, 255));
        customerContact.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        customerContact.setForeground(new java.awt.Color(0, 0, 51));
        customerContact.setToolTipText("");
        customerContact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        customerContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerContactActionPerformed(evt);
            }
        });
        jPanel1.add(customerContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 250, 40));

        addButton.setBackground(new java.awt.Color(51, 51, 255));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 110, 40));

        updateButton.setBackground(new java.awt.Color(51, 51, 255));
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 110, 40));

        removeButoon.setBackground(new java.awt.Color(51, 51, 255));
        removeButoon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeButoon.setForeground(new java.awt.Color(255, 255, 255));
        removeButoon.setText("Remove");
        removeButoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButoonActionPerformed(evt);
            }
        });
        jPanel1.add(removeButoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 110, 40));

        viewButton.setBackground(new java.awt.Color(51, 51, 255));
        viewButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewButton.setForeground(new java.awt.Color(255, 255, 255));
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 110, 40));

        searchButton.setBackground(new java.awt.Color(51, 51, 255));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 110, 40));

        wrapper.setIcon(new javax.swing.ImageIcon("D:\\Projects_Learn\\Fullstack\\Springboot Academy\\Java Desktop Application Development\\5 JDBC\\Codes\\1,2,3,4\\PoSDesktopApp\\src\\main\\java\\assets\\images\\background2.jpg")); // NOI18N
        jPanel1.add(wrapper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // get variables
        String id = customerId.getText();

        // Input validation to check if fields are empty
        if (id.isBlank()) { //isEmpty() get "   " false.
            JOptionPane.showMessageDialog(rootPane, "Please enter Customer-ID to view customer data!");
            return; // Stop further execution if validation fails
        }

        //connect with database

        String url = "jdbc:mysql://localhost:3306/posdesktopapp";
        String userName = "root";
        String password = "8015";

        //create connection object
        Connection connection = null;
        //create prepared statement object
        PreparedStatement preparedStatement = null;
        //get result object
        ResultSet resultSet = null;

        // SQL query to search customer data by ID

        String sql = "SELECT * FROM customer WHERE customer_id = ?";

        // exception handling in java
        try {
            //load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //extablish connection/connect
            connection = DriverManager.getConnection(url, userName, password);
            //prepare sql statement for security, we use prepared statement interface
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, id);
            resultSet = preparedStatement.executeQuery();

            // get output from object
            if (resultSet.next()) {
                String result_id = resultSet.getString("customer_id");
                String result_name = resultSet.getString("customer_name");
                String result_address = resultSet.getString("customer_address");
                int result_contact = resultSet.getInt("customer_contact");

                customerName.setText(result_name);
                customerAddress.setText(result_address);
                customerContact.setText("" + result_contact);
                //customerContact.setText(String.valueOf(result_contact));

            }else {
                JOptionPane.showMessageDialog(rootPane, "No customer found with the given ID.");
                clearCustomerField();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }

    }//GEN-LAST:event_viewButtonActionPerformed

    private void removeButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButoonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeButoonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // get variables
        String id = customerId.getText();
        String name = customerName.getText();
        String address = customerAddress.getText();
        String contactString = customerContact.getText();

        // Input validation to check if fields are empty
        if (name.isBlank()|| contactString.isBlank()|| id.isBlank()) { //isEmpty() get "   " false.
            JOptionPane.showMessageDialog(rootPane, "Please fill out all required fields!");
            return; // Stop further execution if validation fails
        }

        //avoid "" as input.
        if (address.isBlank()) {
            address = null;
        }

        // check Integer input
        try {
            // Handle invalid contact number input
            int contactInt = Integer.parseInt(contactString); // Parsing contact to integer
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Invalid contact number. Please enter a valid integer.");
            return; // Stop further execution if contact parsing fails
        }

        int contactInt = Integer.parseInt(contactString);

        //connect with database

        String url = "jdbc:mysql://localhost:3306/posdesktopapp";
        String userName = "root";
        String password = "8015";

        //create connection object
        Connection connection = null;
        //create prepared statement object
        PreparedStatement preparedStatement = null;

        // SQL query to update data to customer
        String sql = "UPDATE customer SET customer_name = ?, customer_address = ?, customer_contact = ? WHERE customer_id = ?";

        // exception handling in java
        try {
            //load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //extablish connection/connect
            connection = DriverManager.getConnection(url, userName, password);
            //prepare sql statement for security, we use prepared statement interface
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,address);
            preparedStatement.setInt(3,contactInt);
            preparedStatement.setString(4,id);

            // for execute/press enter button, it is return no.of changed rows(same as sql cmd)
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(rootPane, "Updated successfully!");
                //clear input field
                clearCustomerField();//click ctrl + left click to modify.

            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // get variables
        String id = customerId.getText();
        String name = customerName.getText();
        String address = customerAddress.getText();
        String contactString = customerContact.getText();

        //        int contact = Integer.parseInt(customerContact.getText());
        //        System.out.println(id);
        //        System.out.println(name);
        //        System.out.println(address);
        //        System.out.println(contact);

        // Input validation to check if fields are empty
        if (name.isBlank()|| contactString.isBlank()|| id.isBlank()) { //isEmpty() get "   " false.
            JOptionPane.showMessageDialog(rootPane, "Please fill out all required fields!");
            return; // Stop further execution if validation fails
        }

        //avoid "" as input.
        if (address.isBlank()) {
            address = null;
            /*
            if input field enter "NULL" or "null" is not considerd as null,
            but if we enter "NULL" , we can not identify it in thhe database, so
            delete from customer where customer_adress = "NULL" or customer_adress = "";
            it will delete only fake nulls and empty spaces, real nulls will be remainning.
            DELETE FROM customer WHERE customer_address IS NULL OR customer_address = '';// correct
            */
        }

        // check Integer input
        try {
            // Handle invalid contact number input
            int contactInt = Integer.parseInt(contactString); // Parsing contact to integer
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Invalid contact number. Please enter a valid integer.");
            return; // Stop further execution if contact parsing fails
        }

        int contactInt = Integer.parseInt(contactString);

        //connect with database

        String url = "jdbc:mysql://localhost:3306/posdesktopapp";
        String userName = "root";
        String password = "8015";

        //create connection object
        Connection connection = null;
        //create prepared statement object
        PreparedStatement preparedStatement = null;

        // SQL query to insert data to customer
        String sql = "INSERT INTO customer VALUES(?,?,?,?)";

        // exception handling in java
        try {
            //load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //extablish connection/connect
            connection = DriverManager.getConnection(url, userName, password);
            //prepare sql statement for security, we use prepared statement interface
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,address);
            preparedStatement.setInt(4,contactInt);

            // for execute/press enter button, it is return no.of changed rows(same as sql cmd)
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(rootPane, "Customer added successfully!");
                //clear input field
                clearCustomerField();//click ctrl + left click to modify
                //                customerId.setText("");
                //                customerName.setText("");
                //                customerAddress.setText("");
                //                customerContact.setText("");

            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }

        //        } catch(ClassNotFoundException ex) {
        //            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        //        } catch(SQLException ex) {
        //            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        //        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void customerContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerContactActionPerformed

    private void customerAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerAddressActionPerformed

    private void customerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameActionPerformed

    private void customerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdActionPerformed
        // same code from view button, action perform when enter click perform action.
        // get variables
        String id = customerId.getText();

        // Input validation to check if fields are empty
        if (id.isBlank()) { //isEmpty() get "   " false.
            JOptionPane.showMessageDialog(rootPane, "Please enter Customer-ID to view customer data!");
            return; // Stop further execution if validation fails
        }

        //connect with database

        String url = "jdbc:mysql://localhost:3306/posdesktopapp";
        String userName = "root";
        String password = "8015";

        //create connection object
        Connection connection = null;
        //create prepared statement object
        PreparedStatement preparedStatement = null;
        //get result object
        ResultSet resultSet = null;

        // SQL query to search customer data by ID

        String sql = "SELECT * FROM customer WHERE customer_id = ?";

        // exception handling in java
        try {
            //load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //extablish connection/connect
            connection = DriverManager.getConnection(url, userName, password);
            //prepare sql statement for security, we use prepared statement interface
            preparedStatement = connection.prepareCall(sql);
            preparedStatement.setString(1, id);
            resultSet = preparedStatement.executeQuery();

            // get output from object
            if (resultSet.next()) {
                String result_id = resultSet.getString("customer_id");
                String result_name = resultSet.getString("customer_name");
                String result_address = resultSet.getString("customer_address");
                int result_contact = resultSet.getInt("customer_contact");

                customerName.setText(result_name);
                customerAddress.setText(result_address);
                customerContact.setText("" + result_contact);
                //customerContact.setText(String.valueOf(result_contact));

            }else {
                JOptionPane.showMessageDialog(rootPane, "No customer found with the given ID.");
                clearCustomerField();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }//GEN-LAST:event_customerIdActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView().setVisible(true);
            }
        });
    }
    
    // method for clear customer field
    public void clearCustomerField() {
        customerId.setText("");
        customerName.setText("");
        customerAddress.setText("");
        customerContact.setText("");
    }
    
    // method for load all data to table
    public void searchAllData() {
        
        //connect with database

        String url = "jdbc:mysql://localhost:3306/posdesktopapp";
        String userName = "root";
        String password = "8015";

        //create connection object
        Connection connection = null;
        //create prepared statement object
        PreparedStatement preparedStatement = null;
        //create result store object
        ResultSet resultSet = null;
        
        //deal with table
        DefaultTableModel dtm = (DefaultTableModel) customerTable.getModel();
        dtm.setRowCount(0);

        // SQL query to load data from customer
        String sql = "SELECT * FROM customer";

        // exception handling in java
        try {
            //load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //extablish connection/connect
            connection = DriverManager.getConnection(url, userName, password);
            //prepare sql statement for security, we use prepared statement interface
            preparedStatement = connection.prepareCall(sql);
            
            //execute
            resultSet = preparedStatement.executeQuery();
            
            //get data from result object
            while (resultSet.next()) {
                String result_id = resultSet.getString("customer_id");
                String result_name = resultSet.getString("customer_name");
                String result_address = resultSet.getString("customer_address");
                int result_contact = resultSet.getInt("customer_contact");
                
                dtm.addRow(new Object[] {result_id,result_name,result_address,result_contact});
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField customerAddress;
    private javax.swing.JLabel customerAddressLable;
    private javax.swing.JTextField customerContact;
    private javax.swing.JLabel customerContactLable;
    private javax.swing.JTextField customerId;
    private javax.swing.JLabel customerIdLable;
    private javax.swing.JTextField customerName;
    private javax.swing.JLabel customerNameLable;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeButoon;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    private javax.swing.JLabel wrapper;
    // End of variables declaration//GEN-END:variables
}
