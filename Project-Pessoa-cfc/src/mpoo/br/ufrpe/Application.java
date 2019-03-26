package mpoo.br.ufrpe;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa caio = new Pessoa();
		caio.setNome("Caio");
		caio.setCpf("1234567890");
		Endereço endereçoCaio = new Endereço();
		endereçoCaio.setRua("Aquela");
		endereçoCaio.setNumero(0);
		endereçoCaio.setComplemento("bloco tal");
		endereçoCaio.setCidade("Recife");
		caio.setEndereço(endereçoCaio);
		caio.TransformA();
		caio.setAnoEntrada(2016);
		caio.setPeriodoEntrada(1);
		caio.print();
		
	}
}
