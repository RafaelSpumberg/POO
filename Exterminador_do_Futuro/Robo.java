private String modelo;
private double valor;

public Robo (String modelo, double valor ){
    this.modelo=modelo;
    this.valor=valor;
}

public String getModelo(){
    return modelo;
}

public void setModelo(Strinh modelo) {
    this.modelo=modelo;
}

public double getValor(){
    return valor;
}

public void setValor(double valor) {
    this.valor=valor;
}

public String toString(){
    return "Robo modelo" + modelo + ", custo R$" + valor"
}