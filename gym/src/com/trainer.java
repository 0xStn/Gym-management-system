/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class trainer extends javax.swing.JFrame {
 DefaultTableModel model;
    Connection con;
    Statement stm;
   ResultSet res;
    /**
     * Creates new form Projects
     */
    public trainer() {
        initComponents ();
     connection2();   
      
    }

   public void connection2(){
  
        
        
        model=new DefaultTableModel();
        model.addColumn("id");
     
        model.addColumn("fat");
        model.addColumn("diet_type");
         model.addColumn("workout_p");

        trainer_t.setModel(model);
           try {
 String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
           String url = "jdbc:sqlserver://localhost;databaseName=GYM3;encrypt=true;trustServerCertificate=true";
           String user ="stn";
           String pass ="mms";
con = DriverManager.getConnection(url, user,pass);
stm=con.createStatement();
res=stm.executeQuery("select * from trainer111");
while(res.next()){
    
    model.addRow(new Object[]{res.getInt("id"),res.getFloat("fat"),res.getString("diet_type"),res.getString("workout_p")});
    
    
    
}
} catch (SQLException ex) {
        
        JOptionPane.showMessageDialog(this, ex.getMessage());
        
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background_p = new javax.swing.JPanel();
        bar_p = new javax.swing.JPanel();
        back_b = new rojerusan.RSMaterialButtonCircle();
        projects_l = new javax.swing.JLabel();
        image_p = new rojerusan.RSPanelImage();
        projects_scrollp = new javax.swing.JScrollPane();
        trainer_t = new javax.swing.JTable();
        update_b = new rojerusan.RSMaterialButtonRectangle();
        id_t = new javax.swing.JTextField();
        work_t = new javax.swing.JTextField();
        diet_t = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fat_t = new javax.swing.JTextField();
        add_b = new rojerusan.RSMaterialButtonRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background_p.setBackground(java.awt.SystemColor.controlHighlight);

        bar_p.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));

        back_b.setBackground(new java.awt.Color(204, 72, 197));
        back_b.setForeground(java.awt.Color.darkGray);
        back_b.setText("back");
        back_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_bActionPerformed(evt);
            }
        });

        projects_l.setFont(new java.awt.Font("Segoe UI Semibold", 1, 48)); // NOI18N
        projects_l.setForeground(new java.awt.Color(204, 72, 197));
        projects_l.setText("Trainer");

        image_p.setImagen(new javax.swing.ImageIcon("C:\\Users\\Ahmed\\Desktop\\MODERN SUBJ\\Semester5---- 3\\SW\\fitness.png")); // NOI18N

        javax.swing.GroupLayout image_pLayout = new javax.swing.GroupLayout(image_p);
        image_p.setLayout(image_pLayout);
        image_pLayout.setHorizontalGroup(
            image_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        image_pLayout.setVerticalGroup(
            image_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bar_pLayout = new javax.swing.GroupLayout(bar_p);
        bar_p.setLayout(bar_pLayout);
        bar_pLayout.setHorizontalGroup(
            bar_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bar_pLayout.createSequentialGroup()
                .addComponent(back_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(image_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(projects_l, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bar_pLayout.setVerticalGroup(
            bar_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bar_pLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(back_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bar_pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projects_l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bar_pLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(image_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        trainer_t.setBackground(new java.awt.Color(204, 204, 204));
        trainer_t.setModel(new javax.swing.table.DefaultTableModel(
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
        projects_scrollp.setViewportView(trainer_t);

        update_b.setBackground(new java.awt.Color(204, 72, 197));
        update_b.setForeground(new java.awt.Color(240, 240, 240));
        update_b.setText("update");
        update_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_bActionPerformed(evt);
            }
        });

        id_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_tActionPerformed(evt);
            }
        });

        diet_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diet_tActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Workout plan");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("diet type");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("fat %");

        add_b.setBackground(new java.awt.Color(204, 72, 197));
        add_b.setText("add");
        add_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background_pLayout = new javax.swing.GroupLayout(background_p);
        background_p.setLayout(background_pLayout);
        background_pLayout.setHorizontalGroup(
            background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bar_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projects_scrollp, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background_pLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(background_pLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_pLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_b, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background_pLayout.createSequentialGroup()
                        .addGroup(background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_t, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(work_t)
                            .addComponent(diet_t)
                            .addComponent(fat_t))
                        .addGap(39, 39, 39))
                    .addGroup(background_pLayout.createSequentialGroup()
                        .addComponent(add_b, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        background_pLayout.setVerticalGroup(
            background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_pLayout.createSequentialGroup()
                .addComponent(bar_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(projects_scrollp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(background_pLayout.createSequentialGroup()
                        .addGroup(background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(background_pLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(id_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(work_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(diet_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fat_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(background_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_bActionPerformed
     dashboard c3=new dashboard();
     c3.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_back_bActionPerformed

    private void id_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_tActionPerformed

    private void diet_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diet_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diet_tActionPerformed
String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url="jdbc:sqlserver://localhost:1433;databaseName=GYM3";
        String user="stn";
        String pass="mms";
    private void update_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_bActionPerformed
 try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            
           String query="update trainer111 set fat=?,diet_type=?,workout_p=? where id=?";
 PreparedStatement stm = con.prepareStatement(query);
       
               stm.setString(1,fat_t .getText());
               stm.setString(2, diet_t.getText());
               stm.setString(3, work_t.getText());
               stm.setString(4, id_t.getText());
 stm.executeUpdate();
              
            JOptionPane.showMessageDialog(this, "Data updated");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
         connection2();    }//GEN-LAST:event_update_bActionPerformed

    private void add_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bActionPerformed
 try{
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            
           String query="insert into trainer111"+ "(id,workout_p,diet_type,fat)"+ "Values(?,?,?,?)";
 PreparedStatement stm = con.prepareStatement(query);
               stm.setString(1, id_t.getText());
               stm.setString(2,work_t.getText());
               stm.setString(3,diet_t.getText());
               stm.setString(4, fat_t.getText());
             
               
 stm.executeUpdate();
              
            JOptionPane.showMessageDialog(this, "Data Insterted");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }    
      connection2();        // TODO add your handling code here:
    }//GEN-LAST:event_add_bActionPerformed
 
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
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle add_b;
    private rojerusan.RSMaterialButtonCircle back_b;
    private javax.swing.JPanel background_p;
    private javax.swing.JPanel bar_p;
    private javax.swing.JTextField diet_t;
    private javax.swing.JTextField fat_t;
    private javax.swing.JTextField id_t;
    private rojerusan.RSPanelImage image_p;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel projects_l;
    private javax.swing.JScrollPane projects_scrollp;
    private javax.swing.JTable trainer_t;
    private rojerusan.RSMaterialButtonRectangle update_b;
    private javax.swing.JTextField work_t;
    // End of variables declaration//GEN-END:variables
}
