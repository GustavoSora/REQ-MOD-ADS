package Faculdade;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{


    private double salario;
    private List<Curso> cursos = new ArrayList<>();

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Curso> getCurso() {
        return cursos;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }
}
