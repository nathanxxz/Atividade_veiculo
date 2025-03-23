package br.com.projeto.veiculo.main;

import br.com.projeto.veiculo.model.Veiculo;

public class Main {
    public static  void main(String[]args){
        Veiculo veiculo1=new Veiculo("Moto","Vermelha",15000,2);
        Veiculo veiculo2=new Veiculo("Carro","Preto",40000,5);
        Veiculo veiculo3=new Veiculo("Onibus","Amarelo",1000000,70);
        Veiculo veiculo4=new Veiculo("Aviao","Azul",1000000000,200);
        Veiculo veiculo5=new Veiculo("Bicicleta","Branca",7500,1);


        System.out.println("EXIBINDO INFORMACOES DOS VEICULOS");
        System.out.println();
        veiculo1.corValiosa("Vermelho");
        System.out.println();
        System.out.println();
        veiculo1.exibirInfor();
        System.out.println();
        veiculo2.exibirInfor();
        System.out.println();
        veiculo3.exibirInfor();
        System.out.println();
        veiculo4.exibirInfor();
        System.out.println();
        veiculo5.exibirInfor();

    }
}
