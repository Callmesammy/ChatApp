
package form;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.border.EmptyBorder;


public class Chat_item extends javax.swing.JLayeredPane {

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
}
