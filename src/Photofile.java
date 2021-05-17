public class Photofile {

    private int size;
    private String name;
    private String extension;


    public Photofile (int size,String name, String extension){
        this.size = size;
        this.name = name;
        this.extension = extension;
    }

    //Kombi aus SIZE/NAME/PNG
    public void getinfo() {
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
