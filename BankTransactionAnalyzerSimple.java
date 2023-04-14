import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "bank-statement-analyzer/resources";

    public static void main (final String... args) throws IOException{
        final BankStatementCSVParser bankStatementCSVParser = new BankStatementCSVParser();
        final String fileName = args[0];
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);
        final List<BankTransaction> bankTransactions = bankStatementCSVParser.parseLineFromCSV(lines);
        System.out.println("The total for all transaction is " + calculateTotalAmount(bankTransactions));


    }

    public static  double calculateTotalAmount(final List<BankTransaction> bankTransactions){
        double total = 0d;
        for (final BankTransaction bankTransaction : bankTransactions){
            total += bankTransaction.getAmount();
        }
        return total;
    }


}
