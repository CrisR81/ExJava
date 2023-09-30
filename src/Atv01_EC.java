import java.util.Scanner;

public class Atv01_EC {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // final = const
        System.out.print("Digite a primeira nota: ");
        final float primeira_nota = leitor.nextFloat();

        System.out.print("Digite a segunda nota: ");
        final float segunda_nota = leitor.nextFloat();

        var media = (primeira_nota + segunda_nota) / 2;

        if (media >= 6) {
            System.out.println("Meus parabéns!!");
        } else {
            System.out.println("Você nao passou. Estude um pouco mais!");
        }

    }
}