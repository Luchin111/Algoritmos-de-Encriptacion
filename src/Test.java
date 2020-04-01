public class Test {
    public static void main(String[] args){
        Vigenere texto = new Vigenere("Esto es un mensaje cifrado", "melon");
        String txtCifrado = texto.Cifrar();
        System.out.println(txtCifrado);
        Vigenere descifrar = new Vigenere(txtCifrado, "melon");
        String txtDescifrado = descifrar.DesCifrar();
        System.out.println(txtDescifrado);
    }
}
