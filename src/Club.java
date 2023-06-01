import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Club {
    private Map<String, Socio> socios;
    private String archivo;

    public Club(String archivo) {
        this.socios = new HashMap<>();
        this.archivo = archivo;
        leerArchivo();
    }

    private void leerArchivo() {
        
    }

    public void altaSocio(String apodo, String nombre) {
        Socio socio = new Socio(apodo, nombre, LocalDate.now());
        socios.put(apodo, socio);
        guardarArchivo();
    }

    private void guardarArchivo() {
    }

    public void bajaSocio(String apodo) {
        socios.remove(apodo);
        guardarArchivo();
    }

    public void modificarSocio(String apodo, String nombre) {
        Socio socio = socios.get(apodo);
        if (socio != null) {
            socio.setNombre(nombre);
            guardarArchivo();
        }
    }

    public void listarSociosPorApodo() {
        List<String> apodos = new ArrayList<>(socios.keySet());
        Collections.sort(apodos);
        for (String apodo : apodos) {
            System.out.println(socios.get(apodo));
        }
    }

    public void listarSociosPorAntiguedad() {
        List<Socio> lista = new ArrayList<>(socios.values());
        Collections.sort(lista, Comparator.comparing(Socio::getFechaIngreso));
        for (Socio socio : lista) {
            System.out.println(socio);
        }
    }

    public void listarSociosConAltaAnteriorA(int anio) {
        List<Socio> lista = new ArrayList<>();
        for (Socio socio : socios.values()) {
            if (socio.getFechaIngreso().getYear() < anio) {
                lista.add(socio);
            }
        }
        Collections.sort(lista, Comparator.comparing(Socio::getFechaIngreso));
        for (Socio socio : lista) {
            System.out.println(socio);
        }
    }
}
