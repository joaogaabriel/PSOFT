import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("|-----------------------------|\n");
        System.out.print("| (1) - Cadastrar produtos    |\n");
        System.out.print("| (2) - Cadastrar lotes          |\n");
        System.out.print("| (3) - Listar produtos         |\n");
        System.out.print("| (4) - LIstar lotes              |\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: ");

        int operação = x.nextInt();
    }
}
