import java.io.*;

public class iosumm {
    public static void main(String args[]) {

        DataInputStream sc = new DataInputStream(System.in);
        int sum = 0;
        int a = 0, b = 0;

        try {

            // DataInputStream a = new DataInputStream(in);
            // DataInputStream b = new DataInputStream(in);

            System.out.println("enter the value 1=");
            a = Integer.parseInt(sc.readLine());
            System.out.println("enter the value 2=");
            b = Integer.parseInt(sc.readLine());
        }

        catch (Exception ex) {
            System.out.println(ex);
        }

        sum = a + b;
        System.out.println("sum= " + sum);

    }

}
