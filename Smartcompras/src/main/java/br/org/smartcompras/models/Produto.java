package br.org.smartcompras.models;

import java.util.ArrayList;


public class Produto {

	private int idProduto;
	private String produto;
	private String imgProduto;
	private String tipoProduto;
	private ArrayList<Marca> marca = new ArrayList<Marca>();
	
	
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getImgProduto() {
		return imgProduto;
	}
	public void setImgProduto(String imgProduto) {
		this.imgProduto = imgProduto;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	
	public ArrayList<Marca> getMarca() {
		return marca;
	}
	public void setMarca(ArrayList<Marca> marca) {
		this.marca = marca;
	}
	
	
	
	
	
	
}
