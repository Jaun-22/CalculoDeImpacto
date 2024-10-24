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

                    System.out.println(calculo + "N");

                    if (calculo < 100) {
                        System.out.println("COLISÂO  DE BAIXISSIMA INTENSIDADE:");
                        System.out.println("Escala de danos ao boneco: 2");

                    } else if (calculo < 700) {
                        System.out.println("COLISÃO DE BAIXA INTENSIDADE:");
                        System.out.println("Escala de danos ao boneco: 4");

                    } else if (calculo < 1400) {
                        System.out.println("COLISÃO DE INTENSIDADE MODERADA: ");
                        System.out.println("Escala de danos ao boneco: 6");

                    } else if (calculo < 2100) {
                        System.out.println("COLISÃO DE INTENSIDADE ALTA: ");
                        System.out.println("Escala de danos ao boneco: 8");

                    } else {
                        System.out.println("COLISÃO DE INTENSIDADE ALTÍSSIMA: ");
                        System.out.println("Escala de danos ao boneco: 10");

                    }
                }
                break;

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



