package br.ifpe.pp2.models.produtos;

import jakarta.persistence.Id; 
import br.ifpe.pp2.models.produtospedido.ProdutosPedido;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
public class Produtos {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id_produto;
	private String nome;
	private String descricao;
	private Integer estoque;
	private Float preco;
	@Lob
	private byte[] foto;
	@ManyToOne
	private Tipo tipo;
	@ManyToOne
	private ProdutosPedido carrinho;
	
	public Long getId_produto() {
		return id_produto;
	}
	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public Float getPreco() {
		return preco;
	}
	public void setPreco(Float preco) {
		this.preco = preco;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public ProdutosPedido getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(ProdutosPedido carrinho) {
		this.carrinho = carrinho;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
}
