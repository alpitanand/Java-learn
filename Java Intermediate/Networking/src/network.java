import java.net.*;
import java.io.*;

public class network {
    public static void main(String[] args) throws Exception {
        URL oracle = new URL("http://www.oracle.com/");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String inputLine;
        while (1 != 0) {
            inputLine = in.readLine();
            System.out.println(inputLine);

        }
    }
}