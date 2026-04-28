import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

// Variaveis

        double numero1, numero2, resultado;
        char entrada;
        int repeticao = 1;

// Tela inicial

        System.out.println("Vamos começar a usar a Calculadora");

// Escolha dos números 

        while (repeticao <= 1000){
            System.out.print("Digite o primeiro Número : ");
            numero1 = scanner.nextDouble();

            System.out.println("Digite a operação desejada :");
            System.out.println("* - Multiplicação");
            System.out.println("/ - Divisão ");
            System.out.println("+ - Soma ");
            System.out.println("- - Subtração ");
            entrada = scanner.next().charAt(0);

            System.out.print("Digite o segundo Número : ");
            numero2 = scanner.nextDouble();

//Calculos e repetição

            switch (entrada){

                case '*':
                    resultado = numero1 * numero2;
                        System.out.println("O resultado é : " + resultado);
                    break;

                case '/':
                    if (numero2 == 0){
                        System.out.println("Erro: não é possivel dividir por zero");
                    } else {
                        resultado = numero1 / numero2;
                            System.out.println("O resultado é : " + resultado);
                    }
                    break;

                case '+':
                    resultado = numero1 + numero2;
                        System.out.println("O resultado é : " + resultado);
                    break;

                case '-':
                    resultado = numero1 - numero2;
                        System.out.println("O resultado é : " + resultado);
                    break;

                default:
                        System.out.println("Opção invalida");
                    break;
            }
            repeticao++;
        }
        scanner.close();

    }

}
