package mpoo.br.ufrpe;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa caio = new Pessoa();
		caio.setNome("Caio");
		caio.setCpf("1234567890");
		Endere�o endere�oCaio = new Endere�o();
		endere�oCaio.setRua("Aquela");
		endere�oCaio.setNumero(0);
		endere�oCaio.setComplemento("bloco tal");
		endere�oCaio.setCidade("Recife");
		caio.setEndere�o(endere�oCaio);
		caio.TransformA();
		caio.setAnoEntrada(2016);
		caio.setPeriodoEntrada(1);
		caio.print();
		
	}
}
