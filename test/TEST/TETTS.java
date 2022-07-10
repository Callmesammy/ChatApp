
package TEST;

import Blurhash.BlurHash;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author user
 */
public class TETTS {
    
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\user\\Desktop\\ICON\\thumbnail.jpg"));
    String blurhashStr = BlurHash.encode(image); 
            System.out.println(blurhashStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
