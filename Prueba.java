public class Prueba {
    public static void main(String[] args) {
        System.out.println();
        String texto =  "á bcd éóúífg";
        String texto2 = "á bcd éóúífg ";
        String textoCifrado = "";
        String textoCifrado2 = "";

        String cifrado = "$opi9n=lgA*l' Geoanr CUeQ iu-ut {305L3OeTrmf$I";


        
        // for (int i = texto.length() - 1; i >= 0; i--) {
        //     char letra = texto.charAt(i);
        //     textoCifrado += letra;
        // }

        // for (int i = texto2.length() - 1; i >= 0; i--) {
        //     char letra = texto2.charAt(i);
        //     textoCifrado2 += letra;
        // }

        
        System.out.println(Enigma.DesencriptadoRotorC(cifrado, 85));

        // int numero1 = contadorRotacionesCifrado(textoCifrado, true); 
        // int numero2 = contadorRotacionesCifrado(textoCifrado, false); 
        // int numero3 = contadorRotacionesCifrado(textoCifrado2, true); 
        // int numero4 = contadorRotacionesCifrado(textoCifrado2, false); 
        // System.out.println(numero1);
        // System.out.println(numero2);
        // System.out.println(numero3);
        // System.out.println(numero4);

        String cifradoB = "Hola soy Pablo un maquinita total, capitan, fiero terrateniente malagueño";
        // System.out.println(
        //     Enigma.EncriptadoRotorC(cifradoB, 85)
        // );

        // String cifradaB = ">oma(s#y>P+bAo_uY caruqn|t  >oIaL,jcWpjtin? %i/rD Te]rWtfnqe\"t$ 7aAaGuPñe";
        // String cifradaC = "oçe#g&l=mre~n'iGedayr$tUo_emf;,Aa^iqa{ [lHtmt5aAiRipqsmInV glqav Woh ml3H";

        System.out.println(Enigma.DesencriptadoRotorD(Enigma.EncriptadoRotorD(cifradoB, 85), 85));

    }

    public static int contadorRotacionesCifrado(String textoCifrado, boolean esCifradoPar) {
        int rotaciones = 0;

        boolean totalDeLetrasPar = false;
        if (Enigma.esPar(textoCifrado.length())) {
            totalDeLetrasPar = true;
        }

        for (int i = (textoCifrado.length() - 1); i >= 0; i--) {
            char letra = textoCifrado.charAt(i);
            if (Enigma.esCifrable(letra)) {
                if ((!esCifradoPar && !totalDeLetrasPar) || (esCifradoPar && totalDeLetrasPar)) {
                    //contamos las posiciones IMPARES
                    if(!Enigma.esPar(i)) {
                        rotaciones++;
                    }
                } else if ((!esCifradoPar && totalDeLetrasPar) || (esCifradoPar && !totalDeLetrasPar)) {
                    //contamos las posiciones PARES
                    if(Enigma.esPar(i)) {
                        rotaciones++;
                    }

                }
            }
        }
        return rotaciones;
    }
}
