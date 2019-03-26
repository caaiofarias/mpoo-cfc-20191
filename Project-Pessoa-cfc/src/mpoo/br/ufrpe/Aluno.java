package mpoo.br.ufrpe;

public class Aluno {
	private int anoEntrada;
	private int periodoEntrada;
	
	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
	public int getAnoEntrada(){
		return this.anoEntrada;
	}
	public void setPeriodoEntrada(int periodoEntrada){
		this.periodoEntrada = periodoEntrada;
	}
	public int getPeriodoEntrada() {
		return this.periodoEntrada;
	}
	public void print() {
		System.out.printf("Ano de Entrada: %d\n",this.anoEntrada);
		System.out.printf("Período de Entrada: %d\n",this.periodoEntrada);
	}
}