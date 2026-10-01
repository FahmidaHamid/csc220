public class EmailGenerator{
 
    public static String generateEmail(String name) {
        int randomNumber = (int) (Math.random() * 100) % 10;
        String firstThree = name.substring(0, 3).toLowerCase();
        return firstThree + randomNumber + "@someuniv.edu";

    }

     public static String generateEmail(String name, Boolean rev) {
        if(rev){
            
        
        int randomNumber = (int) (Math.random() * 100) % 10;
        String firstThree = name.substring(0, 3).toLowerCase();
        return firstThree + randomNumber + "@someuniv.edu";
        }
        else{
            return null;
        }

    }
}
