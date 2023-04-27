import java.util.Scanner;

public class Menu {
    public int lista(Scanner scanner){
        System.out.println("- - M E N U - -");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        System.out.println("5.- Salir");
        return scanner.nextInt();
    }
}
