import java.util.ArrayList;

public class Nomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Talles Topadão");
        nomes.add("Pacheco");
        nomes.add("Luan");
        nomes.add("Richard");
        nomes.add("Renato");

        nomes.remove(1);
        System.out.println("Lista após remover o segundo nome");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        nomes.remove(2);
        System.out.println("\nLista após remover o terceiro nome");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        if (nomes.getFirst().equals("Talles Topadão")) {
            System.out.println("\nO primeiro nome é Talles Topadão");
        }
        else{
            System.out.println("\nO primeiro nome não é Talles Topadão");
        }
    }
}
