
package form;

import Blurhash.BlurHash;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Image_test extends javax.swing.JLayeredPane {

  
    public Image_test() {
        initComponents();
    }
public void setimage (String image){
    int width =300;
    int height = 300;
    int[] data = BlurHash.decode("LGF5]+Yk^6#M@-5c,1J5@[or[Q6.", width, height, 1);
BufferedImage imag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
imag.setRGB(0, 0, width, height, data, 0, width);
Icon icon = new ImageIcon(image);
Pic.setImage(icon);

}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pic = new swing.PicBox();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pic, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pic, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.PicBox Pic;
    // End of variables declaration//GEN-END:variables
}
