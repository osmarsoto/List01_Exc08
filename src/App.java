import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
        //Calcule e mostre o total do seu salário no referido mês.
        
        double valorh, horas, salario;
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o valor que ganho por hora: ");
        valorh = sc.nextDouble();
        System.out.println("");
        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        horas = sc.nextDouble();

        salario = valorh * horas;

        System.out.print("O valor do seu salario este mês é: "+salario);

        sc.close();

    }
}
