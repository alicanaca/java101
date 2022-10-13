
/**
 *
 * @author alica
 */
import java.util.Scanner;

public class CalcTheAvg {
    public static void main(String args[]) {
        int math, physics, chemistry, history, music;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter math grade: ");
            math = input.nextInt();

            System.out.println("Enter physics grade: ");
            physics = input.nextInt();

            System.out.println("Enter chemistry grade: ");
            chemistry = input.nextInt();

            System.out.println("Enter history grade: ");
            history = input.nextInt();

            System.out.println("Enter music grade: ");
            music = input.nextInt();
        }
        float average = (math + physics + chemistry + history + music) / 5;

        System.out.println("Average score is: " + average);

        String result = (average > 60) ? "Passed the class" : "Failed the class";

        System.out.println("Result: " + result);

    }
}
