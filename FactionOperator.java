import java.util.Scanner;
import java.util.logging.Logger;

public class FactionOperator extends Fraction {

    private final static Logger LOG = Logger.getLogger(FactionOperator.class.getName());

    public static String calc(String args) {

        String[] tokens = args.split("\\s+");
        Fraction a = new Fraction(tokens[0]);
        Fraction b = new Fraction(tokens[2]);

        //LOG.info("Processing these operations: " + args);
        System.out.print("Processing these operations: " + args);

        switch (tokens[1]) {
            case "+":
                a.add(b);
                break;
            case "-":
                a.subtract(b);
                break;
            case "*":
                a.multiply(b);
                break;
            case "/":
                a.divide(b);
                break;
        }

        return a.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        System.out.println("Please input your fractions in this format whole_numerator/denominator e.g. 3_1/4");
        System.out.println("Legal operators shall be *, /, +, - (multiply, divide, add, subtract)");
        System.out.println("Inputs: ");
        String input = scanner.next();

        String result = FactionOperator.calc(input);

        System.out.println(String.format(" = %s", result));
    }
}

