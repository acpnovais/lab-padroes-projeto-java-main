package one.digitalinnovation.gof.strategy;

public class MovimentoBaixo implements Movimento{


    @Override
    public void mover() {
        System.out.println("Movendo-se para baixo...");
    }
}
