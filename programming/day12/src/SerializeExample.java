import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializeExample {
    public static void main(String[] args) {
        User user = new User("Alice", "SuperSecret123");

        try (FileOutputStream fileOut = new FileOutputStream("user.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            
            out.writeObject(user);
            System.out.println("Object has been serialized to user.ser");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
