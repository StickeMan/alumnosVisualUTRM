
public class Alumno {
    String nombre;
    double[] calificacion;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double[] calificacion) {
        this.calificacion = calificacion;
    }    
            
    public Alumno(String nombre, double[] calf) {
        this.nombre=nombre;
        this.calificacion=calf;        
    }
    
    public double CalcularPromedio(){
        
        double suma=0;
        double promedio=0;
        for(int i = 0; i<calificacion.length ; i++){
            suma += calificacion[i];
        }
            promedio = suma / calificacion.length;
                        
        return promedio;
    }              
       
}
