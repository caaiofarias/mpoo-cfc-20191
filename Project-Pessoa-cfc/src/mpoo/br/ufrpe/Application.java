package mpoo.br.ufrpe;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno caio = new Aluno();
		Professor gabriel = new Professor();
		Endere�o endere�oCaio = new Endere�o();
		caio.setNome("Caio");
		caio.setCpf("1234567890");
		endere�oCaio.setRua("Aquela");
		endere�oCaio.setNumero(0);
		endere�oCaio.setComplemento("bloco tal");
		endere�oCaio.setCidade("Recife");
		caio.setEndere�o(endere�oCaio);
		caio.print();
	}

}
