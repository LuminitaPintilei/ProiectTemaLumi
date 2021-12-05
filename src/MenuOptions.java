
    public class MenuOptions {
        Calculator calc = new Calculator();
        ReadFromKeyboard read = new ReadFromKeyboard();
        LogicalNewOperations logical = new LogicalNewOperations();
        UnitatiMasura conversion = new UnitatiMasura();

        public void doSum() {
            int first = read.getInt();
            int second = read.getInt();
            System.out.println(Messages.SUM +
                    calc.sum(first, second));
        }

        public void doSubtract() {
            int first = read.getInt();
            int second = read.getInt();
            System.out.println(Messages.SUBTRACTION+
                    calc.substract(first, second));
        }

        public void doDivision() {
            int first = read.getInt();
            int second = read.getInt();
            System.out.println(Messages.DIVISION+
                    calc.division(first, second));
        }

        public void doMultiplication() {
            int first = read.getInt();
            int second = read.getInt();
            System.out.println(Messages.MULTIPLICATION +
                    calc.multiplication(first, second));
        }
        public void doModulo() {
            int first = read.getInt();
            int second = read.getInt();
            System.out.println(Messages.MODULO +
                    calc.modulo(first, second));
        }
        public void doAverage() {
            int first = read.getInt();
            int second = read.getInt();
            int third = read.getInt();
            System.out.println(Messages.AVERAGE+
                    calc.average(first, second, third));
        }

        public void doCheckBiggerNumber() {
            int first = read.getInt();
            int second = read.getInt();
            System.out.println(Messages.BIGGERNUMBER+
                    logical.checkBiggerNumber(first, second));

        }

        public void doVerifyText() {
            System.out.println(Messages.VERIFYTEXT);
            String text = read.getString();
            System.out.println(
                    logical.verifygivenText(text));

        }

        public void doVerifyNumber() {
            int first = read.getInt();
            System.out.println(
                    logical.verifyNumber(first));

        }

        public void doEvenNumber() {
            int first = read.getInt();
            System.out.println(
                    logical.isNumberEven(first));

        }

        public void doCountBackwards() {
            int small = read.getInt();
            int big = read.getInt();
                    logical.countBackwards(small, big);

        }

        public void doTemperature() {
            System.out.println(Messages.TEMPERATURE);
            float fahrenheit = read.getFloat();
            conversion.printMyCelsius(fahrenheit);

        }

        public void doMeters() {
            System.out.println(Messages.METERS);
            float inch = read.getFloat();
            conversion.printMyMeters(inch);

        }

        public void doSpeed() {
            System.out.println(Messages.SPEED);
            float d = read.getFloat();
            int h = read.getInt();
            int m = read.getInt();
            int s = read.getInt();
            conversion.printMySpeed(d,h,m,s);

        }


    }
