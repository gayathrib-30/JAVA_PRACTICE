import java.util.*;

class Anagram {

    public static void main(String[] args) {

        String s1 = "Listen";
        String s2 = "Silent";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        s1 = new String(a);
        s2 = new String(b);

        if (s1.equals(s2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}