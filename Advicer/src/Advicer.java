import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Advicer {
    public static void main(String[] args){
        String advice = "Hmm i think you should try : ";
        String option1 = "ice hockey";
        String option2 = "martial arts";
        String option3 = "football";
        String option4 = "running";
        String option5 = "Curling";
        System.out.print("Do you like to run a lot or you prefer less movement in sport? 1-movement 2-less movement : ");
        Scanner my_scan = new Scanner(System.in);
        char movement =  my_scan.next().charAt(0);
        System.out.print("Ok, do you like to play in collective sports? y/n: ");
        char collective =  my_scan.next().charAt(0);
        System.out.print("Great and what sports do you like to watch more? w-winter s-summer: ");
        char season =  my_scan.next().charAt(0);
        System.out.print("Will you be able to spend more than 200€ for beginning? l-less m-more: ");
        char money =  my_scan.next().charAt(0);
        System.out.print("Ok so my advice : ");

        Stream<Character> st = Stream.of(movement,collective,season,money);
        String result = st.map(Object::toString).collect(Collectors.joining());

        if (result.equals("1ywm")) {
            System.out.print(advice + option1);
        }
        else if (result.equals("2nsl")) {
            System.out.print(advice + option2);
        }
        else if (result.equals("1ysl")) {
            System.out.print(advice + option3);
        }
        else if (result.equals("1nwl")) {
            System.out.print(advice + option4);
        }
        else if (result.equals("2ywl")) {
            System.out.print(advice + option5);
        } else {System.out.print("I can not help you right now :(");}



    }
}
