import java.lang.invoke.SwitchPoint;
import java.util.*;
import java.lang.*;


public class TheGame {
    public static void main(String[] args){

        int Stone, Paper, Scissors;
        int i;
        int c = 1;


        while(c==1) {

            int m = 0, n = 0, o = 0;

            System.out.println("\n\n*********** WELCOME TO GAMING WORLD **********\n\n");

            System.out.println("#Instructions :\n");
            System.out.println("----------Press Following Numbers To Play A Game----------\n");
            System.out.println("\n-- Stone = 0" + "\n" + "-- Paper = 1" + "\n" + "-- Scissors = 2" + "\n");


            System.out.println("\n^^^^^^^How Many Rounds You Want To Play?^^^^^^^");
            System.out.print("--Enter Here :");
            Scanner scc = new Scanner(System.in);
            int b = scc.nextInt();

            System.out.println("\n");
            System.out.println("\n********** ENJOY THE GAME **********\n");

            for (i = 1; i <= b; i++) {

                System.out.println("ROUND :" + i + "\n");

                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();

                switch (a) {

                    case 0:
                        System.out.println("You = Stone");
                        break;
                    case 1:
                        System.out.println("You = Paper");
                        break;
                    case 2:
                        System.out.println("You = Scissor");
                        break;

                }

                Random randomNum = new Random();
                int bot = randomNum.nextInt(3);
                //System.out.println(bot);

                switch (bot) {

                    case 0:
                        System.out.println("Bot = Stone");
                        break;
                    case 1:
                        System.out.println("Bot = Paper");
                        break;
                    case 2:
                        System.out.println("Bot = Scissor");
                        break;

                }


                System.out.println();

                if (bot == 0 && a == 0) {
                    System.out.println("Tie :|\n");
                    o++;
                }
                if (bot == 0 && a == 1) {
                    System.out.println("You Win :)\n");
                    m++;
                }
                if (bot == 0 && a == 2) {
                    System.out.println("Bot Win :(\n");
                    n++;
                }

                if (bot == 1 && a == 0) {
                    System.out.println("Bot Win :(\n");
                    n++;
                }
                if (bot == 1 && a == 1) {
                    System.out.println("Tie :|\n");
                    o++;
                }
                if (bot == 1 && a == 2) {
                    System.out.println("You Win :)\n");
                    m++;
                }

                if (bot == 2 && a == 0) {
                    System.out.println("You Win :)\n");
                    m++;
                }
                if (bot == 2 && a == 1) {
                    System.out.println("Bot Win :(\n");
                    n++;
                }
                if (bot == 2 && a == 2) {
                    System.out.println("Tie :|\n");
                    o++;
                }
            }

            System.out.println("\n########## Score Board ##########\n");
            System.out.println("YOU :" + m);
            System.out.println("BOT :" + n);
            System.out.println("TIE :" + o);
            System.out.println();

            if (m > n) {
                System.out.println("#*#*#*#*#*#*#* YOU WIN *#*#*#*#*#*#*#\n");
            }
            if (n > m) {
                System.out.println(":::::::::: BOT WIN ::::::::::\n");
            }
            if (m == n) {
                System.out.println("---------- MATCH IS TIE ----------\n");
            }

            System.out.println("IF YOU WANT TO PLAY REMATCH PRESS : 1");
            System.out.println("IF YOU WANT TO EXIT THE GAME PRESS : ANY KEY");

            Scanner j = new Scanner(System.in);
            c = j.nextInt();
        }

    }
}
