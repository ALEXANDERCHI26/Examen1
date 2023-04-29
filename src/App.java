import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("EXAMEN ERICK ALEXANDER HAU CHI");

        int op=0;
       
        Scanner  e = new Scanner(System.in);
        


        
        System.out.println("SELECCIONE UNA OPERACION");
        System.out.println(" 1- SUMA");
        System.out.println(" 2- RESTA");
        System.out.println(" 3- MULTIPLICACION");
        System.out.println(" 4- DIVISION");
        System.out.println(" 5-EXPONENCIAL");
        System.out.println(" 6-SALIR");
        

        op = e.nextInt();

        switch(op){
            case 1:

            System.out.println("Escribe el primer numero");
            float n1 = e.nextFloat();
            System.out.println("Escribe el segundo numero");
            float n2 = e.nextFloat();
            
            Calculadora calculadora = new Calculadora( n1,n2);
            calculadora.sumar();
            break;
            case 2:

            System.out.println("Escribe el primer numero");
             n1 = e.nextFloat();
            System.out.println("Escribe el segundo numero");
             n2 = e.nextFloat();

            Calculadora calculadoraR = new Calculadora( n1,n2);
            calculadoraR.resta();
            break;
            case 3:

            System.out.println("Escribe el primer numero");
            n1 = e.nextFloat();
            System.out.println("Escribe el segundo numero");
            n2 = e.nextFloat();
            Calculadora calculadoraM = new Calculadora( n1,n2);
            calculadoraM.multiplicacion();
            case 4:

            System.out.println("Escribe el primer numero");
            n1 = e.nextFloat();
            System.out.println("Escribe el segundo numero");
            n2 = e.nextFloat();

            Calculadora calculadoraD = new Calculadora( n1,n2);
            calculadoraD.division();
            break;

            case 5:
            System.out.println("Escribe el primer numero");
            n1 = e.nextFloat();
            System.out.println("Escribe el segundo numero");
            n2 = e.nextFloat();

            Calculadora calculadoraE = new Calculadora( n1,n2);
            calculadoraE.exponencial();
            break;
            case 6:
            System.out.println("SALIR DE CALCULADORA");
            
            default:
             System.out.println("NO DISPONIBLE");
             break;
    
        } 
    




    }


}

    
