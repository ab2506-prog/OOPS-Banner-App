import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    public static void main(String[] args) {

        // Create map to store patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for O
        patternMap.put('O', new String[]{
                String.join(" ", "O","O","O"),
                String.join(" ", "O"," ","O"),
                String.join(" ", "O"," ","O"),
                String.join(" ", "O"," ","O"),
                String.join(" ", "O","O","O")
        });

        // Pattern for P
        patternMap.put('P', new String[]{
                String.join(" ", "P","P","P"),
                String.join(" ", "P"," ","P"),
                String.join(" ", "P","P","P"),
                String.join(" ", "P"," "," "),
                String.join(" ", "P"," "," ")
        });

        // Pattern for S
        patternMap.put('S', new String[]{
                String.join(" ", "S","S","S"),
                String.join(" ", "S"," "," "),
                String.join(" ", "S","S","S"),
                String.join(" ", " "," ","S"),
                String.join(" ", "S","S","S")
        });

        // Word to render
        String word = "OOPS";

        // Call render function
        renderBanner(word, patternMap);
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}