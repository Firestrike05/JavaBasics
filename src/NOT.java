import java.sql.SQLOutput;

public class NOT {
    public static void main(String[] args) {

        System.out.println("Is the string equal to water?");

        String text = "salt";

        if (!(text.equals("water")))
        {
            System.out.println("No!");
        }

        else {
            System.out.println("Yes");
        }
    }
}
