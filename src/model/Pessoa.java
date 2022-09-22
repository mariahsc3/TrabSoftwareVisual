package model;

public class Pessoa {
		private String nome;
	    private String fone;
	    private String email;
	    
	    public Pessoa(String nome){
	        this.nome = nome;
	    }


		public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getFone() {
	        return fone;
	    }

	    public void setFone(String fone) {
	        this.fone = fone;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String Email) {
	        this.email = Email;
	    }

	    
	    @Override
	    public String toString() {
	        return "Cliente: \n nome=" + nome + "\n fone=" + fone + "\n e-mail=" + email + "\n";
	    }
}
