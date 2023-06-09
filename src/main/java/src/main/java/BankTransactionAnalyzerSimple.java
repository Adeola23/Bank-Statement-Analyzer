package src.main.java;

import src.main.java.BankStatementParser;
import src.main.java.BankStatementProcessor;
import src.main.java.BankTransaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "bank-statement-analyzer/resources/";

    public void analyze(final String fileName, final BankStatementParser bankStatementParser) throws IOException{
        final Path path = Paths.get(RESOURCES + fileName);
        final List<String> lines = Files.readAllLines(path);
        final List<BankTransaction> bankTransactions = bankStatementParser.parseLineFrom(lines);
        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
        collecSummary(bankStatementProcessor);
    }

    private  static void collecSummary(final BankStatementProcessor bankStatementProcessor){
        System.out.println("The total for all transaction is " + bankStatementProcessor.calculateTotalAmount());
        System.out.println("Transactions in January " + bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));
        System.out.println("The total salary received is " + bankStatementProcessor.calculateTotalForCategory("Salary"));


    }






}
