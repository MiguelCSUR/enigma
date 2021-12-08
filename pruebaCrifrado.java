public class pruebaCrifrado {
    public static void main(String[] args) {
        int codigo = (int)'a';
        int valor = 10000000;

        int desplazamiento = codigo - valor % 95;
        System.out.println(desplazamiento);
    }
}
