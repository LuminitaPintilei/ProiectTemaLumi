public class LogicalNewOperations {
    public int checkBiggerNumber(int first, int second) {

        if (first > second) {
            return (first);
        } else {
            return (second);
        }
    }


    //4. Creati o metoda de tip String, care sa primeasca un parametru de tip String.
    // Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”.
    // Daca da, atunci metoda sa returneze “Learning text comparison”.
    // Daca nu, atunci metoda sa returneze “Got to try some more”.

    public String verifygivenText(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparison");
        } else if (!text.equals("FastTrack")) {
            return ("Got to try some more");
        } else return (" Try again!");


    }

//
    // Given a number, if it’s equal to or higher than 2
    // and equal to or lower than 8, print the number

    public int verifyNumber(int number) {
        if (number >= 2 && number <= 8) {
            return (number);
        } else return (0);
    }
//5. Given a text input and a number input,
// if the text is equal to “FastTrack”
// AND the number is equal to or lower than 3,
// print the text and the number.
// If the text is not “FastTrack” A
// ND the number is equal to or higher than 4,
// print the number and the text, in this order.

    public String verifyNewText(String newText, int newNumber) {

        if (newText.equals("FastTrack") && newNumber <= 3) {
            return (newText + newNumber);
        } else if (!newText.equals("FastTrack") && newNumber >= 4) {
            return (newNumber + newText);
        } else return ("Nu e cazul");

    }
    //6. Given a number input, if it is higher
    // than 8 OR equal to 6, print
    // “The amount of snow this winter was(cm):
    // ” and the given number. Else print “The forecast snow is(cm):”

    public String numberEgFive(int numberEgFive) {

        if (numberEgFive >= 8 || numberEgFive == 6) {
            return (" The amount of snow this winter was" + " " + "(cm):" + numberEgFive);
        } else return ("The forecast snow is(cm):" + " " + numberEgFive);


    }

    //7. Given a number input, if the number is greater than 3 but not equal to 4,
    // print “The number is greater than 3 and not equal to 4".
    // Else if the number is equal to 4 print “The number is equal to 4”.
    // Else if the number is lower than 3 print “The number is lower than 3"

    public String numberEg6(int numberEg6) {
        if (numberEg6 > 3 && numberEg6 != 4) {
            return ("The number is greater than 3 and not equal to 4");

        } else if (numberEg6 == 4) {
            return ("The number is equal to 4");

        } else if (numberEg6 < 3) {
            return ("The number is lower than 3");

        } else return ("Choose a different number!");

    }

// 8. Creati o metoda care primeste un numar ca si parametru si
// sa afiseze ce numar a primit. Folosind constructia Switch-Case,
// verificati ce numar s-a primit si afisati textul "The number is:  x !"
// unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa
// nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru,
// ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
// Apelati metoda in main() pentru a verifica daca functioneaza.


    public String pickNumber(int pickNumber) {

        switch (pickNumber) {
            case 1:
                return ("The number is: 1!");
            case 2:
                return ("The number is: 2!");
            case 3:
                return ("The number is: 3!");
            default:
                System.out.println("Your answer is wrong!");

        }
        return null;
    }

//9. Creati o metoda care sa se numeasca isNumberEven.
// Metoda trebuie sa primeasca ca parametru un numar,
// si sa returneze adevarat sau fals. Daca numarul e par sa returneze true
// iar daca e impar sa returnese false.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public String isNumberEven(int isNumberEven) {

        if (isNumberEven % 2 == 0) {
            return ("true");
        } else return ("false");
    }

    //10. Creati o metoda care sa se numeasca isEligibleToVote.
    // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
    // iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public String isEligibleToVote(int age) {
        if (age >= 18) {
            return ("Are drept de vot.");
        } else
            return ("Fara drept de vot.");
    }

    public int biggerNumber(int first, int second, int third) {

        if ((first > second) && (first > third)) {
            return (first);

        } else if ((second > first) && (second > third)) {
            return (second);
        } else if ((third > first) && (third > second)) {
            return (third);
        }


        return first;
    }

    public void countBackwards(int small, int big) {
        for (int i = big; i >= small; i--) {
            System.out.println(i);
        }


    }

    public float getAverageFromInterval(int start, int max) {
        float sum = 0;
        for (int i = start; i <= max; i++) {
            sum = i + sum;
        }
        return (sum / max - start + 1);
    }

    public float getAverageDivisibleBySeven(int start, int max) {
        int x = start;
        float sum = 0;
        int count = 0;
        while (x <= max) {
            if (x % 7 == 0) {
                sum += x; // sum = sum + x;
                count++;

            }
            x++;

        }
        return sum / count;

    }

    //Given a number, while the number is equal to or lower than 100, print the number;

    public int givenNumber(int start, int max) {
        int x = start;
        max = 100;
        while (x <= 100) {
            System.out.println(x);
        }
        return x;
    }
//2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
// valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public int[] populateArray(int max) {
        int[] myArr = new int[max];
        for (int i = 0; i < max; i++) {
            myArr[i] = i + 1;
        }
        return myArr;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //public static void printArray(Dog[] array){
    //for (int i = 0; i < array.length; i++){
    // System.out.println(array[i].getName());
    //}
    //}

    public float getAverageValueFromArray(int[] array) {
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (sum / array.length);
    }

    public boolean isValueInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

//3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
// si sa il returneze populat cu toate valorile pare de la 1 la 100.
// Apelati metoda in main() pentru a verifica daca functioneaza. A
// tentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.

//7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

    public void grilaArray() {
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("- ", a[i][j]);
            }
            System.out.println();

        }

    }

    //Creati o metoda care sa primeasca un parametru de tip array de numere,
    // populat cu valori, si un parametru de tip numar. Metoda sa
    // verifice daca numarul primit se afla in array-ul primit, si daca da, atunci
    // sa returneze pozitia pe care se afla numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
            System.out.println(arr);
        }
        return false;
    }


    public int[] itemArray() {
        int[] my_array1 = {
                17, 20, 18, 56, 2013,
                158, 2458, 14, 142, 235,
                156, 265, 149, 246};
        return my_array1;
    }

    //9. Creati o metoda care sa primeasca un array,
    // si sa returneze al doilea cel mai mic numar din array.
    //Apelati metoda in main() pentru a verifica daca functioneaza.

    public int[] verifyArray() {

        int[] my_array2 = {
                4, 78, 5, 67, 23, 13};
        return my_array2;

    }

    static int max;
    static int min;

    public int max_min(int my_array[]) {
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
        return min;

    }
}







    























