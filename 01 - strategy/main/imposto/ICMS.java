package main.imposto;

import main.orcamento.Orcamento;

public class ICMS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento){
		return orcamento.getValor() * 0.1;
	}
}