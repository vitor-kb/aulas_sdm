package ex_01;

public class Canhao {
    //atributos
    private Bala bala;
    private double posicaoFinalBala;

    //comportamentos - estao sem public pois os metodos ja sao public por padrao
    void disparar(double velocidade, double angulo) {
        this.posicaoFinalBala = velocidade * velocidade
                * (Math.sin(2 * (Math.toRadians(angulo)) / 9.81));
    }

    double getAlacanceMaximo() {
        return this.posicaoFinalBala + this.bala.getPosicaoX();
    }

    void setBala(double X, double Y) {
        this.bala.setPosicaoX(X);
        this.bala.setPosicaoY(Y);
    }

    Bala getBala() {
        return bala;
    }

    void setBala(Bala bala){
        this.bala = bala;
    }
    
}
