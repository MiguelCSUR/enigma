/**
 * funciones
 */
public class FuncionesRafa {

	public static char Cifrar(char letra, int valor) {

		int codigo = (int) letra;
		System.out.println("codigo: " + codigo + "letra: " + letra + "valor: " + valor);
		int desplazamiento = codigo + valor % 95;
		System.out.println("desplazamiento: " + desplazamiento);
		int resultado;
		//126 es el último carácter '~'
		if (desplazamiento > 126)
		//127-95=32, es el primer carácter ' ' el espacio
		resultado = desplazamiento - 95;
		else
		resultado = desplazamiento;
		return (char) resultado;
		
	}
	
	public static char Descifrar(char letra, int valor) {
		
		int codigo = (int) letra;
		System.out.println("codigo: " + codigo + "letra: " + letra + "valor: " + valor);
		int desplazamiento = codigo - valor % 95;
		System.out.println("desplazamiento: " + desplazamiento);
		int resultado;
		//32 es el primer carácter ' ' el espacio
		if (desplazamiento < 32)
		//31+95=126 es el último carácter '~'
			resultado = desplazamiento + 95;
		else
			resultado = desplazamiento;
		return (char) resultado;

	}
}