
package form;

import java.awt.Color;
import javax.swing.Icon;

/**
 *
 * @author user
 */
public class chat_left extends javax.swing.JLayeredPane {

    
    public chat_left() {
        initComponents();  
        txt.setBackground(new Color(242,242,242));
    }
    
  public void setText(String text){
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
     public void usernameProfile(String name){
        txt.usernameProfile(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new form.Chat_item();

        setLayer(txt, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private form.Chat_item txt;
    // End of variables declaration//GEN-END:variables
}
