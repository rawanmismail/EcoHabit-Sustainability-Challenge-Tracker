import java.util.scanner;

public class EcoHabitApp

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int = choice = 0;

        while (choice ! = 6) {
            System.out.println("========== Eco Habit App ==========");
            System.out.println("Sustainability Challenge Tracker");
            System.out.println("1. View eco-firndly actions");
            System.out.println("2. Record a completed action");
            System.out.println("3. View my activity history");
            System.out.println("4. Set a sustainability goal");
            System.out.println("5. View my progress");
            System.out.println("6. Save & exit");
            System.out.println("  ");
            System.out.println("Choose an action from the menu [1-6]");

            if (input.hasNextInt()) { 
                choice = input.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("View eco-firndly actions");
                        break;
                    case 2:
                        System.out.println("Record a completed action");
                        break;
                    case 3:
                        System.out.println("View my activity history");
                        break;
                    case 4:
                        System.out.println("Set a sustainability goal");
                        break;
                    case 5:
                        System.out.println("View my progress");
                        break;
                    case 6:
                        System.out.println("Save & exit");
                        break
                    default:
                        System.out.println("Invalid option. Please choose 1-6")
                }
                else {
                    System.out.println("Invalid option. Please enter a number")
                    input.next();
                }
            }
            input.close();
        }
    }