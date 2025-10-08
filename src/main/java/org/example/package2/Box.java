package org.example.package2;

public class Box {

    private Object[] boxElements = new Object[5];

    Box() {
        boxElements[0] = "Hello world";
        boxElements[1] = 1;
        boxElements[2] = 1.0;
        boxElements[3] = false;
        boxElements[4] = "Hello world";
    }

    public Object getFromBox(int elementNumber) {
        return boxElements[elementNumber];
    }

    public void putInBox(Object element, int index) {
        boxElements[index] = element;
    }
}
