import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            URL myObj = Main.class.getResource("number.txt");
            System.out.println(myObj);
            Scanner myReader = new Scanner(myObj.openStream());
            com.sun.security.auth.module.NTSystem NTSystem = new com.sun.security.auth.module.NTSystem();
            String data = myReader.nextLine();
            System.out.println(NTSystem.getName() + ": " + data);
            myReader.close();
            FileWriter writer = new FileWriter(myObj.getPath(), false);
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

