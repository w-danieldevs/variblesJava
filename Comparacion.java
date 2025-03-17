package variables;

public class Comparacion {

	public static void main(String[] args) {
		// Declaración de variables
        int edad = 18;
        boolean esMayor = edad >= 18; // Evalúa si la edad es mayor o igual a 18

        // Comparación con otra variable
        int otraEdad = 21;
        boolean edadesIguales = edad == otraEdad; // Evalúa si ambas edades son iguales

        // Imprimir resultados
        System.out.println("¿Es mayor de edad? " + esMayor);
        System.out.println("¿Las edades son iguales? " + edadesIguales);

	}

}
