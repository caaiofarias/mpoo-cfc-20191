package mpoo.br.ufrpe;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa caio = new Pessoa();
		caio.setNome("Caio");
		caio.setCpf("1234567890");
		Enderešo enderešoCaio = new Enderešo();
		enderešoCaio.setRua("Aquela");
		enderešoCaio.setNumero(0);
		enderešoCaio.setComplemento("bloco tal");
		enderešoCaio.setCidade("Recife");
		caio.setEnderešo(enderešoCaio);
		caio.TransformA();
		caio.setAnoEntrada(2016);
		caio.setPeriodoEntrada(1);
		caio.print();
		
	}
}
