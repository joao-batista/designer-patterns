package main;

import main.orcamento.Orcamento;
import main.desconto.Desconto;
import main.desconto.DescontoPorCincoItens;
import main.desconto.DescontoPorMaisDeQuinhentosReais;
import main.desconto.DescontoPorVendaCasada;
import main.desconto.SemDesconto;

public class CalculadorDeDesconto{

	public double calcula(Orcamento orcamento){
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);
		
		return d1.desconta(orcamento);
	}
}