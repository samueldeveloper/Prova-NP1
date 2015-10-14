package Model;

public class Usuario {

	public String nome;
	public String email;
	public String telefone;
	public String tipo;
	public String operadora;
	public Usuario() {
		
	}
	
	public Usuario(String vNome, String vEmail, String vTelefone, String vTipo, String vOperadora) {
		
		this.nome = vNome;
		this.email =vEmail;
		this.telefone = vTelefone;
		this.tipo = vTipo;
		this.operadora = vOperadora;
	}
}
