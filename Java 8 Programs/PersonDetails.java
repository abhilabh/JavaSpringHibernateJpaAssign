/*
 * Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60. Display proper error messages. The program must exit gracefully after displaying the error message in case the arguments passed are not proper. 
 */
public class PersonDetails {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide name and age as command-line arguments");
            return;
        }

        String name = args[0];
        int age;
        try {
            age = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Age must be a valid integer.");
            return;
        }

        if (age < 18 || age >= 60) {
            System.out.println("Invalid age. Age must be between 18 and 60.");
            return;
        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
