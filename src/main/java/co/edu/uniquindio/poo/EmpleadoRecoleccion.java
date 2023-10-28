package co.edu.uniquindio.poo;

public class EmpleadoRecoleccion extends Empleado {
    private int numeroKilos;
    private int valorKilo;
    public EmpleadoRecoleccion(String nombre, String cargo, int numeroKilos, int valorKilo) {
        super(nombre, cargo);
        assert numeroKilos != 0 && numeroKilos >0: "El numero de horas es requerido";
        assert valorKilo != 0 && valorKilo >0: "El numero de horas es requerido";
        this.numeroKilos = numeroKilos;
        this.valorKilo = valorKilo;
    }

    @Override
    public int calcularSalario(){
        return ((numeroKilos*valorKilo)*22);
    }
    public int getNumeroKilos() {
        return numeroKilos;
    }
    public int getValorKilo() {
        return valorKilo;
    }
    
}
