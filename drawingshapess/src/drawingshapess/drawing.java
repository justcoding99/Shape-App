/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingshapess;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;



/**
 *
 * @author DELL
 */
public class drawing extends javax.swing.JFrame implements MouseListener,ActionListener{

    int x,y;
    int eraser=0;
 
    ArrayList<Integer> points = new ArrayList<Integer>();
    public drawing() {
        initComponents();
        this.addMouseListener(this);
        deletebutton.addActionListener(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MENU = new javax.swing.JComboBox<>();
        MENU2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        deletebutton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MENU.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOVE", "Line", "Square", "Circle", "Rectangle", " " }));
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });
        getContentPane().add(MENU, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 190, 20));

        MENU2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DRAW", "Line", "Circle", "Square", "Rectangle", " " }));
        getContentPane().add(MENU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 160, -1));

        jLabel1.setText("WELCOME TO PROGRAM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 240, 50));

        deletebutton.setText("delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 80, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_MENUActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(drawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new drawing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MENU;
    private javax.swing.JComboBox<String> MENU2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deletebutton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(MENU.getSelectedItem().toString().equals("Line")){
             points.add(e.getX());
            points.add(e.getY());
            
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(MENU.getSelectedItem().toString().equals("Line")){
            points.add(e.getX());
            points.add(e.getY());
            repaint();
            
        }
        else if(MENU.getSelectedItem().toString().equals("Square")){
            x=e.getX();
            y=e.getY();
            
            repaint();
        }
        else if(MENU.getSelectedItem().toString().equals("Circle")){
            x=e.getX();
            y=e.getY();
           
            repaint();
        }
        else if(MENU.getSelectedItem().toString().equals("Rectangle")){
            x=e.getX();
            y=e.getY();
            
            repaint();
        }
        else if(MENU2.getSelectedItem().toString().equals("Line")){
           points.add(e.getX());
            points.add(e.getY());
            repaint();
            
        }
         else  if(MENU2.getSelectedItem().toString().equals("Circle")){
            x=e.getX();
            y=e.getY();
           
            repaint();
            
        }
        else if(MENU2.getSelectedItem().toString().equals("Square")){
            x=e.getX();
            y=e.getY();
            repaint();
        }
        else if(MENU2.getSelectedItem().toString().equals("Rectangle")){
            x=e.getX();
            y=e.getY();
            
            repaint();
        }
        
        
        
    }
   
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        
    }
     public void paint (Graphics g){
        super.paint(g);
        if(eraser==1){
            g.clearRect(0, 0,160, -1);
            eraser=0;
        }
        else if(MENU.getSelectedItem().toString().equals("Line")){
           g.drawLine(points.get(0), points.get(1), points.get(2),points.get(3));
           
        }
        else if(MENU.getSelectedItem().toString().equals("Square")){
            g.fillRect(x, y, 50, 50);
            
        }
        else if(MENU.getSelectedItem().toString().equals("Circle")){
            g.fillOval(x, y, 50, 50);
           
        }
        else if(MENU.getSelectedItem().toString().equals("Rectangle")){
            g.fillRect(x, y, 80, 40);
          
        }
        else if(MENU2.getSelectedItem().toString().equals("Line")){
           g.drawLine(250,50,380,90);
           g.drawLine(770,80,687,140);
           g.drawLine(120,650,530,90);
        }
        else if(MENU2.getSelectedItem().toString().equals("Circle")){
            g.fillOval(480, 250, 60, 60);
            g.fillOval(90, 290, 50, 50);
            g.fillOval(380, 350, 50, 50);
           
        }
        else if(MENU2.getSelectedItem().toString().equals("Rectangle")){
            g.fillRect(170, 190, 90, 40);
            g.fillRect(270, 290, 80, 40);
            g.fillRect(90, 350, 70, 40);
            g.fillRect(390, 350, 60, 40);
         }
        else if(MENU2.getSelectedItem().toString().equals("Square")){
            g.fillRect(350, 450, 50, 50);
            g.fillRect(650, 400,80, 80);
            g.fillRect(150, 200,50, 50);
         }
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==deletebutton){
            eraser=1;
            points.clear();
            repaint();
        }
    }

    

    
    
}
