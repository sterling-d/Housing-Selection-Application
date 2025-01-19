import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPoints = 0;

        System.out.println("Hello and welcome to the house selection app. " +
                "We will be asking a few questions to help determine your eligibility for campus housing." +
                "\nHit Enter to begin.");

        // Prompts user to press Enter
        scanner.nextLine();

        // Asks for their age
        System.out.print("How old are you? ");

        // Stores the user's response by utilizing Scanner
        int age = scanner.nextInt();

        // Tallies up points for users depending on their responses
        if (age < 21) {
            totalPoints += 4;
        } else if (age < 28) {
            totalPoints += 3;
        } else if (age < 35) {
            totalPoints += 2;
        }

        // Ask user which year of school they are in
        System.out.println("What year are you in?");
        System.out.println("1: Freshman");
        System.out.println("2: Sophomore");
        System.out.println("3: Junior");
        System.out.println("4: Senior");
        System.out.println("5: Super Senior");
        System.out.print("Enter your year: ");

        // Stores the user's response by utilizing Scanner
        int year = scanner.nextInt();

        // Tallies up points for users depending on their responses
        if (year == 1) {
            totalPoints += 4;
        } else if (year == 2) {
            totalPoints += 3;
        } else if (year == 3) {
            totalPoints += 2;
        } else if (year == 4) {
            totalPoints += 1;
        }

        // Ask for user for years of work experience
        System.out.print("How many years of work experience do you have? ");
        int experience = scanner.nextInt();

        // Grants user 1 point per year of work experience (cap at 4 years)

        totalPoints += Math.min(experience, 4);


        // Asks user yes/ no questions
        // If user is on academic + disciplinary probation, they lose 1 point
        // If user utilizes financial aid, they earn 1 point
        scanner.nextLine(); // Consume newline
        System.out.print("Are you on Academic Probation? (y or n): ");
        String academicProbation = scanner.nextLine();
        if (academicProbation.equals("y")) {
            totalPoints += (-1);
        }

        System.out.print("Are you on Disciplinary Probation? (y/n): ");
        String disciplinaryProbation = scanner.nextLine();
        if (disciplinaryProbation.equals ("y")) {
            totalPoints += (-1);
        }

        System.out.print("Are you on Financial Aid? (y/n): ");
        String financialAid = scanner.nextLine();
        if (financialAid.equals ("y")) {
            totalPoints += 1;
        }

        // Asks user how far they live from campus
        System.out.print("How many miles are you from school? ");
        int miles = scanner.nextInt();
        if (miles < 18) {
            totalPoints += 1;
        } else if (miles < 25) {
            totalPoints += 2;
        } else if (miles < 35) {
            totalPoints += 3;
        } else if (miles < 45) {
            totalPoints += 4;
        }

        // Asks user their school status and prompts them to enter a selection
        System.out.println("Are you a part-time or full-time student? ");
        System.out.println("1: Part-Time");
        System.out.println("2: Full-Time");
        System.out.print("Enter Selection: ");

        // If user works part-time, they gain 2 points

        int studentStatus = scanner.nextInt();
        if (studentStatus == 1) {
            totalPoints += 2;
        }

        // Asks user yes/no question- whether they've had previous housing before
        // scanner.nextLine() allows user to answer the question below without it automatically reverting to the closing statement.
        scanner.nextLine();
        System.out.print("Have you had housing before? (y/n): ");
        String previousHousing = scanner.nextLine();
        if (previousHousing.equals("y")) {
            totalPoints += 1;
        }

        // Displays the total points for the user
        System.out.println("Thank you for your time. Your detemined score for housing is : " + totalPoints);

        scanner.close();
    }
}