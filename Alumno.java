/**
 * Representa un alumno con nombre y tres notas.
 * Proporciona métodos para acceder y modificar los atributos,
 * así como para calcular el promedio de las notas.
 */
public class Alumno {
    /** Nombre del alumno */
    private String nombre;
    /** Primera nota del alumno */
    private double nota1;
    /** Segunda nota del alumno */
    private double nota2;
    /** Tercera nota del alumno */
    private double nota3;

    /**
     * Crea un nuevo alumno con nombre y tres notas.
     * @param n Nombre del alumno
     * @param n1 Nota 1 (debe estar entre 0 y 10)
     * @param n2 Nota 2 (debe estar entre 0 y 10)
     * @param n3 Nota 3 (debe estar entre 0 y 10)
     * @throws IllegalArgumentException si alguna nota no está entre 0 y 10
     */
    public Alumno(String n, double n1, double n2, double n3) {
        nombre = n;
        setNota1(n1);
        setNota2(n2);
        setNota3(n3);
    }

    /**
     * Obtiene el nombre del alumno.
     * @return Nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     * @param nombre Nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la primera nota del alumno.
     * @return Nota 1
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Establece la primera nota del alumno.
     * @param nota1 Nota 1 (debe estar entre 0 y 10)
     * @throws IllegalArgumentException si la nota no está entre 0 y 10
     */
    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            throw new IllegalArgumentException(Mensajes.ERROR_NOTA1);
        }
    }

    /**
     * Obtiene la segunda nota del alumno.
     * @return Nota 2
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Establece la segunda nota del alumno.
     * @param nota2 Nota 2 (debe estar entre 0 y 10)
     * @throws IllegalArgumentException si la nota no está entre 0 y 10
     */
    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            throw new IllegalArgumentException(Mensajes.ERROR_NOTA2);
        }
    }

    /**
     * Obtiene la tercera nota del alumno.
     * @return Nota 3
     */
    public double getNota3() {
        return nota3;
    }

    /**
     * Establece la tercera nota del alumno.
     * @param nota3 Nota 3 (debe estar entre 0 y 10)
     * @throws IllegalArgumentException si la nota no está entre 0 y 10
     */
    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        } else {
            throw new IllegalArgumentException(Mensajes.ERROR_NOTA3);
        }
    }

    /**
     * Calcula el promedio de las tres notas del alumno.
     * @return Promedio de las notas
     */
    public double promedio() {
        return (nota1 + nota2 + nota3) / 3;
    }
}