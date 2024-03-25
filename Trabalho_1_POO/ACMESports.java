// Imports
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;
public class ACMESports {
	private Medalheiro medalheiro;
	private Plantel plantel;

	// Atributos para redirecionamento de E/S
	private Scanner in = new Scanner(System.in); // Atributo para entrada de dados
	private PrintStream saidaPadrao = System.out; // Guarda a saida padrao - tela (console)
	private final String nomeArquivoEntrada = "dadosin.txt"; // Nome do arquivo de entrada de dados
	private final String nomeArquivoSaida = "dadosout.txt"; // Nome do arquivo de saida de dados

	private Medalheiro medalheiro;

	private Plantel plantel;

	public ACMESports() {
		medalheiro = new Medalheiro();
		plantel = new Plantel();

		redirecionaES(); // Redireciona E/S para arquivos
	}

	public void executar() {
		/*
		public void executar() {
		cadastrarAtletas();
		cadastrarMedalhas();
		cadastrarMedalhasAtletasCorrespondentes();

		MostrarAtletaPorNome();
		MostrarAtletaPorPais();
		MostrarAtletaPorMedalha();
	}
		 */

	}
	// lê todos os dados de cada atleta e, se o número não for repetido, cadastra-o
	// no sistema.
	// Para cada atleta cadastrado com sucesso no sistema, mostra os dados do atleta
	// no formato: 1:número,nome,país
	/*cada linha corresponde ao número, nome e país
de um atleta. Quando o número lido for -1, não há mais atletas a serem
cadastrados. */
	public void cadastrarAtletas() {
/*
int numero;
	String nome;
	String pais;
	numero = entrada.nextInt();

	while(!numero.equals(-1)) {
		nome = entrada.nextLine();
		pais = entrada.nextLine();
		entrada.nextLine();
		Medalha m = new medalha (numero,nome, pais);
		enxame.adicionaRobo(r);
		modelo = entrada.nextLine();
	}
 */

		String nome;
		String pais;
		int numero;

		atleta = entrada.nextLine();
		while(!numero == -1) {

		}

	}
/*
lê todos os dados de cada medalha e, se o código não for
repetido, cadastra-a no sistema. Para cada medalha cadastrada com sucesso no
sistema, mostra os dados da medalha no formato: 2:codigo,tipo,é
individual?,modalidade
 */
//cada linha corresponde ao código, tipo, se
//é individual, e modalidade de uma medalha. Quando o código lido for -1, não há
//mais medalhas a serem cadastradas.

	public void cadastrarMedalhas() {
	}
/*
adiciona uma medalha para
cada atleta e vice-versa. Para cada cadastramento com sucesso mostra os dados
no formato: 3:código,número
 */
	public void cadastrarMedalhasAtletasCorrespondentes() {
	}
/*
lê o nome de um determinado atleta. Se não existir um atleta com o nome indicado, mostra a
mensagem de erro: “5:Nenhum atleta encontrado.”. Se existir, mostra os
dados do atleta no formato: 5:número,nome,país
 */
	public void MostrarAtletaPorNome() {
	}
/*
 lê o nome de um país.
Se não existir nenhum país com o nome indicado, mostra a mensagem de erro:
“7:Pais nao encontrado.”. Se existir, mostra os dados de cada atleta no
formato: 7:número,nome,país
 */
	public void MostrarAtletaPorPais() {
	}
/*
lê o tipo de uma
medalha. Se não houver nenhum atleta com o tipo de medalha indicado, mostra a
mensagem de erro: “8:Nenhum atleta encontrado.”, caso contrário, mostra
os dados de cada atleta no formato: 8:número,nome,país
 */
	public void MostrarAtletaPorMedalha() {
	}
/*
lê o número de um
determinado atleta. Se não existir um atleta com o número indicado, mostra a
mensagem de erro: “4:Nenhum atleta encontrado.”. Se existir, mostra os
dados do atleta no formato: 4:número,nome,país
 */
	public void MostrarAtletaPorNumero() {
	}
/*
lê o tipo de uma
medalha. Se não houver nenhum atleta com o tipo de medalha indicado, mostra a
mensagem de erro: “8:Nenhum atleta encontrado.”, caso contrário, mostra
os dados de cada atleta no formato: 8:número,nome,país
 */
	public void MostrarAtletaTipoMedalha() {
	}
/*
lê uma modalidade.
Se não houver a modalidade no sistema, mostra a mensagem de erro:
“9:Modalidade não encontrada.” Se uma medalha não tiver atleta, mostra
uma mensagem no formato: 9:modalidade,tipo,Sem atletas com
medalha. Caso contrário, mostra os dados de cada atleta da medalha no formato:
9:modalidade,tipo,número,nome,país
 */
	public void MostrarAtletaPorModalidade() {
	}
/*
localiza o atleta com maior
número de medalhas. Se não houver atletas com medalhas, mostra a mensagem
de erro: “10:Nenhum atleta com medalha.”. Caso contrário, mostra os dados
do atleta e medalhas no formato:
10:número,nome,país,Ouro:quantidade,Prata:quantidade,Bronze:
quantidade
 */
	public void MostrarAtletaMaisMedalhas() {
	}





	// Redireciona E/S para arquivos
	// Chame este metodo para redirecionar a leitura e escrita de dados para
	// arquivos
	private void redirecionaES() {
		try {
			BufferedReader streamEntrada = new BufferedReader(new FileReader(nomeArquivoEntrada));
			entrada = new Scanner(streamEntrada); // Usa como entrada um arquivo
			PrintStream streamSaida = new PrintStream(new File(nomeArquivoSaida), Charset.forName("UTF-8"));
			// System.setOut(streamSaida); // Usa como saida um arquivo
		} catch (Exception e) {
			System.out.println(e);
		}
		Locale.setDefault(Locale.ENGLISH); // Ajusta para ponto decimal
		entrada.useLocale(Locale.ENGLISH); // Ajusta para leitura para ponto decimal
	}

	// Restaura E/S padrao de tela(console)/teclado
	// Chame este metodo para retornar a leitura e escrita de dados para o padrao
	private void restauraES() {
		System.setOut(saidaPadrao);
		entrada = new Scanner(System.in);
	}

}
