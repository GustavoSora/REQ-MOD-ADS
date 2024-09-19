package Faculdade;

public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.setNome("Martim");
        professor.setIdade(30);
        professor.setSalario(4000.00);

        Curso curso = new Curso();
        curso.setNome("Engenharia de Software");
        curso.setCodigo("ES20242");


        professor.adicionarCurso(curso);

        System.out.println("Professor: " + professor.getNome());
        System.out.println("Curso: " + curso.getNome());

    }
}