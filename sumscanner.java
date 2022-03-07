import java.util.*;

public class sumscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        try {

            System.out.println("enter the value 1");
            a = sc.nextInt();

            System.out.println("enter the value 1");
            b = sc.nextInt();

            c = a / b;

            System.out.println("div=" + c);

        }

        catch (Exception ex) {
            System.out.println(ex);

        }

        System.out.println("DHRUV");

    }
}
