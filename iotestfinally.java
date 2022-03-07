import java.util.*;

public class iotestfinally {

    public static void main(String args[]) {

        // DataInputStream sc = new DataInputStream(System.in);

        try {

            int data = 25 / 0;
            System.out.println("data=" + data);

        }

        catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of phe code...");

    }

}
