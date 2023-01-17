package org.example;

import java.util.*;

public class Utils {

    public static int divide(int a, int b) {
        return a / b;
        //return 0;
    }

    public static List<Integer> reverse(List<Integer> numbers) {

/*        List<Integer> revList = new ArrayList<>();

        for(int i = numbers.size(); i > 0; i--){
            int n = numbers.get(i - 1); // här måste man ta INDEX i minus 1 eftersom vår lista börjar på 3 men index 3 finns inte, 0 , 1 ,2 jue....
            revList.add(n);
        }

        return revList;*/

        // Collections.reverse(numbers); en annan lösning, fungerar dock inte eftersom List.of är immutable

        // Refactoring med Stream, är lättare o läsa
        return numbers
                .stream()
                .sorted(Comparator.reverseOrder()).toList();

    }
}
