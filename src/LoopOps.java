public class LoopOps {


    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o
    // numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


    public int number(int n) {
        for (int i = 100; n <= i; n++) {
            System.out.println(n);
        }

        return n;
    }

    //2. Creati o metoda in clasa LogicalOp,
    // care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o
    // numaratoare pana la -100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public int number2(int n) {
        for (int i = -100; n >= i; n--) {
            System.out.println(n);
        }
        return n;
    }

    //Creati o metoda in clasa LogicalOp, care sa primeasca
    // doi parametrii de tip numar. Metoda sa afiseze o numaratoare
    // intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.


    public int numaratoare(int first, int second) {
        int x;
        int y;
        for (x = first, y = second; x <= y; x++) {
            System.out.println(x);
        }
        return x;
    }

    //Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o
    // numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).

    public void numaratoarecrescatoare(int first, int second) {
        int x;
        int y;
        for (x = first, y = second; x <= y; x++) {
            System.out.println(x);
        }

        for (x = first, y = second; x >= y; y++) {
            System.out.println(y);

        }

    }

    //Creati o metoda in clasa LogicalOp
    // care sa afiseze toate numerele pare de la 1 la 100.

    public void numerepare() {
        int v = 100;
        for (int i = 1; i <= v; i++) {
            if (i % 2 == 0) {
                System.out.println(i)
                ;
            }

        }

    }
    //6. Creati o metoda in clasa LogicalOp care
    // sa afiseze toate numerele impare de la 1 la 100.

    public void numereImpare() {
        int v = 100;
        for (int i = 1; i <= v; i++) {
            if (i % 2 != 0) {
                System.out.println(i)
                ;
            }

        }

    }

    //7. Creati o metoda in clasa LogicalOp care sa primeasca
    // un parametru de tip numar. Metoda sa adune toate numerele pana la 100,
    // pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public int sum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            System.out.println(sum);
        }

        return sum;
    }

    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // si sa calculeze media numerelor. La final, metoda sa returneze media.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void averageSum() {
        int sum = 0;
        int average = 101;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;

            System.out.println(sum / average);
        }

    }

    // 9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    // *******
    // ******
    // *****
    //****
    // ***
    // **
    //*

    public void tipar(int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            System.out.print("*");
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public void tipar2() {
        int i, j;
        for (j = 7; j > 1; j--) {
            System.out.print("*");
        }

        for (i = j; i > 1; i--) {
            System.out.print("*");

            System.out.println();
        }

    }

    //public void printPattern() {
    //
    //    for (int j = 7; j >= 1; j--) {
    //
    //        String text = "";
    //
    //        for (int i = j; i >= 1; i--) {
    //
    //            text = text + "*";
    //
    //        }
    //
    //        System.out.println(text);
    //
    //    }
    //
    //}

    //Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void numbers() {
        int i = 45, n = 100;

        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }

    //Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


    public void newNumbers() {
        int i = -78, n = -100;

        while (i >= n) {
            System.out.println(i);
            i--;

        }
    }

    //Creati o metoda in clasa LogicalOp,
    // care sa primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.

    public void Count() {
        int x = 7;
        int y = 12;
        int i = x;

        while (i >= x && i <= y) {
            System.out.println(i);
            i++;
        }
    }

    //Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute
    // o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,
    // atunci numaratoarea sa fie de la y la x).

    public int count(int first, int second) {
        int x = first;
        int y = second;

        while (x >= y) {
            System.out.println(y);
            y++;
        }
        while (x <= y) {
            System.out.println(x);
            x++;

        }
        return x;
    }

    //Creati o metoda in clasa LogicalOp care sa
    // afiseze toate numerele pare de la 1 la 100.

    public void oneToHundred() {
        int i = 1;
        while (i >= 1 && i <= 100) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }

    //Creati o metoda in clasa LogicalOp care sa
    // afiseze toate numerele impare de la 1 la 100.

    public void oneToHundredOdd() {
        int i = 1;
        while (i >= 1 && i <= 100) {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }

    //Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si
    // afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    //public void average() {
       // int num = 8899, i = 111, sum = 0;
       // while (i <= num) {
         //   sum += i;
         //   i++;

          //  System.out.println(sum);

       // int count = count(i,num);
       // System.out.print(count);

    public void sumAndAverageWhile() {

        int firstNumber = 111;
        int secondNumber = 8899;
        double sum = 0;
        int count = 0;


        while (firstNumber <= secondNumber) {
            sum += firstNumber;
            firstNumber++;
            count++;

        }

        System.out.println(sum);

        double average = sum / count;

        System.out.println("The average of the numbers is: " + average);

    }



    //8. Creati o metoda care sa primeasca doi parametrii de tip numar,
    // si sa returneze media numerelor divizibile cu 7, din acel interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    //public void SevenNumbers(int first, int second){
       // int x = first, y = second, sum = 0;
        //int i;
        //while ( x <= y) {
            //if(x <= first)
           // if( x % 7==0){
                //sum+=x;
                //x++;

               // System.out.println(sum);

    public float divideBySevenWhile(int firstNumber, int lastNumber) {
        float count = 0F;
        float sum = 0F;
        while (firstNumber <= lastNumber) {

            if (firstNumber % 7 == 0) {
                count ++;
                sum += firstNumber;

            }

            firstNumber++;

        }

        float average = sum / count;

        return average;

    }



    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void fibonacci() {

        int count = 20;

        int num1 = 0;

        int num2 = 1;



        int i=1;

        while(i<=count)

        {

            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;

            num1 = num2;

            num2 = sumOfPrevTwo;

            i++;

        }

    }


        public void wozaCozaLoza () {

            int i = 1;

            while (i <= 110) {

                if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

                    System.out.print("CozaLozaWoza ");

                } else if (i % 5 == 0 && i % 7 == 0) {

                    System.out.print("WozaLoza ");

                } else if (i % 3 == 0 && i % 7 == 0) {

                    System.out.print("CozaWoza ");

                } else if (i % 3 == 0 && i % 5 == 0) {

                    System.out.print("CozaLoza ");

                } else if (i % 7 == 0) {

                    System.out.print("Woza ");

                } else if (i % 5 == 0) {

                    System.out.print("Loza ");

                } else if (i % 3 == 0) {

                    System.out.print("Coza ");

                } else {

                    System.out.print(i + " ");

                }

                if (i % 11 == 0) {

                    System.out.println();

                }

                i++;

            }

        }


    }















