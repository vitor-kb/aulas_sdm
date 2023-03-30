package ex_socket;

import java.net.*;
import javax.swing.*;

public class UDPClient {
    public static void main(String[] args) {

        try {
            DatagramSocket clientSocket = new DatagramSocket();
            byte[] sendData = new byte[1024];
            InetAddress IPAdress = InetAddress.getByName("localhost");
            while (true) {
                String sentence = JOptionPane.showInputDialog("Digite:");
                sendData = sentence.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sentence.length(), IPAdress, 4000);
                clientSocket.send(sendPacket);
                if (sentence.equals("fim")) {
                    break;
                }
            }
            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Cliente encerrado");
        }

    }
}
