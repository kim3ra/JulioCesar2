public class JulioCesar {

    static String cifrarJC(String valor, int des) {
	
	    char[] buffer = valor.toCharArray();


			for (int i = 0; i < buffer.length; i++) {

	    
	    		char letra = buffer[i];
	    		letra = (char) (letra - des);
	    
	    		if (letra > 'Z') {
					letra = (char) (letra - 26);
	    	} 

	    		else if (letra < 'A') {
					letra = (char) (letra + 26);
	   		 }
	   		 	buffer[i] = letra;
	}
	
			return new String(buffer);
    	}

    			public static void main(String[] args) {

	
				    System.out.println();
				    String a = "HOLA";
				    System.out.println("Mensaje original: "+a);
				    System.out.println();

	
				    String c = cifrarJC(a, 3);
	
				    System.out.println("Mensaje Cifrado: "+c);

	
				    /*Profesor:
				    Esta sección se la anexo como parte de la lógica 
			    	para descifrar el mensaje.
	
				    String d = cifrarJC(c, -3);
				    System.out.println();
				    System.out.println(d);
				    */
	
    		}
		}
