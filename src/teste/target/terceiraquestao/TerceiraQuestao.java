package teste.target.terceiraquestao;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;


public class TerceiraQuestao {
    public static void main(String[] args) {
        
    //Declarando variaveis 

        String arquivoJson = "C:\\dados.json";
        List<Double> faturamentos = new ArrayList<>();
        double menorFaturamento ;
        double maiorFaturamento ;
        double somaFaturamento ;
        double mediaFaturamento ;

    // iniciando tratamento do arquivo Json

        try (FileReader reader = new FileReader(arquivoJson)) {
            JsonElement jsonElement = JsonParser.parseReader(reader);
            JsonArray jsonArray = jsonElement.getAsJsonArray();

            for (JsonElement element : jsonArray) {
                JsonObject obj = element.getAsJsonObject();
                if (obj.has("valor") && !obj.get("valor").isJsonNull()) {
                    faturamentos.add(obj.get("valor").getAsDouble());
                }
            }

    //Usando Collections para separar o menor e o maior valor de faturamento.
     
            menorFaturamento = Collections.min(faturamentos);
            maiorFaturamento = Collections.max(faturamentos);
            somaFaturamento = faturamentos.stream().mapToDouble(Double::doubleValue).sum();
            mediaFaturamento = somaFaturamento / faturamentos.size();

            long diasAcimaMedia = faturamentos.stream().filter(f -> f > mediaFaturamento).count();

            System.out.println("Esse foi o menor faturamento: " + menorFaturamento);
            System.out.println("Esse foi o maior faturamento " + maiorFaturamento);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaMedia);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}