import java.lang.*;
import java.util.*;

public class Collection_2 {
    private java.lang.Object[] objArray = new java.lang.Object[10];
    private int elementCount = 0;

    public void add(java.lang.Object obj) {
        if (elementCount == objArray.length) {
            increaseCapacity();
        }
        objArray[elementCount] = obj;
        elementCount++;
    }

    public void increaseCapacity() {
        int newCapacity = objArray.length * 2;
        java.lang.Object[] nextArray = new java.lang.Object[newCapacity];
        for (int i = 0; i < objArray.length; i++) {
            nextArray[i] = objArray[i];
        }
        objArray = nextArray;
    }

    public void displayElements() {
        for (int i = 0; i < elementCount; i++) {
            System.out.println(objArray[i]);
        }
    }

    public static void main(String[] args) {
        Collection_2 collection = new Collection_2();

        // Adding some elements
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");

        // Displaying the elements
        System.out.println("Elements in collection:");
        collection.displayElements();
    }
}
