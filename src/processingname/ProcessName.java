package processingname;

import java.util.Scanner;


public class ProcessName {
   
    
public static void main(String[] args) {
        // Digite seu nome e seu sobrenome na caixa de texto
        // Ele abreviará seu nome
    
        Scanner console = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        
        String name = console.nextLine();
        int space = name.indexOf(" ");
        System.out.println(space);
        String first = name.substring(0, space);
        String last = name.substring(space + 1, name.length());
        String firstInitial = first.substring(0, 1);
        name = last + "," + firstInitial + "." ;
        System.out.println("seu nome e: " + name);
    }
}
