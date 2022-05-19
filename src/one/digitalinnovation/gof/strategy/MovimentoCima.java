package one.digitalinnovation.gof.strategy;

public class MovimentoCima implements Movimento {

	@Override
	public void mover() {
		System.out.println("Movendo-se para cima...");
	}

}
