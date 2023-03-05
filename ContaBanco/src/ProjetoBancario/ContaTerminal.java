package ProjetoBancario;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        System.out.println("Por favor, informe o número da agência: ");
        numero = scanner.nextInt();
        
        System.out.println("Agora informe o nome da agência bancária: ");
        agencia = scanner.next();
        
        System.out.println("A seguir, informe um nome: ");
        nomeCliente = scanner.next();
        
        System.out.println("Agora, informe um saldo bancário: ");
        saldo = Double.parseDouble(scanner.next());
        
        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque!");
        
        scanner.close();
    }

}