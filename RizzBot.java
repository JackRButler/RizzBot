import java.util.Scanner;
import java.lang.Math;

class ThreadPause {
    public void wait(int sec) {
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class RizzBot {
    public static void main (String[] args) {

        //Some variables that are used later
        double rand = Math.random();
        String yes = "yes";
        String ok = "ok";
        String sure = "sure";

        //The Pause and Input Shit
        ThreadPause TP = new ThreadPause();
        Scanner input = new Scanner(System.in);

        //Name question
        System.out.println("What's yo name girl");

        //Name input
        String name = input.nextLine();

        //Name rizz
        System.out.println("That's a fine ass name");

        //Pause
        TP.wait(2);

        //Random Pickup Line
        if (rand < 0.5) {
            System.out.println("Listen " + name + ", I think I dropped something.");
        } else {
            System.out.println("Hey " + name + ", are you a god");
        }

        //Pause
        TP.wait(1);

        //Punchline
        if (rand < 0.5) {
            System.out.println("Oh wait, that was my jaw.");
        } else {
            System.out.println("cause god dammmmm");
        }

        //Pause
        TP.wait(3);

        //Phone number line
        System.out.println("Hey I was thinking, my life is missing something.");

        //Pause
        TP.wait(2);

        //Ending of phone number line
        System.out.println("It's missing your phone number, you think you can give it to me?");

        //Phone number input
        String number = input.nextLine();

        //Pause
        TP.wait(2);

        //Post phone number input
        if (number.length() == 10 || number.length() == 12) {
            System.out.println("Damn girl even your number is sexy");

            //Pause
            TP.wait(2);

            //Phone Number Rizz
            System.out.println("I'll shoot you a text as soon as I add " + number + " to my contacts");

            //Pause
            TP.wait(1);

            //Phone number rizz pt 2
            System.out.println("I think I'm gonna put your name in as \"my girl\", you ok with that?");


            //Answer to contact question
            String ryzz = input.nextLine();

            //Pause
            TP.wait(2);

            //Final rizz
            if (ryzz.equalsIgnoreCase(yes) || ryzz.equalsIgnoreCase(ok) || ryzz.equalsIgnoreCase(sure)) {
                System.out.println("Sweet");
            } else {
                System.out.println("Ok, ig i'll just put your fine ass name in.");
            }
        } else if (number.equalsIgnoreCase(yes) || number.equalsIgnoreCase(ok) || number.equalsIgnoreCase(sure)) {
            System.out.println("Lets see it");

            //Phone number input
            String numberTwo = input.nextLine();

            //Pause
            TP.wait(2);

            //Phone Number Rizz
            System.out.println("I'll shoot you a text as soon as I add " + numberTwo + " to my contacts");

            //Pause
            TP.wait(1);

            //Phone number rizz pt 2
            System.out.println("I think I'm gonna put your name in as \"my girl\", you ok with that?");


            //Answer to contact question
            String ryzz = input.nextLine();

            //Pause
            TP.wait(2);

            //Final rizz
            if (ryzz.equalsIgnoreCase(yes)) {
                System.out.println("Sweet");
            } else {
                System.out.println("Ok, ig i'll just put your fine ass name in.");
            }

        } else {
            System.out.println("ight then, can you give me your moms number?");
        }

        String momNumber = input.nextLine();

        if (momNumber.length() == 10 || momNumber.length() == 12)
            {System.out.println("next time you see me I'll be your stepdad");}
        else if (momNumber.equalsIgnoreCase(yes) || momNumber.equalsIgnoreCase(ok) || momNumber.equalsIgnoreCase(sure))
            {
                System.out.println("send it");

                TP.wait(2);

                System.out.println("next time you see me I'll be your stepdad");
            }
        else
            {System.out.println("Ight, its fine I'm sure she'll be screaming it tn ;)");}
    }

}
