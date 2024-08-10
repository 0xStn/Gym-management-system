
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;      
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
public class Admin extends javax.swing.JFrame {
    
    DefaultTableModel model;
    Connection con;
    Statement stm;
   ResultSet res;
    public Admin() {
        initComponents();
            showtables();
            searchtable();

    }
    private void showtables(){
      
        model=new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("name");
        model.addColumn("age");
        model.addColumn("phone");
      
        model.addColumn("start_date");
        model.addColumn("package_no.");   
      

           Admin_t.setModel(model);
           
try {
           String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
           String url = "jdbc:sqlserver://localhost;databaseName=GYM3;encrypt=true;trustServerCertificate=true";
           String user ="stn";
           String pass ="mms";
           
    
con = DriverManager.getConnection(url, user,pass);
stm=con.createStatement();
res=stm.executeQuery("select * from sys_Admin111");
while(res.next()){
    
    model.addRow(new Object[]{
        res.getInt("id"),
        res.getString("c_name"),
        res.getInt("age"),
        res.getString("phone_num"),
        res.getString("joinning_date"),
        res.getString("package_num")});
    
    
    
}
} catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(this, ex.getMessage());
        
    }
  }
    private void searchtable(){
             
        model=new DefaultTableModel();
      model.addColumn("id");
        model.addColumn("name");
        model.addColumn("age");
        model.addColumn("phone");

        model.addColumn("start_date");
        model.addColumn("package_no.");   
         searcht.setModel(model);
           
try {
           String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
           String url = "jdbc:sqlserver://localhost;databaseName=GYM3;encrypt=true;trustServerCertificate=true";
           String user ="stn";
           String pass ="mms";
    
con = DriverManager.getConnection(url, user,pass);
System.out.println("connected");
    }catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(this, ex.getMessage());

    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        Admin_t = new javax.swing.JTable();
        bar_p = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        back_b = new rojerusan.RSMaterialButtonCircle();
        packages_b = new rojerusan.RSMaterialButtonRectangle();
        jPanel2 = new javax.swing.JPanel();
        fname_l = new javax.swing.JLabel();
        lname_l = new javax.swing.JLabel();
        Ssn_l = new javax.swing.JLabel();
        b_date_l = new javax.swing.JLabel();
        package_num_t = new javax.swing.JTextField();
        name_t = new javax.swing.JTextField();
        id_t = new javax.swing.JTextField();
        age_t = new javax.swing.JTextField();
        start_date_t = new javax.swing.JTextField();
        phone_t = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        insert_b = new rojerusan.RSMaterialButtonRectangle();
        update_b = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        searcht = new javax.swing.JTable();
        search_b = new rojerusan.RSMaterialButtonRectangle();
        search_t = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scroll.setBackground(new java.awt.Color(255, 255, 255));

        Admin_t.setAutoCreateRowSorter(true);
        Admin_t.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.disabledBackground"));
        Admin_t.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Admin_t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        Admin_t.setAlignmentX(1.0F);
        Admin_t.setAlignmentY(1.0F);
        Admin_t.setGridColor(new java.awt.Color(0, 0, 204));
        Admin_t.setSelectionBackground(new java.awt.Color(255, 255, 255));
        scroll.setViewportView(Admin_t);

        bar_p.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon("C:\\Users\\Ahmed\\Desktop\\MODERN SUBJ\\Semester5---- 3\\SW\\dumbbell (1).png")); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 72, 197));
        jLabel2.setText("Admin board");

        back_b.setBackground(new java.awt.Color(204, 72, 197));
        back_b.setForeground(new java.awt.Color(97, 220, 212));
        back_b.setText("back");
        back_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_bActionPerformed(evt);
            }
        });

        packages_b.setBackground(new java.awt.Color(0, 204, 204));
        packages_b.setText("packages");
        packages_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packages_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bar_pLayout = new javax.swing.GroupLayout(bar_p);
        bar_p.setLayout(bar_pLayout);
        bar_pLayout.setHorizontalGroup(
            bar_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bar_pLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(back_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(packages_b, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        bar_pLayout.setVerticalGroup(
            bar_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(bar_pLayout.createSequentialGroup()
                .addGroup(bar_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bar_pLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(back_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bar_pLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bar_pLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(bar_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(packages_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(java.awt.Color.lightGray);

        fname_l.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        fname_l.setText("Package no.");

        lname_l.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lname_l.setText("Name");

        Ssn_l.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Ssn_l.setText("ID");

        b_date_l.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        b_date_l.setText("age");

        package_num_t.setText(" ");
        package_num_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                package_num_tActionPerformed(evt);
            }
        });

        name_t.setText(" ");

        id_t.setText(" ");
        id_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tActionPerformed(evt);
            }
        });

        age_t.setText(" ");

        start_date_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_date_tActionPerformed(evt);
            }
        });

        phone_t.setText(" ");
        phone_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_tActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("start date");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("phone num");

        insert_b.setBackground(new java.awt.Color(97, 220, 212));
        insert_b.setForeground(java.awt.Color.darkGray);
        insert_b.setText("insert");
        insert_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_bActionPerformed(evt);
            }
        });

        update_b.setBackground(new java.awt.Color(97, 220, 212));
        update_b.setForeground(java.awt.Color.darkGray);
        update_b.setText("update");
        update_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(insert_b, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update_b, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(start_date_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(b_date_l, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lname_l)
                                        .addComponent(Ssn_l, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fname_l, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(package_num_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phone_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(package_num_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fname_l, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname_l, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(id_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_date_l, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(start_date_t, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_b, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insert_b, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Ssn_l, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        searcht.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        searcht.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(searcht);

        search_b.setBackground(new java.awt.Color(97, 220, 212));
        search_b.setForeground(java.awt.Color.darkGray);
        search_b.setText("search");
        search_b.setMaximumSize(new java.awt.Dimension(88, 25));
        search_b.setMinimumSize(new java.awt.Dimension(88, 25));
        search_b.setPreferredSize(new java.awt.Dimension(88, 25));
        search_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_bActionPerformed(evt);
            }
        });

        search_t.setToolTipText("");
        search_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_tActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(search_b, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search_t, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bar_p, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_b, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_t, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_tActionPerformed
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url="jdbc:sqlserver://localhost:1433;databaseName=GYM3";
        String user="stn";
        String pass="mms";
        
    
    private void insert_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_bActionPerformed
   try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            
           String query="insert into sys_Admin111"+ "(id,c_name,age,phone_num,joinning_date,package_num)"+ "Values(?,?,?,?,?,?)";
 PreparedStatement stm = con.prepareStatement(query);
               stm.setString(1, id_t.getText());
               stm.setString(2,name_t.getText());
               stm.setString(3,age_t.getText());
               stm.setString(4, phone_t.getText());
               stm.setString(5, start_date_t.getText());
               stm.setString(6, package_num_t.getText());
               
 stm.executeUpdate();
              
            JOptionPane.showMessageDialog(this, "Data Insterted");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }    
    try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            
           String query="insert into members_reg111"+ "(id,c_name,age,package_num,phone_num,joinning_date)"+ "Values(?,?,?,?,?,?)";
 PreparedStatement stm = con.prepareStatement(query);
               stm.setString(1, id_t.getText());
               stm.setString(2,name_t.getText());
               stm.setString(3,age_t.getText());
               stm.setString(5, phone_t.getText());
               stm.setString(6, start_date_t.getText());
               stm.setString(4, package_num_t.getText());
               
 stm.executeUpdate();
              
            JOptionPane.showMessageDialog(this, "member added successfully");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }    
      showtables();
    }//GEN-LAST:event_insert_bActionPerformed

    private void back_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_bActionPerformed
      dashboard c1=new dashboard();
      
      c1.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_back_bActionPerformed

    private void id_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tActionPerformed

    private void phone_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_tActionPerformed

    private void update_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bActionPerformed
         try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            
           String query="update sys_Admin111 set c_name=?,phone_num=?,age=? where id=?";
 PreparedStatement stm = con.prepareStatement(query);
       
             stm.setString(1, name_t.getText());
                           stm.setString(3, age_t.getText());

               stm.setString(2, phone_t.getText());
               stm.setString(4, id_t.getText());
 stm.executeUpdate();
              
            JOptionPane.showMessageDialog(this, "Data updated");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
          try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            
           String query="update members_reg111 set c_name=?,phone_num=?,age=? where id=?";
 PreparedStatement stm = con.prepareStatement(query);
       
             stm.setString(1, name_t.getText());
             stm.setString(3, age_t.getText());
               stm.setString(2, phone_t.getText());
               stm.setString(4, id_t.getText());
 stm.executeUpdate();
              
          
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
         showtables();
    }//GEN-LAST:event_update_bActionPerformed

    private void search_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_bActionPerformed


try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st=con.createStatement();
         String query="select * from sys_Admin111 WHERE id= "+ search_t.getText();
              
              res=st.executeQuery(query);
              searcht.setModel(DbUtils.resultSetToTableModel(res));
              
           
             
            JOptionPane.showMessageDialog(this, "search  successful");
             }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }showtables();
    }//GEN-LAST:event_search_bActionPerformed

    private void start_date_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_date_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_start_date_tActionPerformed

    private void packages_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packages_bActionPerformed
packages p=new packages();
p.setVisible(true);
this.setVisible(false);

    }//GEN-LAST:event_packages_bActionPerformed

    private void package_num_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_package_num_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_package_num_tActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Admin_t;
    private javax.swing.JLabel Ssn_l;
    private javax.swing.JTextField age_t;
    private javax.swing.JLabel b_date_l;
    private rojerusan.RSMaterialButtonCircle back_b;
    private javax.swing.JPanel bar_p;
    private javax.swing.JLabel fname_l;
    private javax.swing.JTextField id_t;
    private rojerusan.RSMaterialButtonRectangle insert_b;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lname_l;
    private javax.swing.JTextField name_t;
    private javax.swing.JTextField package_num_t;
    private rojerusan.RSMaterialButtonRectangle packages_b;
    private javax.swing.JTextField phone_t;
    private rojerusan.RSPanelImage rSPanelImage1;
    private javax.swing.JScrollPane scroll;
    private rojerusan.RSMaterialButtonRectangle search_b;
    private javax.swing.JTextField search_t;
    private javax.swing.JTable searcht;
    private javax.swing.JTextField start_date_t;
    private rojerusan.RSMaterialButtonRectangle update_b;
    // End of variables declaration//GEN-END:variables
}
