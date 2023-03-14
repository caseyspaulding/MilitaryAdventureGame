import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Welcome to your Military Adventure Recruit!");
        System.out.println("");
        System.out.println("Whats your name Recruit?");
        System.out.println("");

        boolean playAgain = true;
        while (playAgain){
            String name ;
            Scanner in = new Scanner(System.in);
            name = in.nextLine();


            System.out.println(name + ",you must choose a branch of service.  \n" +
                    "a. Navy\n" +
                    "b. Army\n" +
                    "c. Marine\n" +
                    "e. Airforce\n" +
                    "");


            String choice;


            System.out.println("Please select a, b, c or d: ");
            choice = in.nextLine();

//            if (choice.equalsIgnoreCase("a")) {
//                System.out.println("Welcome to Code Deployment Sailor." +
//                        "Here are your characteristics:\n" +
//                        "" +
//                        "Humor: 100\n" +
//                        "Strength: 100\n" +
//                        "Intelligence: 100\n" +
//                        "Wisdom: 100\n" +
//                        "Charisma: 100\n");
//                break;
//            } else if (choice.equalsIgnoreCase("b")) {
//                System.out.println("Welcome to Code Deployment Soldier." +
//                        "Here are your characteristics:\n" +
//                        "" +
//                        "Humor: 100\n" +
//                        "Strength: 100\n" +
//                        "Intelligence: 100\n" +
//                        "Wisdom: 100\n" +
//                        "Charisma: 100\n");
//                break;
//            } else if (choice.equalsIgnoreCase("c")) {
//                System.out.println("Welcome to Code Deployment Marine." +
//                        "Here are your characteristics:\n" +
//                        "" +
//                        "Humor: 100\n" +
//                        "Strength: 100\n" +
//                        "Intelligence: 100\n" +
//                        "Wisdom: 100\n" +
//                        "Charisma: 100\n");
//                break;
//            } else if (choice.equalsIgnoreCase("d")) {
//                System.out.println("Welcome to Code Deployment Airman. " +
//                        "Here are your characteristics:\n" +
//                        "" +
//                        "Humor: 100\n" +
//                        "Strength: 100\n" +
//                        "Intelligence: 100\n" +
//                        "Wisdom: 100\n" +
//                        "Charisma: 100\n");
//                break;
//            } else {
//                System.out.println("Invalid selection. Please try again.");
//            }
//
//            if (choice.equalsIgnoreCase("a")) {
//                System.out.println("Its the " +
//                        "Here are your characteristics:\n" +
//                        "" +
//                        "Humor: 100\n" +
//                        "Strength: 100\n" +
//                        "Intelligence: 100\n" +
//                        "Wisdom: 100\n" +
//                        "Charisma: 100\n");
//                break;
//            }

            switch (choice) {
                case "a":
                    navyScene();
                    break;
                case "b":
                    armyScene();
                    break;
                case "c":
                    marineScene();
                    break;
                case "d":
                    airforceScene();
                    break;
                case "e":
                    spaceforceScene();
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }

            System.out.println("************************************************************************************************");
            System.out.println("");
            System.out.println("");

        }


        }
    public static void navyScene() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("\"You have chosen the U.S. Navy!\"Welcome to Deployment Sailor." +
                "Here are your characteristics:\n" +
                "" +
                "Humor: 100\n" +
                "Strength: 100\n" +
                "Intelligence: 100\n" +
                "Wisdom: 100\n" +
                "Charisma: 100\n");


        System.out.println("You are currently on a ship and your team is under attack. ");

        System.out.println("What do you do?");
        System.out.println("1. Defend your ship with your shipmates?");
        System.out.println("2. Try to escape on a lifeboat?");
        System.out.println("3. Surrender to the enemy.?");

        System.out.print("Enter your choice (1-3): ");
        input = scanner.nextLine();
        int choice = Integer.parseInt(input);
        int choiceinner = 0;
        switch (choice) {
            case 1:
                System.out.println("You have chosen to defend your ship with your shipmates.");
                System.out.println("You have been promoted to Chief! 1000 XP");
                System.out.println("You are now defending your ship.");
                System.out.println("You have 10 seconds to defend your ship.");
                System.out.println("What do you do first?");
                System.out.println("1. Activate ships defense systems?");
                System.out.println("2. Grab a gun and start shooting?");
                System.out.println("3. Start shouting orders?");
                switch (choiceinner) {
                    case 1:
                        System.out.println("You have chosen to activate ships defense systems.");
                        System.out.println("You are now activating ships defense systems.");
                        System.out.println("You have 10 seconds to activate ships defense systems.");
                        System.out.println("");

                    case 2:
                        System.out.println("You have chosen to grab a gun and start shooting.");
                        System.out.println("You are now grabbing a gun and starting shooting.");
                        System.out.println("You have 10 seconds to grab a gun and starting shooting.");
                        System.out.println("Congratulations! You have defeated your ship.");


                    case 3:
                        System.out.println("You have chosen to start shouting orders.");
                        System.out.println("You are now starting shouting orders.");
                        System.out.println("No one listened to your shouting orders.");
                        System.out.println("Please try again.");
                        break;
                }
                break;
            case 2:
                System.out.println("You have chosen to escape on a lifeboat.");
                System.out.println("You are now escaping on a lifeboat.");
                System.out.println("You have 10 seconds to escape on a lifeboat.");
                System.out.println("");
                break;
            case 3:
                System.out.println("You have chosen to surrender to the enemy.");
                System.out.println("That did not work out for you.");
                System.out.println("****************************");
                System.out.println("      GAME OVER!           ");
                System.out.println("****************************");
        }
    }

    public static void armyScene() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("You have chosen the U.S. Navy!");

        System.out.println("You are currently on a ship and your team is under attack. ");

        System.out.println("What do you do?");
        System.out.println("1. Defend your ship with your shipmates?");
        System.out.println("2. Try to escape on a lifeboat?");
        System.out.println("3. Surrender to the enemy.?");

        System.out.print("Enter your choice (1-3): ");
        input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        switch (choice) {
            case 1:
                System.out.println("You have chosen to defend your ship with your shipmates.");
                System.out.println("You are now defending your ship.");
                System.out.println("You have 10 seconds to defend your ship.");
                System.out.println("");
                break;
            case 2:
                System.out.println("You have chosen to escape on a lifeboat.");
                System.out.println("You are now escaping on a lifeboat.");
                System.out.println("You have 10 seconds to escape on a lifeboat.");
                System.out.println("");
                break;
            case 3:
                System.out.println("You have chosen to surrender to the enemy.");
                System.out.println("You Lose!");
        }
    }

    public static void marineScene() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("You have chosen the U.S. Navy!");

        System.out.println("You are currently on a ship and your team is under attack. ");

        System.out.println("What do you do?");
        System.out.println("1. Defend your ship with your shipmates?");
        System.out.println("2. Try to escape on a lifeboat?");
        System.out.println("3. Surrender to the enemy.?");

        System.out.print("Enter your choice (1-3): ");
        input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        switch (choice) {
            case 1:
                System.out.println("You have chosen to defend your ship with your shipmates.");
                System.out.println("You are now defending your ship.");
                System.out.println("You have 10 seconds to defend your ship.");
                System.out.println("");
                break;
            case 2:
                System.out.println("You have chosen to escape on a lifeboat.");
                System.out.println("You are now escaping on a lifeboat.");
                System.out.println("You have 10 seconds to escape on a lifeboat.");
                System.out.println("");
                break;
            case 3:
                System.out.println("You have chosen to surrender to the enemy.");
                System.out.println("You Lose!");
        }
    }
    public static void airforceScene() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("You have chosen the U.S. Navy!");

        System.out.println("You are currently on a ship and your team is under attack. ");

        System.out.println("What do you do?");
        System.out.println("1. Defend your ship with your shipmates?");
        System.out.println("2. Try to escape on a lifeboat?");
        System.out.println("3. Surrender to the enemy.?");

        System.out.print("Enter your choice (1-3): ");
        input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        switch (choice) {
            case 1:
                System.out.println("You have chosen to defend your ship with your shipmates.");
                System.out.println("You are now defending your ship.");
                System.out.println("You have 10 seconds to defend your ship.");
                System.out.println("");
                break;
            case 2:
                System.out.println("You have chosen to escape on a lifeboat.");
                System.out.println("You are now escaping on a lifeboat.");
                System.out.println("You have 10 seconds to escape on a lifeboat.");
                System.out.println("");
                break;
            case 3:
                System.out.println("You have chosen to surrender to the enemy.");
                System.out.println("You Lose!");
        }
    }
    public static void spaceforceScene() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("You have chosen the U.S. Navy!");

        System.out.println("You are currently on a ship and your team is under attack. ");

        System.out.println("What do you do?");
        System.out.println("1. Defend your ship with your shipmates?");
        System.out.println("2. Try to escape on a lifeboat?");
        System.out.println("3. Surrender to the enemy.?");

        System.out.print("Enter your choice (1-3): ");
        input = scanner.nextLine();
        int choice = Integer.parseInt(input);

        switch (choice) {
            case 1:
                System.out.println("You have chosen to defend your ship with your shipmates.");
                System.out.println("You are now defending your ship.");
                System.out.println("You have 10 seconds to defend your ship.");
                System.out.println("");
                break;
            case 2:
                System.out.println("You have chosen to escape on a lifeboat.");
                System.out.println("You are now escaping on a lifeboat.");
                System.out.println("You have 10 seconds to escape on a lifeboat.");
                System.out.println("");
                break;
            case 3:
                System.out.println("You have chosen to surrender to the enemy.");
                System.out.println("You Lose!");
        }
    }
    }





