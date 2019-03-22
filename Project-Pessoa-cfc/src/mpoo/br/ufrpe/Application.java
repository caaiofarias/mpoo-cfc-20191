package mpoo.br.ufrpe;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno caio = new Aluno();
		Professor gabriel = new Professor();
		Endereço endereçoCaio = new Endereço();
		caio.setNome("Caio");
		caio.setCpf("1234567890");
		endereçoCaio.setRua("Aquela");
		endereçoCaio.setNumero(0);
		endereçoCaio.setComplemento("bloco tal");
		endereçoCaio.setCidade("Recife");
		caio.setEndereço(endereçoCaio);
		caio.print();
	}

}
