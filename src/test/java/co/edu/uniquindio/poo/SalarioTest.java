/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class SalarioTest {
    private static final Logger LOG = Logger.getLogger(SalarioTest.class.getName());
    @Test
    public void salarioEmpleadoParcial(){
        LOG.info("Iniciado test salarioEmpleadoParcial");
        Finca finca = new Finca("La villa");
        Empleado empleado = new EmpleadoTiempoParcial("Andrés", "Gerente", 8, 1500000);
        finca.registrarEmpleado(empleado);
        assertTrue(empleado.calcularSalario());
        LOG.info("Finalizando test salarioEmpleadoParcial");
    }
}
