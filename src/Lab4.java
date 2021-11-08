public class Lab4 {

    public static void main(String[] args) {
        LogicalNewOperations op = new LogicalNewOperations();
        op.countBackwards(3,100);

        System.out.println(op.getAverageFromInterval(1, 100));
        System.out.println(op.getAverageDivisibleBySeven(1,100));
        op.givenNumber(9);


        int x = 1;
       while(x <= 100){
           System.out.println(x);
           x ++; // x = x + 1;
       }
       for(int i = 1; i <= 100; i++){
           System.out.println(i);
       }

        //int x = 2;
        x+=x+=x++ + ++x;
//        x== ?
        //System.out.println(x);

    }



}


