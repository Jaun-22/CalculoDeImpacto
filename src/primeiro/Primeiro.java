package primeiro;

import java.util.Scanner;

public class Primeiro {
    public void primeiroProjeto() {

        boolean validador = true;


        while (validador) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("=========================================");
            System.out.println("Escolha a Opção:");
            System.out.println("1 - Novo teste  |  2 - Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1: {

                    System.out.println("Digite o valor da massa (entre 0kg até 200kg): ");
                    float valorMassa = scanner.nextFloat();

                    while (valorMassa < 0 || valorMassa > 200) {
                        System.out.println("valor incorreto, Digite o valor da massa (entre 0kg até 200kg): ");
                        valorMassa = scanner.nextFloat();
                    }

                    System.out.println("Digite a velocidade do veiculo: ");
                    float valorVelocidade = scanner.nextFloat();

                    while (valorVelocidade < 0 || valorVelocidade > 1000) {
                        System.out.println("valor incorreto, Digite o valor da velocidade (entre 0km/h até 1000km/h): ");
                        valorVelocidade = scanner.nextFloat();

                    }
                    float calculo = valorMassa * valorVelocidade;
                    System.out.println(calculo);


                    break;

                }
                case 2:
                    System.out.println("programa encerrado");
                    validador = false;
                    break;
                default:
                    System.out.println("valor incorreto");


            }


        }


    }

}

