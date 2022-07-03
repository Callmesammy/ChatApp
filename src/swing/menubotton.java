
package swing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author user
 */
public class menubotton extends JButton{

    /**
     * @return the iconSelected
     */
    public Icon getIconSelected() {
        return iconSelected;
    }

    /**
     * @param iconSelected the iconSelected to set
     */
    public void setIconSelected(Icon iconSelected) {
        this.iconSelected = iconSelected;
    }

    /**
     * @return the iconsimple
     */
    public Icon getIconsimple() {
        return iconsimple;
    }

    /**
     * @param iconsimple the iconsimple to set
     */
    public void setIconsimple(Icon iconsimple) {
        this.iconsimple = iconsimple;
    }

    private Icon iconSelected;
    private Icon iconsimple;
    
    
    public void setSelected (boolean bln){
        super.setSelected(bln);
        if (bln){
            setIcon(iconSelected);
        }else{
            setIcon(iconsimple);
        }
    }
    public menubotton() {
        setContentAreaFilled(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        if (isSelected()){
            g.setColor(new Color(110,41,255));
            g.fillRect(0, getHeight()-3, getWidth(), getHeight());
        }
    }
    
    
    
}
