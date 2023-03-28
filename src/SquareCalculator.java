import java.util.Scanner;
public class SquareCalculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = Double.parseDouble(reader.nextLine()); //reads a line from the users keyboard

        System.out.println("Enter height: ");
        double height = Double.parseDouble(reader.nextLine());  //reads a double var from keyboard and transfers it to an integer

        System.out.println(width);
        System.out.println(height);

        double perimeter = (width + height) * 2;

        System.out.println(perimeter);

        double area = width * height;

        System.out.println(area);

    }
}
