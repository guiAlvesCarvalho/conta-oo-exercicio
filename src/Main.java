import model.ContaInvestimento;
import model.ContaPoupanca;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoMenu;
        int opcaoConta;
        ContaPoupanca cp = null;
        ContaInvestimento ci = null;

        do {
            System.out.println();
            System.out.println("1.Abrir Conta");
            System.out.println("2.Sacar");
            System.out.println("3.Depositar");
            System.out.println("4.Mostrar Saldo");
            System.out.println("0.Sair");
            opcaoMenu = input.nextInt();

            if (opcaoMenu == 1) {
                System.out.println("Qual tipo de conta quer criar?\n1.Poupança\n2.Investimento");
                opcaoConta = input.nextInt();
                if (opcaoConta == 1) {
                    cp = new ContaPoupanca();
                    System.out.println("Conta Poupança criada");
                } else if (opcaoConta == 2) {
                    ci = new ContaInvestimento();
                    System.out.println("Conta Investimento criada");
                } else {
                    System.out.println("Digite um número válido");
                }

            } else if (opcaoMenu == 2) {

            } else if (opcaoMenu == 3) {

            } else if (opcaoMenu == 4) {
                System.out.println("Qual tipo de conta?\n1.Poupança\n2.Investimento");
                opcaoConta = input.nextInt();
                if (opcaoConta == 1) {
                    if ((cp != null)) {
                        System.out.println("Saldo Conta Poupança : R$" + cp.getSaldo());
                    } else {
                        System.out.println("Você não possui esta conta");
                    }
                } else if (opcaoConta == 2) {
                    if ((ci != null)) {
                        System.out.println("Saldo Conta Investimento : R$" + ci.getSaldo());
                    } else {
                        System.out.println("Você não possui esta conta");
                    }
                } else System.out.println("Digite um número válido");
            }
        } while (opcaoMenu != 0);

    }
}