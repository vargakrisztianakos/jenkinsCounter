import java.io.*;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.sql.Timestamp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            URL myObj = Main.class.getResource("number.txt");
            Scanner myReader = new Scanner(myObj.openStream());
            String data = myReader.nextLine();
            System.out.println(System.getProperty("os.name") + " " + System.getProperty("user.name")+ ": " + data);
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
        try{
            URL obj = Main.class.getResource("timestamps.txt");
            Timestamp ts = new Timestamp(System.currentTimeMillis());
            System.out.println(ts);
            FileWriter fw = new FileWriter(obj.getPath(), true);
            fw.write(ts.toString());
            fw.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}

