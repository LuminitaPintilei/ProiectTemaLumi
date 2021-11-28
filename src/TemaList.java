import java.util.ArrayList;
import java.util.List;

public class TemaList {

    //1.Scrieti o metoda Java, care sa primeasca parametru
    // o Lista, si sa afiseze, pe rand,
    // toate valorile din lista, fiecare pe rand nou.

    public static void main(String[] args) {

        List< Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);

        System.out.println(firstList);

        List<Integer> myList = new ArrayList<>();
        Lab6 op = new Lab6();
        List<Integer> mySecondList = op.getPopulatedList(100);

        System.out.println(mySecondList);
        op.printListFromNumber(mySecondList, 70);
        op.addElement(mySecondList, 700);

        op.reverseList(mySecondList);

        List<String> myStringList = new ArrayList<>();
        op.stringList(myStringList, 1,"Mos Craciun");
        op.secondStringList(mySecondList,0);
        op.iterateList(mySecondList);












    }



      }



