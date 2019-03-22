package mpoo.br.ufrpe;
import java.util.Date;

public class Professor extends Pessoa {
	private Date admissao = new Date();

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	public Date getAdmissao(){
		return this.admissao;
	}
	
}