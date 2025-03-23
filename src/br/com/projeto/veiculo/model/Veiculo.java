package br.com.projeto.veiculo.model;

public class Veiculo {
    public String tipo;
    public String cor;
    public double preco;
    public int qtddepassageiros;

    public Veiculo(String tipo,String cor,double preco,int qtddepassageiros){
        this.tipo=tipo;
        this.cor=cor;
        this.preco=preco;
        this.qtddepassageiros=qtddepassageiros;

    }
    public void exibirInfor(){
        System.out.printf("É um %s, a cor é %s, o valor é %.2f, e  a quantidade de passageiros é %d",this.tipo,this.cor,this.preco,this.qtddepassageiros);
    }
    public void corValiosa(String cor){
        if (this.cor==cor){
            this.preco*=0.20;
            System.out.printf("A cor valiosa é %s, e o preco vai subir 20 porcento %.2f",this.cor,this.preco);
        }
        else {
            System.out.println("A cor escolhida nao é rara, vai continuar no preco padrao");
        }

    }
}
