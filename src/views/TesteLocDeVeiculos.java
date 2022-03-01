package views;

import model.LocadoraDeVeiculos;

import java.util.Scanner;

public class TesteLocDeVeiculos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        LocadoraDeVeiculos lv = new LocadoraDeVeiculos();
        System.out.println("Digite seu nome:");
        lv.setNome(ler.nextLine());

        System.out.println("informe seu CPF:");
        lv.setCPF(ler.nextLine());

        System.out.println("Digite seu telefone:");
        lv.setTelefone(ler.nextLine());

        while (lv.getIdade()<18){
            System.out.println("Informe sua idade:");
            lv.setIdade(ler.nextInt());
            if (lv.getIdade()>= 18 && lv.getIdade()<=23){
                System.out.println("Locação Junior");
            }else if (lv.getIdade()>= 24){
                System.out.println("Locação");
            }else{
                System.out.println("Informe uma idade valida");
            }

        }

        while (lv.getLimiteCartao()<500){
           System.out.println("informe o limite do seu cartão:");
           lv.setLimiteCartao(ler.nextDouble());
           if (lv.getLimiteCartao()<500){
               System.out.println("O limite do seu cartão é inferior ao valor mínimo obrigatório de R$500.00");
               System.out.println("informe outro cartão e seu limite:");
           }else{
               System.out.println(" Cartão aceito com sucesso");
           }
        }

        System.out.println("Sobre nossas diárias de locação: ");
        System.out.println("Nossas diárias são de 24 horas, e o contrato mínimo é de uma diária, no valor inicial de R$189,34");
        System.out.println("O tempo máximo de locação do veículo são de 30 diárias");
        System.out.println("Quantos dias pretende alugar o carro?");
        lv.setDia(ler.nextInt());




        int opcao;
        System.out.println("Escolha o modelo do veículo");
        System.out.println("1- Chevrolet Onix");
        System.out.println("2- Renault Logan");
        System.out.println("3- Volkswagen Voyage");
        System.out.println("4- Toyota Etios");
        opcao = ler.nextInt();
        switch (opcao) {
            case 1:
                lv.setVeiculo("Chevrolet Onix");
                break;
            case 2:
                lv.setVeiculo("Renault Logan");
                break;
            case 3:
                lv.setVeiculo("Volkswagen Voyage");
                break;
            case 4:
                lv.setVeiculo("Toyota etios");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        int opcao2;
        System.out.println("Digite a cidade de retirada do veículo");
        System.out.println("1- Canoas");
        System.out.println("2- Porto Alegre");
        System.out.println("3- Novo Hamburgo");
        System.out.println("4- Gramado");
        opcao2 = ler.nextInt();
        switch (opcao2) {
            case 1:
                lv.setCidade("Canoas");
                break;
            case 2:
                lv.setCidade("Porto Alegre");
                break;
            case 3:
                lv.setCidade("Novo Hamburgo");
                break;
            case 4:
                lv.setCidade("Gramado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }


        System.out.println("Voce deseja a proteção completa?");
        System.out.println("1-sim");
        System.out.println("2-nao");
        lv.setProtecao(ler.nextInt());


        System.out.println("Voce deseja a os acessorios incluso?");
        System.out.println("1-sim");
        System.out.println("2-nao");
        lv.setAcessorios(ler.nextInt());


        int opcao3;
       do {


           System.out.println("Escolha qual operação você deseja visualizar: ");
           System.out.println("1 - Ver Dados:");
           System.out.println(" 2- Ver dados do cartão:");
           System.out.println("3- Dados do veiculo:");
           System.out.println("4- Cidade de retirada do veiculo:");
           System.out.println("5- Proteção completa:");
           System.out.println("6- Acessorio?");
           System.out.println("7- Valor da Hora extra:");
           System.out.println("8- Valor total da locação:");
           System.out.println("9- Sair:");
           opcao3 = ler.nextInt();
           switch (opcao3){
               case 1:
                   System.out.println("Ver dados:"+lv.toString());

                   break;
               case 2:
                   System.out.println("Cartão aceito, limite de R$:"+lv.getLimiteCartao());
                   break;
               case 3:
                   System.out.println("Carro selecionado: "+lv.getVeiculo());
                   break;
               case 4:
                   System.out.println("Cidade de retirada: "+lv.getCidade());
                   break;

               case 5:
                   System.out.println("Proteção completa?:R$"+lv.protCompleta());
                   break;
               case 6:
                   System.out.println(" Acessorios?:R$"+lv.acessorios());
                   break;
               case 7:
                   System.out.println(" Valor da Hora extra junior:R$"+lv.calcularHorasExtras2());
                   System.out.println("Valor da hora extra:R$"+lv.calcularHorasExtras1());
                   break;
               case 8:
                   System.out.println(" Valor total da locação:R$"+lv.valorTolal());
                   break;
               case 9:
                   System.out.println("menu Encerrado");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Opção inválida...");
                   break;
           }
       }while (opcao3!=9);
    }

}





