public class EmailGenerator {
    public static String generateNewEmail(String x, String domain) {
        int randomNumber = (int) (Math.random() * 100) % 10;
        String firstThree = x.substring(0, 3).toLowerCase();
        return firstThree + randomNumber + "@" +  domain + ".edu";

    }
    // overloaded method to generate email with a max length for the name part
    
    public static String generateNewEmail(
        String x, String domain, int maxLength) {

    int randomNumber = (int)(Math.random() * 100) % 10;

    // Remove spaces from the name
    String cleanName = x.replace(" ", "");

    // Make sure maxLength is not larger than the name
    int length = Math.min(cleanName.length(), maxLength);

    String alpha = cleanName.substring(0, length).toLowerCase();

    return alpha + randomNumber + "@" + domain + ".edu";
}

}
