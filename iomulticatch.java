import java.io.*;

public class iomulticatch {

    public static void main(String[] args) {

        DataInputStream sc = new DataInputStream(System.in);

        try

        {

            int a[] = new int[5];
            // a[5] = 30 / 0;

            System.out.println("vv=" + a[10]);
        }

        catch (ArithmeticException ex) {
            System.out.println("Arithmetic Exception occurs");
        }

        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }

        catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("rest of the code");

    }
}
