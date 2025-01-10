class Professor extends Usuario {
    public Professor(String nome) {
        super(nome, "Professor");
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.2; // Multa reduzida para professores
    }
}