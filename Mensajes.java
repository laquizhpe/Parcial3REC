/**
 * Clase utilitaria que contiene todos los textos fijos usados en pantalla
 * como constantes, para facilitar la corrección y traducción de textos.
 */
public class Mensajes {
    /** Encabezado de la tabla de alumnos */
    public static final String ENCABEZADO = "Nombre\tNota1\tNota2\tNota3\tMedia";
    /** Separador visual para la tabla */
    public static final String SEPARADOR = "--------------------------------------";
    /** Título del listado de alumnos */
    public static final String TITULO_LISTADO = "\tLISTADO DE ALUMNOS";
    /** Texto para mostrar la nota media del grupo */
    public static final String NOTA_MEDIA = "Nota media del grupo: ";
    /** Código para limpiar la pantalla en consola */
    public static final String LIMPIAR_PANTALLA = "\033[H\033[2J";
    /** Mensaje de error para nota1 fuera de rango */
    public static final String ERROR_NOTA1 = "La nota1 debe estar entre 0 y 10";
    /** Mensaje de error para nota2 fuera de rango */
    public static final String ERROR_NOTA2 = "La nota2 debe estar entre 0 y 10";
    /** Mensaje de error para nota3 fuera de rango */
    public static final String ERROR_NOTA3 = "La nota3 debe estar entre 0 y 10";
}