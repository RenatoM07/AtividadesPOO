import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é: " + nome);

        String nomeSemEspacos = nome.replaceAll(" ", "");

        int length = nomeSemEspacos.length();
        System.out.println("Seu nome possui a quantidade de " + length + " caracteres.");


        String nomeMaiusculo = nome.toUpperCase();
        System.out.println("O nome com todas as letras maiúsculas: " + nomeMaiusculo);

        int contadorVogais = contarVogais(nomeSemEspacos);
        System.out.println("O nome digitado tem " + contadorVogais + " vogais.");

        boolean rio = nomeMaiusculo.contains("RIO");
        boolean uni = nomeMaiusculo.contains("UNI");

        System.out.println("Seu nome contém 'RIO': " + rio);
        System.out.println("Seu nome contém 'UNI': "+uni);

        scanner.close();
    }

    public static int contarVogais(String texto) {
        String vogais = "aeiouAEIOU";
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (vogais.indexOf(c) != -1) {
                contador++;
            }
        }

        return contador;
    }



}