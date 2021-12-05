
    import java.util.HashMap;
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

  //      private HashMap<String, String> credentials = new HashMap<>();
 //       private static String[] userNameArray = {"Lumi", "Cosmin", "Ana"};
   //     private static String[] passwordArray = {"parola11", "parola12", "parola13"};


 //       public static String[] getUserNameArray() {
 //           return userNameArray;
 //       }

 //       public static String[] getPasswordArray() {
 //           return passwordArray;
 //       }

  //      public void loadCredentials(String[] userName, String[] password) {
  //          for (int i = 0; i < userName.length; i++) {
  //              credentials.put(userName[i], password[i]);
  //          }
  //      }

  //      public void login() {
 //           String userName, passWord;
  //          System.out.println(Messages.USERNAME_LOGIN);
  //          Scanner sc1 = new Scanner(System.in);
  //          userName = sc1.nextLine();

  //          System.out.println(Messages.PASWORD_LOGIN);
 //           Scanner sc2 = new Scanner(System.in);
  //          passWord = sc2.nextLine();

  //          if (credentials.containsKey(userName)) {
  //              String correspondingPwd = credentials.get(userName);

  //              if (credentials.containsKey(userName) && correspondingPwd.equals(passWord)) {
   //                 System.out.println(Messages.HELLO);
   //             } else {
   //                 System.out.println(Messages.INCORRECT_LOGIN);
   //             }
    //        } else {
    //            System.out.println(Messages.WRONGUSER);
     //       }

      //  }
    }







