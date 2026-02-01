package edu_carlos_mendez.actividad3;
import edu_carlos_mendez.actividad3.models.Empleado;
import edu_carlos_mendez.actividad3.process.Lista_empleados;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class Test_lista_empleados {
    Lista_empleados programa = new Lista_empleados();
    List<Empleado> listaPrueba = Arrays.asList(
            new Empleado(10000, 20, "VENTAS"),
            new Empleado(30000, 30, "SISTEMAS"),
            new Empleado(40000, 40, "SISTEMAS"),
            new Empleado(10000, 20, "TECNOLOGIA")
    );
    @Test
    public void mayorsalario() {
        Empleado resultado = programa.mas_salario(listaPrueba);
        assertEquals(40000.0, resultado.getSalario(), 0.001);
    }

    @Test
    public void edadcomun() {
        int resultado = programa.edad_mas_comun(listaPrueba);
        assertEquals(20, resultado);
    }

    @Test
    public void promedioedad() {
        double resultado = programa.promedio_de_la_edad(listaPrueba);
        assertEquals(27.5, resultado, 0.001);
    }

    @Test
    public void promediosalario() {
        double resultado = programa.promedio_salario(listaPrueba);
        assertEquals(22500.0, resultado, 0.001);
    }

    @Test
    public void edadconsalariomayor25() {
        double resultado = programa.edad_y_salario_mayor_a25k(listaPrueba);
        assertEquals(35.0, resultado, 0.001);
    }

    @Test
    public void menor25() {
        List<Empleado> resultado = programa.menor_a_25(listaPrueba);
        assertEquals(2, resultado.size());
        assertEquals(20, resultado.get(0).getEdad());
    }

    @Test
    public void empleadosdesistemas() {
        int resultado = programa.empleados_de_sistemas(listaPrueba);
        assertEquals(2, resultado);
    }

    @Test
    public void salario_mayor30k() {
        List<Empleado> lista = Arrays.asList(
                new Empleado(50000, 25, "SISTEMAS"),
                new Empleado(10000, 35, "MERCADOTECNIA"),
                new Empleado(20000, 40, "TECNOLOGIA")
        );
        Empleado resultado = programa.menor_gana_30k(lista);
        assertEquals(20000.0, resultado.getSalario(), 0.001);
    }

    @Test
    public void salariomenor_edad_rara() {
        Empleado e1 = new Empleado(1000, 20, "TECNOLOGIA");
        Empleado e2 = new Empleado(1000, 30, "SISTEMAS");
        Empleado e3 = new Empleado(1000, 20, "TECNOLOGIA");
        Empleado e4 = new Empleado(1000, 30, "MERCADOTECNIA");
        Empleado e5 = new Empleado(5000, 50, "TECNOLOGIA");
        Empleado e6 = new Empleado(2000, 60, "SISTEMAS");

        List<Empleado> lista = Arrays.asList(e1, e2, e3, e4, e5, e6);

        Empleado resultado = programa.empleado_mas_raro(lista);
        assertEquals(2000.0, resultado.getSalario(), 0.001);
        assertEquals(60, resultado.getEdad());
    }
}