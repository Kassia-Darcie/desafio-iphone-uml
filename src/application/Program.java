package application;

import iphone.Iphone;

public class Program {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.ligar("123456789");
		iphone.exibirPagina("https://www.google.com");
		iphone.adicionarNovaAba();
		iphone.selecionarMusica("Bones");
	}

}
