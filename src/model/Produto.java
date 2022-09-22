package model;

public class Produto {
	 	public String nome;
	 	public String descricao;
	 	public double preco;
	 	
	 	
	 	
	 	
	 	
		public Produto(PessoaFisica pProduto) {
			
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
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		
		@Override
		public String toString() {
			return "Produto [nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + "]";
		}
	 	
}
