import java.io.*;

class ioexceptionprogression {

    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {

        try {
            n();
        }

        catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        ioexceptionprogression obj = new ioexceptionprogression();
        obj.p();
        System.out.println("normal flow...");
    }

}
