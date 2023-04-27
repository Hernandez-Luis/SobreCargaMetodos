import java.util.Scanner;

public class Operaciones {
    public void op(){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Acciones acciones = new Acciones();
        Muestra muestra = new Muestra();

        int x = 0,c,d;
        String a,b;
        float A,B;
        Integer C,D;

        while (x!=5){
            x = menu.lista(scanner);
            switch (x){
                case 1:
                    muestra.pregunta1();
                    a = scanner.next();
                    muestra.pregunta2();
                    b = scanner.next();
                    System.out.println("Suma: " + acciones.operacion(a,b));
                    break;
                case 2:
                    muestra.pregunta1();
                    c = scanner.nextInt();
                    muestra.pregunta2();
                    d = scanner.nextInt();
                    System.out.println("Resta: " + acciones.operacion(c,d));
                    break;
                case 3:
                    muestra.pregunta1();
                    C = scanner.nextInt();
                    muestra.pregunta2();
                    D = scanner.nextInt();
                    System.out.println("Multiplicacion: " + acciones.operacion(C,D));
                    break;
                case 4:
                    muestra.pregunta1();
                    A = Float.parseFloat(scanner.next());
                    muestra.pregunta2();
                    B = Float.parseFloat(scanner.next());
                    System.out.println("Division: " + acciones.operacion(A,B));
                    break;
                case 5:
                    System.out.println("Saliste del programa");
                    break;
                default:
                    System.out.println("Esta opcion no existe");
            }
        }
    }
}
