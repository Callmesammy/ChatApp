
package form;

import Event.EventImage;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;


public class View_image extends javax.swing.JComponent {

   
    public View_image() {
       
        initComponents();
    }
 private Icon image;
    public void viewImage (Icon image){
      this.image = image; 
      pic.setImage(image);
        setVisible(true);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new swing.PicBox();
        Jcd = new javax.swing.JButton();

        pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                picMousePressed(evt);
            }
        });

        Jcd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TEST/downld.png"))); // NOI18N
        Jcd.setBorder(null);
        Jcd.setContentAreaFilled(false);
        Jcd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcdActionPerformed(evt);
            }
        });
        pic.add(Jcd);
        Jcd.setBounds(830, 450, 70, 28);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void picMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picMousePressed
        setVisible(false);
    }//GEN-LAST:event_picMousePressed

    private void JcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcdActionPerformed
      EventImage.install().addPicture().save(image);
    }//GEN-LAST:event_JcdActionPerformed

    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.setColor(new Color(0,0,0,140));
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g); 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jcd;
    private swing.PicBox pic;
    // End of variables declaration//GEN-END:variables
}
