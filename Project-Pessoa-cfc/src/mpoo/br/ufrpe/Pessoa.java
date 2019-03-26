/**
 * 
 */
package mpoo.br.ufrpe;
import java.util.Date;
/**
 * @author Caio Farias Cavalcanti
 * Class Pessoa que herda o Endereço dela. Ao querer imprimir o endereço, chamar um metódo e imprimir todo endereço.
 */
public class Pessoa {
	private boolean verifyA = false;
	private boolean verifyP = false;
	private Aluno aluno;
	private Professor professor;
	private String nome;
	private String cpf;	
	private Endereço endereço = new Endereço();
	
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
	
	
	public void TransformA() {
		this.verifyA = true;
		this.aluno = new Aluno();
	}
	public void TransformP() {
		this.verifyP = true;
		this.professor = new Professor();
	}
	public void print() {
		System.out.printf("Nome: %s\n",this.nome);
		System.out.printf("CPF: %s\n",this.cpf);
		this.endereço.print();
		if(this.verifyA == true) {
			this.aluno.print();
		}
		if (this.verifyP == true) {
			this.professor.print();
		}
	}
	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

	
	//METODOS PARA CASO O OBJETO SE TORNE UM ALUNO
	public void setAnoEntrada(int anoEntrada) {//metodo para alterar atributo da classe aluno 
		if(this.verifyA == true) {
			this.aluno.setAnoEntrada(anoEntrada);
		} else {
			System.out.println("Você não é um aluno!");
		}
	}
	public void setPeriodoEntrada(int periodoEntrada) {//metodo para alterar atributo da classe aluno 
		if(this.verifyA) {
			this.aluno.setPeriodoEntrada(periodoEntrada);
		} else {
			System.out.println("Você não é um aluno!");
		}
	}
	public int getAlunoAnoEntrada() {
		return aluno.getAnoEntrada();
	}
	public int getAlunoPeriodoEntrada() {
		return aluno.getPeriodoEntrada();
	}
	//FIM DOS METODOS ALUNO
	
	//METODOS PARA O CASO DO OBJ SE TORNE UM PROFESSOR
	public void setAdmissao(Date admissao) {
		if(this.verifyP) {
			this.professor.setAdmissao(admissao);
		} else {
			System.out.println("Você não é um Professor!");
		}
	}
	public Date getAdmissao() {
		return this.professor.getAdmissao();
	}
	// FIM DOS METODOS PROFESSOR;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
