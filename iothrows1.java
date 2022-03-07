import java.io.*;

class iothrows1 {

    void m() throws IOException {

        throw new IOException("device eroor");
    }

    void n() throws IOException {
        m();
    }

    void p() {

        try {
            n();
        }

        catch (Exception e) {
            System.out.println("error");
        }
    }

    public static void main(String args[]) {
        iothrows1 xxx = new iothrows1();
        xxx.p();
        System.out.println("normal flow");
    }

}
