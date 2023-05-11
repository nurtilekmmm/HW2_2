import java.time.Year;

public class Main {
    public static Printable createObject(String className) {
        switch (className) {
            case "Mac":
                Mac mac = new Mac("MacBook Pro",2021,"macOS");
                return mac;
            case "Asus":
                Asus asus = new Asus("ROG Strix G15", 2022,"Windows");
                return asus;
            case "HP":
                HP hp = new HP("HP Pavilion",2023,"Linux");
                return hp;
            default:
                return null;
        }
    }
    public static void main(String[] args) {
        Printable obj1 = createObject("Mac");
        Printable obj2 = createObject("Asus");
        Printable obj3 = createObject("HP");


        Printable[] objects = {obj1, obj2, obj3};
        for (Printable object : objects) {
            object.print();
            System.out.println("----------------------");
        }
    }
}