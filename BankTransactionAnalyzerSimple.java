import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "bank-statement-analyzer/resources";

    public static void main (final String... args) throws IOException{
        final Path path = Paths.get(RESOURCES + args[0]);
        final List<String> lines = Files.readAllLines(path);

        double total = 0d;
        double totalJan = 0d;
        final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (final String line : lines){
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            final LocalDate date = LocalDate.parse(columns[0]);
            if(date.getMonth() == Month.JANUARY){
                final double amountJan = Double.parseDouble(columns[1]);
                totalJan += amountJan;
            }
            total += amount;
        }




        System.out.println("The total for all transaction is " + total);


    }


}
