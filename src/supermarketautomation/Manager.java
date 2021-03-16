/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarketautomation;

//import com.mysql.cj.xdevapi.Statement;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
//import java.*;
import java.time.*;
//import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import net.proteanit.sql.*;

/**
 *
 * @author Dhanush Pamujula
 */
public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    public Manager() {
        initComponents();
        this.setVisible(true);
        SelectUser();
        SelectCategory();
        SelectProduct();
        getCat();
    }
    Connection Con = null,aon=null;
    Statement St = null;
    ResultSet Rs = null;
    
private void SelectUser()
{
    try
    {
        Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
        St= Con.createStatement();
        Rs = St.executeQuery("Select * from supermarket.Users where Role = 'SALES CLERK' or Role='EMPLOYEE' order by name");
        UsersTable.setModel(DbUtils.resultSetToTableModel(Rs));
        Con.close();
        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendarDemo1 = new com.toedter.calendar.demo.JCalendarDemo();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        UserID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Logout = new javax.swing.JButton();
        Role = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        Edit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Rolefilter = new javax.swing.JComboBox<>();
        Filter = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        Gender = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        CategoryName = new javax.swing.JTextField();
        AddCategory = new javax.swing.JButton();
        EditCategory = new javax.swing.JButton();
        DeleteCategory = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CategoryTable = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        CategoryId = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        InvPId = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        InvProName = new javax.swing.JTextField();
        Category = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        InvStock = new javax.swing.JTextField();
        AddProduct = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        BasePrice = new javax.swing.JTextField();
        InvFilter = new javax.swing.JButton();
        EditProduct = new javax.swing.JButton();
        DeleteProduct = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        LogoutInv = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        StaPId = new javax.swing.JTextField();
        StaLogout = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        From = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        To = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        TotalQuantity = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        TotalProfit = new javax.swing.JTextField();
        view = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ProfitTable = new javax.swing.JTable();

        javax.swing.GroupLayout jCalendarDemo1Layout = new javax.swing.GroupLayout(jCalendarDemo1.getContentPane());
        jCalendarDemo1.getContentPane().setLayout(jCalendarDemo1Layout);
        jCalendarDemo1Layout.setHorizontalGroup(
            jCalendarDemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jCalendarDemo1Layout.setVerticalGroup(
            jCalendarDemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DMS MARKET SYSTEM");

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane3.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 180));

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EMPLOYEE/SALES CLERK DETAILS");
        jLabel7.setToolTipText("");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setIconTextGap(5);

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ID :");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setIconTextGap(5);
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 26));

        UserID.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        UserID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserID.setPreferredSize(new java.awt.Dimension(80, 26));
        UserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("NAME : ");
        jLabel8.setToolTipText("");
        jLabel8.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setIconTextGap(5);
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 26));

        Name.setFont(new java.awt.Font("Gadugi", 0, 13)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name.setPreferredSize(new java.awt.Dimension(80, 26));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(204, 204, 204));
        Logout.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        Logout.setText("LOGOUT");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        Role.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SALES CLERK", "EMPLOYEE" }));
        Role.setAutoscrolls(true);
        Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("USER TYPE : ");
        jLabel9.setToolTipText("");
        jLabel9.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setIconTextGap(5);
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 26));

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("GENDER : ");
        jLabel10.setToolTipText("");
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.setIconTextGap(5);
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 26));

        Add.setBackground(new java.awt.Color(204, 204, 204));
        Add.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        Add.setText("ADD");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("PASSWORD : ");
        jLabel11.setToolTipText("");
        jLabel11.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setIconTextGap(5);
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 26));

        Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Password.setEchoChar('\u2022');
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PasswordMousePressed(evt);
            }
        });
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });

        Edit.setBackground(new java.awt.Color(204, 204, 204));
        Edit.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        Edit.setText("EDIT DETAILS");
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
        });
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 0, 0));
        jLabel12.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("VIEW :");
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setIconTextGap(5);
        jLabel12.setPreferredSize(new java.awt.Dimension(50, 26));

        Rolefilter.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        Rolefilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "SALES CLERK", "EMPLOYEE" }));
        Rolefilter.setAutoscrolls(true);
        Rolefilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolefilterActionPerformed(evt);
            }
        });

        Filter.setBackground(new java.awt.Color(204, 204, 204));
        Filter.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        Filter.setText("FILTER");
        Filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FilterMouseClicked(evt);
            }
        });
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(204, 204, 204));
        Delete.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        Delete.setText("DELETE");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("DETAILS LIST");
        jLabel13.setToolTipText("");
        jLabel13.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setIconTextGap(5);

        UsersTable.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "CATEGORY", "GENDER", "PASSWORD"
            }
        ));
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        Gender.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        Gender.setAutoscrolls(true);
        Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rolefilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Logout)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rolefilter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filter)
                    .addComponent(Delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("EMPLOYEE/CLERK", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 180));

        jLabel14.setBackground(new java.awt.Color(255, 0, 0));
        jLabel14.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("INVENTORY");
        jLabel14.setToolTipText("");
        jLabel14.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setIconTextGap(5);

        jTabbedPane1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setBackground(new java.awt.Color(255, 0, 0));
        jLabel15.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("CATEGORY NAME :");
        jLabel15.setToolTipText("");
        jLabel15.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setIconTextGap(5);
        jLabel15.setPreferredSize(new java.awt.Dimension(50, 26));

        CategoryName.setBackground(new java.awt.Color(102, 255, 255));
        CategoryName.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        CategoryName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CategoryName.setPreferredSize(new java.awt.Dimension(80, 26));
        CategoryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryNameActionPerformed(evt);
            }
        });

        AddCategory.setBackground(new java.awt.Color(204, 204, 204));
        AddCategory.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        AddCategory.setText("ADD CATEGORY");
        AddCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCategoryMouseClicked(evt);
            }
        });
        AddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCategoryActionPerformed(evt);
            }
        });

        EditCategory.setBackground(new java.awt.Color(204, 204, 204));
        EditCategory.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        EditCategory.setText("EDIT CATEGORY");
        EditCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditCategoryMouseClicked(evt);
            }
        });
        EditCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCategoryActionPerformed(evt);
            }
        });

        DeleteCategory.setBackground(new java.awt.Color(204, 204, 204));
        DeleteCategory.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        DeleteCategory.setText("DELETE CATEGORY");
        DeleteCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteCategoryMouseClicked(evt);
            }
        });
        DeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCategoryActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 0, 0));
        jLabel16.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CATEGORIES");
        jLabel16.setToolTipText("");
        jLabel16.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel16.setIconTextGap(5);

        CategoryTable.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        CategoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CATEGORY NAME"
            }
        ));
        CategoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoryTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CategoryTable);

        jLabel24.setBackground(new java.awt.Color(255, 0, 0));
        jLabel24.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("CATEGORY ID :");
        jLabel24.setToolTipText("");
        jLabel24.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel24.setIconTextGap(5);
        jLabel24.setPreferredSize(new java.awt.Dimension(50, 26));

        CategoryId.setBackground(new java.awt.Color(102, 255, 255));
        CategoryId.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        CategoryId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CategoryId.setPreferredSize(new java.awt.Dimension(80, 26));
        CategoryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(AddCategory)
                        .addGap(33, 33, 33)
                        .addComponent(EditCategory)
                        .addGap(38, 38, 38)
                        .addComponent(DeleteCategory))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddCategory)
                    .addComponent(EditCategory)
                    .addComponent(DeleteCategory))
                .addGap(26, 26, 26)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD CATEGORIES", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N

        jLabel17.setBackground(new java.awt.Color(255, 0, 0));
        jLabel17.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("PRODUCT ID :");
        jLabel17.setToolTipText("");
        jLabel17.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.setIconTextGap(5);
        jLabel17.setPreferredSize(new java.awt.Dimension(50, 26));

        InvPId.setBackground(new java.awt.Color(102, 255, 255));
        InvPId.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        InvPId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InvPId.setPreferredSize(new java.awt.Dimension(80, 26));
        InvPId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvPIdActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 0, 0));
        jLabel18.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("PRODUCT NAME :");
        jLabel18.setToolTipText("");
        jLabel18.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel18.setIconTextGap(5);
        jLabel18.setPreferredSize(new java.awt.Dimension(50, 26));

        InvProName.setBackground(new java.awt.Color(102, 255, 255));
        InvProName.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        InvProName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InvProName.setPreferredSize(new java.awt.Dimension(80, 26));
        InvProName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvProNameActionPerformed(evt);
            }
        });

        Category.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        Category.setAutoscrolls(true);
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 0, 0));
        jLabel19.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("CATEGORY :");
        jLabel19.setToolTipText("");
        jLabel19.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel19.setIconTextGap(5);
        jLabel19.setPreferredSize(new java.awt.Dimension(50, 26));

        jLabel20.setBackground(new java.awt.Color(255, 0, 0));
        jLabel20.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("STOCK :");
        jLabel20.setToolTipText("");
        jLabel20.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel20.setIconTextGap(5);
        jLabel20.setPreferredSize(new java.awt.Dimension(50, 26));

        InvStock.setBackground(new java.awt.Color(102, 255, 255));
        InvStock.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        InvStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InvStock.setPreferredSize(new java.awt.Dimension(80, 26));
        InvStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvStockActionPerformed(evt);
            }
        });

        AddProduct.setBackground(new java.awt.Color(204, 204, 204));
        AddProduct.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        AddProduct.setText("ADD PRODUCT");
        AddProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddProductMouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 0, 0));
        jLabel22.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("PURCHASE PRICE :");
        jLabel22.setToolTipText("");
        jLabel22.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel22.setIconTextGap(5);
        jLabel22.setPreferredSize(new java.awt.Dimension(50, 26));

        BasePrice.setBackground(new java.awt.Color(102, 255, 255));
        BasePrice.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        BasePrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BasePrice.setPreferredSize(new java.awt.Dimension(80, 26));
        BasePrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasePriceActionPerformed(evt);
            }
        });

        InvFilter.setBackground(new java.awt.Color(204, 204, 204));
        InvFilter.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        InvFilter.setText("FILTER");
        InvFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvFilterMouseClicked(evt);
            }
        });
        InvFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvFilterActionPerformed(evt);
            }
        });

        EditProduct.setBackground(new java.awt.Color(204, 204, 204));
        EditProduct.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        EditProduct.setText("EDIT PRODUCT");
        EditProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditProductMouseClicked(evt);
            }
        });

        DeleteProduct.setBackground(new java.awt.Color(204, 204, 204));
        DeleteProduct.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        DeleteProduct.setText("DELETE PRODUCT");
        DeleteProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteProductMouseClicked(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(255, 0, 0));
        jLabel23.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PRODUCTS");
        jLabel23.setToolTipText("");
        jLabel23.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel23.setIconTextGap(5);

        ProductsTable.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "CATEGORY", "STOCK", "PRICE"
            }
        ));
        ProductsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ProductsTable);

        jLabel27.setBackground(new java.awt.Color(255, 0, 0));
        jLabel27.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("SELLING PRICE :");
        jLabel27.setToolTipText("");
        jLabel27.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel27.setIconTextGap(5);
        jLabel27.setPreferredSize(new java.awt.Dimension(50, 26));

        Price.setBackground(new java.awt.Color(102, 255, 255));
        Price.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        Price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Price.setPreferredSize(new java.awt.Dimension(80, 26));
        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InvFilter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BasePrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(InvPId, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(InvProName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(InvStock, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DeleteProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvPId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvProName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddProduct)
                    .addComponent(InvFilter))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditProduct)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(DeleteProduct))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("PRODUCTS", jPanel5);

        LogoutInv.setBackground(new java.awt.Color(204, 204, 204));
        LogoutInv.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        LogoutInv.setText("LOGOUT");
        LogoutInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutInvMouseClicked(evt);
            }
        });
        LogoutInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutInvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(LogoutInv)
                .addGap(127, 127, 127))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoutInv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("INVENTORY", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 180));

        jLabel21.setBackground(new java.awt.Color(255, 0, 0));
        jLabel21.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("PRODUCT ID :");
        jLabel21.setToolTipText("");
        jLabel21.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel21.setIconTextGap(5);
        jLabel21.setPreferredSize(new java.awt.Dimension(50, 26));

        StaPId.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        StaPId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        StaPId.setPreferredSize(new java.awt.Dimension(80, 26));
        StaPId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaPIdActionPerformed(evt);
            }
        });

        StaLogout.setBackground(new java.awt.Color(160, 160, 160));
        StaLogout.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        StaLogout.setText("LOGOUT");
        StaLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StaLogoutMouseClicked(evt);
            }
        });
        StaLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaLogoutActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 0, 0));
        jLabel25.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("STATISTICS");
        jLabel25.setToolTipText("");
        jLabel25.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel25.setIconTextGap(5);

        jLabel26.setBackground(new java.awt.Color(255, 0, 0));
        jLabel26.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("FROM :");
        jLabel26.setToolTipText("");
        jLabel26.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel26.setIconTextGap(5);
        jLabel26.setPreferredSize(new java.awt.Dimension(50, 26));

        From.setDateFormatString("yyyy-MM-dd\n");
        From.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        jLabel28.setBackground(new java.awt.Color(255, 0, 0));
        jLabel28.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("TO :");
        jLabel28.setToolTipText("");
        jLabel28.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel28.setIconTextGap(5);
        jLabel28.setPreferredSize(new java.awt.Dimension(50, 26));

        To.setDateFormatString("yyyy-MM-dd");
        To.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N

        jLabel29.setBackground(new java.awt.Color(255, 0, 0));
        jLabel29.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("TOTAL QUANTITY SOLD :");
        jLabel29.setToolTipText("");
        jLabel29.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel29.setIconTextGap(5);
        jLabel29.setPreferredSize(new java.awt.Dimension(50, 26));

        TotalQuantity.setEditable(false);
        TotalQuantity.setBackground(new java.awt.Color(204, 204, 204));
        TotalQuantity.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        TotalQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalQuantity.setPreferredSize(new java.awt.Dimension(80, 26));
        TotalQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalQuantityActionPerformed(evt);
            }
        });

        jLabel30.setBackground(new java.awt.Color(255, 0, 0));
        jLabel30.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("TOTALPROFIT : ");
        jLabel30.setToolTipText("");
        jLabel30.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel30.setIconTextGap(5);
        jLabel30.setPreferredSize(new java.awt.Dimension(50, 26));

        TotalProfit.setEditable(false);
        TotalProfit.setBackground(new java.awt.Color(204, 204, 204));
        TotalProfit.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        TotalProfit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalProfit.setPreferredSize(new java.awt.Dimension(80, 26));
        TotalProfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalProfitActionPerformed(evt);
            }
        });

        view.setBackground(new java.awt.Color(160, 160, 160));
        view.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        view.setText("VIEW");
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
        });
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        ProfitTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prize Realized", "Quantity Sold", "Profit"
            }
        ));
        jScrollPane4.setViewportView(ProfitTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StaPId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TotalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StaLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(146, 146, 146))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(StaLogout)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(view))))
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(To, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(StaPId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(From, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("STATISTICS", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserIDActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void RolefilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolefilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RolefilterActionPerformed

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    private void GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderActionPerformed

    private void LogoutInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutInvActionPerformed

    private void CategoryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryNameActionPerformed

    private void AddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddCategoryActionPerformed

    private void EditCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditCategoryActionPerformed

    private void DeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteCategoryActionPerformed

    private void InvPIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvPIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvPIdActionPerformed

    private void InvProNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvProNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvProNameActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void InvStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvStockActionPerformed

    private void BasePriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasePriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BasePriceActionPerformed

    private void StaPIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaPIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StaPIdActionPerformed

    private void StaLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StaLogoutActionPerformed

    private void InvFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvFilterActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void TotalQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalQuantityActionPerformed

    private void TotalProfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalProfitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalProfitActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewActionPerformed
    private boolean CheckUniqueID(String s)
    {
        try{
            aon =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = aon.prepareStatement("Select count(*) from Users where UserId=?");
            add.setString(1,String.valueOf(s));
            Rs=add.executeQuery();
            //aon.close();
            Rs.next();
            if(Rs.getInt(1)==0) 
            {
               // JOptionPane.showMessageDialog(this,"False");
                return true;
            }
            return false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        //.showMessageDialog(this,"Execp");
        return false;
    }
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
       if(UserID.getText().isEmpty() || Name.getText().isEmpty() || Password.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Information is Missing");
       }
       else{
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("insert into Users values(?,?,?,?,?)");
            add.setString(1,String.valueOf(UserID.getText()));
            if(!CheckUniqueID(UserID.getText().toString()))
            {
                JOptionPane.showMessageDialog(this,"Id Already Taken,Please Enter another ID");
                Con.close();
                return;
            }
            add.setString(2,String.valueOf(Name.getText()));
            add.setString(3,String.valueOf(Role.getSelectedItem().toString()));
            add.setString(4,String.valueOf(Gender.getSelectedItem().toString()));
            add.setString(5,String.valueOf(Password.getPassword()));
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Added Successfully");  
            Con.close();
            
            SelectUser();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_AddMouseClicked

    private void FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseClicked
        // TODO add your handling code here:
        try
    {
        if(Rolefilter.getSelectedItem().toString()=="SELECT")
        {
            SelectUser();
        }
        else
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("Select * from supermarket.Users where Role=? order by name");
            add.setString(1,String.valueOf(Rolefilter.getSelectedItem()));
            Rs = add.executeQuery();
            UsersTable.setModel(DbUtils.resultSetToTableModel(Rs));
            Con.close();
        }
        
        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }//GEN-LAST:event_FilterMouseClicked
    private void closePassword()
    {
        try{
            Password.setEchoChar('\u2022');
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        // TODO add your handling code here:
        try{
        DefaultTableModel model = (DefaultTableModel)UsersTable.getModel();
        int Index=UsersTable.getSelectedRow();
        UserID.setText(model.getValueAt(Index,0).toString());
        Name.setText(model.getValueAt(Index,1).toString());
        Role.setSelectedItem(model.getValueAt(Index,2));
        Gender.setSelectedItem(model.getValueAt(Index,3));
        Password.setText(model.getValueAt(Index,4).toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        closePassword();
    }//GEN-LAST:event_UsersTableMouseClicked

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PasswordKeyTyped

    private void PasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PasswordMousePressed

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
         if(UserID.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Give the Correct ID for deletion");
       }
       else{
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("delete from Users where UserID=?");
            add.setString(1,String.valueOf(UserID.getText()));
            if(CheckUniqueID(UserID.getText()))
            {
                JOptionPane.showMessageDialog(this,"ID Entered Doesn't Exist");
                Con.close();
                return;
            }
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Deleted Successfully");  
            Con.close();
            
            SelectUser();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_DeleteMouseClicked

    private void PasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyReleased
        // TODO add your handling code here:
        Password.setEchoChar('\u2022');
        
    }//GEN-LAST:event_PasswordKeyReleased

    private void PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyPressed
        // TODO add your handling code here:
        if(Password.echoCharIsSet())
        {
            Password.setEchoChar((char)0);
        }
    }//GEN-LAST:event_PasswordKeyPressed

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_LogoutMouseClicked

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
        // TODO add your handling code here:
        if(UserID.getText().isEmpty() || Name.getText().isEmpty() || Password.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Information is Missing");
       }
       else{
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("update users set name=?,role=?,gender=?,password=? where userid=?");
            add.setString(5,String.valueOf(UserID.getText()));
            if(CheckUniqueID(UserID.getText()))
            {
                JOptionPane.showMessageDialog(this,"ID Entered is Incorrect");
                Con.close();
                return;
            }
            add.setString(1,String.valueOf(Name.getText()));
            add.setString(2,String.valueOf(Role.getSelectedItem().toString()));
            add.setString(3,String.valueOf(Gender.getSelectedItem().toString()));
            add.setString(4,String.valueOf(Password.getPassword()));
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Edited Successfully");  
            Con.close();
            
            SelectUser();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_EditMouseClicked

    private void CategoryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryIdActionPerformed
    private boolean CheckUniqueCatId(String s)
    {
        try{
            aon =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("Select count(*) from Category where CategoryId=?");
            add.setString(1,String.valueOf(s));
            Rs=add.executeQuery();
            aon.close();
            Rs.next();
            if(Rs.getInt(1)==0) return true;
            return false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    private void SelectCategory()
    {
        try
    {
        Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
        St= Con.createStatement();
        Rs = St.executeQuery("Select * from supermarket.Category order by CategoryId");
        CategoryTable.setModel(DbUtils.resultSetToTableModel(Rs));
        Con.close();
        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    private void getCat()
    {
        try{
        Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
        St =Con.createStatement();
        String que="Select Name from supermarket.Category";
        Rs=St.executeQuery(que);
        Category.removeAllItems();
        Category.addItem("SELECT");
        while(Rs.next())
        {
            String cats=Rs.getString("Name");
            Category.addItem(cats);
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private void AddCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCategoryMouseClicked
        // TODO add your handling code here:
        if(CategoryId.getText().isEmpty() || CategoryName.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Information is Missing");
       }
       else{
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("insert into category values(?,?)");
            add.setString(1,String.valueOf(CategoryId.getText()));
            if(!CheckUniqueCatId(CategoryId.getText().toString()))
            {
                JOptionPane.showMessageDialog(this,"ID Entered is already taken");
                Con.close();
                return;
            }
            add.setString(2,String.valueOf(CategoryName.getText()));
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Added Successfully");  
            Con.close();
            SelectCategory();
            Category.addItem(CategoryName.getText().toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_AddCategoryMouseClicked

    private void EditCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditCategoryMouseClicked
        // TODO add your handling code here:
         if(CategoryId.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Information is Missing");
       }
       else{
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("update category set name=? where CategoryId=?");
            add.setString(2,String.valueOf(CategoryId.getText()));
            if(CheckUniqueCatId(CategoryId.getText().toString()))
            {
                JOptionPane.showMessageDialog(this,"ID Doesn't Exist");
                Con.close();
                return;
            }
            add.setString(1,String.valueOf(CategoryName.getText()));
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Edited Successfully");  
            Con.close();
            SelectCategory();
            getCat();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }

    }//GEN-LAST:event_EditCategoryMouseClicked

    private void DeleteCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteCategoryMouseClicked
        // TODO add your handling code here:
         if(CategoryId.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Information is Missing");
       }
       else{
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("delete from category where categoryid=?");
            add.setString(1,String.valueOf(CategoryId.getText()));
            if(CheckUniqueCatId(CategoryId.getText().toString()))
            {
                JOptionPane.showMessageDialog(this,"ID Doesn't Exist");
                Con.close();
                return;
            }
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Deleted Successfully");  
            Con.close();
            SelectCategory();
            getCat();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }

    }//GEN-LAST:event_DeleteCategoryMouseClicked

    private void CategoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoryTableMouseClicked
        // TODO add your handling code here:
        try{
        DefaultTableModel model = (DefaultTableModel)CategoryTable.getModel();
        int Index=CategoryTable.getSelectedRow();
        CategoryId.setText(model.getValueAt(Index,0).toString());
        CategoryName.setText(model.getValueAt(Index,1).toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CategoryTableMouseClicked

    private void LogoutInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutInvMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_LogoutInvMouseClicked
    private void SelectProduct()
    {
        try
    {
        Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
        St= Con.createStatement();
        Rs = St.executeQuery("Select Id,Name,Category,Stock,Price from supermarket.Products order by Id");
        ProductsTable.setModel(DbUtils.resultSetToTableModel(Rs));
        Con.close();
        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
    private void InvFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvFilterMouseClicked
        // TODO add your handling code here:
        try
    {
        if(Category.getSelectedItem().toString()=="SELECT")
        {
            SelectProduct();
        }
        else
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("Select Id,name,category,stock,price from supermarket.products where category=? order by name");
            add.setString(1,String.valueOf(Category.getSelectedItem()));
            Rs = add.executeQuery();
            ProductsTable.setModel(DbUtils.resultSetToTableModel(Rs));
            Con.close();
        }
        
        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

    }//GEN-LAST:event_InvFilterMouseClicked
    private boolean CheckUniqueProId(String s)
    {
         try{
            aon =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("Select count(*) from products where Id=?");
            add.setString(1,String.valueOf(s));
            Rs=add.executeQuery();
            aon.close();
            Rs.next();
            if(Rs.getInt(1)==0) return true;
            return false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(this,"Excpet"); 
        return false;
    }
    private void AddProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddProductMouseClicked
        // TODO add your handling code here:
        if(InvPId.getText().isEmpty() || InvProName.getText().isEmpty() || Category.getSelectedItem().toString()=="SELECT" || BasePrice.getText().isEmpty() || Price.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"Information is Missing");
       }
       else{
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("insert into products values(?,?,?,?,?,?)");
            add.setString(1,String.valueOf(InvPId.getText()));
            if(!CheckUniqueProId(InvPId.getText().toString()))
            {
                JOptionPane.showMessageDialog(this,"ID Entered is already taken");
                Con.close();
                return;
            }
            add.setString(2,String.valueOf(InvProName.getText()));
            add.setString(3,String.valueOf(Category.getSelectedItem()));
            if(InvStock.getText().isEmpty()) add.setInt(4,0);
            else add.setInt(4,Integer.valueOf(InvStock.getText().toString()));
            add.setFloat(5, Float.valueOf(BasePrice.getText().toString()));
            add.setFloat(6, Float.valueOf(Price.getText().toString()));
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Added Successfully");  
            Con.close();
            SelectProduct();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_AddProductMouseClicked

    private void EditProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditProductMouseClicked
        // TODO add your handling code here:
        if(InvPId.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"ID is missing");
       }
       else{
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("update products set Name=?,Category=?,Stock=?,BasePrice=?,Price=? where Id=?");
            add.setString(6,String.valueOf(InvPId.getText()));
            if(CheckUniqueProId(InvPId.getText().toString()))
            {
                JOptionPane.showMessageDialog(this,"ID Entered Doesn't Exist");
                Con.close();
                return;
            }
            add.setString(1,String.valueOf(InvProName.getText()));
            add.setString(2,String.valueOf(Category.getSelectedItem()));
            if(InvStock.getText().isEmpty()) add.setInt(3,0);
            else add.setInt(3,Integer.valueOf(InvStock.getText().toString()));
            add.setFloat(4, Float.valueOf(BasePrice.getText().toString()));
            add.setFloat(5, Float.valueOf(Price.getText().toString()));
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Edited Successfully");  
            Con.close();
            SelectProduct();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_EditProductMouseClicked

    private void DeleteProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteProductMouseClicked
        // TODO add your handling code here:
        if(InvPId.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this,"ID is missing");
       }
       else{
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("delete from products where Id=?");
            add.setString(1,String.valueOf(InvPId.getText()));
            if(CheckUniqueProId(InvPId.getText().toString()))
            {
                JOptionPane.showMessageDialog(this,"ID Entered Doesn't Exist");
                Con.close();
                return;
            }
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Deleted Successfully");  
            Con.close();
            SelectProduct();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_DeleteProductMouseClicked

    private void ProductsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTableMouseClicked
        // TODO add your handling code here:
        try{
        aon =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
        Statement s=aon.createStatement();
        DefaultTableModel model = (DefaultTableModel)ProductsTable.getModel();
        int Index=ProductsTable.getSelectedRow();
        InvPId.setText(model.getValueAt(Index,0).toString());
        String que="Select BasePrice from Products where Id ='"+InvPId.getText()+"'";
        Rs=s.executeQuery(que);
        Rs.next();
        BasePrice.setText(String.valueOf(Rs.getFloat(1)));
        InvProName.setText(model.getValueAt(Index,1).toString());
        Category.setSelectedItem(model.getValueAt(Index,2).toString());
        InvStock.setText(model.getValueAt(Index,3).toString());
        //BasePrice.setText(model.getValueAt(Index,4).toString());
        Price.setText(model.getValueAt(Index,4).toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ProductsTableMouseClicked

    private void StaLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StaLogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Login();
    }//GEN-LAST:event_StaLogoutMouseClicked

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        // TODO add your handling code here:
        String s = ((JTextField)From.getDateEditor().getUiComponent()).getText().toString();
        String sp = ((JTextField)To.getDateEditor().getUiComponent()).getText().toString();
        if(StaPId.getText().isEmpty() || s.isEmpty() || sp.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Information is Missing");
            return;
        }
        try{
        Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
        //PreparedStatement add=Con.prepareStatement("select price,sum(quantity),sum(profit) where date between ? and ? group by price");
        //JOptionPane.showMessageDialog(this,s);
        //add.setDate(1, Date.valueOf(s));
        St=Con.createStatement();
        if(CheckUniqueTraProId(StaPId.getText()))
        {
            JOptionPane.showMessageDialog(this,"ID doesn't exist or No Trasaction is yet Made");
            return;
        }
        String que="select price as Price_Realized,sum(quantity) as Quantity,sum(profit) as Profit from transaction where Pid='"+StaPId.getText()+"' and date between '"+s+"' and '"+sp+"' group by price";
        /*add.setDate(1, Date.valueOf(s));
        add.setDate(2, Date.valueOf(sp));
        Rs=add.executeQuery();*/
        Rs=St.executeQuery(que);
        ProfitTable.setModel(DbUtils.resultSetToTableModel(Rs));
        int totqua=0;
        float totpro=0;
        Rs=St.executeQuery(que);
        while(Rs.next())
        {
            totqua+=Rs.getInt(2);
            totpro+=Rs.getFloat(3);
            //JOptionPane.showMessageDialog(this, totqua+" "+totpro);
        }
        
        TotalQuantity.setText(String.valueOf(totqua));
        TotalProfit.setText(String.valueOf(totpro));
        JOptionPane.showMessageDialog(this,"See the down table");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewMouseClicked
    private boolean CheckUniqueTraProId(String s)
    {
         try{
          aon =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("Select count(*) from transaction where PId=?");
            add.setString(1,String.valueOf(s));
            Rs=add.executeQuery();
        aon.close();
            Rs.next();
            if(Rs.getInt(1)==0) return true;
            return false;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(this,"Excpet"); 
        return false;
    }
    private String getsdatas(java.util.Date d)
    {
        String ans="";
        int y=d.getYear();
        ans+=String.valueOf(y);
        ans+="-";
        y=d.getMonth();
        ans+=String.valueOf(y);
        ans+="-";
        y=d.getDate();
        ans+=String.valueOf(y);
        return ans;
    }
    //private JDateChooser sd;
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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton AddCategory;
    private javax.swing.JButton AddProduct;
    private javax.swing.JTextField BasePrice;
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JTextField CategoryId;
    private javax.swing.JTextField CategoryName;
    private javax.swing.JTable CategoryTable;
    private javax.swing.JButton Delete;
    private javax.swing.JButton DeleteCategory;
    private javax.swing.JButton DeleteProduct;
    private javax.swing.JButton Edit;
    private javax.swing.JButton EditCategory;
    private javax.swing.JButton EditProduct;
    private javax.swing.JButton Filter;
    private com.toedter.calendar.JDateChooser From;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JButton InvFilter;
    private javax.swing.JTextField InvPId;
    private javax.swing.JTextField InvProName;
    private javax.swing.JTextField InvStock;
    private javax.swing.JButton Logout;
    private javax.swing.JButton LogoutInv;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Price;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JTable ProfitTable;
    private javax.swing.JComboBox<String> Role;
    private javax.swing.JComboBox<String> Rolefilter;
    private javax.swing.JButton StaLogout;
    private javax.swing.JTextField StaPId;
    private com.toedter.calendar.JDateChooser To;
    private javax.swing.JTextField TotalProfit;
    private javax.swing.JTextField TotalQuantity;
    private javax.swing.JTextField UserID;
    private javax.swing.JTable UsersTable;
    private com.toedter.calendar.demo.JCalendarDemo jCalendarDemo1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
