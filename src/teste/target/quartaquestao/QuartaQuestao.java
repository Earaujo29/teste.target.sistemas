package teste.target.quartaquestao;

public class QuartaQuestao {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48 ; 
        double outros = 19849.53;

        double faturamentoTotal = sp + rj + mg + es + outros ; 

        double porcentagemSP = (sp / faturamentoTotal) * 100;
        double porcentagemRJ = (rj / faturamentoTotal) * 100;
        double porcentagemlMG = (mg / faturamentoTotal) * 100;
        double porcentagemlES = (es / faturamentoTotal) * 100;
        double porcentagemOutros = (outros / faturamentoTotal) * 100;

        System.out.printf("Porcentagem total de São Paulo: %.2f%%\n", porcentagemSP);
        System.out.printf("Porcentagem total de Rio de Janeiro: %.2f%%\n", porcentagemRJ);
        System.out.printf("Porcentagem total de Minas Gerais: %.2f%%\n", porcentagemlMG);
        System.out.printf("Porcentagem total de Espirto Santo: %.2f%%\n", porcentagemlES);
        System.out.printf("Percentual de Outros: %.2f%%\n", porcentagemOutros);

    }
}
