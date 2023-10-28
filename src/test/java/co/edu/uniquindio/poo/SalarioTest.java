package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class SalarioTest {
    private static final Logger LOG = Logger.getLogger(SalarioTest.class.getName());
    @Test
    public void salarioEmpleadoParcial(){
        LOG.info("Iniciado test salarioEmpleadoParcial");
        Finca finca1 = new Finca("La villa");
        Empleado empleado1 = new EmpleadoTiempoParcial("Andrés", "Cafetero", 8, 5000);
        finca1.registrarEmpleado(empleado1);
        assertEquals(880000, empleado1.calcularSalario());
        LOG.info("Finalizando test salarioEmpleadoParcial");
    }

    @Test
    public void salarioEmpleadoRecoleccion(){
        LOG.info("Iniciando test salarioEmpleadoRecoleccion");
        Finca finca2 = new Finca("La hacienda");
        Empleado empleado2 = new EmpleadoRecoleccion("Jaider", "Recolector", 30, 3000);
        finca2.registrarEmpleado(empleado2);
        assertEquals(1980000, empleado2.calcularSalario());
        LOG.info("Finalizando test salarioEmpleadoRecoleccion");
    }

    @Test
    public void salarioEmpleadoTiempoCompleto(){
        LOG.info("Iniciando test salarioEmpleadoTiempoCompleto");
        Finca finca3 = new Finca("El eden");
        Empleado empleado3 = new EmpleadoTiempoCompleto("Rodrigo", "Ganadero", 1200000);
        finca3.registrarEmpleado(empleado3);
        assertEquals(1200000, empleado3.calcularSalario());
        LOG.info("Finalizando test salarioEmpleadoTiempoCompleto");
    }
}
