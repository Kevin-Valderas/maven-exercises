import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scs = new Scanner(System.in);
            System.out.print("Input: ");
            String input = scs.nextLine();
            System.out.println("You entered: \"" + input + "\"");
            System.out.println("\"" + input + "\" " + returnNumMessage(input));
            System.out.println("Flipped Case: " + StringUtils.swapCase(input));
            System.out.println("Reversed: " + StringUtils.reverse(input));
        }
        public static String returnNumMessage(String input) {
            return (StringUtils.isNumeric(input)) ? "is a number" : "is not a number";
        }
    }
