package mpoo.br.ufrpe;
import java.util.Date;

public class Professor {
	private Date admissao = new Date();

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}
	public Date getAdmissao(){
		return this.admissao;
	}
	public void print() {
		System.out.print("Data de Admissao: "+ admissao);
	}
}