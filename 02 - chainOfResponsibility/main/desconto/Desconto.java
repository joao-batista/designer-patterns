package main.desconto;

import main.orcamento.Orcamento;

public interface Desconto{
	
	double desconta(Orcamento orcamento);
	void setProximo(Desconto proximo);
}