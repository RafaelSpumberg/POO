public class Enxame{
   
public Enxame (){
    colecao = new ArrayList<Robo>(tamanho);
}

public boolean adicionaRobo(Robo novoRobo) {
        for (int i = 0; i < colecao.size(); i++) {
            Robo robo = colecao.get(i);
            if (robo.getModelo().equals(novoRobo.getModelo())) {
                return false;
            }
        }

        colecao.add(novoRobo);
        return true;
    }


public Robo consultaPorModelo(String modelo){
    if(!colecao.isEmpty()){
        for(int i=0; i<colecao.size(): i++){
            Robo l = colecao.get(i);
            if(l.getModelo().equals(modelo)){
                return l;
                else
                return null;
            }
        }
    }
}

public double calculaSomatorio(){
    double somatorio = 0;
    for(int i = 0; i<colecao.size(); i++){
        somatorio += colecao.get(i).getValor();
    }
    return somatorio;

}

}