package LDecisao;
import java.util.Scanner;
public class DQuatro {
	public static void main(String[] args) {
		
		
		Scanner fofolete= new Scanner(System.in);
		int num;
       
		    System.out.println("Digite o primeiro n�mero:  ");
            num=fofolete.nextInt();
        
         
        if(num%2==0)
        {  
        	System.out.println("Voc� informou um n�mero par ");
            System.out.println( Math.sqrt(num));
        
         
        }
        else
        {  
        	System.out.println("Voc� informou um n�mero �mpar" );
            System.out.println(Math.pow(num, 2));
        }
}
}
