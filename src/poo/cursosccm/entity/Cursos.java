package poo.cursosccm.entity;
// Generated 24/10/2018 08:39:02 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cursos generated by hbm2java
 */
public class Cursos  implements java.io.Serializable {


     private int idcursos;
     private Tematicas tematicas;
     private String nombre;
     private String profesor;
     private int aula;
     private String duracion;
     private String cargaHoraria;
     private int cupo;
     private Set inscripcions = new HashSet(0);

    public Cursos() {
    }

	
    public Cursos(int idcursos, Tematicas tematicas, String nombre, String profesor, int aula, String duracion, String cargaHoraria, int cupo) {
        this.idcursos = idcursos;
        this.tematicas = tematicas;
        this.nombre = nombre;
        this.profesor = profesor;
        this.aula = aula;
        this.duracion = duracion;
        this.cargaHoraria = cargaHoraria;
        this.cupo = cupo;
    }
    public Cursos(int idcursos, Tematicas tematicas, String nombre, String profesor, int aula, String duracion, String cargaHoraria, int cupo, Set inscripcions) {
       this.idcursos = idcursos;
       this.tematicas = tematicas;
       this.nombre = nombre;
       this.profesor = profesor;
       this.aula = aula;
       this.duracion = duracion;
       this.cargaHoraria = cargaHoraria;
       this.cupo = cupo;
       this.inscripcions = inscripcions;
    }
   
    public int getIdcursos() {
        return this.idcursos;
    }
    
    public void setIdcursos(int idcursos) {
        this.idcursos = idcursos;
    }
    public Tematicas getTematicas() {
        return this.tematicas;
    }
    
    public void setTematicas(Tematicas tematicas) {
        this.tematicas = tematicas;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getProfesor() {
        return this.profesor;
    }
    
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public int getAula() {
        return this.aula;
    }
    
    public void setAula(int aula) {
        this.aula = aula;
    }
    public String getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public String getCargaHoraria() {
        return this.cargaHoraria;
    }
    
    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public int getCupo() {
        return this.cupo;
    }
    
    public void setCupo(int cupo) {
        this.cupo = cupo;
    }
    public Set getInscripcions() {
        return this.inscripcions;
    }
    
    public void setInscripcions(Set inscripcions) {
        this.inscripcions = inscripcions;
    }

    @Override
    public String toString() {
        return nombre;
    }

}


