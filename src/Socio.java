import java.time.LocalDate;

public class Socio {
    private String apodo;
    private String nombre;
    private LocalDate fechaIngreso;

    public Socio(String apodo, String nombre, LocalDate fechaIngreso) {
        this.apodo = apodo;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String toString() {
        return "Socio [apodo=" + apodo + ", nombre=" + nombre + ", fechaIngreso=" + fechaIngreso + "]";
    }
}
