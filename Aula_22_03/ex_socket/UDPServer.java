package ex_socket;

import java.net.*;

public class UDPServer {
    public static void main(String[] asopdkapsodkopaskdaposdkapsodkpsoadksapokdopaskdposadkaposkd) {

        try {
            System.out.println("Servidor iniciado..");
            byte[] receiveData = new byte[1024];
            DatagramSocket serverSocket = new DatagramSocket(4000);
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            while (true) {
                serverSocket.receive(receivePacket);
                String sentence = new String(receivePacket.getData());
                if (sentence.substring(0, 3).equals("fim")) {
                    break;
                }
                InetAddress IPAddress = receivePacket.getAddress();
                System.out.println("Recebido de " + IPAddress.getHostAddress() + ":" + sentence);
            }
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Erro encontrado!");
        }

    }
}
