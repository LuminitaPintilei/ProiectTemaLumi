import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab6 {

    public List<Integer> getPopulatedList(int max) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            myList.add(i);
        }
        return myList;
    }

    //3. Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
    // iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand,
    // toate valorile din lista, fiecare pe rand nou, pornind de la numarul
    // intreg primit ca si parametru.

    public void printListFromNumber(List<Integer> myList, int number) {
        for (int i = number; i <= myList.size(); i++) {
            System.out.println(myList.get(i - 1));
        }
    }

    //2. Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru sa fie o lista de numere, si celalalt
    // un numar (real sau intreg). Metoda sa adauge numarul
    // primit ca si parametru la final de lista.

    public void addElement(List<Integer> myList, int element) {
        myList.add(element);
        System.out.print(myList);
    }

    //4. Scrieti o metoda Java, care sa primeasca parametru o Lista,
    // si sa afiseze, pe rand, toate valorile din lista,
    // dar invers(de la capat la inceput).

    public void reverseList(List<Integer> myList) {

        Collections.reverse(myList);
        System.out.println(myList);


    }

    //5.Scrieti o metoda Java, care sa primeasca trei parametrii:
    // unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
    // Metoda sa adauge parametrul de tip String in lista primita,
    // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void stringList(List<String> myStringList, int x, String arg) {
        myStringList = new ArrayList<>();

        myStringList.add("Roma");
        myStringList.add("Viena");
        myStringList.add("Bucuresti");
        myStringList.add("Paris");
        myStringList.add("Varsovia");
        System.out.println(myStringList);

        myStringList.set(x, arg);

        System.out.println(myStringList);


    }

    //6.Scrieti o metoda Java, care sa primeasca doi parametrii.
    // Primul dintre ei va fi o Lista,
    // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.

    public void secondStringList(List<Integer> myList, int i) {
        myList.set(0, i);
        System.out.println(myList);

    }
    //7.Scrieti o metoda Java care sa primeasca parametru o Lista,
    // si sa afiseze ce valori are lista, si ce pe ce pozitie.
    // (Ex: “Pe pozitia 1 valoare este 4”).

    public void iterateList(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            myList.get(i);
            System.out.println("Elementul de pe pozitia" + " " + i + " " + "este" + myList.get(i));

        }

    }
    //Scrieti o metoda Java care sa primeasca
    // o Lista si sa returneze cel mai mare numar din ea.




        }



