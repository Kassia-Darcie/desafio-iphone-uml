package iphone;

import iphone.apps.navegadorInternet.NavegadorInternet;
import iphone.apps.reprodutorMusical.ReprodutorMusical;
import iphone.apps.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a página: " + url + ", pelo navegador Safari do Iphone.");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba ao navegador Safari do Iphone.");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página do navegador Safari do Iphone.");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero + ", via Iphone");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo uma chamada com Iphone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz do Iphone");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica com Iphone");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a musica com Iphone");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Tocando a musica: " + musica + ", com Iphone");
		
	}

}
