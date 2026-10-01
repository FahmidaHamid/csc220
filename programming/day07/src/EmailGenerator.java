public class EmailGenerator {
    public static String generateNewEmail(String x, String domain) {
        int randomNumber = (int) (Math.random() * 100) % 10;
        String firstThree = x.substring(0, 3).toLowerCase();
        return firstThree + randomNumber + "@" +  domain + ".edu";

    }
}
