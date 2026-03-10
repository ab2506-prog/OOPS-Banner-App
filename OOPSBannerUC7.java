public class OOPSBannerUC7 {

    // Static inner class to store character pattern
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create pattern objects
        CharacterPattern O = new CharacterPattern('O', new String[]{
                String.join(" ", "O","O","O"),
                String.join(" ", "O"," ","O"),
                String.join(" ", "O"," ","O"),
                String.join(" ", "O"," ","O"),
                String.join(" ", "O","O","O")
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                String.join(" ", "P","P","P"),
                String.join(" ", "P"," ","P"),
                String.join(" ", "P","P","P"),
                String.join(" ", "P"," "," "),
                String.join(" ", "P"," "," ")
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                String.join(" ", "S","S","S"),
                String.join(" ", "S"," "," "),
                String.join(" ", "S","S","S"),
                String.join(" ", " "," ","S"),
                String.join(" ", "S","S","S")
        });

        // Word to display
        CharacterPattern[] word = {O, O, P, S};

        // Print banner
        for (int i = 0; i < 5; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append("   ");
            }

            System.out.println(line);
        }
    }
}