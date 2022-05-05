import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            URL myObj = Main.class.getResource("number.txt");
            Scanner myReader = new Scanner(myObj.openStream());
            String data = myReader.nextLine();
            if (System.getProperty("os.name") == "Linux"){
                com.sun.security.auth.module.UnixSystem USystem = new com.sun.security.auth.module.UnixSystem();
                System.out.println(USystem.getUsername() + ": " + data);
            }else {
                com.sun.security.auth.module.NTSystem NTSystem = new com.sun.security.auth.module.NTSystem();
                System.out.println(NTSystem.getName() + ": " + data);
            }
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

