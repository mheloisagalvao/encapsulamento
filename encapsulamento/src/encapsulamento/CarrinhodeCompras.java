package encapsulamento;

import java.util.ArrayList;

public class CarrinhodeCompras {
	private ArrayList<Produto> produtos;

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public void adicionarProduto(Produto produto) {

	}

	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}

	public void limparCarrinho() {
		produtos.clear();
	}

	public double getTotal() {
		double total = 0;
		for (Produto produto : produtos) {
			total += produto.getPreco();
		}
		return total;
	}
}
