public class assignment4 {

    public static void main(String[] args) {

        // Create banner lines using String.join()
        String line1 = String.join(" ", "O", " ", " ", "O", " ", "OOO", " ", "OOO", " ", "OOO");
        String line2 = String.join(" ", "O", " ", " ", "O", "O", " ", " ", "O", "O", " ", " ", "O");
        String line3 = String.join(" ", "O", " ", " ", "O", "O", " ", " ", "O", "O", "OOO");
        String line4 = String.join(" ", "O", " ", " ", "O", "O", " ", " ", "O", "O");
        String line5 = String.join(" ", " ", "OOO", " ", "OOO", " ", "OOO", "O");

        // Store lines in an array
        String[] banner = { line1, line2, line3, line4, line5 };

        // Loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}