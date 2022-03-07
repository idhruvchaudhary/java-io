import java.io.*;

public class ioexception {

    public static void main(String args[]) {

        DataInputStream sc = new DataInputStream(System.in);

        int a[] = new int[3];
        int i;

        try {
            for (i = 0; i < 9; i++) {
                System.out.println("enter the value");
                // a[9] = Integer.parseInt(sc.readLine());
                a[i] = Integer.parseInt(sc.readLine());
            }

        }

        catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
