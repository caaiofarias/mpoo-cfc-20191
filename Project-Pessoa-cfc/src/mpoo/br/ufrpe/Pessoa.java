/**
 * 
 */
package mpoo.br.ufrpe;

/**
 * @author Aluno
 *
 */
public class Pessoa extends Enderešo {
	
	private String nome;
	private String cpf;	
	private Enderešo enderešo;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void print() {
		System.out.printf("Nome: %s\n",this.nome);
		System.out.printf("CPF: %s\n",this.cpf);
		this.enderešo.print();
	}
	public void setEnderešo(Enderešo enderešo) {
		this.enderešo = enderešo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
