package thread;

public class ThreadParalelo extends Thread{
    String texto;
    public ThreadParalelo(String texto){
        this.texto = texto;
    }

    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(":" + texto);
        }
    }
}
