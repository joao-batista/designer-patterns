package main.orcamento;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import main.item.Item;


public class Orcamento{
	
	private double valor;
	private List<Item> itens;

	public Orcamento(){
		this.itens = new ArrayList<Item>();
	}
	
	public Orcamento(double valor){
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}
	
	public double getValor(){
		return this.valor;
	}
	
	public List<Item> getItens(){
		return Collections.unmodifiableList(this.itens);
	}
	
	public void adicionaItem(Item item){
		this.itens.add(item);
		this.valor = valor + item.getValor();
	}
}