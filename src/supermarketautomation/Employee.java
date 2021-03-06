/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarketautomation;

/**
 *
 * @author Dhanush Pamujula
 */
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    Connection Con,aon;
    Statement St;
    ResultSet Rs;
    
    public Employee() {
        initComponents();
        this.setVisible(true);
    }
    
    public Employee(String s)
    {
        initComponents();
        this.setVisible(true);
        //JOptionPane.showMessageDialog(this,s);
        EmpId.setText(String.valueOf(s));
        try{
        Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
        String que="Select Name from Users where UserId ='"+s+"'";
        St=Con.createStatement();
        Rs=St.executeQuery(que);
        Rs.next();
        EmpName.setText(String.valueOf(Rs.getString(1)));
        Con.close();
        getCat();
        SelectProduct();
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EmpName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EmpId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ProName = new javax.swing.JTextField();
        AddStock = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        Logout = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Category = new javax.swing.JComboBox<>();
        Filter = new javax.swing.JButton();
        EditStock = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DMS MARKET SYSTEM");
        setBackground(new java.awt.Color(0, 0, 180));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 180));

        jLabel8.setBackground(new java.awt.Color(255, 0, 0));
        jLabel8.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PRODUCT STOCKS");
        jLabel8.setToolTipText("");
        jLabel8.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setIconTextGap(5);

        jLabel5.setBackground(new java.awt.Color(255, 0, 0));
        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EMPLOYEE ID :");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.setIconTextGap(5);
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 26));

        EmpName.setEditable(false);
        EmpName.setBackground(new java.awt.Color(204, 204, 204));
        EmpName.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        EmpName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmpName.setPreferredSize(new java.awt.Dimension(80, 26));
        EmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpNameActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EMPLOYEE NAME:");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.setIconTextGap(5);
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 26));

        EmpId.setEditable(false);
        EmpId.setBackground(new java.awt.Color(204, 204, 204));
        EmpId.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        EmpId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmpId.setPreferredSize(new java.awt.Dimension(80, 26));
        EmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpIdActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 0, 0));
        jLabel9.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PRODUCT ID :");
        jLabel9.setToolTipText("");
        jLabel9.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setIconTextGap(5);
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 26));

        PId.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        PId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PId.setPreferredSize(new java.awt.Dimension(80, 26));
        PId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIdActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 0, 0));
        jLabel10.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("PRODUCT NAME :");
        jLabel10.setToolTipText("");
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.setIconTextGap(5);
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 26));

        ProName.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        ProName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ProName.setPreferredSize(new java.awt.Dimension(80, 26));
        ProName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProNameActionPerformed(evt);
            }
        });

        AddStock.setBackground(new java.awt.Color(160, 160, 160));
        AddStock.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        AddStock.setText("ADD STOCK");
        AddStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStockMouseClicked(evt);
            }
        });
        AddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStockActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 0, 0));
        jLabel11.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("QUANTITY :");
        jLabel11.setToolTipText("");
        jLabel11.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setIconTextGap(5);
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 26));

        Quantity.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        Quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Quantity.setPreferredSize(new java.awt.Dimension(80, 26));
        Quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(160, 160, 160));
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

        jLabel12.setBackground(new java.awt.Color(255, 0, 0));
        jLabel12.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CATEGORY :");
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setIconTextGap(5);
        jLabel12.setPreferredSize(new java.awt.Dimension(50, 26));

        Category.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        Category.setAutoscrolls(true);
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });

        Filter.setBackground(new java.awt.Color(160, 160, 160));
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

        EditStock.setBackground(new java.awt.Color(160, 160, 160));
        EditStock.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        EditStock.setText("EDIT STOCK");
        EditStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditStockMouseClicked(evt);
            }
        });
        EditStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStockActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(160, 160, 160));
        Clear.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        Clear.setText("CLEAR");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 0, 0));
        jLabel13.setFont(new java.awt.Font("Gadugi", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PRODUCT LIST");
        jLabel13.setToolTipText("");
        jLabel13.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setIconTextGap(5);

        jPanel1.setBackground(new java.awt.Color(0, 0, 180));

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "CATEGORY", "STOCK"
            }
        ));
        ProductsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Filter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EmpName, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(ProName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Logout))
                    .addComponent(EditStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(99, 99, 99))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Logout))
                    .addComponent(EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddStock))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditStock))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filter)
                    .addComponent(Clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jLabel7.setBackground(new java.awt.Color(255, 0, 0));
        jLabel7.setFont(new java.awt.Font("Gadugi", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BILLING SYSTEM");
        jLabel7.setToolTipText("");
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setIconTextGap(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(277, 277, 277)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(273, 273, 273)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(214, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpNameActionPerformed

    private void EmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpIdActionPerformed

    private void PIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PIdActionPerformed

    private void ProNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProNameActionPerformed

    private void AddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddStockActionPerformed

    private void QuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryActionPerformed

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilterActionPerformed

    private void EditStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditStockActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearActionPerformed

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Login();
    }//GEN-LAST:event_LogoutMouseClicked

    private void FilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseClicked
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
            PreparedStatement add = Con.prepareStatement("Select Id,name,category,stock from supermarket.products where category=? order by name");
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
    }//GEN-LAST:event_FilterMouseClicked

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        // TODO add your handling code here:
        PId.setText("");
        ProName.setText("");
        Quantity.setText("");
    }//GEN-LAST:event_ClearMouseClicked
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
    private void AddStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStockMouseClicked
        // TODO add your handling code here:
        if(PId.getText().isEmpty() || Quantity.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Information is Missing");
            return;
        }
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("update products set Stock=Stock+? where Id=?");
            if(CheckUniqueProId(PId.getText().toString()))
            {
                JOptionPane.showMessageDialog(this,"Product Id doesn't Exist");
                Con.close();
                return;
            }
            add.setInt(1, Integer.valueOf(Quantity.getText().toString()));
            add.setString(2,PId.getText().toString());
            int row=add.executeUpdate();
            Con.close();
            JOptionPane.showMessageDialog(this, "Stock Added Successfully");
            SelectProduct();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AddStockMouseClicked

    private void EditStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditStockMouseClicked
        // TODO add your handling code here:
        if(PId.getText().isEmpty() || Quantity.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Information is Missing");
            return;
        }
        try
        {
            Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
            PreparedStatement add = Con.prepareStatement("update products set Stock=? where Id=?");
            if(CheckUniqueProId(PId.getText().toString()))
            {
                JOptionPane.showMessageDialog(this,"Product Id doesn't Exist");
                Con.close();
                return;
            }
            add.setInt(1, Integer.valueOf(Quantity.getText().toString()));
            add.setString(2,PId.getText().toString());
            int row=add.executeUpdate();
            Con.close();
            JOptionPane.showMessageDialog(this, "Stock Edited Successfully");
            SelectProduct();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EditStockMouseClicked

    private void ProductsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTableMouseClicked
        // TODO add your handling code here:
        try{
        aon =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
        Statement s=aon.createStatement();
        DefaultTableModel model = (DefaultTableModel)ProductsTable.getModel();
        int Index=ProductsTable.getSelectedRow();
        PId.setText(model.getValueAt(Index,0).toString());
        ProName.setText(model.getValueAt(Index,1).toString());
        Category.setSelectedItem(model.getValueAt(Index,2).toString());
        Quantity.setText("0");
        //BasePrice.setText(model.getValueAt(Index,4).toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ProductsTableMouseClicked

    private void SelectProduct()
    {
        try
    {
        Con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket","dhanu","root123");
        St= Con.createStatement();
        Rs = St.executeQuery("Select Id,Name,Category,Stock from supermarket.Products order by Id");
        ProductsTable.setModel(DbUtils.resultSetToTableModel(Rs));
        Con.close();
        
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    }
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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee("E0001").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStock;
    private javax.swing.JComboBox<String> Category;
    private javax.swing.JButton Clear;
    private javax.swing.JButton EditStock;
    private javax.swing.JTextField EmpId;
    private javax.swing.JTextField EmpName;
    private javax.swing.JButton Filter;
    private javax.swing.JButton Logout;
    private javax.swing.JTextField PId;
    private javax.swing.JTextField ProName;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JTextField Quantity;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
