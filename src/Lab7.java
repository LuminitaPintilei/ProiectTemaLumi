import java.util.List;
import java.util.Scanner;

    public class Lab7 {

        public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
            ReadFromKeyboard read = new ReadFromKeyboard();
        int x = read.getInt();
        System.out.println("Integer number is: " +x);

        float y = read.getFloat();
        System.out.println("Float is: "+y);

        double d = read.getDouble();
        System.out.println("Double is: " +d);

        String s = read.getString();
        System.out.println("String is "+s);

        long l = read.getLong();
        System.out.println("Long is: "+l);



    //   float a = scan.nextFloat();
    //  String z = scan.next();
     // System.out.println("String citit este: " + z);
     // System.out.println("Float-ul citit este: " + a);


            LogicalNewOperations op = new LogicalNewOperations();
            int[] array = read.getArray(3);
            op.printArray(array);



            int[] secondArray = read.checkValueArray(op.itemArray(), 70000);
            System.out.println(secondArray);

            read.getPopulatedList();



        }
}
