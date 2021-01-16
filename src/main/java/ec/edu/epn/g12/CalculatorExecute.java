package ec.edu.epn.g12;

public class CalculatorExecute {
    public static void main(String[] args){
        System.out.println("== Calculadora Ejecución ==");
        Calculator c = new Calculator();
        int addition= c.addition(8,9);
        System.out.println("c.addition(8,9)="+addition);

        int substraccion = c.substraction(11,3);
        System.out.println("c.substraccion(11,3)="+substraccion);

        int mutiplicacion= c.multiplication(8,7);
        System.out.println("c.substraccion(8,7)="+mutiplicacion);
        int division = c.division(40,5);
        System.out.println("c.substraccion(40,5)="+division);

        int expo = c.division(40,5);
        System.out.println("c.exponentiatios(40,5)="+expo);





    }
}
