import java.util.Scanner;

public class JulioCesar {

    static  String alfabeto = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
    //Key por default
    //static  int key = 3;
   //Como quedara el alfabeto: XYZABCDEFGHIJKLMNOPQRSTUVW 
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String msgCifrado;
        System.out.println("Cifrado de Julio Cesar.:.MejiaMartinezBrandon.:.Seguridad de Software \n ");
        System.out.println("Inserta el mensaje secreto a cifrar: (En mayusculas) ");
        String mensaje = scanner.nextLine();
        System.out.println("Insert the 'secret key' (Veces que se recorrera el alfabeto): ");
        int key = scanner.nextInt();
        msgCifrado = cifrarJC(mensaje, key);
       
        //Desplegando el mensaje
        System.out.format("El mensaje inicial es: %s\n", mensaje);
        System.out.format("El mensaje cifrado es: %s\n", msgCifrado);
        
    }
    
    public static String cifrarJC(String mensaje, int key){
        //Mensaje a cifrar
        String msgCifrado = "";
        //varible auxiliar 
        int pos;

        //Recorriendo el mensaje con el key y el alfabeto
        for(int i = 0; i < mensaje.length(); i++) {
            pos = alfabeto.indexOf(mensaje.charAt(i));
            int val = (pos+key) % (26);
            char replace = alfabeto.charAt(val);
            msgCifrado = msgCifrado+replace;
        }
        return msgCifrado;
    }
   
}
