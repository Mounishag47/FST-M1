package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {

        Map<Integer, String> colours = new HashMap<>();

        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "Yellow");
        colours.put(5, "Black");

        System.out.println(colours);

        colours.remove(4);

        System.out.println(colours.containsValue("Green"));

        System.out.println(colours.size());
    }
}
