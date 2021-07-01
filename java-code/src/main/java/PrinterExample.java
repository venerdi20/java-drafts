import interfaces.MyPrinter;

import java.util.ArrayList;
import java.util.List;

public class PrinterExample {
    static void print(MyPrinter printer, List<String> stringList) {
        printer.func(stringList);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("-01-");
        stringList.add("-02-");
        stringList.add("-03-");
        MyPrinter listPrinter = (l) -> {
            for (String str : l) System.out.println(str);
        };
        print(listPrinter, stringList);
    }
}
