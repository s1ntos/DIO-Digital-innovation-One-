class Aluno extends Usuario {
    public Aluno(String nome) {
        super(nome, "Aluno");
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.5; // Multa reduzida para alunos
    }
}