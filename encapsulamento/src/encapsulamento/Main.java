package encapsulamento;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("Heloísa Galvão");
		cliente.setEndereco("Rua A, 123");
		cliente.setEmail("heloisa.galvao@gmail.com");

		Produto produto1 = new Produto();
		produto1.setId(1);
		produto1.setNome("Camiseta");
		produto1.setDescricao("Camiseta preta de algodão");
		produto1.setPreco(29.99);

		Produto produto2 = new Produto();
		produto2.setId(2);
		produto2.setNome("Tênis");
		produto2.setDescricao("Tênis esportivo de couro");
		produto2.setPreco(99.99);

		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(produto1);
		produtos.add(produto2);

		Pedido pedido = new Pedido();
		pedido.setId(1);
		pedido.setCliente(cliente);
		pedido.setProdutos(produtos);
		pedido.setTotal(pedido.getTotal());

		CarrinhodeCompras carrinho = new CarrinhodeCompras();
		carrinho.adicionarProduto(produto1);
		carrinho.adicionarProduto(produto2);

		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setId(1);
		fornecedor.setNome("Loja de Roupas");
		fornecedor.setEndereco("Rua B, 456");
		fornecedor.setEmail("contato@lojaderoupas.com");

		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Pedido nº " + pedido.getId() + " - Total: R$ " + pedido.getTotal());
		System.out.println("Fornecedor: " + fornecedor.getNome());
	}
}
