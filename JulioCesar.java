import java.util.Scanner;

public class JulioCesar{
	static Scanner ingresa = new Scanner(System.in);
	static String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	public static void main(String args[]){
		System.out.println("Ingrese el texto a cifrar ");
        String texto = ingresa.nextLine();
		String convierte = texto.toUpperCase();
		System.out.println("Texto: "+convierte);
        System.out.println("Texto cifrado: "+CifrarJC(convierte,23));
	}
	public static String CifrarJC(String entrada,int desp){ 
        String salida = ""; 
        for(int i = 0;i<entrada.length();i++)
                salida += alfabeto.charAt(( alfabeto.indexOf(entrada.charAt(i)) +desp)%alfabeto.length()); 
        return salida; 
    } 
 
} 
