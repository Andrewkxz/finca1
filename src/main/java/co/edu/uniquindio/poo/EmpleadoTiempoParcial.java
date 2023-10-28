package co.edu.uniquindio.poo;

public class EmpleadoTiempoParcial extends Empleado{
    private int numeroHoras;
    private int salarioHora;
    public EmpleadoTiempoParcial(String nombre, String cargo, int numeroHoras, int salarioHora) {
        super(nombre, cargo);
        assert numeroHoras != 0 && numeroHoras > 0: "El numero de horas es requerido";
        assert salarioHora != 0 && salarioHora > 0: "El salario por hora es requerido";
        this.numeroHoras = numeroHoras;
        this.salarioHora = salarioHora;
    }

    @Override
    public int calcularSalario(){
        return ((numeroHoras*salarioHora)*22);
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