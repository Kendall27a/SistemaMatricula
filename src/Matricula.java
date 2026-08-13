/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kenda
 */
public class Matricula {
    private Estudiante estudiantes;
    private Profesor profesor;
    private String curso;

    public Matricula(Estudiante estudiantes, Profesor profesor, String curso) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.curso = curso;
    }

    public Estudiante getEstudiantes() {
        return estudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getCurso() {
        return curso;
    }
    
    @Override
    public String toString() {
        return "Matricula:\n" + estudiantes + "\n" + profesor +  "\nCurso: " + curso;
    }
    
}
