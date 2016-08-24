package main;

import main.orcamento.Orcamento;
import main.imposto.Imposto;

public class CalculadorDeImpostos{

	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer){
		double imposto = impostoQualquer.calcula(orcamento);
		System.out.println(imposto);
	}
}