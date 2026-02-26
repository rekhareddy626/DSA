import java.util.*;

public class Longest {
    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        
        Arrays.sort(s);   // Sort the array
        
        String first = s[0];
        String last = s[s.length - 1];
        
        int count = 0;
        
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) == last.charAt(i)) {
                count++;
            } else {
                break;
            }
        }
        
        if (count == 0)
            System.out.println("No Common Prefix");
        else
            System.out.println("Longest Common Prefix: " + first.substring(0, count));
    }
}