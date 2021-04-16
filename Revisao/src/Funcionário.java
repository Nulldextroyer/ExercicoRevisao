import java.util.ArrayList;
import java.util.List;

public class Funcionário extends Usuário {
	private String nome;
	private String email;
	private String nascimento;
	
	public List<Integer> Horas = new ArrayList<Integer>();
	public List<Float> Valor = new ArrayList<Float>();
	
	public Funcionário() {
		
	}
	
	public Funcionário(String usuario, int senha, String nome, String email, String nascimento) {
		super(usuario, senha);
		setNome(nome);
		setEmail(email);
		setNascimento(nascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() > 0)
			this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.length() > 0)
			this.email = email;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		if(nascimento.length()> 0) 
			this.nascimento = nascimento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionário [nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", nascimento=");
		builder.append(nascimento);
		builder.append(", Horas=");
		builder.append(Horas);
		builder.append(", Valor=");
		builder.append(Valor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
