public class Main {


    public static void main(String[] args) {

        UnitatiMasura masura = new UnitatiMasura();
        Print print = new Print();
        Calculator calc = new Calculator();

        calc.sum(11,17);
        calc.sum(7, 5, 3);
        calc.sum(11.0f,2.5f);
        calc.sum(10, 1456789);
        calc.substract(10,7);
        calc.substract(5.5f, 3.2f, 0.5f);
        calc.substract(19,10);
        calc.substract(1345904356d, 340087765d);
        calc.division(6,2);
        calc.division(20.5f, 2);
        calc.division(60.6f,2.3f,4.6f);
        calc.division(123.56f,23.2f);
        calc.multiplication(2,5);
        calc.multiplication(3.5f, 4.2f);
        calc.multiplication(2.1f, 3.5f,2);
        calc.multiplication(272727272d, 339399383737d);
        calc.modulo(30,5);
        calc.modulo(34.6f, 5.7f);
        calc.modulo(17171635d, 933376d);
        System.out.println(calc.sum(11,17));
        System.out.println(calc.sum(7, 5, 3));
        System.out.println(calc.sum(11.0f,2.5f));
        System.out.println(calc.sum(10, 1456789));
        System.out.println( calc.substract(10,7));
        System.out.println( calc.substract(5.5f, 3.2f, 0.5f));
        System.out.println( calc.substract(19,10));
        System.out.println( calc.substract(1345904356d, 340087765d));
        System.out.println( calc.division(6,2));
        System.out.println(calc.division(20.5f, 2));
        System.out.println(calc.division(60.6f,2.3f,4.6f));
        System.out.println(calc.division(123.56f,23.2f));
        System.out.println( calc.multiplication(2.1f, 3.5f,2));
        System.out.println( calc.multiplication(272727272d, 339399383737d));
        System.out.println(calc.modulo(30,5));
        System.out.println( calc.modulo(34.6f, 5.7f));
        System.out.println(calc.modulo(17171635d, 933376d));


















        print.printModel();
        print.printMyModelJava();
        print.model();
        calc.printMySum();
        calc.printMyDivision();
        calc.printMyResult();
        calc.printMyModulo();
        calc.printMyAverage(10, 9, 8);
        calc.printMyAverage(35.6f, 67.5f, 45.1f);
        masura.printMyCelsius(100);
        masura.printMyMeters(345);
        masura.printMySpeed(2000, 1, 30, 15);
        calc.DoStuff(5);
        calc.DoStuff(5);
        calc.DoStuff(7);
        calc.DoStuff(1);
        calc.DoStuff(1);
        calc.DoStuff(5);












    }



 }















