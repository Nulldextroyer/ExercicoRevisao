
public class Usu�rio {
	private String usuario;
	private int senha;
	
	public Usu�rio() {
		
	}
	
	public Usu�rio(String usuario, int senha) {
		setUsuario(usuario);
		setSenha(senha);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		if(usuario.length() > 0)
			this.usuario = usuario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		if(senha > 0)
			this.senha = senha;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usu�rio [usuario=");
		builder.append(usuario);
		builder.append(", senha=");
		builder.append(senha);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
