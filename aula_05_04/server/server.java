package server;

import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) {
        System.out.println("Servidor iniciado...");
        try {
            ServerSocket socketServidor = new ServerSocket(5003);
            Socket socketCliente = socketServidor.accept();
            PrintWriter out = new PrintWriter(socketCliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socketCliente.getInputStream()));
            String entrada;
            while ((entrada = in.readLine()) != null) {
                System.out.println("Recebido: " + entrada);
                out.println(entrada);
                if (entrada.equals("fim")) {
                    break;
                }
            }
            out.close();
            in.close();
            socketServidor.close();
            socketCliente.close();
        } catch (Exception e) {
            System.out.println("Erro na inicialização do servidor " + e);
        }

    }
}