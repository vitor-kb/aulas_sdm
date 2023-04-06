package client;

import java.net.*;

import javax.swing.JOptionPane;

import java.io.*;

public class client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5003);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String entradaServidor = "";
            String entradaUsuario = JOptionPane.showInputDialog("Digite:");
            while (!entradaUsuario.equals("fim")) {
                {
                    out.println(entradaUsuario);
                    entradaServidor = in.readLine();
                    entradaUsuario = JOptionPane.showInputDialog("Chegou: " + entradaServidor + "\nDigite para enviar: ");
                }
            }
            out.close();
            in.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Erro na inicialização do cliente: " + e);
        }

    }
}
