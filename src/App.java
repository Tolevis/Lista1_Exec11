import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
     
     int numero1,numero2,numeroReal;
     double a,b,c;
    
     System.out.print("Digite um numero inteiro: ");
     numero1 = entrada.nextInt();
     
     System.out.print("Digite outro numero inteiro: ");
     numero2 = entrada.nextInt();
     
     System.out.print("Digite um numero real: ");
     numeroReal = entrada.nextInt();
     
     a = numero1*2 + numero2/2;
     System.out.print("a respota A: " + a);
     
     b = numero1*3 + numeroReal;
     System.out.print("a respota B: " + b);
     
     c = numeroReal*numeroReal*numeroReal;
     System.out.print("a respota C: " + c);
     
     entrada.close();   
    }
}
