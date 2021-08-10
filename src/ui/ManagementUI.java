package ui;

import dao.TblCategoriesDAO;
import dao.TblProductsDAO;
import dao.TblUsersDAO;
import dto.Category;
import dto.Product;
import java.awt.CardLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ManagementUI extends javax.swing.JFrame {
    
    TblUsersDAO listUsers = new TblUsersDAO();
    TblCategoriesDAO modelCategory;
    TblProductsDAO modelProduct;
    
    final int SUCCESS = 1;
    boolean addNewProduct = true;
    boolean addNewCategory = true;
    boolean deleteCategory = true;
    boolean deleteProduct = true;
    
    public ManagementUI() throws Exception {
        initComponents();
        setLocationRelativeTo(null);
        
        listUsers.loadData();
        
        modelCategory = new TblCategoriesDAO();
        tblCategory.setModel(modelCategory.getModelCategory());
        
        modelProduct = new TblProductsDAO();
        tblProduct.setModel(modelProduct.getModelProduct());
        
        try {
            cbxCategoryName.setModel(new DefaultComboBoxModel<>(modelCategory.getListCategoriesComboBox()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void clearInformationCategoryOnTable() {
        txtCategoryID.setText("");
        txtCategoryName.setText("");
        txtDescription.setText("");
    }
    
    void clearInformationProductOnTable() {
        txtProductID.setText("");
        txtProductName.setText("");
        txtUnit.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pfdPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pCategory = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCategoryID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCategoryName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnAddCategory = new javax.swing.JButton();
        btnSaveCategory = new javax.swing.JButton();
        btnDeleteCategory = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        pProduct = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxCategoryName = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAddProduct = new javax.swing.JButton();
        btnSaveProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("User's Information");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel11.setText("User ID:");

        txtUserID.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel12.setText("Password:");

        pfdPassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUserID)
                                    .addComponent(pfdPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                                .addGap(100, 100, 100))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(506, 506, 506)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel11, jLabel12});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pfdPassword, txtUserID});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pfdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel12});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pfdPassword, txtUserID});

        getContentPane().add(jPanel3, "card3");

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Main part:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 15))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        tblCategory.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategory);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detailed part:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 15))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Category ID:");

        txtCategoryID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Category name:");

        txtCategoryName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Description:");

        btnAddCategory.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAddCategory.setText("Add New");
        btnAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoryActionPerformed(evt);
            }
        });

        btnSaveCategory.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSaveCategory.setText("Save");
        btnSaveCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCategoryActionPerformed(evt);
            }
        });

        btnDeleteCategory.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDeleteCategory.setText("Delete");
        btnDeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCategoryActionPerformed(evt);
            }
        });

        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCategoryID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCategoryName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(119, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAddCategory)
                        .addGap(45, 45, 45)
                        .addComponent(btnSaveCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeleteCategory)
                        .addGap(32, 32, 32))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel7, jLabel8, jLabel9});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCategoryID, txtCategoryName});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddCategory, btnDeleteCategory, btnSaveCategory});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCategory)
                    .addComponent(btnSaveCategory)
                    .addComponent(btnDeleteCategory))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel7, jLabel8, jLabel9});

        javax.swing.GroupLayout pCategoryLayout = new javax.swing.GroupLayout(pCategory);
        pCategory.setLayout(pCategoryLayout);
        pCategoryLayout.setHorizontalGroup(
            pCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCategoryLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pCategoryLayout.setVerticalGroup(
            pCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Category", pCategory);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Main part:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 15))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        tblProduct.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProduct);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detailed part:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 15))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Product ID:");

        txtProductID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Product name:");

        txtProductName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Category name:");

        cbxCategoryName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Unit:");

        txtUnit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Quantity:");

        txtQuantity.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Price:");

        txtPrice.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnAddProduct.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnAddProduct.setText("Add New");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnSaveProduct.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSaveProduct.setText("Save");
        btnSaveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProductActionPerformed(evt);
            }
        });

        btnDeleteProduct.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDeleteProduct.setText("Delete");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrice)
                            .addComponent(txtQuantity)
                            .addComponent(txtUnit)
                            .addComponent(txtProductName)
                            .addComponent(txtProductID, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(cbxCategoryName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAddProduct)
                        .addGap(43, 43, 43)
                        .addComponent(btnSaveProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btnDeleteProduct)))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel4, jLabel5, jLabel6});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPrice, txtProductID, txtProductName, txtQuantity, txtUnit});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddProduct, btnDeleteProduct, btnSaveProduct});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbxCategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProduct)
                    .addComponent(btnSaveProduct)
                    .addComponent(btnDeleteProduct))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPrice, txtProductID, txtProductName, txtQuantity, txtUnit});

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddProduct, btnDeleteProduct, btnSaveProduct});

        javax.swing.GroupLayout pProductLayout = new javax.swing.GroupLayout(pProduct);
        pProduct.setLayout(pProductLayout);
        pProductLayout.setHorizontalGroup(
            pProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pProductLayout.setVerticalGroup(
            pProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Product", pProduct);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMouseClicked
        int selectedRow = tblCategory.getSelectedRow();
        Category ca = modelCategory.getModelCategory().getList().get(selectedRow);
        txtCategoryID.setText(ca.getCategoryID());
        txtCategoryID.setEditable(false);
        txtCategoryName.setText(ca.getCategoryName());
        txtDescription.setText(ca.getDescription());
        addNewCategory = false;
        deleteCategory = true;
    }//GEN-LAST:event_tblCategoryMouseClicked

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        int selectedRow = tblProduct.getSelectedRow();
        Product pro = modelProduct.getModelProduct().getList().get(selectedRow);
        txtProductID.setText(pro.getProductID());
        txtProductID.setEditable(false);
        txtProductName.setText(pro.getProductName());
        cbxCategoryName.setSelectedItem(pro.getCategoryID() + " - " + modelCategory.getCategoryNameComboBox(pro.getCategoryID()));
        txtUnit.setText(pro.getUnit());
        txtPrice.setText(String.valueOf(pro.getPrice()));
        txtQuantity.setText(String.valueOf(pro.getQuantity()));
        addNewProduct = false;
        deleteProduct = true;
    }//GEN-LAST:event_tblProductMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String userID = txtUserID.getText();
        String password = String.valueOf(pfdPassword.getPassword());
        if (listUsers.checkLogin(userID, password) == true) {
            JOptionPane.showMessageDialog(null, "DNTC");
            CardLayout layout = (CardLayout) this.getContentPane().getLayout();
            layout.next(this.getContentPane());
        } else {
            JOptionPane.showMessageDialog(null, "DNTB");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoryActionPerformed
        txtCategoryID.setEditable(true);
        clearInformationCategoryOnTable();
        addNewCategory = true;
        deleteCategory = false;
    }//GEN-LAST:event_btnAddCategoryActionPerformed

    private void btnSaveCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCategoryActionPerformed
        if (!modelCategory.validData(txtCategoryID.getText().trim(), txtCategoryName.getText().trim(),
                txtDescription.getText().trim())) {
            return;
        }
        if (addNewCategory) {
            try {
                if (!modelCategory.validDataCategoryID(txtCategoryID.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "DUPLICATE CATEGORYID at " + txtCategoryID.getText().trim());
                    return;
                }
                Category ca = new Category(txtCategoryID.getText().trim().toUpperCase(),
                        txtCategoryName.getText().trim(),
                        txtDescription.getText().trim());
                
                if (modelCategory.Insert(ca) == SUCCESS) {
                    modelCategory.getModelCategory().getList().add(ca);
                    modelCategory.getListCategoriesComboBox().add(ca.getCategoryID() + " - " + ca.getCategoryName());
                }
                addNewCategory = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                int selectedRow = tblCategory.getSelectedRow();
                if (selectedRow < 0) {
                    JOptionPane.showMessageDialog(this, "Choose Row to Edit!!!");
                    return;
                }
                Category caNew = new Category(txtCategoryID.getText().trim().toUpperCase(), txtCategoryName.getText().trim(),
                        txtDescription.getText().trim());
                Category caOld = modelCategory.getModelCategory().getList().get(selectedRow);
                
                if (modelCategory.Save(caNew) == SUCCESS) {
                    modelCategory.getListCategoriesComboBox().remove(caOld.getCategoryID() + " - " + caOld.getCategoryName());
                    caOld.setCategoryName(caNew.getCategoryName());
                    caOld.setDescription(caNew.getDescription());
                    modelCategory.getListCategoriesComboBox().add(caNew.getCategoryID() + " - " + caNew.getCategoryName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        modelProduct.getModelProduct().loadCategoriesComboBox();
        cbxCategoryName.setModel(new DefaultComboBoxModel<>(modelCategory.getListCategoriesComboBox()));
        tblCategory.updateUI();
    }//GEN-LAST:event_btnSaveCategoryActionPerformed

    private void btnDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCategoryActionPerformed
        try {
            int selectedRow = tblCategory.getSelectedRow();
            if (selectedRow < 0 || deleteCategory == false) {
                JOptionPane.showMessageDialog(this, "Choose the Row to Delete");
                return;
            }
            int r = JOptionPane.showConfirmDialog(this, "Do you want to Delete this Category?");
            if (r == JOptionPane.YES_OPTION) {
                Category ca = modelCategory.getModelCategory().getList().get(selectedRow);
                if (!modelProduct.checkconstraintCategoryID(ca.getCategoryID())) {
                    JOptionPane.showMessageDialog(this, "Still Products is manager by this Category");
                    return;
                }
                if (modelCategory.Delete(ca) == SUCCESS) {
                    deleteCategory = false;
                    modelCategory.getModelCategory().getList().remove(ca);
                    modelCategory.getListCategoriesComboBox().remove(ca.getCategoryID() + " - " + ca.getCategoryName());
                    JOptionPane.showMessageDialog(this, "Deleted");
                    cbxCategoryName.setModel(new DefaultComboBoxModel<>(modelCategory.getListCategoriesComboBox()));
                    clearInformationCategoryOnTable();
                    modelProduct.getModelProduct().loadCategoriesComboBox();
                    tblCategory.updateUI();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteCategoryActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        txtProductID.setEditable(true);
        clearInformationProductOnTable();
        addNewProduct = true;
        deleteProduct = false;
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnSaveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProductActionPerformed
        if (!modelProduct.validData(txtProductID.getText().trim(), txtProductName.getText().trim(), txtUnit.getText().trim(),
                txtPrice.getText().trim(), txtQuantity.getText().trim(), cbxCategoryName.getSelectedItem())) {
            return;
        }
        if (addNewProduct) {
            try {
                if (!modelProduct.validDataProductID(txtProductID.getText().trim())) {
                    JOptionPane.showMessageDialog(this, "DUPLICATED PRODUCTID at " + txtProductID.getText().trim());
                    return;
                }
                Product pro = new Product(txtProductID.getText().toUpperCase().trim(),
                        txtProductName.getText().trim(),
                        txtUnit.getText().trim(),
                        Float.parseFloat(txtPrice.getText().trim()),
                        Integer.parseInt(txtQuantity.getText().trim()),
                        modelProduct.loadCategoryIDIntoProduct(cbxCategoryName.getSelectedItem().toString()));
                if (modelProduct.Insert(pro) == SUCCESS) {
                    modelProduct.getModelProduct().getList().add(pro);
                }
                addNewProduct = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                int selectedRow = tblProduct.getSelectedRow();
                if (selectedRow < 0) {
                    JOptionPane.showMessageDialog(this, "Please Choose Row to Edit");
                }
                
                Product proOld = modelProduct.getModelProduct().getList().get(selectedRow);
                Product proNew = new Product(txtProductID.getText().trim().toUpperCase(),
                        txtProductName.getText().trim(),
                        txtUnit.getText().trim(),
                        Float.parseFloat(txtPrice.getText().trim()),
                        Integer.parseInt(txtQuantity.getText().trim()),
                        modelProduct.loadCategoryIDIntoProduct(cbxCategoryName.getSelectedItem().toString()));
                if (modelProduct.Save(proNew) == SUCCESS) {
                    proOld.setProductName(proNew.getProductName());
                    proOld.setUnit(proNew.getUnit());
                    proOld.setPrice(proNew.getPrice());
                    proOld.setQuantity(proNew.getQuantity());
                    proOld.setCategoryID(proNew.getCategoryID());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        tblProduct.updateUI();
    }//GEN-LAST:event_btnSaveProductActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed
        try {
            int selectedRow = tblProduct.getSelectedRow();
            if (selectedRow < 0 || deleteProduct == false) {
                JOptionPane.showMessageDialog(this, "Choose the Row to Delete");
                return;
            }
            int r = JOptionPane.showConfirmDialog(this, "Do you want to Delete this Product?");
            if (r == JOptionPane.YES_OPTION) {
                Product pro = modelProduct.getModelProduct().getList().get(selectedRow);
                if (modelProduct.Delete(pro) == SUCCESS) {
                    deleteProduct = false;
                    modelProduct.getModelProduct().getList().remove(pro);
                    JOptionPane.showMessageDialog(this, "Deleted");
                    clearInformationProductOnTable();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        tblProduct.updateUI();
    }//GEN-LAST:event_btnDeleteProductActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManagementUI().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ManagementUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnDeleteCategory;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSaveCategory;
    private javax.swing.JButton btnSaveProduct;
    private javax.swing.JComboBox<String> cbxCategoryName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pCategory;
    private javax.swing.JPanel pProduct;
    private javax.swing.JPasswordField pfdPassword;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtCategoryID;
    private javax.swing.JTextField txtCategoryName;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUnit;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
