package Week1;

import java.util.HashSet;

import static java.lang.Character.toLowerCase;

public class Pangrams {
    public static String pangrams(String s) {
        // Write your code here
        final int numOfLettersInEngAlph = 26;
        HashSet<Character> letterSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') continue;
            ch = Character.toLowerCase(ch);
            letterSet.add(ch);
        }

        return letterSet.size() == numOfLettersInEngAlph ? "pangram" : "not pangram";
    }
}
