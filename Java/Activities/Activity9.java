package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("David");
        myList.add("Eve");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println(myList.get(2));

        System.out.println(myList.contains("Charlie"));

        System.out.println(myList.size());

        myList.remove("Bob");

        System.out.println(myList.size());
    }
}

