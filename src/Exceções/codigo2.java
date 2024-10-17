import java.util.Scanner;

public class codigo2 {
    public class Principal {
        public static void main ( String args [ ] ) throws InterruptedException {
            int divisor , dividendo , quociente = 0;
            String controle = "s";
	        
            Scanner s = new Scanner ( System.in );
            do {    
                System.out.println ( "Entre com o dividendo." );
                dividendo = s.nextInt();
                System.out.println ( "Entre com o divisor." );
                divisor = s.nextInt();
                quociente = dividendo / divisor;
                System.out.println ( "O quociente é: " + quociente );
                System.out.println ( "Repetir?" );
                controle = s.next().toString();
            } while ( controle.equals( "s" ) );
            s.close();
        }    
    }   
}
