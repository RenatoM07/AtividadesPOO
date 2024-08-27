import java.util.Scanner;

public class MeuPrimeiroPrograma {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha uma operação: ");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            int escolha = scanner.nextInt();

            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado;

            switch (escolha) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.println("Resultado da adição: " + resultado);
                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                }
                case 3 -> {
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                }
                case 4 -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }



}
