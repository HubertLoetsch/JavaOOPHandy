
import java.nio.file.Files;

import static com.sun.nio.file.SensitivityWatchEventModifier.LOW;

public class Camera {

    public enum Cameraresolution {LOW,MEDIUM,HIGH}
    private Cameraresolution resolution;

    public Camera(){
        this.resolution = resolution;
    }
    public Files takePicture(){
        return new Photofile(420,"A001","JPG")
    }




}

