import java.io.Serializable;

public class User implements Serializable {
    // Explicitly define a version ID
    private static final long serialVersionUID = 1L; 
    
    public String username;
    // This field will be skipped during serialization
    public transient String password; 
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
