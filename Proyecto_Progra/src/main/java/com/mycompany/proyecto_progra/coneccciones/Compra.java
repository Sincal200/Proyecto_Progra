
package com.mycompany.proyecto_progra.coneccciones;

import com.mycompany.proyecto_progra.vista.MySqlConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mycompany.proyecto_progra.coneccciones.inventario;
import com.mycompany.proyecto_progra.vista.Ventas;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Compra extends javax.swing.JFrame {
    
    int filas;
    DefaultTableModel modelo;
    MySqlConnector conector = new  MySqlConnector();
    Connection conexion = conector.conectar();
    
    public String cantidad = "";
    public Double total = 0.00;
    public Double parcial;
    public Double operacion;
    public Double total1;
    public Double operacion1;
    public Double total2;
    Connection con = null;
    
    public Connection getConnection(){
        String db = "jdbc:mysql://localhost/compras";
        String usuario = "root";
        String pass = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(db,usuario,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR Base de datos");
    }
    return con;
}
    
    PreparedStatement ps;
    ResultSet rs;
    
    public Compra() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        modelo = new DefaultTableModel();
        modelo.addColumn("Code");
        modelo.addColumn("Product");
        modelo.addColumn("OUM");
        modelo.addColumn("Quantity");
        modelo.addColumn("Price");
        modelo.addColumn("Amount");
        this.tb1Producto.setModel(modelo);
    }
    
    private void limpiar(){
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtMonto.setText("");  
        jTextCode.setText("");
        jTextProduct.setText("");
    }
    
    private void save(){
        try {
            Sales facturas = new Sales();
            facturas.setCustomer(jTextField1.getText().toString());
            facturas.setNumber(jTextField10.getText().toString());
            facturas.setRemarks(jTextField9.getText().toString());
            facturas.setMoney(jComboBox4.getSelectedItem().toString());
            facturas.setTotal(Double.parseDouble(jTextField8.getText()));
            
            String insert = "INSERT INTO `sales` (`Customer`, `Number`, `Remarks`, `Money`, `Total`) "
                    + "VALUES (?, ?, ?, ?, ?);";

            PreparedStatement pst = conexion.prepareStatement(insert);
            pst.setString(1, facturas.getCustomer());
            pst.setString(2, facturas.getNumber());
            pst.setString(3, facturas.getRemarks());
            pst.setString(4, facturas.getMoney());
            pst.setDouble(5, facturas.getTotal());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Datos guardados");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextCode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jTextProduct = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1Producto = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Oxxo_Logo.svg (1).png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 190, 110));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("PURCHASE");
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, 37));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SALES");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 37));

        jButton6.setBackground(new java.awt.Color(255, 51, 51));
        jButton6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 10)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("INVENTORY");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 37));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint-grunge-background_1409-1619.jpg"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 630));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 130, -1));

        jPanel3.setBackground(new java.awt.Color(204, 0, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 26, -1, 20));

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setText("Code");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 40, 30));

        jTextCode.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextCode.setBorder(null);
        jTextCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCodeKeyPressed(evt);
            }
        });
        jPanel1.add(jTextCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 127, 30));

        jButton1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton1.setText("Cal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, 30));

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel3.setText("UOM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 24, -1, 20));

        jComboBox2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POUND", "GALON", "LITER", "KG", "QUART" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 109, 30));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, 30));

        txtCantidad.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtCantidad.setBorder(null);
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 20, 70, 30));

        txtPrecio.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtPrecio.setBorder(null);
        txtPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPrecio.setEnabled(false);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(891, 20, 100, 30));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel6.setText("Amount");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, 30));

        txtMonto.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtMonto.setBorder(null);
        txtMonto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMonto.setEnabled(false);
        txtMonto.setKeymap(null);
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 80, 30));

        jTextProduct.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jTextProduct.setBorder(null);
        jTextProduct.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextProduct.setEnabled(false);
        jPanel1.add(jTextProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 220, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1140, 60));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tb1Producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tb1Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1ProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1Producto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 128, 1030, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel13.setText("Customer");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jTextField1.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jTextField1.setBorder(null);
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 182, 20));

        jLabel15.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel15.setText("Contact No.");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 90, 30));

        jTextField10.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jTextField10.setBorder(null);
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 244, 20));

        jLabel14.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel14.setText("Remarks");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, 30));

        jTextField9.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jTextField9.setBorder(null);
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 101, 20));

        jComboBox4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credit", "Contand" }));
        jPanel5.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        jButton10.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton10.setText("Save");
        jButton10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 10, -1, -1));

        jButton9.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton9.setText("Cancel");
        jButton9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 580, 1140, 40));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Amount");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("IVA");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 30, 22));

        jTextField6.setText("12%");
        jPanel6.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Total");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));
        jPanel6.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 80, -1));

        jButton11.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton11.setText("Clean");
        jButton11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 81, -1));

        jButton4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton4.setText("Add");
        jButton4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, -1));

        jButton12.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton12.setText("Update");
        jButton12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        jButton8.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jButton8.setText("Remove");
        jButton8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 70, 100, 510));

        jLabel1.setBackground(new java.awt.Color(255, 0, 102));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1070, 630));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 6, 1170, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        inventario VEN = new inventario();
        VEN.setVisible(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            Connection con = null;
        try{
        con = getConnection();
        Statement st = conexion.createStatement();
        ps = con.prepareStatement("SELECT * FROM `purchase` WHERE CODE =?");
        ps.setString(1, jTextCode.getText());
        
        rs = ps.executeQuery();
        
        if(rs.next()){
            jTextCode.setText(rs.getString("CODE"));
            jTextProduct.setText(rs.getString("PRODUCT"));
            txtPrecio.setText(rs.getString("PRICE"));
            cantidad = rs.getString("QUANTITY");
            
        }
        else{
            JOptionPane.showMessageDialog(null,"No existe el código ingre");
            jTextCode.setText("");
        }
            
        }catch(Exception e){
            System.err.println(e);  
        }
        }
    }//GEN-LAST:event_jTextCodeKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precio = Double.parseDouble(txtPrecio.getText());
        
        double result = precio * cantidad;
        
        txtMonto.setText(Double.toString(result));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
     
    }//GEN-LAST:event_txtMontoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String OUM = (String) jComboBox2.getSelectedItem();
        String []info = new String[6];
        info[0] = jTextCode.getText();
        info[1] = jTextProduct.getText();
        info[2] = OUM;
        info[3] = txtCantidad.getText();
        info[4] = txtPrecio.getText();
        info[5] = txtMonto.getText();
        
        if(Integer.parseInt (cantidad) >= Integer.parseInt (info[3])){
            try{
                String insert = "UPDATE `purchase` SET "
                +"QUANTITY = QUANTITY - ? " 
                +"WHERE CODE = ?";
                PreparedStatement pst = conexion.prepareStatement(insert);
                pst.setString(1, txtCantidad.getText());
                pst.setString(2, jTextCode.getText());
                pst.execute();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ingrese la cantidad a comprar");
            }
            modelo.addRow(info);
            
            jTextCode.setText("");
            jTextProduct.setText("");
            txtCantidad.setText("");
            txtPrecio.setText("");
            txtMonto.setText("");
            
            parcial = Double.parseDouble(info[5]);
            total = total + parcial;
            total1 = (total *0.12) + total;
            jTextField7.setText(Double.toString(total));
            jTextField8.setText(Double.toString(total1));
            
            
        }else{
             JOptionPane.showMessageDialog(null, "No hay suficiente producto para vender");
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try{
                String insert = "UPDATE `purchase` SET "
                +"QUANTITY = QUANTITY + ? " 
                +"WHERE CODE = ?";
                PreparedStatement pst = conexion.prepareStatement(insert);
                pst.setString(1, txtCantidad.getText());
                pst.setString(2, jTextCode.getText());
                pst.execute();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "error");
            }
        int fila = tb1Producto.getSelectedRow();
        Double monto = Double.parseDouble(txtMonto.getText());
        if (fila>=0){
            modelo.removeRow(fila);
            operacion = total - monto;
            jTextField7.setText(Double.toString(operacion));
            total = operacion;
            total1 = (total *0.12) + total;
            jTextField8.setText(Double.toString(total1));
            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        String OUM = (String) jComboBox2.getSelectedItem();
        String []info = new String[6];
        info[0] = jTextCode.getText();
        info[1] = jTextProduct.getText();
        info[2] = OUM;
        info[3] = txtCantidad.getText();
        info[4] = txtPrecio.getText();
        info[5] = txtMonto.getText();
        String codigo = (String) modelo.getValueAt(tb1Producto.getSelectedRow(), 3);
        System.out.println(codigo);
        
        operacion = Double.parseDouble(txtMonto.getText()) ;
        total = total - parcial;
        try{ 
            if(Integer.parseInt (txtCantidad.getText()) > Integer.parseInt (codigo)){
                int diferencia = (Integer.parseInt (txtCantidad.getText()) - Integer.parseInt (codigo));
                String dif = String.valueOf(diferencia);
                String insert = "UPDATE `purchase` SET "
                +"QUANTITY = QUANTITY - ? " 
                +"WHERE CODE = ?";
                PreparedStatement pst = conexion.prepareStatement(insert);
                pst.setString(1, dif);
                pst.setString(2, jTextCode.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Actulizado");
                parcial = Double.parseDouble(txtMonto.getText());
                total2 = total + parcial;
                jTextField7.setText(Double.toString(total2));
                total1 = (total2 * 0.12) + total2;
                jTextField8.setText(Double.toString(total1));
                total = total2;

            }else{
                int diferencia = (Integer.parseInt (codigo) - Integer.parseInt (txtCantidad.getText()));
                String dif = String.valueOf(diferencia);
                String insert = "UPDATE `purchase` SET "
                +"QUANTITY = QUANTITY + ? " 
                +"WHERE CODE = ?";
                PreparedStatement pst = conexion.prepareStatement(insert);
                pst.setString(1, dif);
                pst.setString(2, jTextCode.getText());
                pst.execute();
                JOptionPane.showMessageDialog(null, "Actulizado");
                parcial = Double.parseDouble(txtMonto.getText());
                total2 = total + parcial;
                jTextField7.setText(Double.toString(total2));
                total1 = (total2 * 0.12) + total2;
                jTextField8.setText(Double.toString(total1));
                total = total2;

            }
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "error");
            }
        
        for(int i = 0; i < tb1Producto.getColumnCount(); i++){
            modelo.setValueAt(info[i],filas,i);
        }
       
    }//GEN-LAST:event_jButton12ActionPerformed

    private void tb1ProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1ProductoMouseClicked
        int seleccion = tb1Producto.getSelectedRow();
        jTextCode.setText(tb1Producto.getValueAt(seleccion,0).toString());
            jTextProduct.setText(tb1Producto.getValueAt(seleccion,1).toString());
            txtCantidad.setText(tb1Producto.getValueAt(seleccion,3).toString());
            txtPrecio.setText(tb1Producto.getValueAt(seleccion,4).toString());
            txtMonto.setText(tb1Producto.getValueAt(seleccion,5).toString());
            filas = seleccion;
            
            
        
    }//GEN-LAST:event_tb1ProductoMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        int seleccion = tb1Producto.getSelectedRow();
        jTextCode.setText(tb1Producto.getValueAt(seleccion,0).toString());
            jTextProduct.setText(tb1Producto.getValueAt(seleccion,1).toString());
            txtCantidad.setText(tb1Producto.getValueAt(seleccion,3).toString());
            txtPrecio.setText(tb1Producto.getValueAt(seleccion,4).toString());
            txtMonto.setText(tb1Producto.getValueAt(seleccion,5).toString());
            filas = seleccion;
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        for (int i = 0; i < tb1Producto.getRowCount(); i++) {
        modelo.removeRow(i);
        i-=1;

        }
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtMonto.setText("");  
        jTextCode.setText("");
        jTextProduct.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField1.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Ventas VEN = new Ventas();
        VEN.setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        save();
        for (int i = 0; i < tb1Producto.getRowCount(); i++) {
        modelo.removeRow(i);
        i-=1;

        }
        txtCantidad.setText("");
        txtPrecio.setText("");
        txtMonto.setText("");  
        jTextCode.setText("");
        jTextProduct.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField1.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        
    }//GEN-LAST:event_jButton10ActionPerformed

    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField jTextCode;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextProduct;
    private javax.swing.JTable tb1Producto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
