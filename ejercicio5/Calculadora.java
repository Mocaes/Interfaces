package ejercicio5;

public class Calculadora implements Operaciones{
	
@Override
public int sumar(int a, int b) {
return a+b;
}

@Override
public int restar(int a, int b) {
return a-b;
}

@Override
public int multiplicacion(int a,int b) {
return a*b;
}

@Override
public int division(int a, int b) {
	return a/b;
}

public double potencia (double a , double b) {
	return Math.pow(a, b);
}
public double raiz ( double a) {
	return Math.sqrt(a);
}
}