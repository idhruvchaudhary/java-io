import java.io.*;

public class iotestthrow {

    public static void validate(int age) {

        if (age < 18) {
            throw new ArithmeticException("Person is not eligible to vote");

        }

        else {
            System.out.println("you are eligible for vote");
        }

        System.out.println(10 / 5);
    }

    public static void main(String args[]) {

        try {
            validate(13);
        }

        // validate(53);

        catch (Exception ex) {
            System.out.println(ex);
        }

        System.out.println("rest of the code");

    }

}
