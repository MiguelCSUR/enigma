import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

import javax.print.CancelablePrintJob;
import javax.print.event.PrintEvent;

//Cada rotor que compruebe si el char es cifrable, los char cifrables son los del 32 al 126.

public class Enigma {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int opcion = 1939;
		String cadena = "";
		int rotorA, rotorB, rotorC, rotorD;

		while (opcion != 12) {
			cadena = "";
			PintarPantalla(opcion);
			opcion = sc.nextInt();

			switch (opcion) {
				case 1:
					cadena = PedirTexto();
					rotorA = PedirRotor(1);
					rotorB = PedirRotor(2);
					rotorC = PedirRotor(3);
					rotorD = PedirRotor(4);

					cadena = EncriptadoRotorA(cadena, rotorA);
					cadena = EncriptadoRotorB(cadena, rotorB);
					cadena = EncriptadoRotorC(cadena, rotorC);
					cadena = EncriptadoRotorD(cadena, rotorD);

					System.out.println("Frase encriptada: " + cadena);
					DeseaContinuar();
					break;
				case 2:
					cadena = PedirTexto();
					rotorA = PedirRotor(1);
					rotorB = PedirRotor(2);
					rotorC = PedirRotor(3);
					rotorD = PedirRotor(4);

					cadena = DesencriptadoRotorD(cadena, rotorD);
					cadena = DesencriptadoRotorC(cadena, rotorC);
					cadena = DesencriptadoRotorB(cadena, rotorB);
					cadena = DesencriptadoRotorA(cadena, rotorA);

					System.out.println("Frase desencriptada: " + cadena);
					DeseaContinuar();
					break;
				case 3:
					cadena = PedirTexto();
					rotorA = PedirRotor(1);
					cadena = EncriptadoRotorA(cadena, rotorA);
					System.out.println("Frase encriptada: " + cadena);
					DeseaContinuar();
					break;
				case 4:
					cadena = PedirTexto();
					rotorA = PedirRotor(1);
					cadena = DesencriptadoRotorA(cadena, rotorA);
					System.out.println("Frase desencriptada: " + cadena);
					DeseaContinuar();
					break;
				case 5:
					cadena = PedirTexto();
					rotorB = PedirRotor(2);
					cadena = EncriptadoRotorB(cadena, rotorB);
					System.out.println("Frase encriptada: " + cadena);
					DeseaContinuar();
					break;
				case 6:
					cadena = PedirTexto();
					rotorB = PedirRotor(2);
					cadena = DesencriptadoRotorB(cadena, rotorB);
					System.out.println("Frase desencriptada: " + cadena);
					DeseaContinuar();
					break;
				case 7:
					cadena = PedirTexto();
					rotorC = PedirRotor(3);
					cadena = EncriptadoRotorC(cadena, rotorC);
					System.out.println("Frase encriptada: " + cadena);
					DeseaContinuar();
					break;
				case 8:
					cadena = PedirTexto();
					rotorC = PedirRotor(3);
					cadena = DesencriptadoRotorC(cadena, rotorC);
					System.out.println("Frase desencriptada: " + cadena);
					DeseaContinuar();
					break;
				case 9:
					cadena = PedirTexto();
					rotorD = PedirRotor(4);
					cadena = EncriptadoRotorD(cadena, rotorD);
					System.out.println("Frase encriptada: " + cadena);
					DeseaContinuar();
					break;
				case 10:
					cadena = PedirTexto();
					rotorD = PedirRotor(4);
					cadena = DesencriptadoRotorD(cadena, rotorD);
					System.out.println("Frase desencriptada: " + cadena);
					DeseaContinuar();
					break;
				case 11:
					medusa(PedirTexto());
					break;
				case 12:
					Adios();
					break;
				default:
					System.out.println("Opción incorrecta");
					DeseaContinuar();
			}
		}
	}

	public static void PintarPantalla(int opcion) throws InterruptedException {

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("██████████████████████████████████████████");
		Thread.sleep(randomTimeSlow());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeSlow());
		System.out.println("█░░░░░░░░░░░░░MAQUINA ENIGMA░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░Servicio de Inteligencia del 2nd Reich░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░1. Encriptado total░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░2. Desencriptado total░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░3. Encriptar texto solo con rotor A░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░4. Desncriptar texto solo con rotor A░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░5. Encriptar texto solo con rotor B░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░6. Desncriptar texto solo con rotor B░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░7. Encriptar texto solo con rotor C░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░8. Desncriptar texto solo con rotor C░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░9. Encriptar texto solo con rotor D░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░10. Desncriptar texto solo con rotor D░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░11. Medusa░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░12. Salir del programa░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░Escoja una opción░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		Thread.sleep(randomTimeFast());
		System.out.println("██████████████████████████████████████████");

		System.out.println();
	}

	public static int randomTimeSlow() {
		int randomTime = (int) (Math.random() * 200) + 20;
		return randomTime;
	}

	public static int randomTimeFast() {
		int randomTime = (int) (Math.random() * 30) + 10;
		return randomTime;
	}

	public static int PedirRotor(int opcion) {
		Scanner sc = new Scanner(System.in);
		int n = 1945;
		while (n >= 100 || n < 0) {
			System.out.print("Introduzca el valor del rotor ");
			switch (opcion) {
				case 1:
					System.out.println("A");
					break;
				case 2:
					System.out.println("B");
					break;
				case 3:
					System.out.println("C");
					break;
				case 4:
					System.out.println("D");
					break;
			}
			n = sc.nextInt();
			if (n >= 100 && n < 0)
				System.out.println("ERROR. Un rotor tiene que tener un valor entre 0 y 99. Pruebe otra vez");
		}
		return n;
	}

	public static String PedirTexto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el texto");
		String cadena = sc.nextLine();
		return cadena;
	}

	public static boolean rotorCero(int rotor) {
		boolean aVeSiEsCero = false;
		if (rotor == 0)
			aVeSiEsCero = true;
		return aVeSiEsCero;
	}

	public static String EncriptadoRotorA(String cadena, int rotor) {
		String cadenaEncriptada = "";
		boolean cada3 = true;

		for (int i = 0; i < cadena.length(); i++) {

			if (cada3 && esCifrable(cadena.charAt(i)))
				cadenaEncriptada = cadenaEncriptada + Cifrar(cadena.charAt(i), rotor);
			else
				cadenaEncriptada = cadenaEncriptada + cadena.charAt(i);

			if ((i + 1) % 3 == 0) {
				if (cada3)
					cada3 = false;
				else
					cada3 = true;
			}
		}
		return cadenaEncriptada;
	}

	public static String DesencriptadoRotorA(String cadena, int rotor) {
		String cadenaDesencriptada = "";
		boolean cada3 = true;

		for (int i = 0; i < cadena.length(); i++) {
			if (cada3 && esCifrable(cadena.charAt(i)))
				cadenaDesencriptada = cadenaDesencriptada + Descifrar(cadena.charAt(i), rotor);
			else
				cadenaDesencriptada = cadenaDesencriptada + cadena.charAt(i);

			if ((i + 1) % 3 == 0) {
				if (cada3)
					cada3 = false;
				else
					cada3 = true;
			}
		}
		return cadenaDesencriptada;
	}

	public static String EncriptadoRotorB(String cadena, int rotor) {
		String cadenaEncriptada = "";
		if (rotorCero(rotor))
			return cadena;// En el enunciado dice que hay que asegurarse de que si el rotor es 0, tiene
							// que salir igual, por eso el B, C y D tienen esto

		for (int i = 0; i < cadena.length(); i++) {
			if (esPar(i) && esCifrable(cadena.charAt(i))) {
				cadenaEncriptada = cadenaEncriptada + Cifrar(cadena.charAt(i), rotor);
				rotor = rotor + 11;
			} else
				cadenaEncriptada = cadenaEncriptada + cadena.charAt(i);
		}
		return cadenaEncriptada;
	}


	public static String DesencriptadoRotorB(String cadena, int rotor) {
		String cadenaDesencriptada = "";

		if (rotorCero(rotor))
			return cadena;

		for (int i = 0; i < cadena.length(); i++) {
			if (esPar(i) && esCifrable(cadena.charAt(i))) {
				cadenaDesencriptada = cadenaDesencriptada + Descifrar(cadena.charAt(i), rotor);
				rotor = rotor + 11;
			} else
				cadenaDesencriptada = cadenaDesencriptada + cadena.charAt(i);
		}
		return cadenaDesencriptada;
	} 


	public static String EncriptadoRotorC(String texto, int valor) {
		String textoAlReves = "";
		String textoCifrado = "";
		char letra;
		if (rotorCero(valor))
			return texto;

		for(int i=texto.length()-1 ; i >= 0 ; i--)	textoAlReves+=texto.charAt(i);
	
		if(esPar(texto.length())){
			for (int i = 0; i < texto.length(); i++) {
				letra = textoAlReves.charAt(i);
				// Comprobamos que la posicion de la letra sea impar, para aplicarle el cifrado
				
				if (esPar(i) && esCifrable(letra)) {
					letra = Cifrar(letra, valor);
					valor += 23;
				}
				// Sea o no cifrada la letra alfinal siempre la vamos añadiendo a una nueva
				// String que esta invertida a la original
				textoCifrado += letra;
			}
		}else{
			for (int i = 0; i < texto.length(); i++) {
				letra = textoAlReves.charAt(i);
				
				if (!esPar(i) && esCifrable(letra)) {
					letra = Cifrar(letra, valor);
					valor += 23;
				}
				textoCifrado += letra;
			}
		}
		return textoCifrado;
	}

	public static String DesencriptadoRotorC(String textoCifrado, int valor) {
		String textoCasiDescifrado = "";
		String textoDescifrado = "";
		char letra;
		if (rotorCero(valor))
			return textoCifrado;

		if(esPar(textoCifrado.length())){
			for (int i = 0; i < textoCifrado.length(); i++) {
				letra = textoCifrado.charAt(i);
				// Comprobamos que la posicion de la letra sea impar, para aplicarle el cifrado
				
				if (esPar(i) && esCifrable(letra)) {
					letra = Descifrar(letra, valor);
					valor += 23;
				}
				// Sea o no cifrada la letra alfinal siempre la vamos añadiendo a una nueva
				// String que esta invertida a la original
				textoCasiDescifrado += letra;
			}
		}else{
			for (int i = 0; i < textoCifrado.length(); i++) {
				letra = textoCifrado.charAt(i);
				
				if (!esPar(i) && esCifrable(letra)) {
					letra = Descifrar(letra, valor);
					valor += 23;
				}
				textoCasiDescifrado += letra;
			}
		}

		for(int i=textoCifrado.length()-1 ; i >= 0 ; i--)	textoDescifrado+=textoCasiDescifrado.charAt(i);

		return textoDescifrado;
	}

	public static String EncriptadoRotorD(String cadena, int rotor) {
		String cadenaInversa = "";
		String cadenaEncriptada = "";
		boolean cada5 = true;
		if (rotorCero(rotor))
			return cadena;

		for (int i = cadena.length() - 1; i >= 0; i--)
			cadenaInversa = cadenaInversa + cadena.charAt(i);

		for (int i = 0; i < cadenaInversa.length(); i++) {
			if (cada5 && esCifrable(cadenaInversa.charAt(i)))
				cadenaEncriptada = cadenaEncriptada + Cifrar(cadenaInversa.charAt(i), rotor);
			else
				cadenaEncriptada = cadenaEncriptada + cadenaInversa.charAt(i);

			if ((i + 1) % 5 == 0) {
				if (cada5)
					cada5 = false;
				else
					cada5 = true;
			}
		}
		return cadenaEncriptada;
	}

	public static String DesencriptadoRotorD(String cadena, int rotor) {
		String cadenaAux = "";
		String cadenaDesencriptada = "";
		boolean cada5 = true;

		if (rotorCero(rotor))
			return cadena;

		for (int i = 0; i < cadena.length(); i++) {
			if (cada5 && esCifrable(cadena.charAt(i)))
				cadenaAux = cadenaAux + Descifrar(cadena.charAt(i), rotor);
			else
				cadenaAux = cadenaAux + cadena.charAt(i);

			if ((i + 1) % 5 == 0) {
				if (cada5)
					cada5 = false;
				else
					cada5 = true;
			}
		}

		for (int i = cadenaAux.length() - 1; i >= 0; i--)
			cadenaDesencriptada = cadenaDesencriptada + cadenaAux.charAt(i);

		return cadenaDesencriptada;
	}

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

	public static boolean esPar(int numero) {
		boolean esPar = false;
		if (numero % 2 == 0)
			esPar = true;
		return esPar;
	}

	public static void medusa(String textoCifrado) {

		System.out.println("Iniciando Desencriptado...");

		for (int a = 0; a < 100; a++) {
			for (int b = 0; b < 100; b++) {
				for (int c = 0; c < 100; c++) {
					for (int d = 0; d < 100; d++) {

						// System.out.printf("%d %d %d %d\n", d, c, b, a);
						textoCifrado = DesencriptadoRotorD(textoCifrado, d);
						textoCifrado = DesencriptadoRotorC(textoCifrado, c);
						textoCifrado = DesencriptadoRotorB(textoCifrado, b);
						textoCifrado = DesencriptadoRotorA(textoCifrado, a);

						String[] textoSeparado = textoCifrado.split("\\s+");

						if (textoSeparado.length >= 10) {
							for (int i = 0; i < textoSeparado.length; i++) {
								for (int j = 0; j < ListadoPalabras.listaPalabras().length; j++) {
									if (textoSeparado[i].equals(ListadoPalabras.listaPalabras()[j])) {
										System.out.printf("%d %d %d %d\n", d, c, b, a);
										for (String string : textoSeparado) {
											System.out.println(" " + string + " ");
										}
									}
								}
							}
						}

						// for (String palabrasDelCifrado : textoSeparado) {
						// for (String palabraDelListado : ListadoPalabras.listaPalabras()) {
						// if(palabrasDelCifrado.equals(palabraDelListado)) {
						// System.out.printf("rotorD: %d rotorC: %d rotorB: %d rotorA: %d", d, c, b, a);
						// System.out.println(textoCifrado);
						// break;
						// }
						// }
						// }
					}
				}
			}
		}
	}

	public static boolean esCifrable(char letra) {
		boolean esCifrable = false;
		if (letra >= 32 && letra <= 126) {
			esCifrable = true;
		}
		return esCifrable;
	}

	public int rotaciones(String textoCifrado, boolean esCifradoPar) {
		int rotaciones = 0;
		for (int i = 0; i < textoCifrado.length(); i++) {
			char letra = textoCifrado.charAt(i);
			if (esCifradoPar) {
				if (esPar(i)) {
					if (esCifrable(letra))
						rotaciones++;
				}
			} else {
				if (!esPar(i)) {
					if (esCifrable(letra))
						rotaciones++;
				}
			}
		}
		return rotaciones;
	}

	public static void DeseaContinuar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pulse Enter para continuar");
		String continuar = sc.nextLine();
	}

	public static int numeroLetrasCifradas(String textoCifrado, boolean esCifradoPar) {
		int rotaciones = 0;

		boolean totalDeLetrasPar = false;
		if (esPar(textoCifrado.length())) {
			totalDeLetrasPar = true;
		}

		for (int i = (textoCifrado.length() - 1); i >= 0; i--) {
			char letra = textoCifrado.charAt(i);
			if (esCifrable(letra)) {
				if ((!esCifradoPar && !totalDeLetrasPar) || (esCifradoPar && totalDeLetrasPar)) {
					// contamos las posiciones IMPARES
					if (!esPar(i)) {
						rotaciones++;
					}
				} else if ((!esCifradoPar && totalDeLetrasPar) || (esCifradoPar && !totalDeLetrasPar)) {
					// contamos las posiciones PARES
					if (esPar(i)) {
						rotaciones++;
					}

				}
			}
		}
		return rotaciones;
	}

	public static void cifrador() {
		String frase = "Hola qué paña pitóte";
		// $KHa nQOA lo?ó[nusA[Mue L=ña
		
		// go7aUnVsQ coeó-n.s) @u? Uaña
		
		// ^ñupKeXqye%u7 ócOlve"u4 >lcH
		
		// YñYhweuq ekmfwócol ekmfwYloH

		System.out.println(DesencriptadoRotorD(EncriptadoRotorD(frase, 87), 87));
		System.out.println(DesencriptadoRotorC(EncriptadoRotorC(frase, 92), 92));
		System.out.println(DesencriptadoRotorB(EncriptadoRotorB(frase, 31), 31));
		System.out.println(DesencriptadoRotorA(EncriptadoRotorA(frase, 59), 59));

	}

	public static void pruebaCifrado() {
		String textoCifrado = ";7j6M42]-v[G9ó`7.%dUsP7C)Qñ^";
		textoCifrado = DesencriptadoRotorD(textoCifrado, 87);
		textoCifrado = DesencriptadoRotorC(textoCifrado, 92);
		textoCifrado = DesencriptadoRotorB(textoCifrado, 31);
		textoCifrado = DesencriptadoRotorA(textoCifrado, 59);

		System.out.println(textoCifrado);
	}

	public static void Adios() {
		System.out.println("██████████████████████████████████████████");
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println("█░░░░░ (Referencia a antiguo saludo ░░░░░█");
		System.out.println("█░░░░░  Nacional Socialista Alemán) ░░░░░█");
		System.out.println("█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█");
		System.out.println("██████████████████████████████████████████");
	}
}