public class ProgramJavaMain {
    public static void main(String[] args) {
        ProgramStart ps = new ProgramStart();
        Login login = new Login();
        //login.loadCredentials(Login.getUserNameArray(),Login.getPasswordArray());
        // login.login();
        if (login.loginSuccessful()) {
            ps.runProgram();
            ps.runMathProgram();
            ps.runLogicalProgram();
            ps.runConversionProgram();
        }
    }
}



