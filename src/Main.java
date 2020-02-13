import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int int_random = generateRandomInt() ;
        devinerunchiffre(int_random);

    }


    public static int generateRandomInt(){
        // un chiffre entre 0 et 9
        Random rand = new Random();
        int int_random = rand.nextInt(10);
        return  int_random;
    }

    public static void devinerunchiffre(int int_random ){

        int num;
        do {
            System.out.print("Please write your Number");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            vérifierlareponse(num, int_random);

        }while (num != int_random || num == -1);

    }

    public static  String vérifierlareponse(int num , int int_random){

        String resultat = "";

        if (num == -1) {

            resultat =  "Exit";

        }

        else if (num > int_random) {
          return   "trop grand";
        }else if (num < int_random) {

            resultat =  "trop petit" ;

        }
        else if(num == int_random) {
            resultat =  "félicitations";

        }
        return resultat;
    }
}
