import java.util.Scanner;
public class AgeCalc {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.print("What's your name?");
        String name = reader.nextLine();
        //reads a line from the users keyboard

        System.out.print("How old are you?");
        int age = Integer.parseInt(reader.nextLine());
        //reads a string var from keyboard and transfers it to an integer

        System.out.println("Your name is: " + name + ", and you are " + age + " years old, nice to meet you!");

    }

}
