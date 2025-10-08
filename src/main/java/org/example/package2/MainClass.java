package org.example.package2;

public class MainClass {

    public static void main(String[] args) {
        Box myFirstBox = new Box();

        System.out.println(myFirstBox.getFromBox(3)); // false

        myFirstBox.putInBox("Telephone", 1);
        myFirstBox.putInBox(1, 1);
        System.out.println(myFirstBox.getFromBox(3));
        myFirstBox.putInBox("Какой-то текст", 1);

        System.out.println(myFirstBox.getFromBox(3));
    }
}
