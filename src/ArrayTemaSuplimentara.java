import java.util.Arrays;

public class ArrayTemaSuplimentara {

    public static void main(String[] args) {

        //1. Creati o metoda care insereze un element
        // pe o pozitie specifica intr-un array.

        int[] my_array = {11, 56, 34, 7, 8};
        int Index_position = 2;
        int newValue = 5;
        for (int i = my_array.length - 1; i > Index_position; i--) {
            my_array[i] = my_array[i - 1];
        }
        my_array[Index_position] = newValue;
        System.out.println(Arrays.toString(my_array));

    }

    //2. Creati o metoda care sa
    // gaseasca cel mai mare si cel mai mic numar dintr-un array.

    static int max;
    static int min;

    public static void max_min(int my_array[]) {
        max = my_array[0];
        min = my_array[0];
        int len = my_array.length;
        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i] < min) min = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
                if (my_array[i] > max) max = my_array[i];
                if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            if (my_array[i] < my_array[i + 1]) {
                if (my_array[i] < min) min = my_array[i];
                if (my_array[i + 1] > max) max = my_array[i + 1];
            }
        }
    }

    public static void my_array(String[] args) {
        int[] my_array = {90, 114, 9, 45, 678, 91, 7};

        max_min(my_array);
        System.out.println();

        System.out.println("maxim" + max);
        System.out.println("minim" + min);
    }

    //5. Creati o metoda care sa gaseasca
    // toate elementele comune intre doua
    // array-uri (array de String).

    public static void comun (String[] args) {
        String[] array1 = {"Ana", "george", "Paul", "Soare"};

        String[] array2 = {"Cal", "Magar", "Soare", "Oana", "Victor", "Ion", "Ana"};

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }

        System.out.println("Common element : " + (array1));

    }


}










