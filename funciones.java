/**
 * funciones
 */
public class funciones {

	public static char Cifrar(char letra, int valor) {

		int codigo = (int) letra;
		int desplazamiento = codigo + valor % 95;
		int resultado;
		if (desplazamiento > 126)
			resultado = desplazamiento - 95;
		else
			resultado = desplazamiento;
		return (char) resultado;

	}

	public static char Descifrar(char letra, int valor) {

		int codigo = (int) letra;
		int desplazamiento = codigo - valor % 95;
		int resultado;
		if (desplazamiento < 32)
			resultado = desplazamiento + 95;
		else
			resultado = desplazamiento;
		return (char) resultado;

	}
}