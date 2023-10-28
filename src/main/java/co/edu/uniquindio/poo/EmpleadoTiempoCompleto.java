package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado{
    private int salario;

    public EmpleadoTiempoCompleto(String nombre, String cargo, int salario) {
        super(nombre, cargo);
        assert salario != 0 && salario > 0: "El salario es requerido";
        this.salario = salario;
    }

    @Override
    public int calcularSalario(){
        return (salario);
    }

    public int getSalario() {
        return salario;
    }
    
}
