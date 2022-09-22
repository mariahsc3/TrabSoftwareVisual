package dao;


import model.PessoaFisica;
import model.Produto;
import java.io.File;
import java.util.ArrayList;

public class ProdutoDao {
	 GerenciadorDeArquivo gf = new GerenciadorDeArquivo();
	    
	    public ArrayList<Produto> convertCsvConta(ArrayList<PessoaFisica> clientes){
	        File contasFile = gf.openFile();
	        ArrayList<Produto> listaProduto = new ArrayList<> ();
	        ArrayList<String> arquivo = gf.readFile(contasFile);
	        
	        for(String linha: arquivo ){
	            
	            String[] itens = linha.split(",");
	            PessoaFisica PProduto = null;
	            for(PessoaFisica p: clientes){
	                if(!p.getCpf().equals(itens[0].trim())){
	                    System.out.println("CPF: " + itens[0] + "não encontrado");
	                } else {
	                	listaProduto = p;
	                }
	            }
	            if(PProduto != null){
	            	Produto produto = new Produto(PProduto);
	            	produto.setNome(itens[2].trim());
	            	produto.setDescricao(itens[1].trim());
	            	produto.setPreco(Double.parseDouble(itens[4].trim()));
	                listaProduto.add(produto);
	            }
	        }
	        return listaProduto;
	    }
}
