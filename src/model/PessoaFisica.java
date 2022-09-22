package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaFisica extends Pessoa {
	 	private Date nascimento;
	    private String cpf;
	    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	    
	    public PessoaFisica(String nome, String cpf){
	        super(nome);
	        this.cpf = cpf;
	    }

	    public Date getNascimento() {
	        return nascimento;
	    }

	    public void setNascimento(Date nascimento) {
	        this.nascimento = nascimento;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    
	    @Override
	    public String toString() {
	        return super.toString() + " nascimento=" + formato.format(nascimento) + "\n cpf=" + cpf + "\n";
	    }
}
