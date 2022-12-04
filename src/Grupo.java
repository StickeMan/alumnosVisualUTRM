
public class Grupo {
    Alumno[] ArregloAlumnos;
    int NoCalificaciones;
    
    public Grupo(int NoAlumnos, int NoCalif){
        this.ArregloAlumnos= new Alumno[NoAlumnos];
        this.NoCalificaciones = NoCalif;
    }
    
    public Grupo(){}
    
    public Alumno[] getArregloAlumnos() {
        return ArregloAlumnos;
    }

    public void setArregloAlumnos(Alumno[] ArregloAlumnos) {
        this.ArregloAlumnos = ArregloAlumnos;
    }

    public int getNoCalificaciones() {
        return NoCalificaciones;
    }

    public void setNoCalificaciones(int NoCalificaciones) {
        this.NoCalificaciones = NoCalificaciones;
    }
        
}
