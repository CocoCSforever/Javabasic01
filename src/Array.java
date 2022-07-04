import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Array {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }



        /*
        public static void main(String[] args) {

            Integer myInt = 100;
            String myString = myInt.toString();
            System.out.println(myString);

    }
    */

}

