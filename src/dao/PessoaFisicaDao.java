package dao;


import model.PessoaFisica;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaFisicaDao {
	
	GerenciadorDeArquivo gf = new GerenciadorDeArquivo();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
    public ArrayList<PessoaFisica> convertCsvPessoaFisica(){
        File clientesFile = gf.openFile();
        ArrayList<PessoaFisica> listaClientes = new ArrayList<PessoaFisica> ();
        ArrayList<String> arquivo = gf.readFile(clientesFile);
        for(String linha: arquivo ){
            String[] itens = linha.split(",");
            PessoaFisica cliente = new PessoaFisica(itens[0].trim(), itens[3].trim());
            cliente.setEmail(itens[1].trim());
            cliente.setFone(itens[2].trim());
            try {
                cliente.setNascimento(formato.parse(itens[4]));
            } catch (ParseException ex) {
                System.out.println("Erro na data digitada o formato deve ser dd/mm/aaaa");
            }
            listaClientes.add(cliente);
        }
        return listaClientes;
    }
}
