package model;

public class LocadoraDeVeiculos {
    private String nome, CPF, veiculo, telefone, cidade;
    private int dia, idade,horasExtras, protecao, acessorios;
    private double juros,limiteCartao,diarias = 189.34;

    public LocadoraDeVeiculos(){}

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }

    public double getDiarias() {
        return diarias;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setDiarias(double diarias) {
        this.diarias = diarias;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public int getProtecao() {
        return protecao;
    }

    public void setProtecao(int protecao) {
        this.protecao = protecao;
    }

    public int getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(int acessorios) {
        this.acessorios = acessorios;
    }

    public double calcularDiaria(){
        return this.diarias * this.dia;
    }

    public double protCompleta(){

        if (this.idade >=18 && this.idade<=23){
            if (this.protecao <=1){
                return 32;
            }else{return 0;}
        }else if (this.idade>=24){
            if (this.protecao>=1){
                return 29;
            }else{return 0;}
        }else {return 0;}
    }


    public double acessorios(){
        if (this.idade >=18 && this.idade<=23){
            if (this.acessorios<=1){
                return 25;
            }else{return 0;}
        }else if (this.idade>=24){
            if (this.acessorios<=1){
                return 25;
            }else{return 0;}
        }else {return 0;}
    }

    public double valorTolal(){
        return (calcularDiaria()+calcularJuros())+protCompleta()+acessorios();
    }

    public double calcularHorasExtras1(){
        return 122.34;
    }

    public double calcularJuros(){
        if (this.idade >=18 && this.idade<=23){
            return calcularDiaria() * 0.15;
        }else if (this.idade>=24){
            return calcularDiaria() * 0.12;
        }else {return 0;}
    }

    public double calcularHorasExtras2(){
        return  135.25;
    }

    @Override
    public String toString(){
        return "\nNome:"+this.nome+
                "\nCPF:"+this.CPF+
                "\nIdade:"+this.idade+
                "\nTelefone"+this.telefone;
    }
}
