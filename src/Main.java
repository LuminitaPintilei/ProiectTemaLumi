public class Main {

    public static float x = 3;
    public static float y = 5;
    public static float z = x + y;


    public static void main(String[] args) {


        printMyName();
        printMySum();
        printMyDivision();
        printMyResult();
        printMyModulo();
        printMyAverage(10, 9, 8);
        printMyCelsius(100);
        printMyMeters(345);
        printMySpeed(2000, 1, 30, 15);


    }


    public static void printMyName() {

        String printMyName = ("Hello \nLuminita" );

        System.out.println(printMyName);

    }


    public static void printMySum() {

        float printMySum = x + y;

        System.out.println(printMySum);

    }

    public static void printMyDivision() {

        float printMyDivision = x / y;

        System.out.println(printMyDivision);

    }

    public static void printMyResult() {

        float printMyResult = -5 + 8 * 6;

        System.out.println(printMyResult);

    }

    public static void printMyModulo() {

        float printMyModulo = z % x;

        System.out.println(printMyModulo);

    }

    public static void printMyAverage(float first, float second, float third) {

        float printMyAverage = ((first + second + third) / 3);
        System.out.println(printMyAverage);

    }

    public static void printMyCelsius(float Fahrenheit) {

        float printMyCelsius = ((Fahrenheit - 32) * 5 / 9);
        System.out.println("Temperatura este" + " " + printMyCelsius + " " + "grade Celsius" );

    }

    public static void printMyMeters(float Inch) {

        double printMyMeters = (Inch * 0.0254);

        System.out.println("Distanta in metri este" + " " + printMyMeters + " " + "metri" );

    }

    public static void printMySpeed(float d, int h, int m, int s) {
        float t = ((h * 3600 + m * 60 + s));
        float printMySpeed = d / t;
        System.out.println(" Viteza este " + printMySpeed + " " + " metri pe secunda" );
        System.out.println(" Viteza este " + printMySpeed * 3.6 + " " + " kilometri pe ora" );
        System.out.println(" Viteza este " + printMySpeed * 2.24 + " " + " mile pe ora" );


    }

}


