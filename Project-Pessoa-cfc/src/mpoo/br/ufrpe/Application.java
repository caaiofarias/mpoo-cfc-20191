package mpoo.br.ufrpe;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno caio = new Aluno();
		Professor gabriel = new Professor();
		Enderešo enderešoCaio = new Enderešo();
		caio.setNome("Caio");
		caio.setCpf("1234567890");
		enderešoCaio.setRua("Aquela");
		enderešoCaio.setNumero(0);
		enderešoCaio.setComplemento("bloco tal");
		enderešoCaio.setCidade("Recife");
		caio.setEnderešo(enderešoCaio);
		caio.print();
	}

}
