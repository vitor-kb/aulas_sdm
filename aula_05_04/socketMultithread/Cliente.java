package socketMultithread;

import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Cliente iniciado...");

        try {
            Socket socket = new Socket("localhost", 5000);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            EscutaThread escuta = new EscutaThread(in);
            escuta.start();
            String entrada = "";
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
