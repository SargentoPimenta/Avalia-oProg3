
class Animal {
    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

  
    public Animal(String nome, int comprimento, int patas, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

  
    public String getNome() {
        return nome;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

   
    public void exibirInformacoes() {
        System.out.printf("%-20s %-10d %-10d %-15s %-10s %-15.1f", 
            nome, comprimento, patas, cor, ambiente, velocidade);
    }
}


class Peixe extends Animal {
    private String caracteristicas;

    
    public Peixe(String nome, int comprimento, double velocidade) {
        super(nome, comprimento, 0, "Cinzento", "Mar", velocidade);
        this.caracteristicas = "Barbatanas e cauda";
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("%-20s\n", caracteristicas);
    }
}

class Mamifero extends Animal {
    private String alimento;

   
    public Mamifero(String nome, int comprimento, String cor, double velocidade, String alimento) {
        super(nome, comprimento, 4, cor, "Terra", velocidade);
        this.alimento = alimento;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("%-20s\n", alimento != null ? "Alimento: " + alimento : "");
    }
}


public class TesteZoo {
    public static void main(String[] args) {
        System.out.println("Zoo:");
        System.out.printf("%-20s %-10s %-10s %-15s %-10s %-15s %-20s\n", 
            "Animal", "Comprimento", "Patas", "Cor", "Ambiente", "Velocidade", "Características");

        
        Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2.0);
        Peixe tubarao = new Peixe("Tubarão", 300, 1.5);
        Mamifero urso = new Mamifero("Urso-do-Canadá", 180, "Vermelho", 0.5, "Mel");

        
        camelo.exibirInformacoes();
        System.out.println();
        tubarao.exibirInformacoes();
        System.out.println();
        urso.exibirInformacoes();
        System.out.println();
    }
}
