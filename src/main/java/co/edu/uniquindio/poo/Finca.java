package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Finca {
    private String nombre;
    public String getNombre() {
        return nombre;
    }

    private Collection<Empleado> empleados;

    public Finca (String nombre){
        assert nombre != null && !nombre.isBlank():"El nombre de la finca es requerido";
        this.nombre = nombre;
        this.empleados = new LinkedList<>();
    }

    public Collection<EmpleadoTiempoParcial> listarEmpleadosTiempoParcial(){
        Predicate<Empleado> condicion = empleado -> empleado instanceof EmpleadoTiempoParcial;
        return empleados.stream()
                .filter(condicion)
                .map(empleado -> (EmpleadoTiempoParcial)empleado)
                .sorted(Comparator.comparing(Empleado::calcularSalario))
                .toList();
    }

    public Collection<Empleado> listarEmpleadosMenorRendimiento(){
        double promedioHorasLaboradas = calcularPromedioHorasLaboradas();
        double promedioKilosRecolectados = calcularPromedioKilosRecolectados();

        Predicate<Empleado> condicion = empleado -> {
            if( empleado instanceof EmpleadoTiempoParcial e && e.getNumeroHoras() < promedioHorasLaboradas ){
                return true;
            }
            if( empleado instanceof EmpleadoRecoleccion e && e.getNumeroKilos() < promedioKilosRecolectados ){
                return true;
            }
            return false;
        };

        return empleados.stream().filter(condicion).toList();

    }

    public Collection<EmpleadoRecoleccion> listarEmpleadosRecoleccion(int numeroKilos){
        Predicate<Empleado> condicion = empleado -> empleado instanceof EmpleadoRecoleccion;
        Predicate<EmpleadoRecoleccion> condicion2 = empleado-> empleado.getNumeroKilos() > numeroKilos;
        return empleados.stream()
                .filter(condicion)
                .map(empleado -> (EmpleadoRecoleccion)empleado)
                .filter(condicion2)
                .sorted(Comparator.comparing(EmpleadoRecoleccion::getNumeroKilos))
                .toList();
    }

    public Collection<Empleado> listarEmpleadosSalarioMayorPromedio(){
        final double salarioPromedio = calcularPromedioSalario();
        Predicate<Empleado> condicion = empleado -> empleado.calcularSalario() > salarioPromedio;
        return empleados.stream()
                .filter(condicion)
                .sorted(Comparator.comparing(Empleado::getNombre))
                .toList();
    }

    private double calcularPromedioKilosRecolectados() {
        Predicate<Empleado> condicion = empleado -> empleado instanceof EmpleadoRecoleccion;
        return empleados.stream()
                .filter(condicion)
                .map(empleado -> (EmpleadoRecoleccion)empleado)
                .mapToInt(EmpleadoRecoleccion::getNumeroKilos)
                .summaryStatistics()
                .getAverage();
    }

    private double calcularPromedioHorasLaboradas() {
        Predicate<Empleado> condicion = empleado -> empleado instanceof EmpleadoTiempoParcial;
        return empleados.stream()
                .filter(condicion)
                .map(empleado -> (EmpleadoTiempoParcial)empleado)
                .mapToInt(EmpleadoTiempoParcial::getNumeroHoras)
                .summaryStatistics()
                .getAverage();
    }

    private double calcularPromedioSalario() {
        return empleados.stream()
                .mapToInt(Empleado::calcularSalario)
                .summaryStatistics()
                .getAverage();
    }

    public void registrarEmpleado (Empleado empleado){
        empleados.add(empleado);
    }
}
