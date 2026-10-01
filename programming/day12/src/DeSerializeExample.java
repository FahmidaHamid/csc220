import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeSerializeExample {
    public static void main(String[] args) {
        User deserializedUser = null;

        try (FileInputStream fileIn = new FileInputStream("user.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            
            // Read the object and cast it back to the target class
            deserializedUser = (User) in.readObject();
            
            System.out.println("Object has been deserialized.");
            System.out.println("Username: " + deserializedUser.username);
            // Will print 'null' because the password field was marked transient
            System.out.println("Password: " + deserializedUser.password); 
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
