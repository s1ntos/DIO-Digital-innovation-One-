public class Usuario {
    private String nome;
    private String tipo;

    // Construtor
    public Usuario(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    // Método polimórfico
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 1.0; // Valor base da multa
    }
}

// Subclasse: Aluno
class Aluno extends Usuario {
    public Aluno(String nome) {
        super(nome, "Aluno");
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.5; // Multa reduzida para alunos
    }
}