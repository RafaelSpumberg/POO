import java.util.ArrayList;
import java.util.Collection;

public class Medalha {

	private int codigo;
	private int tipo;
	private boolean individual;
	private String modalidade;
	private Collection<Atleta> atleta;

	public Medalha (int codigo, int tipo, boolean individual, String modalidade){
		this.codigo=codigo;
		this.tipo=tipo;
		this.individual=individual;
		this.modalidade=modalidade;
		this.atleta = new ArrayList<>();
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

	public String getModalidade(){
		return modalidade;
	}

	public void adicionaAtleta(Atleta atleta) {
		this.atleta.add(atleta);
	}

}
