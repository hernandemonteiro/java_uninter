import java.util.Hashtable;
import java.util.Scanner;

import controllers.UserController;

public class App {
    public static void main(String[] args) throws Exception {
        int idade = 20;

        System.out.println("Hello, World!");
        System.out.println(idade + "\n");

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Digite seu nome: ");
        // String nome = scanner.nextLine();

        // System.out.println("Seu nome é " + nome + "!");
        // scanner.close();

        int peso = 93;
        double altura = 1.81;
        double imc = peso / (altura * altura);

        System.out.println(String.format("Seu IMC é %.2f!", imc));

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }

        UserController userController = new UserController();
        userController.put("José", 20);
        userController.put("Maria", 30);
        userController.put("João", 40);

        Hashtable<String, Integer> users = userController.show();
        System.out.println(users.get("José"));
        // for (int i = 0; i <= idade; i++) {
        // System.out.println(i);
        // }
    }
}
