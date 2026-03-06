public class Assignment3 {

    public static void main(String[] args) {

        String line1 = String.join(" ", "O", " ", " ", "O", " ", "OOO", " ", "OOO", " ", "OOO");
        String line2 = String.join(" ", "O", " ", " ", "O", "O", " ", " ", "O", "O", " ", " ", "O");
        String line3 = String.join(" ", "O", " ", " ", "O", "O", " ", " ", "O", "O", "OOO");
        String line4 = String.join(" ", "O", " ", " ", "O", "O", " ", " ", "O", "O");
        String line5 = String.join(" ", " ", "OOO", " ", "OOO", " ", "OOO", "O");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}