import java.util.Scanner;
public class Ex1{
    public static void main(String[] args) {
    float x;
    Scanner resultado = new Scanner(System.in);
    System.out.println("Digite um numero para X:");
    x=resultado.nextFloat();

    while(x != 1){

    if(x%2==0){
        x=x/2;
    }
    else{
        x = 3 * x + 1;
    }
    System.out.print("-> "+x);
}

    
}}
