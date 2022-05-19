package one.digitalinnovation.gof.strategy;

public class Robo {
	
	private Movimento movimento;

	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}
	
	public void mover() {
		movimento.mover();
	}
}
