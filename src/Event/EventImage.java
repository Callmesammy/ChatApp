
package Event;

public class EventImage {
    
    private static EventImage instance;
    private ImageEvent picture;
    
    public static EventImage install(){
    if (instance == null){
        instance = new EventImage();
    }   
    return instance;
    }

    public EventImage() {
    }
    
   public void addEventImage(ImageEvent picture){
       this.picture = picture;
   }
    public ImageEvent addPicture(){
        return picture;
    }
    
}
