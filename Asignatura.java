import java.util.ArrayList;

/**
 * Clase que representa una asignatura y gestiona una lista de alumnos.
 * Permite dar de alta alumnos, mostrar el listado y calcular la nota media del grupo.
 */
public class Asignatura {
    /** Lista de alumnos de la asignatura */
    private ArrayList<Alumno> lista = new ArrayList<>();

    /**
     * Da de alta un nuevo alumno en la asignatura.
     * @param nombre Nombre del alumno
     * @param n1 Nota 1 (debe estar entre 0 y 10)
     * @param n2 Nota 2 (debe estar entre 0 y 10)
     * @param n3 Nota 3 (debe estar entre 0 y 10)
     * @throws IllegalArgumentException si alguna nota no está entre 0 y 10
     */
    public void altaAlumno(String nombre, double n1, double n2, double n3) {
        Alumno a = new Alumno(nombre, n1, n2, n3);
        lista.add(a);
    }

    /**
     * Muestra por pantalla el listado de alumnos con sus notas y promedio.
     */
    public void mostrarAlumnos() {
        System.out.println(Mensajes.ENCABEZADO);
        System.out.println(Mensajes.SEPARADOR);
        for (Alumno a : lista) {
            System.out.println(a.getNombre() + "\t" +
                String.format("%.1f", a.getNota1()) + "\t" +
                String.format("%.1f", a.getNota2()) + "\t" +
                String.format("%.1f", a.getNota3()) + "\t" +
                String.format("%.1f", a.promedio()));
        }
    }

    /**
     * Calcula la nota media del grupo de alumnos.
     * @return Nota media del grupo, o 0 si no hay alumnos
     */
    public double promedioGeneral() {
        double suma = 0;
        for (Alumno a : lista) {
            suma += a.promedio();
        }
        return lista.size() > 0 ? suma / lista.size() : 0;
    }
}