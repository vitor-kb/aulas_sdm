package ex_01;

public class Main {
    public static void main(String[] AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA) {
        //EX 1
        Canhao cn = new Canhao();
        Bala bala = new Bala();

        cn.setBala(bala);
        cn.setBala(0, 0);
        cn.disparar(5, 45);
        System.out.println("Posicoes finais de cada disparo: ");
        System.out.format("%.3f%n", cn.getAlacanceMaximo());
        cn.setBala(1, 1);
        cn.disparar(5, 45);
        System.out.format("%.3f%n", cn.getAlacanceMaximo());
        cn.setBala(5, 3);
        cn.disparar(9, 27);
        System.out.format("%.3f%n", cn.getAlacanceMaximo());
    }
}
