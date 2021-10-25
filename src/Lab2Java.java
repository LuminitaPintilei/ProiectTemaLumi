public class Lab2Java {
    public static int x = 45;
    public static int z = 4;


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Print printModel = new Print();

        double result = calc.sum(x,z);
        double substractResult = calc.substract(x,z);
        double divisionResult = calc.division(x,z);
        double multiplyResult = calc.multiplication(x,z);
        double moduloResult = calc.modulo(x,z);
        System.out.println(result);
        System.out.println(substractResult);
        System.out.println(divisionResult);
        System.out.println(multiplyResult);
        System.out.println(moduloResult);

        printModel.printModel();

    }

}
