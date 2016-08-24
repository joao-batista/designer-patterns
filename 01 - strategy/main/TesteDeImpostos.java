package main;

import main.orcamento.Orcamento;
import main.imposto.Imposto;
import main.imposto.ISS;
import main.imposto.ICMS;

public class TesteDeImpostos{

	public static void main(String[] args){
	
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
	}
}