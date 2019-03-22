/**
 * 
 */
package mpoo.br.ufrpe;

/**
 * @author Aluno
 *
 */
public class Pessoa extends Endereço {
	
	private String nome;
	private String cpf;	
	private Endereço endereço;
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
		this.endereço.print();
	}
	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
