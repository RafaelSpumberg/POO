import java.util.ArrayList;
import java.util.Collection;

public class Plantel {

	private ArrayList <Atleta> atleta;

	public Plantel() {
		atletas = new ArrayList <Atleta>();
	}
/*
cadastraAtleta(Atleta): recebe como parâmetro um novo Atleta e o cadastra no
sistema. Não pode haver atletas com o mesmo número. Retorna true se o
cadastro teve sucesso; ou false em caso contrário.
 */
	public boolean cadastraAtleta(Atleta novoAtleta) {
		for (Atleta atleta : atletas){
			if (atleta.getNumero() == novoAtleta.getNumero)){
				return false;
			}
		}
		atletas.add(novoAtleta);
		return true;
	}
/*
consultaAtleta(String): retorna o atleta com o nome indicado. Se não houver
nenhum atleta com este nome retorna null.
 */
	public Atleta consultaAtleta(String nome) {
		for (Atleta a : atletas) {
			if (a.getNome().equals(nome)) {
				return a;
			}
		}
			return null;
	}
/*
consultaAtleta(int): retorna o atleta com o número indicado. Se não houver
nenhum atleta com este número retorna null
 */
	public Atleta consultaAtleta(int numero) {
		for (Atleta a : atletas) {
			if (a.getNumero().equals(numero)) {
				return a;
			}
		}
		return null;
	}


}
