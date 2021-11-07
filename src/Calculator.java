public class Calculator {

    public static float x = 3;
    public static float y = 5;
    public static float z = x + y;


    public double sum(int first, double second) {
        double result = first + second;
        return result;
    }

    public double substract(double first, double second) {
        double result = first - second;
        return result;

    }

    public double division(double first, double second) {
        double result = first / second;
        return result;

    }

    public double multiplication(double first, double second) {
        double result = first * second;
        return result;

    }

    public double modulo(double first, double second) {
        double result = first % second;
        return result;

    }

    public void printMySum() {

        float printMySum = x + y;

        System.out.println(printMySum);

    }

    public void printMyDivision() {

        float printMyDivision = x / y;

        System.out.println(printMyDivision);

    }

    public void printMyResult() {

        float printMyResult = -5 + 8 * 6;

        System.out.println(printMyResult);

    }

    public void printMyModulo() {

        float printMyModulo = z % x;

        System.out.println(printMyModulo);

    }

    public void printMyAverage(float first, float second, float third) {

        float printMyAverage = ((first + second + third) / 3);
        System.out.println(printMyAverage);

    }

    public void DoStuff(int u){

        int v = 7;
        int DoStuff = v + 1;

        System.out.println(DoStuff);

    }

}



































