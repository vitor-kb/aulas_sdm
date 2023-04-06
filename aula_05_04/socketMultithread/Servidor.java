package socketMultithread;

import java.io.*;
import javax.swing.*;
import java.net.*;

public class Servidor {
    public static void main(String[] aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa) {
        System.out.println("Servidor iniciado...");

        try {
            ServerSocket socketServidor = new ServerSocket(5003);
            Socket socketCliente = socketServidor.accept();
            PrintWriter out = new PrintWriter(socketCliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socketCliente.getInputStream()));
            EscutaThread escuta = new EscutaThread(in);
            escuta.start();
            String entrada;
            while (true) {
                entrada = JOptionPane.showInputDialog(null, "Mensagem para o cliente", "Servidor",
                        JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Servidor:" + entrada);
                out.print(entrada);
                socketServidor.close();
            }
            
        } catch (Exception e) {
            System.out.println();
        }

    }
}
