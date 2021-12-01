import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Advicer {
    public static void main(String[] args){
        //LIST OF CLUBS
                                            /*MARTIN*/
            //Martin - Football
            String[] freeClubsFootball_Martin = {"FC Nam sa nechce", "Footballers"};
            String[] paidClubsFootball_Martin = {"FCMartin", "FCParadise"};

            //Martin - Hockey
            String[] freeClubsHockey_Martin = {"HC Martin"};
            String[] paidClubsHockey_Martin = {"MHC Martin", "Ice Breakers"};

            //Martin - martial arts
            String[] freeClubsMA_Martin = {"Mortal Combat", "Tekken", "Hospoda u Martina"};
            String[] paidClubsMA_Martin = {"Octagon Martin", "Spartans", "Avengers"};
                                            /*PRAGUE*/
            //Prague - Football
            String[] freeClubsFootball_Prague = {"FC Nam sa nechce", "Footballers"};
            String[] paidClubsFootball_Prague = {"FCMartin", "FCParadise"};

            //Prague - Hockey
            String[] freeClubsHockey_Prague = new String[0];
            String[] paidClubsHockey_Prague = {"HC Prague", "Hokej v Praze"};

            //Prague - martial arts
            String[] freeClubsMA_Prague = {"Mortal Combat", "Tekken", "Hospoda u Honzu"};
            String[] paidClubsMA_Prague = {"Octagon Prague", "Spartans", "Avengers"};

            //LIST OF CITIES
        String[] cities = {"Martin", "Bratislava", "Brno", "Prague"};
        //list of sports
        String advice = "Hmm i think you should try : ";
        String option1 = "ice hockey";
        String option2 = "martial arts";
        String option3 = "football";
        String option4 = "running";
        String option5 = "Curling";
        //VARIABLES
        boolean Sportcheck = true;
        String ChoosenSport = null;
                                                                /*CODE*/
        System.out.print("Do you like to run a lot or you prefer less movement in sport? 1-movement 2-less movement : ");
        Scanner my_scan = new Scanner(System.in);
        char movement =  my_scan.next().charAt(0);
        System.out.print("Ok, do you like to play in collective sports? y/n: ");
        char collective =  my_scan.next().charAt(0);
        System.out.print("Great and what sports do you like to watch more? w-winter s-summer: ");
        char season =  my_scan.next().charAt(0);
        System.out.print("Will you be able to spend more than 200€ for beginning? l-less m-more: ");
        char money =  my_scan.next().charAt(0);

        //SPORT CHOOSING LOGIC
        Stream<Character> st = Stream.of(movement,collective,season,money);
        String result = st.map(Object::toString).collect(Collectors.joining());
        //Sport codes
        if (result.equals("1ywm")) {
            System.out.print(advice + option1);
            ChoosenSport = option1;
        }
        else if (result.equals("2nsl")) {
            System.out.print(advice + option2);
            ChoosenSport = option2;
        }
        else if (result.equals("1ysl")) {
            System.out.print(advice + option3);
            ChoosenSport = option3;
        }
        else if (result.equals("1nwl")) {
            System.out.print(advice + option4);
            ChoosenSport = option4;
        }
        else if (result.equals("2ywl")) {
            System.out.print(advice + option5);
            ChoosenSport = option5;
        } else {System.out.println("I can not help you right now :(");
            Sportcheck = false;}

        //CLUB CHOOSE LOGIC
        if (Sportcheck == true) {
            Scanner my_scan_String = new Scanner(System.in);
            System.out.print("\nIn which city do you want to train? : ");
            String CityClub = my_scan_String.next();
            System.out.print("Can you afford to pay for training or do you want to train fo free? Leave * as input if you don't mind options:paid/free : ");
            String Mone2Club = my_scan_String.next();
            //City_Martin
            if (Objects.equals(CityClub, cities[0])) {
                // Sport_Football
                if (ChoosenSport.equals(option3)){
                    if (Objects.equals(Mone2Club, "paid")) {
                        System.out.println("Here are some nonfree clubs for : " + " in " + cities[0] + ChoosenSport);
                        System.out.println(Arrays.toString(paidClubsFootball_Martin)+ "\n");
                    } else if (Objects.equals(Mone2Club, "*")) {
                        System.out.println("Here are some free clubs for: " + ChoosenSport + " in " + cities[0]);
                        System.out.println(Arrays.toString(freeClubsFootball_Martin)+ "\n");
                        System.out.println("Here are some nonfree clubs for:  " + ChoosenSport + " in " + cities[0]);
                        System.out.println(Arrays.toString(paidClubsFootball_Martin)+ "\n");
                    } else if (Objects.equals(Mone2Club, "free")) {
                        System.out.println("Here are some free clubs for:  " + ChoosenSport + " in " + cities[0]);
                        System.out.println(Arrays.toString(freeClubsFootball_Martin)+ "\n");
                    }
                }
                // Sport_Hockey
                else if (ChoosenSport.equals(option1)){
                    if (Objects.equals(Mone2Club, "paid")) {
                        System.out.println("Here are some nonfree clubs for : " + " in " + cities[0] + ChoosenSport);
                        System.out.println(Arrays.toString(paidClubsHockey_Martin)+ "\n");
                    } else if (Objects.equals(Mone2Club, "*")) {
                        System.out.println("Here are some free clubs for: " + ChoosenSport + " in " + cities[0]);
                        System.out.println(Arrays.toString(freeClubsHockey_Martin)+ "\n");
                        System.out.println("Here are some nonfree clubs for:  " + ChoosenSport + " in " + cities[0]);
                        System.out.println(Arrays.toString(paidClubsHockey_Martin)+ "\n");
                    } else if (Objects.equals(Mone2Club, "free")) {
                        System.out.println("Here are some free clubs for:  " + ChoosenSport + " in " + cities[0]);
                        System.out.println(Arrays.toString(freeClubsHockey_Martin)+ "\n");
                    }
                }
            }
            //City_Prague
            if (Objects.equals(CityClub, cities[3])) {
                // Sport_martialarts
                if (ChoosenSport.equals(option2)){
                    if (Objects.equals(Mone2Club, "paid")) {
                        System.out.println("Here are some nonfree clubs for : " + " in " + cities[3] + ChoosenSport);
                        System.out.println(Arrays.toString(paidClubsMA_Prague)+ "\n");
                    } else if (Objects.equals(Mone2Club, "*")) {
                        System.out.println("Here are some free clubs for: " + ChoosenSport + " in " + cities[3]);
                        System.out.println(Arrays.toString(freeClubsMA_Prague)+ "\n");
                        System.out.println("Here are some nonfree clubs for:  " + ChoosenSport + " in " + cities[3]);
                        System.out.println(Arrays.toString(paidClubsMA_Prague)+ "\n");
                    } else if (Objects.equals(Mone2Club, "free")) {
                        System.out.println("Here are some free clubs for:  " + ChoosenSport + " in " + cities[3]);
                        System.out.println(Arrays.toString(freeClubsMA_Prague)+ "\n");
                    }
                }
                // Sport_Hockey
                else if (ChoosenSport.equals(option1)){
                    if (Objects.equals(Mone2Club, "paid")) {
                        System.out.println("Here are some nonfree clubs for : " + " in " + cities[3] + ChoosenSport);
                        System.out.println(Arrays.toString(paidClubsHockey_Prague)+ "\n");
                    } else if (Objects.equals(Mone2Club, "*")) {
                        System.out.println("Here are some free clubs for: " + ChoosenSport + " in " + cities[3]);
                        System.out.println(Arrays.toString(freeClubsHockey_Prague)+ "\n");
                        System.out.println("Here are some nonfree clubs for:  " + ChoosenSport + " in " + cities[3]);
                        System.out.println(Arrays.toString(paidClubsHockey_Prague)+ "\n");
                    } else if (Objects.equals(Mone2Club, "free")) {
                        System.out.println("Here are some free clubs for:  " + ChoosenSport + " in " + cities[3]);
                        System.out.println(Arrays.toString(freeClubsHockey_Prague)+ "\n");
                    }
                }
            }
        }
    }
}
