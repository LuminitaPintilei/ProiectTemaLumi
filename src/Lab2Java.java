public class Lab2Java {
    public static int x = 45;
    public static int z = 4;


    public static void main(String[] args) {
        double result = sum(x,z);
        double substractResult = substract(x,z);
        double divisionResult = division(x,z);
        double multiplyResult = multiplication(x,z);
        double moduloResult = modulo(x,z);
        System.out.println(result);
        System.out.println(substractResult);
        System.out.println(divisionResult);
        System.out.println(multiplyResult);
        System.out.println(moduloResult);

    }
    public static double sum(int first, double second){
        double result = first + second;
        return result;
    }

    public static double substract(double first, double second){
        double result = first - second;
        return result;

    }

   public static double division(double first, double second){
        double result = first / second;
        return result;

   }

   public static double multiplication(double first, double second){
        double result = first * second;
        return result;

   }

   public static double modulo(double first, double second){
        double result = first % second;
        return result;

   }

}
