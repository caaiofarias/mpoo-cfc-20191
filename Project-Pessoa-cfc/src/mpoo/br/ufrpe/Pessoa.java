/**
 * 
 */
package mpoo.br.ufrpe;

/**
 * @author Aluno
 *
 */
public class Pessoa extends Endere�o {
	
	private String nome;
	private String cpf;	
	private Endere�o endere�o;
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
		this.endere�o.print();
	}
	public void setEndere�o(Endere�o endere�o) {
		this.endere�o = endere�o;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
