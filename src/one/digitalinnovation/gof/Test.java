package one.digitalinnovation.gof;

import one.digitalinnovation.gof.strategy.*;
import one.digitalinnovation.gof.strategy.Movimento;
import one.digitalinnovation.gof.strategy.MovimentoCima;
import one.digitalinnovation.gof.strategy.MovimentoEsquerda;
import one.digitalinnovation.gof.strategy.MovimentoBaixo;
import one.digitalinnovation.gof.strategy.MovimentoDireita;


public class Test {

	public static void main(String[] args) {
		
		// Strategy
		
		Movimento esquerda = new MovimentoEsquerda();
		Movimento cima = new MovimentoCima();
		Movimento direita = new MovimentoDireita();
		Movimento baixo = new MovimentoBaixo();
		
		Robo robo = new Robo();
		robo.setMovimento(esquerda);
		robo.mover();
		robo.mover();
		robo.setMovimento(cima);
		robo.mover();
		robo.setMovimento(direita);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.setMovimento(baixo);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.mover();

	}

}
