package mpoo.br.ufrpe;

public class Endereço {
	private String rua;
	private int numero;
	private String complemento;
	private String cidade;

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void print() {
		System.out.println("Rua: "+ this.getRua());
		System.out.println("Numero: "+ this.getNumero());
		System.out.println("Complemento: "+ this.getComplemento());
		System.out.println("Cidade: "+ this.getCidade());
		
	}
	
	
}
