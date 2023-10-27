package co.edu.uniquindio.poo;

public class EmpleadoTiempoParcial extends Empleado{
    private int numeroHoras;
    private int salarioHora;
    public EmpleadoTiempoParcial(String nombre, String cargo, int numeroHoras, int salarioHora) {
        super(nombre, cargo);
        this.numeroHoras = numeroHoras;
        this.salarioHora = salarioHora;
    }

    @Override
    public int calcularSalario(){
        return (numeroHoras*salarioHora);
    }
    public int calcularHorasLaboradas(){
        return (numeroHoras*30);
    }
    public int getNumeroHoras() {
        return numeroHoras;
    }
    public int getSalarioHora() {
        return salarioHora;
    }

    
}