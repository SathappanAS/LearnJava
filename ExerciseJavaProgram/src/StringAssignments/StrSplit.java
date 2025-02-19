package StringAssignments;
public class StrSplit {
    public static String Reversal(String str) {
        // Null check
        if (str == null) {
            throw new RuntimeException("str is null");
        }

        // Length check
        if (str.length() == 1) {
            return str;
        }

        // Length check == 0
        if (str.length() == 0) {
            return str;
        }

        // Split the string into words
        String words[] = str.split(" ");
        System.out.println("Lenght of the words " + words.length);
        String rev = "";

        // Loop through each word and reverse it
        for (int j = 0; j < words.length; j++) {
            String word = words[j];

            // Reverse each word using a loop
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord = reversedWord + word.charAt(i);
            }

            // Append the reversed word to the result string
            rev = rev + reversedWord + " ";
        }

        // Return the final result (trim to remove trailing space)
        return rev.trim();
    }

    public static void main(String[] args) {
        String str = "testing automation selenium";
        String res = StrSplit.Reversal(str);
        System.out.println(res);

    }
}