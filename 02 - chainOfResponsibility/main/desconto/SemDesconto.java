package main.desconto;

import main.orcamento.Orcamento;

public class SemDesconto implements Desconto{
	
	private Desconto proximo;
		
	public double desconta(Orcamento orcamento){
		return 0;
	}
	
	public void setProximo(Desconto proximo){
	}

}