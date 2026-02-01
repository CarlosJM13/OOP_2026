package edu_carlos_mendez.actividad3.process;
import edu_carlos_mendez.actividad3.models.Empleado;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Esta clase se enfoca en todos los codigos enfocados en listas de empleados
 * como mayor salario, edad comun, promedio de edad, etc.
 */
public class Lista_empleados {

    public Empleado mas_salario(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }
        Empleado mayor = lista.get(0);

        for (Empleado e : lista) {
            if (e.getSalario() > mayor.getSalario()) {
                mayor = e;
            }
        }
        return mayor;
    }
    public int edad_mas_comun(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) {
            return -1;
        }

        Map<Integer, Integer> frecuencias = new HashMap<>();

        for (Empleado e : lista) {
            int edad = e.getEdad();
            if (frecuencias.containsKey(edad)) {
                frecuencias.put(edad, frecuencias.get(edad) + 1);
            } else {
                frecuencias.put(edad, 1);
            }
        }
        int edadGanadora = -1;
        int maxRepeticiones = 0;

        for (Map.Entry<Integer, Integer> par : frecuencias.entrySet()) {
            if (par.getValue() > maxRepeticiones) {
                maxRepeticiones = par.getValue();
                edadGanadora = par.getKey();
            }
        }
        return edadGanadora;
    }
    public int promedio_de_la_edad(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) return 0;
        int suma = 0;
        for (Empleado e : lista) {
            suma += e.getEdad();
        }
        return (int) suma / lista.size();
    }
    public int promedio_salario(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) return 0;
        int suma = 0;
        for (Empleado e : lista) {
            suma += (int) e.getSalario();
        }
        return suma / lista.size();
    }

    public int edad_y_salario_mayor_a25k(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) return 0;
        int sumaEdad = 0;
        int contador = 0;

        for (Empleado e : lista) {
            if (e.getSalario() > 25000) {
                sumaEdad += e.getEdad();
                contador++;
            }
        }

        if (contador == 0) return 0;
        return (int) sumaEdad / contador;
    }
    public List<Empleado> menor_a_25(List<Empleado> lista) {
        List<Empleado> resultado = new ArrayList<>();
        if (lista == null) return resultado;

        for (Empleado e : lista) {
            if (e.getEdad() < 25) {
                resultado.add(e);
            }
        }
        return resultado;
    }
    public int empleados_de_sistemas(List<Empleado> lista) {
        if (lista == null) return 0;
        int contador = 0;
        for (Empleado e : lista) {
            if ("SISTEMAS".equalsIgnoreCase(e.getDepartamento())) {
                contador++;
            }
        }
        return contador;
    }
    public Empleado menor_gana_30k(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) return null;

        Empleado mejorCandidato = null;

        for (Empleado e : lista) {
            if (e.getEdad() > 30) {
                if (mejorCandidato == null || e.getSalario() > mejorCandidato.getSalario()) {
                    mejorCandidato = e;
                }
            }
        }
        return mejorCandidato;
    }
    public Empleado empleado_mas_raro(List<Empleado> lista) {
        if (lista == null || lista.isEmpty()) return null;

        Map<Integer, Integer> frecuencias = new HashMap<>();
        for (Empleado e : lista) {
            frecuencias.put(e.getEdad(), frecuencias.getOrDefault(e.getEdad(), 0) + 1);
        }
        int frecuenciaMinima = Integer.MAX_VALUE;
        for (int cantidad : frecuencias.values()) {
            if (cantidad < frecuenciaMinima) {
                frecuenciaMinima = cantidad;
            }
        }
        Empleado elegido = null;

        for (Empleado e : lista) {
            if (frecuencias.get(e.getEdad()) == frecuenciaMinima) {
                if (elegido == null || e.getSalario() < elegido.getSalario()) {
                    elegido = e;
                }
            }
        }
        return elegido;
    }
}
