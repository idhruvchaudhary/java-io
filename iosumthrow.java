import java.io.*;

public class iosumthrow {

    public static void main(String args[]) throws Exception {

        DataInputStream sc = new DataInputStream(System.in);

        int sum = 0;

        // DataInputStream a = new DataInputStream(in);
        // DataInputStream b = new DataInputStream(in);

        int a, b;
        System.out.println("enter the value 1=");
        a = Integer.parseInt(sc.readLine());
        System.out.println("enter the value 2=");
        b = Integer.parseInt(sc.readLine());

        sum = a + b;
        System.out.println("sum= " + sum);

    }

}