
package form;

import java.awt.Color;


public class Chat_title extends javax.swing.JPanel {

 
    public Chat_title() {
        initComponents();
    }

 public void setUsername(String text){
     Ibname.setText(text);
 }
 public void setStatus(){
     ibsuccess.setText("Active Now");
     ibsuccess.setForeground(new java.awt.Color(116, 240, 118));
 }
 public void setStatustext(String text){
     ibsuccess.setText(text);
     ibsuccess.setForeground(new Color(88, 89, 91));
     
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        Ibname = new javax.swing.JLabel();
        ibsuccess = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        jLayeredPane1.setLayout(new java.awt.GridLayout(0, 1, 0, 7));

        Ibname.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        Ibname.setForeground(new java.awt.Color(8, 8, 8));
        Ibname.setText("Name");
        jLayeredPane1.add(Ibname);

        ibsuccess.setBackground(new java.awt.Color(118, 251, 131));
        ibsuccess.setForeground(new java.awt.Color(116, 240, 118));
        ibsuccess.setText("Active Now");
        jLayeredPane1.add(ibsuccess);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ibname;
    private javax.swing.JLabel ibsuccess;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
