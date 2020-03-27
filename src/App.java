import controller.Controller;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
       Controller cl = new Controller();
       Object obj = new Object();
       obj = cl.input();
        System.out.println(obj.toString());

    }
}
