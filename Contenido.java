public class Contenido {
    public static void main(String[] args) {
        String phrase = "Hoaasdiapfniajlfiafjdjsifafhsi panzer podafdosjihdfjdp[oafpdsojfihfjdkp[afojsid";
        String[] wordsKey = {"panzer", "moto"};
        String[] words = phrase.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            boolean contains = false;
            for (int j = 0; j < wordsKey.length; j++) {
                if (words[i].equals(wordsKey[j])) {
                    contains = true;
                }
            }
            if (contains) {
                System.out.println();
                System.out.println("contiene la plabra");
            }
        }
    }
}
