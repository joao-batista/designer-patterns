package main.desconto;

import main.orcamento.Orcamento;
import main.item.Item;

public class DescontoPorVendaCasada implements Desconto{

	private Desconto proximo;
		
	public double desconta(Orcamento orcamento){
		if(existe("CANETA", orcamento) && existe("LAPIS", orcamento)){
			System.out.println("Venda Casada");
			return orcamento.getValor() * 0.05;
		}else{
			return proximo.desconta(orcamento);
		}
	}
	
	public void setProximo(Desconto proximo){
		this.proximo = proximo;
	}
	
	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getNome().equals(nomeDoItem)) {
				return true;
			}
		}
		return false;
	}
}