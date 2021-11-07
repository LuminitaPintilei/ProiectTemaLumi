public class Lab3 {



    public static void main(String[] args) {


        String text = "Bla bla Bla";
        LogicalNewOperations op = new LogicalNewOperations();

        System.out.println(op.verifygivenText(text));

        int number = 7;
        System.out.println(op.verifyNumber(number));

        String newText = "Fast&Easy";
        int newNumber = 5;
        System.out.println(op.verifyNewText(newText, newNumber));

        int numberEgFive = 10;
        System.out.println(op.numberEgFive(numberEgFive));

        int numberEg6 = 4;
        System.out.println(op.numberEg6(numberEg6));


        int biggest = op.checkBiggerNumber(5,4);
        System.out.println("The bigger number is" + " " + biggest);

        String pickNumber = op.pickNumber(2);
        System.out.println(pickNumber);

        String isNumberEven =  op.isNumberEven(9);
        System.out.println(isNumberEven);

        String isEligibleToVote = op.isEligibleToVote(10);
        System.out.println(isEligibleToVote);

        int biggerNumber = op.biggerNumber(5,3,7);
        System.out.println(biggerNumber);











    }




}




