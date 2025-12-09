package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Red");
        hs.add("Blue");
        hs.add("Green");
        hs.add("Yellow");
        hs.add("Black");
        hs.add("White");

        System.out.println(hs.size());

        hs.remove("Green");

        System.out.println(hs.remove("Purple"));

        System.out.println(hs.contains("Blue"));

        System.out.println(hs);
    }
}
