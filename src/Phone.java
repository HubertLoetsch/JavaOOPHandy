import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class Phone {
    private String color;
    private SDCard card;
    private Sim sim;
    private Camera camera;

    public Phone(String color, Sim sim, Camera camera, SDCard card) {
        this.color = color;
        this.camera = camera;
        this.sim = sim;
        this.card = card;
    }

    public void makePicture (){
        Files file = this.camera.takePicture();
        this.card.SaveFile(file);
    }

    //makePicture
    public void takePicture() {
        if (this.card == null || this.card.getFreeSpace() < 1000) {
            System.out.println("No space or no card ");
            return;
        }
    }


    //PrintallFiles
    public void printAllFiles() {


    }

    //MakeCALL
    public void makeCall(String number) {
        if (sim == null) {
            System.out.println("no SIM Card");
            return;
        }
        sim.docall(number);
    }


}

