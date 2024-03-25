import java.util.Collection;
import java.util.ArrayList;

public class Medalheiro {

	private colecao <Medalha> medalha;

	public Medalheiro(){

		medalhas = new ArrayList <Medalha>();
	}
/*
cadastraMedalha(Medalha): recebe como parâmetro uma nova medalha e a
cadastra no sistema. Não pode haver medalhas com o mesmo código. Retorna
true se o cadastro teve sucesso; ou false em caso contrário
 */
	public boolean cadastraMedalha (Medalha m) {
		if(consultaMedalha(m.getCodigo()) !=null ){
			return false;
		}
		medalhas.add(m);
			return true;
	}
/*
consultaMedalha(int): retorna a medalha com o código indicado. Se não
houver medalha com este código retorna null

 */
	public Medalha consultaMedalha(int codigo) {
		for(Medalha m : medalhas) {
			if (m.getCodigo().equals(codigo)) {
				return m;
			}
		}
			return null;
	}
/*
consultaMedalhas(String): retorna uma coleção de medalhas com a
modalidade indicada. Se não houver nenhuma medalha com esta modalidade
retorna null
 */
	public ArrayList<Medalha> consultaMedalhas(String modalidade) {
		consulta = new ArrayList<>();
		for (Medalha m : medalhas){
			if (m.getModalidade().equals(Modalidade)){
			consulta.add(m);
			}
			return consulta; 
			}
		}
		return null;
	}

}
