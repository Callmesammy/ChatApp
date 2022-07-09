
package form;

import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author user
 */
public class chat_user extends javax.swing.JLayeredPane {

    
    public chat_user() {
        initComponents();  
        txt.setBackground(new Color(242,242,242));
    }
    
    public void usernameProfile(String name){
        txt.usernameProfile(name);
    }
    public void setImageprofile (Icon image){
        iamage.setImage(image);
    }
    public void setText(String text) {
      if (txt.equals("")){
          txt.hideText();
      }else{
            txt.setText(text);
      }
             }
    
   public void setImag (Icon ...image){
       txt.setImage(false, image);
   }
    public void setTime(){
        txt.setTime("01:30pm");
}
    public void setSuccess(){
        txt.setsuccess();
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        iamage = new swing.ImageAvatar();
        txt = new form.Chat_item();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        iamage.setBorderColor(new java.awt.Color(130, 196, 227));
        iamage.setBorderSize(1);
        iamage.setImage(new javax.swing.ImageIcon(getClass().getResource("/TEST/thumbnail.jpg"))); // NOI18N
        iamage.setMinimumSize(new java.awt.Dimension(33, 33));
        iamage.setPreferredSize(new java.awt.Dimension(33, 33));

        jLayeredPane1.setLayer(iamage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iamage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iamage, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jLayeredPane1);
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ImageAvatar iamage;
    private javax.swing.JLayeredPane jLayeredPane1;
    private form.Chat_item txt;
    // End of variables declaration//GEN-END:variables

    void setImage(Icon[] image) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
