public class UnitatiMasura {

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
