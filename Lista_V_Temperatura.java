import java.util.Scanner;

public class Lista_V_Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int total = 12;

        for (int i = 1; i <= total; i++) {
            System.out.print("Digite a temperatura " + i + " (entre 4 e 10): ");
            double temp = sc.nextDouble();

            while (temp < 4 || temp > 10) {
                System.out.println("Valor inválido! Digite entre 4 e 10:");
                temp = sc.nextDouble();
            }

            soma = soma + temp;
        }

        double media = soma / total;
        System.out.println("️ Média das temperaturas: " + media + " °C");
    }
}
