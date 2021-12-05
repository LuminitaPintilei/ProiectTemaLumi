
    import java.util.Scanner;

    public class Login {



        public boolean isLoggedIn(){
            Scanner scan = new Scanner(System.in);
            String username = "Lumi";
            String password = "parola11";

            System.out.println(Messages.USERNAME_LOGIN);
            String givenUsername = scan.next();
            System.out.println(Messages.PASWORD_LOGIN);
            String givenPassword = scan.next();

            if (username.equals(givenUsername) && password.equals(givenPassword)){
                System.out.println(Messages.CORRECT_LOGIN);
                System.out.println(Messages.HELLO + username +"!");
                return true;
            }else {
                System.out.println(Messages.INCORRECT_LOGIN);
                return false;

            }
        }

        public boolean loginSuccessful(){
            boolean repeat;
            int count = 0;
            do {
                repeat = isLoggedIn();
                count++;
            }while (!repeat && count <=3);
            return repeat;
        }
}
