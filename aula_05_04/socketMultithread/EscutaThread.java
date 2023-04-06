package socketMultithread;

import java.io.*;

public class EscutaThread extends Thread {
    BufferedReader in;

    public EscutaThread(BufferedReader in) {
        this.in = in;
    }

    public void run() {
        String entrada;

        try {
            while ((entrada = in.readLine()) != null) {
                System.out.println("Recebi:" + entrada);
            }
        } catch (Exception e) {}
    }
}
