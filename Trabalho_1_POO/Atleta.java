import java.util.ArrayList;

public class Atleta {

	private int numero;
	private String nome;
	private String pais;
	private ArrayList <Medalha> medalha;
}

public Atleta (int numero, String nome, String pais){
	this.numero=numero;
	this.nome=nome;
	this.pais=pais;
	medalhas = new ArrayList <Medalha>();
}

public int getNumero() {
	return numero;
}
public String getNome() {
	return nome;
}
public String getPais() {
	return pais;
}

//adicionaMedalha(Medalha): adiciona uma nova medalha ao atleta.
public void adicionaMedalha(Medalha medalha) {
	if(colecao.isEmpty()){
		medalhas.add(medalha);
	}
}

//consultaQuantidadeMedalhas(): retorna a quantidade de medalhas do atleta
public int consultaQuantidadeMedalhas() {
	int count = 0;
	if(!colecao.isEmpty()){
		for(Medalha m : medalhas ) {
			if(m.getNumero().equals(numero))
				count++;
		}
		return count++;
	}
	else
		return 0;
}


