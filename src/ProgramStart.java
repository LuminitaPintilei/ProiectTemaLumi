public class ProgramStart extends MenuOptions{
    ReadFromKeyboard read = new ReadFromKeyboard();

    public void printMenu(){
        System.out.println(Messages.MAIN_MENU_SELECT_OPTION);
        System.out.println(Messages.MAIN_MENU);
    }

    public void printMathMenu(){
        System.out.println(Messages.MAIN_MENU_SELECT_OPTION);
        System.out.println(Messages.MATH_MENU);
    }

    public void printLogicalMenu(){
        System.out.println(Messages.MAIN_MENU_SELECT_OPTION);
        System.out.println(Messages.LOGICAL_MENU);
    }

    public void printConversionMenu(){
        System.out.println(Messages.MAIN_MENU_SELECT_OPTION);
        System.out.println(Messages.CONVERSION_MENU);
    }


    public boolean runMenuOption() {
        printMenu();
        int option = read.getInt();
        switch (option) {
            case 0:
                System.out.println(Messages.BYE);
                return false;
            case 1:
                runMathProgram();
                return true;
            case 2:
                runLogicalProgram();
                return true;
            case 3:
                runConversionProgram();
                return true;

            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public boolean runMathMenuOption(){
        printMathMenu();
        int optionMath = read.getInt();
        switch (optionMath){
            case 0:
                System.out.println(Messages.WELCOME);
                return false;
            case 1:
                doSum();
                return true;
            case 2:
                doSubtract();
                return true;
            case 3:
                doDivision();
                return true;
            case 4:
                doMultiplication();
                return true;
            case 5:
                doModulo();
                return true;
            case 6:
                doAverage();
                return true;

            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public boolean runLogicalMenuOption(){
        printLogicalMenu();
        int optionLogical = read.getInt();
        switch (optionLogical){
            case 0:
                System.out.println(Messages.WELCOME);
                return false;
            case 1:
                doCheckBiggerNumber();
                return true;
            case 2:
                doVerifyText();
                return true;
            case 3:
                doVerifyNumber();
                return true;
            case 4:
                doEvenNumber();
                return true;
            case 5:
                doCountBackwards();
                return true;

            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public boolean runConversionMenuOption(){
        printConversionMenu();
        int optionConversion = read.getInt();
        switch (optionConversion){
            case 0:
                System.out.println(Messages.WELCOME);
                return false;
            case 1:
                doTemperature();
                return true;
            case 2:
                doMeters();
                return true;
            case 3:
                doSpeed();
                return true;

            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public void runProgram(){
        boolean repeatProgram;
        do {
            repeatProgram = runMenuOption();
        }while (repeatProgram);
    }

    public void runMathProgram(){
        boolean repeatProgram;
        do {
            repeatProgram = runMathMenuOption();
        }while (repeatProgram);
    }

    public void runLogicalProgram(){
        boolean repeatProgram;
        do {
            repeatProgram = runLogicalMenuOption();
        }while (repeatProgram);
    }

    public void runConversionProgram(){
        boolean repeatProgram;
        do {
            repeatProgram = runConversionMenuOption();
        }while (repeatProgram);
    }



}
