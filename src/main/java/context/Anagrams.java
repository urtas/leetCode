package context;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Anagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String first = r.readLine();

        Set<Character> characterSet = first.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

        String second = r.readLine();
        byte result = 1;
        for (char c : second.toCharArray()) {
            if (!characterSet.contains(c)) {
                result = 0;
                break;
            }
        }
        System.out.println(result);

    }
}
