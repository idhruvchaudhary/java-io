import java.io.*;

class parent {

    void msg() {

        System.out.println("perent hendling");
    }
}

public class iooverriding extends parent {

    void msg() throws IOException {
        System.out.println("test exception child");
    }

    public static void main(String args[]) {
        parent p = new iooverriding();

        p.msg();
    }
}
