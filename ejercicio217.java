import java.util.Scanner;

public class Ejercicio217
{

public static void main(String[] args)
{

Scanner entrada = new Scanner(System.in);
int num1;
int num2;
int num3;
int suma;
int promedio;
int producto;



System.out.print("Ingrese el primer numero entero: ");
num1 = entrada.nextInt();

System.out.print("Ingrese el segundo numero entero: ");
num2 = entrada.nextInt();

System.out.print("Ingrese el tercer numero entero: ");
num3 = entrada.nextInt();

suma = num1 + num2 + num3;
promedio = suma / 3;
producto = num1 * num2 * num3;

if (num1 > num2 && num1 > num3)
System.out.printf("la suma de los enteros es: %d\nEl promedio de los enteros: %d\nEl producto de los enteros: %d\n %d es el mayor de los enteros ",
suma,promedio, producto, num1);

if (num2 > num1 && num2 > num3)
System.out.printf("la suma de los enteros es: %d\nEl promedio de los enteros: %d\nEl producto de los enteros: %d\n %d es el mayor de los enteros ",
suma,promedio, producto, num2);
if (num3 > num1 && num3 > num2)
System.out.printf("la suma de los enteros es: %d\nEl promedio de los enteros: %d\nEl producto de los enteros: %d\n %d es el mayor de los enteros\n ",
suma,promedio, producto, num3);

if (num1 < num2 && num1 < num3)
System.out.printf("%d es el menor de los enteros ", num1);

if (num2 < num1 && num2 < num3)
System.out.printf("%d es el menor de los enteros ",num2);
if (num3 < num1 && num3 < num2)
System.out.printf("%d es el menor de los enteros ",num3);









}

}
