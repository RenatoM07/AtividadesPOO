public class Jato {

    String fabricante;
    String modelo;
    int ano;
    String cor;
    double velocidadeAtual;

    public Jato(String fabricante, String modelo, int ano, String cor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0.0;
    }

    public void acelerar(double incremento) {
        this.velocidadeAtual += incremento;
        System.out.println("O jato acelerou para " + this.velocidadeAtual + " km/h.");
    }

    public void desacelerar(double decremento) {
        if (this.velocidadeAtual - decremento >= 0) {
            this.velocidadeAtual -= decremento;
        } else {
            this.velocidadeAtual = 0;
        }
        System.out.println("O jato desacelerou para " + this.velocidadeAtual + " km/h.");
    }

    public void exibirInformacoes() {
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }

    public double obterVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println("O jato foi pintado de " + this.cor + ".");
    }

    public static void main(String[] args) {
        Jato meuJato = new Jato("Boeing", "747", 2019, "Branco");

        meuJato.exibirInformacoes();
        meuJato.acelerar(900.0); // Acelerando o jato
        meuJato.desacelerar(300.0); // Desacelerando o jato
        meuJato.pintar("Prata"); // Mudando a cor do jato
        System.out.println("Velocidade Atual: " + meuJato.obterVelocidadeAtual() + " km/h");
    }
}
