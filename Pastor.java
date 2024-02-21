import java.text.DecimalFormat;
import java.util.Scanner;

public class Pastor {

    public static void main(String[] args) {
        int table[][] = new int[3][4];
        int ovWhite = 0, ovBrown = 0, ovBlack = 0;
        int PrWhite = 2000, PrBrown = 2600, PrBlack = 2400;
        Scanner inp = new Scanner(System.in);

        // branca 120kg R$2.000
        // pardas 180kg R$2.600
        // pretas 150kg R$2.400

        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < 1; j++) {

                System.out.println("Quantas ovelhas brancas tem no rebanho: ");
                ovWhite = inp.nextInt();
                table[0][0] = ovWhite;

                System.out.println("Quantas ovelhas pardas tem no rebanho: ");
                ovBrown = inp.nextInt();
                table[1][0] = ovBrown;

                System.out.println("Quantas ovelhas pretas tem no rebanho: ");
                ovBlack = inp.nextInt();
                table[2][0] = ovBlack;

                table[0][1] = 120;
                table[1][1] = 180;
                table[2][1] = 150;

                table[0][2] = 2000;
                table[1][2] = 2600;
                table[2][2] = 2400;

                table[0][3] = ovWhite * PrWhite;
                table[1][3] = ovBrown * PrBrown;
                table[2][3] = ovBlack * PrBlack;

            }
        }
        System.out.println("\n\n\n _______________TABELA DE OVELHAS__________________");
        System.out.println(
                "|                                                  |\n|             #1ª Linha: ovelha branca.            |\n|             #2ª Linha: ovelha parda.             |\n|            #3ª Linha: ovelha preta.              |\n|__________________________________________________|\n|                                                  |");
        System.out.println("|Quantidade:_" + "Peso:_________" + "Preço:________" + "Total:____|");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("|" + table[i][j] + "     |    ");
            }
            System.out.println();
        }

        System.out.println("|__________________________________________________|");
        System.out.println("|Peso p/ cor: " + ovWhite * 120 + "Kg branca," + ovBrown * 180 + "Kg marrom,"
                + ovBlack * 150 + "Kg preto|");
        System.out.println("|Peso total do rebanho:"
                + ((ovWhite * 120) + (ovBrown * 180) + (ovBlack * 150)) + "Kg                       |");
        System.out.println("|__________________________________________________|");
    }
}