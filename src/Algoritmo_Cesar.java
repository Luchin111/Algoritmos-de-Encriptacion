import java.util.Scanner;

public class Algoritmo_Cesar {
    public static void main(String[] args){

        //Utilizamos Metodo de entrada Scanner
        Scanner S=new Scanner(System.in);
        /*String a;
        System.out.println("Introduce una frase: ");
        a=S.nextLine();

        System.out.println(a);*/

        String frase,encriptado;

        encriptado="";

        int desplazamiento;

        String min="abcdefghijklmnopqrstuvwxyz ";
        String may="ABCDEFGHIJKLMNOPQRSTUVWXYZ ";

        System.out.println("Introduce una frase: ");//Empieza A Programar
        frase=S.nextLine();

        System.out.println("Introduce una clave de desplazamiento: ");
        desplazamiento=S.nextInt();

        for (int i=0;i<frase.length();i++){
            for (int j=0;j<min.length();j++){
                if (frase.charAt(i)==min.charAt(j)){
                    if (j+desplazamiento>=min.length()){
                        encriptado+=min.charAt((j+desplazamiento) % min.length()); //30 % 25  = 5  El resto de la division
                    }
                    else {
                        encriptado+=min.charAt(j+desplazamiento);
                    }
                }
                else if(frase.charAt(i)==may.charAt(j)) {
                    if (j + desplazamiento >= may.length()) {
                        encriptado += may.charAt((j + desplazamiento) % may.length()); //30 % 25  = 5  El resto de la division
                    } else {
                        encriptado += may.charAt(j + desplazamiento);
                    }

                }
            }
        }
        System.out.println("La frase es : "+frase);
        System.out.println("Frase encriptada : "+encriptado);
    }
}