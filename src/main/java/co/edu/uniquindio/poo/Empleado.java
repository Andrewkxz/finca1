package co.edu.uniquindio.poo;

public abstract class Empleado {
    private final String nombre;
    private String cargo;
    public Empleado(String nombre, String cargo) {
        assert nombre != null && !nombre.isBlank(): "El nombre es requerido";
        assert cargo != null && !cargo.isBlank(): "El cargo es requerido";
        this.nombre = nombre;
        this.cargo = cargo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCargo() {
        return cargo;
    }

    public abstract int calcularSalario();

}
