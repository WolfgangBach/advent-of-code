import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TextReader {

    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\wbach\\Workspace\\Java\\src\\main\\java\\input_data.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String number;
        int numberBefore = -1;
        int counter = 0;
        while((number = (br.readLine())) != null) {
            if(Integer.parseInt(number) > numberBefore){
                counter++;
            }
            numberBefore = Integer.parseInt(number);
        }
        System.out.println("The number is of higher numbers is : "+ counter);
    }
}
