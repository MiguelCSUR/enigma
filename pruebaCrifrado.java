public class pruebaCrifrado {
    public static void main(String[] args) {
        String textoCifrado = "asda completar sbdkjjl;adj sbjajhsk bjfskd flsd;";
        String[] textoSeparado = textoCifrado.split("\\s+");

        if (textoSeparado.length > 3) {
            //mínimo el texto esta conformado por 4 palabras
            for (int i = 0; i < textoSeparado.length; i++) {
                //analizamos todas las palabras
                if (textoSeparado[i].length() < 15) {
                    //analizamos que las palabras no excedan 16 de letras
                    for (int j = 0; j < ListadoPalabras.listaPalabras().length; j++) {
                        if (textoSeparado[i].equals(ListadoPalabras.listaPalabras()[j])) {
                            // System.out.printf("%d %d %d %d\n", d, c, b, a);
                            System.out.println("encontrado");
                            for (String string : textoSeparado) {
                                System.out.print(" " + string + " ");
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
