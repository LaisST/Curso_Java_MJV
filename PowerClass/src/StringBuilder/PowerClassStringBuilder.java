package StringBuilder;

public class PowerClassStringBuilder {
	public static void main(String[] args) {
		  
	    StringBuilder frase = new StringBuilder ("MJV School");
	    // Print da frase completa;
	    System.out.println("Frase Completa: " + frase); 
	    
	    //Método delete(): Remove caracteres da sequência e retorna uma referência ao StringBuilder atual.
	    frase.delete(0,3);
	    // Print da frase com o delete do indice 0 ao 3;
	    System.out.println("Frase com delete(): " + frase); 
	    
	    //Método insert(): adiciona caracteres ao StringBuilder no indice solicitado.
	    frase.insert(0,"M");
	    frase.insert(1,"J");
	    frase.insert(2,"V");
	    //Print da frase com os caracteres adicionados
	    System.out.println("Frase com insert(): " + frase);
	    
	    //setCharAt: Substitui os caracteres de acordo com o indice informado;
	    frase.setCharAt(0, 'R');
	    frase.setCharAt(1, 'B');
	    frase.setCharAt(2, 'D');
	    //Print da frase com substituição de caracteres
	    System.out.println("Frase com setCharAt(): " + frase);
	    
	    //fonte: https://www.devmedia.com.br/a-classe-stringbuilder-em-java/25609
	    //fonte: https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
	        }
	}
