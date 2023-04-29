public class Calculadora{

    float n1;
    float n2;

    public Calculadora (float n1, float n2){
        this.n1= n1;
        this.n2=n2;
    }
public void sumar(){

    float sum = n1+n2;
    System.out.println("La suma es igual a : "+ sum);
}
public void resta(){

    float res = n1-n2;
    System.out.println("La resta es igual a : "+ res);
}

public void multiplicacion(){

    float mult = n1*n2;
    System.out.println("La multiplicacion es igual a : "+ mult);
}

public void division(){

    float div = n1/n2;
    System.out.println("La division es igual a : "+ div);
}

public double exponencial() {
    double resultado = Math.pow(this.n1, this.n2);
    System.out.println(this.n1 + "^" + this.n2 + " = " + resultado);
    return resultado;
}
}