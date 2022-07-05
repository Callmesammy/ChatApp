
package form;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;


public class Chat_item extends javax.swing.JLayeredPane {

    private JButton cms, cmk;
    private  JLabel label;
    public Chat_item() {
        initComponents();
        txt.setEditable(false);
        txt.setBackground(new Color(0,0,0,0));
        txt.setOpaque(false);
        
    }

    public void setText (String text){
        txt.setText(text);
    }
    
    public void usernameProfile (String name){
         JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.LEFT, 0,0));
      // layer.setBorder(new EmptyBorder(3, 0, 10, 0));
        cms = new JButton(name);
        cms.setContentAreaFilled(false);
        cms.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cms.setForeground(new java.awt.Color(51, 165, 248));
        cms.setFont(new java.awt.Font("sansserif", 3, 13));
       txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 5, 10));
        cms.setFocusable(false);
      // txt.setBorder(new EmptyBorder(0, 0, 10, 0));
        layer.add(cms);
        add(layer, 0); 
        
    }
    
        public void USERRIGHT (String cons){
         JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.LEFT, 0,0));
      // layer.setBorder(new EmptyBorder(3, 0, 10, 0));
        cmk = new JButton(cons);
        cmk.setContentAreaFilled(false);
        cmk.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmk.setForeground(new java.awt.Color(8, 8, 8));
        cmk.setFont(new java.awt.Font("sansserif", 3, 13));
       txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 5, 10));
        cmk.setFocusable(false);
      // txt.setBorder(new EmptyBorder(0, 0, 10, 0));
        layer.add(cmk);
        add(layer, 0); 
        
    }
    public void setTime (String time){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(FlowLayout.RIGHT, 0,0));
        layer.setBorder(new EmptyBorder(0, 5, 10, 5));
        label = new JLabel(time);
        label.setForeground(new Color(92, 100, 95));
        label.setHorizontalTextPosition(JLabel.LEFT);
        layer.add(label);
        add(layer); 
    }
    
    public void setImage(boolean right, Icon ...image){
        JLayeredPane layer = new JLayeredPane();
        layer.setLayout(new FlowLayout(right? FlowLayout.RIGHT :FlowLayout.LEFT));
        layer.setBorder(new EmptyBorder(0, 5, 0, 5));
        Chatimage mage = new Chatimage(right);
        mage.addImage(image);
        layer.add(mage);
        add(layer);
    }

    public void setsuccess(){
        if (label != null){
            label.setIcon(new ImageIcon(getClass().getResource("/icon/ticc.png")));
        }
    }
      public void setseen(){
        if (label != null){
            label.setIcon(new ImageIcon(getClass().getResource("/icon/doubleticcblu.png")));
        }
    }
   public void hideText(){
        txt.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new swing.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 5, 10));
        txt.setSelectionColor(new java.awt.Color(142, 192, 226));
        add(txt);
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        super.paintComponent(g); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.JIMSendTextPane txt;
    // End of variables declaration//GEN-END:variables

    void setImage(boolean b, String[] image) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
