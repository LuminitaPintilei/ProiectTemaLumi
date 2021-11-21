public class Calculator {

    public static float x = 3;
    public static float y = 5;
    public static float z = x + y;
// 1. In proiectul de Calculator, in clasa Calculator,
// supraincarcati toate metodele conform principiului polimorfismului.
// Creati cel putin cate doua metode polimorfe pentru
// fiecare metoda pe care o aveti in clasa.

    public double sum(int first, double second) {
        double result = first + second;
        return result;
    }

    public int sum(int first, int second){
        int result = first + second;
        return result;
    }
    public int sum ( int first, int second, int third) {
        int result = first + second + third;
        return result;
    }
    public float sum ( float first, float second) {
        float result = first + second;
        return result;
    }

    public double substract(double first, double second) {
        double result = first - second;
        return result;

    }
    public int substract(int first, int second) {
        int result = first - second;
        return result;
    }
    public float substract(float first, float second, float third) {
        float result = first - second -third;
        return result;
    }


    public int division(int first, int second) {
        int result = first / second;
        return result;

    }

    public float division(float first, float second) {
        float result = first / second;
        return result;

    }
    public float division(float first, int second) {
        float result = first / second;
        return result;

    }
    public float division(float first, float second, float third) {
        float result = first / second / third;
        return result;
    }

    public double multiplication(double first, double second) {
        double result = first * second;
        return result;

    }
    public int multiplication(int first, int second) {
        int result = first * second;
        return result;

    }
    public float multiplication(float first, float second) {
        float result = first * second;
        return result;

    }

    public float multiplication(float first, float second, int third) {
        float result = first * second * third;
        return result;

    }

    public double modulo(double first, double second) {
        double result = first % second;
        return result;

    }

    public int modulo(int first, int second) {
        int result = first % second;
        return result;

    }
    public float modulo(float first, float second) {
        float result = first % second;
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

    public void printMyAverage(int first, int second, int third) {

        int printMyAverage = ((first + second + third) / 3);
        System.out.println(printMyAverage);

    }

    public void DoStuff(int u){

        int v = 7;
        int DoStuff = v + 1;

        System.out.println(DoStuff);

    }

}



































