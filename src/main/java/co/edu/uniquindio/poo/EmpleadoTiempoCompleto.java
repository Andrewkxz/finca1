package co.edu.uniquindio.poo;

public class EmpleadoTiempoCompleto extends Empleado{
    private int salario;

    public EmpleadoTiempoCompleto(String nombre, String cargo, int salario) {
        super(nombre, cargo);
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