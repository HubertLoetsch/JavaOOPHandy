public class Sim {

    private int id;
    private String Number;

    public Sim (int id, String number){
        this.id = id;
        this.Number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }
}
