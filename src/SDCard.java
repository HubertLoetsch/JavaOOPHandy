import java.util.ArrayList;
import java.util.List;

public class SDCard {

    private int capacity;
    private List<Photofile> files;

    public SDCard (int capacity){
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public int getFreeSpace(){
        int sum = 0;
        for (Photofile photofile : files){
            sum += photofile.getSize();
        }
        return capacity - sum;
    }

    public void SaveFile (Photofile file){
        this.files.add(file);
    }

}



























































