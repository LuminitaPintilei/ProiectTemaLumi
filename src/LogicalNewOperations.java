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

    public float getAverageFromInterval(int start, int max){
        float sum = 0;
        for(int i = start; i <=max; i++ ){
            sum = i+sum;
        }
        return (sum / max - start + 1);
    }

    public float getAverageDivisibleBySeven(int start, int max) {
        int x = start;
        float sum = 0;
        int count = 0;
        while (x<=max) {
            if(x % 7 == 0) {
                sum += x; // sum = sum + x;
                count++;

            }
            x++;

        }
        return sum / count;

    }

    //Given a number, while the number is equal to or lower than 100, print the number;

    public void givenNumber(int start, int max){
        int x = start;
        max = 0;
        while (x <= 100){
            System.out.println(x);
        }
    }

}










