
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

    public class ReadFromKeyboard {


        public int getInt() {
            int count = 0;
            do {
                Scanner scan = new Scanner(System.in);
                try {
                    System.out.print("Type an integer number: ");
                    return scan.nextInt();
                } catch (InputMismatchException error) {
                    System.out.println("Incorrect value!");
                    count++;
                }
                if (count == 5) {
                    sleep(5);
                    count = 0;
                }
            } while (true);
        }

        private void sleep(int seconds) {
            System.out.print("Sleeping for: ");
            do {
                System.out.println(seconds);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                seconds--;
            } while (seconds > 0);

        }

        public float getFloat() {
            int count = 0;
            do {
                Scanner scan = new Scanner(System.in);
                try {
                    System.out.print("Type a float: ");
                    return scan.nextFloat();
                } catch (InputMismatchException error) {
                    System.out.println("Incorrect value!");
                    count++;
                }
                if (count == 5) {
                    sleep(5);
                    count = 0;
                }
            } while (true);
        }

        public double getDouble() {
            int count = 0;
            do {
                Scanner scan = new Scanner(System.in);
                try {
                    System.out.print("Type a double: ");
                    return scan.nextDouble();
                } catch (InputMismatchException error) {
                    System.out.println("Incorrect value!");
                    count++;
                }
                if (count == 5) {
                    sleep(5);
                    count = 0;
                }
            } while (true);
        }

        public String getString() {
            int count = 0;
            do {
                Scanner scan = new Scanner(System.in);
                try {
                    System.out.print("Type a String: ");
                    return scan.next();
                } catch (InputMismatchException error) {
                    System.out.println("Incorrect value!");
                    count++;
                }
                if (count == 5) {
                    sleep(5);
                    count = 0;
                }
            } while (true);
        }

        public long getLong() {
            int count = 0;
            do {
                Scanner scan = new Scanner(System.in);
                try {
                    System.out.print("Type a long: ");
                    return scan.nextLong();
                } catch (InputMismatchException error) {
                    System.out.println("Incorrect value!");
                    count++;
                }
                if (count == 5) {
                    sleep(5);
                    count = 0;
                }
            } while (true);
        }

        public int[] getArray(int size) {
            int[] myArr = new int[size];
            System.out.println("Type the value of your array:");
            for (int i = 0; i < myArr.length; i++) {
                myArr[i] = getInt();
            }
            return myArr;
        }


        //5. In clasa LogicalOp, creati o metoda care sa primeasca
        // un array de numere ca si parametru, si un numar. Fara a folosi
        // conditii, si folosind un try-catch, afisati valoarea de pe
        // pozitia numarului primit, iar daca valoarea numarului este mai mare
        // decat numarul de pozitii din array,
        // afisati textul: "Inside catch, number too large".

        public int[] checkValueArray(int[] secondArray, int i) {

            for ( i = 0; i < secondArray.length; i++)
                secondArray[i] = i;
                try {
                    System.out.println (secondArray[i]);
                }
                catch (ArrayIndexOutOfBoundsException error) {
                    System.out.println("Inside catch, number too large");
                }

            return null;
        }

        //4. In clasa Read, creati o metoda care sa returneze o lista d
        // e numere populate de la tastatura. Metoda nu v-a primii parametru
        // lungimea. In rezolvarea ei trebuie folosit try-catch.
        // (Hint: a se citi de la tastatura atata timp cat
        // valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

        public List<Integer> getPopulatedList() {
            List<Integer> myList = new ArrayList<>();

            do {
                myList.add(getInt());

                try {
                    System.out.println(" Your List is " +myList);

                } catch (InputMismatchException error) {
                    System.out.println("Incorrect value!");
                }

            } while (true);

        }




        }
