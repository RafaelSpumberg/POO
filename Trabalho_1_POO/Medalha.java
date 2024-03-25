import java.util.ArrayList;
public class Medalha {

	private int codigo;
	private int tipo;
	private boolean individual;
	private String modalidade;
	private colecao <Atleta> atleta;

	public Medalha (int codigo, int tipo, boolean individual, String modalidade){
		this.codigo=codigo;
		this.tipo=tipo;
		this.individual=individual;
		this.modalidade = modalidade;
		atletas = new ArrayList <Atleta>();

	}

	public int getCodigo(){
		return codigo;
	}

	public int getTipo() {
		return tipo;
	}

	public boolean isIndividual() {
		return individual;
	}

	public String getModalidade() {
		return modalidade;
	}
//adicionaAtleta(Atleta): adiciona um atleta à medalha
	public void adicionaAtleta(Atleta novoAtleta) {
		atletas.add(novoAtleta);
	}

}
