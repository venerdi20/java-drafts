package lambdas;

import lambdas.interfaces.MyFunction;

import java.util.ArrayList;
import java.util.List;

public class FunctionExample {
    static boolean isContains(MyFunction function, List<String> stringList, String str) {
        return function.func(stringList, str);
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("-01-");
        stringList.add("-02-");
        stringList.add("-03-");
//        MyFunction function = List::contains;
        MyFunction function = (l, s) -> {
            return l.contains(s);
        };
        System.out.println(isContains(function, stringList, "-03-"));
        System.out.println(isContains(function, stringList, "-04-"));
    }
}
