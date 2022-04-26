import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            File myObj = new File("number.txt");
            Scanner myReader = new Scanner(myObj);
            com.sun.security.auth.module.NTSystem NTSystem = new com.sun.security.auth.module.NTSystem();
            String data = myReader.nextLine();
            System.out.println(NTSystem.getName() + ": " + data);
            myReader.close();
            FileWriter writer = new FileWriter("number.txt", false);
            int number = Integer.parseInt(data);
            number++;
            writer.write(Integer.toString(number));
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}

