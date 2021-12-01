import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class UpperNumCounter {

    public static File file = new File("./src\\main\\java\\input_data.txt");

    public void sumHigherNumberThenBefore() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String number;
            long numberBefore = 0;
            long counter = 0;
            while ((number = (br.readLine())) != null) {
                if ((Long.parseLong(number) > numberBefore) && (numberBefore != 0)) {
                    counter++;
                }
                numberBefore = Long.parseLong(number);
            }
            System.out.println("The number is of higher numbers is : " + counter);
        }
    }

    public static void main(String[] args) throws Exception {
        new UpperNumCounter().sumHigherNumberThenBefore();
    }

}
