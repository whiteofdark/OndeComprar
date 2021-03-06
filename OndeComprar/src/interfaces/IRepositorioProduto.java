package interfaces;

import programa.Produto;


import java.sql.ResultSet;
import java.util.List;

import javax.swing.table.TableModel;

public interface IRepositorioProduto {
	public void listarProdutos();
	public void listarProdutos(String order);
	public Produto buscarProduto(int id);
	// ADICIONAR METODO ESTATICO PARA SOMAR O VALOR DE TODOS OS PRODUTOS
	public TableModel listarProdutosTabela(String texto, String order);
	public void inserirProduto(Produto produto);
	public void atualizarProduto(Produto produto);
	public void apagarProduto(int id);
	public Produto produtoParaTela(int id);
}
