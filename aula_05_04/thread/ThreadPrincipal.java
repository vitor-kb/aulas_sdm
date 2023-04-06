package thread;

public class ThreadPrincipal {
    public static void main(String[] aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa) {
        ThreadParalelo a = new ThreadParalelo("#Paralelo#");
        a.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(":" + "&principal");
        }
    }
}
