public class Phone {

    private SDCard card;
    private Sim sim;
    private Camera camera;



//GetFree space
    //Make Call
    //Print all Files
    //Make Picture

    public void makePicture() {
        if (this.card == null || this.card.getFreeSpace() < 1000) {
            System.out.println("No space or no card ");
            return;
        }
    }





}

