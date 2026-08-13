package Streams.OperacionesIntermedias.Leccion30_OperacionFilter;

import java.util.Arrays;
import java.util.List;

public class Empleado implements Comparable {
    private long id;
    private String nombre;
    private double ingresos;
    private Genero genero;
    private int edad;

    @Override
    public int compareTo(Object o) {
        return this.getNombre().compareTo(((Empleado)o).getNombre());
    }

    public static enum Genero {
        HOMBRE, MUJER
    }

    public Empleado(long id, String nombre, double ingresos, int edad, Genero genero) {
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esHombre(){
        return this.genero == Genero.HOMBRE;
    }

    public boolean esMujer(){
        return this.genero == Genero.MUJER;
    }

    public static List<Empleado> empleados() {
        Empleado emp1 = new Empleado(1, "Juan Perez", 538.00, 26, Genero.HOMBRE);
        Empleado emp2 = new Empleado(2, "Alicia Ramirez", 600.00, 38, Genero.MUJER);
        Empleado emp3 = new Empleado(3, "Juan Puga", 900.00, 36, Genero.HOMBRE);
        Empleado emp4 = new Empleado(4, "Javier Vazquez", 330.00, 36, Genero.HOMBRE);
        Empleado emp5 = new Empleado(5, "Hevelyn Lopez", 450.00, 36, Genero.MUJER);
        Empleado emp6 = new Empleado(6, "Esmeralda Lopez", 450.00, 38, Genero.MUJER);
        Empleado emp7 = new Empleado(7, "Oyuky Navarro", 600.00, 38, Genero.MUJER);
        Empleado emp8 = new Empleado(8, "Alvaro Mejia", 450.50, 22, Genero.HOMBRE);
        Empleado emp9 = new Empleado(9, "Olivia Suarez", 652.30, 35, Genero.MUJER);
        Empleado emp10 = new Empleado(10, "Jessica Quevedo", 584.22, 38, Genero.MUJER);

        Empleado emp11 = new Empleado(11, "Carlos Mendoza", 720.00, 29, Genero.HOMBRE);
        Empleado emp12 = new Empleado(12, "Mariana Torres", 815.50, 31, Genero.MUJER);
        Empleado emp13 = new Empleado(13, "Luis Hernandez", 490.75, 24, Genero.HOMBRE);
        Empleado emp14 = new Empleado(14, "Gabriela Castro", 935.00, 42, Genero.MUJER);
        Empleado emp15 = new Empleado(15, "Ricardo Flores", 680.25, 33, Genero.HOMBRE);
        Empleado emp16 = new Empleado(16, "Daniela Morales", 570.00, 27, Genero.MUJER);
        Empleado emp17 = new Empleado(17, "Fernando Ortega", 1050.00, 45, Genero.HOMBRE);
        Empleado emp18 = new Empleado(18, "Patricia Rojas", 625.80, 34, Genero.MUJER);
        Empleado emp19 = new Empleado(19, "Miguel Sanchez", 780.40, 30, Genero.HOMBRE);
        Empleado emp20 = new Empleado(20, "Laura Gutierrez", 890.00, 39, Genero.MUJER);

        Empleado emp21 = new Empleado(21, "Andres Ramirez", 510.00, 23, Genero.HOMBRE);
        Empleado emp22 = new Empleado(22, "Sofia Martinez", 745.60, 28, Genero.MUJER);
        Empleado emp23 = new Empleado(23, "Eduardo Jimenez", 620.00, 32, Genero.HOMBRE);
        Empleado emp24 = new Empleado(24, "Valeria Cruz", 980.50, 41, Genero.MUJER);
        Empleado emp25 = new Empleado(25, "Roberto Navarro", 560.75, 37, Genero.HOMBRE);
        Empleado emp26 = new Empleado(26, "Camila Vargas", 710.00, 25, Genero.MUJER);
        Empleado emp27 = new Empleado(27, "Alejandro Ruiz", 830.25, 40, Genero.HOMBRE);
        Empleado emp28 = new Empleado(28, "Fernanda Silva", 675.90, 29, Genero.MUJER);
        Empleado emp29 = new Empleado(29, "Diego Mendoza", 590.00, 27, Genero.HOMBRE);
        Empleado emp30 = new Empleado(30, "Natalia Herrera", 760.45, 33, Genero.MUJER);

        return Arrays.asList(
                emp1, emp2, emp3, emp4, emp5,
                emp6, emp7, emp8, emp9, emp10,
                emp11, emp12, emp13, emp14, emp15,
                emp16, emp17, emp18, emp19, emp20,
                emp21, emp22, emp23, emp24, emp25,
                emp26, emp27, emp28, emp29, emp30
        );
    }
}