
package form;

import Event.EventImage;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import swing.PicBox;


public class Chatimage extends javax.swing.JLayeredPane {

   
    public Chatimage(boolean right) {
        initComponents();
        setLayout(new MigLayout("","0["+(right? "right": "left")+"]","2[]2"));
    }

   public void addImage (Icon ...images){
       for (Icon image: images){
           PicBox box = new PicBox();
           box.setPreferredSize(getAutoSize(image, 200, 200));
           box.setImage(image);
           addimage(box, image);
           add(box, "wrap");
       }
   }
   
   private void addimage(Component com, Icon image){
       com.setCursor(new Cursor(Cursor.HAND_CURSOR) {
       });
        com.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              if (SwingUtilities.isLeftMouseButton(e)){
                  EventImage.install().addPicture().picture(image);
              }
            }
        
        });
   }
       
        private Dimension getAutoSize(Icon image, int w, int h) {
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.min(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        return new Dimension(width, height);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
