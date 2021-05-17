public class Sim {

    private int id;
    public String Number;

    public Sim (int id, String number){
        this.id = id;
        this.Number = number;
    }

    public String docall(String number){
        return "Tel" + number + "id" + id;
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
