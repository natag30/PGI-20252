public class InvertirPalabra {

    public static String invertirNombre(String nombre) {

        String palabraInvertida="";

        for (int i = 0; i <= nombre.length()-1; i++) {
            palabraInvertida+=nombre.charAt(nombre.length()-1-i);
        }
        return palabraInvertida;
        }
}

public static void main(String[] args) {

    System.out.println(InvertirPalabra.invertirNombre("raul"));
}