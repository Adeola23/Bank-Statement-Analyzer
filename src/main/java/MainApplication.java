package src.main.java;

import src.main.java.BankStatementCSVParser;
import src.main.java.BankStatementParser;
import src.main.java.BankTransactionAnalyzerSimple;

import java.io.IOException;

public class MainApplication {
    public  static  void main(final String... args) throws IOException{
        final BankTransactionAnalyzerSimple bankTransactionAnalyzer = new BankTransactionAnalyzerSimple();
        final BankStatementParser bankStatementParser = new BankStatementCSVParser();
        bankTransactionAnalyzer.analyze(args[0], bankStatementParser);
    }
}
