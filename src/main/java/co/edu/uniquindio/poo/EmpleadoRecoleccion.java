package co.edu.uniquindio.poo;

public class EmpleadoRecoleccion extends Empleado {
    private int numeroKilos;
    private int valorKilo;
    public EmpleadoRecoleccion(String nombre, String cargo, int numeroKilos, int valorKilo) {
        super(nombre, cargo);
        this.numeroKilos = numeroKilos;
        this.valorKilo = valorKilo;
    }

    @Override
    public int calcularSalario(){
        return (numeroKilos*valorKilo);
    }
    public int getNumeroKilos() {
        return numeroKilos;
    }
    public int getValorKilo() {
        return valorKilo;
    }
    
}
