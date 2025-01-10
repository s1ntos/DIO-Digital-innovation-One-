public class DigitalInnovationOne {
    public static void main(String[] args) {
        // Criando livros
        Liivro livro1 = new Liivro("Java: Como Programar", "Deitel", "123456");
        Liivro livro2 = new Liivro("Clean Code", "Robert C. Martin", "789101");

        // Criando usuários
        Usuario aluno = new Aluno("João Paulo");
        Usuario professor = new Professor("Ana Clara");

        // Testando empréstimo e devolução
        livro1.emprestar();
        livro1.emprestar(); // Tentativa de emprestar novamente
        livro1.devolver();
        livro1.emprestar();

        // Calculando multa
        System.out.println("Multa para aluno: R$" + aluno.calcularMulta(3));
        System.out.println("Multa para professor: R$" + professor.calcularMulta(3));
    }
}