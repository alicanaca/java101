import java.util.Scanner;

public class Daire {
    public static void main (String args[]){
        double pi = 3.14;
        int r, alpha;
        double cevre, alan, alan2;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the radius: ");
            r = input.nextInt();
            cevre = 2 * pi * r;
            alan = pi * r * r;
            System.out.println("Area of the circle: "+alan);
            System.out.println("Perimeter of the circle: "+cevre);
            System.out.println("Enter an angle for a certain area: ");
            alpha = input.nextInt();
        }
        if (alpha>0 && alpha<=360){
            alan2 = alan * alpha / 360;
            System.out.println("Area of the certain angle: "+alan2);
        } else { System.out.println("Invalid number"); }
    }
}
