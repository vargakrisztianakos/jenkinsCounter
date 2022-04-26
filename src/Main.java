import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File myObj = new File("number.txt");
            Scanner myReader = new Scanner(myObj);
            com.sun.security.auth.module.NTSystem NTSystem = new com.sun.security.auth.module.NTSystem();

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(NTSystem.getName() + ": " + data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

