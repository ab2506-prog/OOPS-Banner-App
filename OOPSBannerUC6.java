public class OOPSBannerUC6 {

    public static void main(String[] args) {

        String[] o = createO();
        String[] p = createP();
        String[] s = createS();

        // Banner has 5 rows
        for (int i = 0; i < o.length; i++) {

            String line = String.join("   ",
                    o[i],
                    o[i],
                    p[i],
                    s[i]
            );

            System.out.println(line);
        }
    }

    // Static method for letter O
    public static String[] createO() {

        return new String[] {
                String.join(" ", "O","O","O"),
                String.join(" ", "O"," ","O"),
                String.join(" ", "O"," ","O"),
                String.join(" ", "O"," ","O"),
                String.join(" ", "O","O","O")
        };
    }

    // Static method for letter P
    public static String[] createP() {

        return new String[] {
                String.join(" ", "P","P","P"),
                String.join(" ", "P"," ","P"),
                String.join(" ", "P","P","P"),
                String.join(" ", "P"," "," "),
                String.join(" ", "P"," "," ")
        };
    }

    // Static method for letter S
    public static String[] createS() {

        return new String[] {
                String.join(" ", "S","S","S"),
                String.join(" ", "S"," "," "),
                String.join(" ", "S","S","S"),
                String.join(" ", " "," ","S"),
                String.join(" ", "S","S","S")
        };
    }
}