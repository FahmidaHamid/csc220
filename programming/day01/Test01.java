import java.util.ArrayList;

class Room {
    int id;
    String title;

    Room(){
        id = 0;
        title = "dummy";
    }

    Room(int id, String title) {
        this.id = id;
        this.title = title;
    }


    public String toString(){
        return "This is room no: " + id + " and it's called " + title; 
    }
}


class Building {

    int buildingId;
    ArrayList<Room> rooms;



}

public class Test01{

    public static void main(String[] args) {
        
        Room r1 = new Room();
        System.out.println(r1);

        Room r2 = new Room(2, "CLU Student Union");
        System.out.println(r2);

        Building b1 = new Building();
        System.out.println(b1);


    }
}
