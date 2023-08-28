package cardValidation;

import java.util.ArrayList;
import java.util.List;

public class CardValidation {
    public static boolean isValid(String candidate) {


        List<Integer> digits = new ArrayList<>();
        for (char c : candidate.toCharArray()) {
            if (c == ' ') {
                continue;
            } else if (!Character.isDigit(c)) {
                return false;
            } else {
                digits.add(Character.getNumericValue(c));
            }
        }
        if (digits.size() <= 1) {
            return false;
        }

        for (int i = digits.size() - 2; i >= 0; i -= 2) {
            int doubled = digits.get(i) * 2;
            if (doubled > 9) {
                doubled -= 9;
            }
            digits.set(i, doubled);
        }

        Integer sum = digits.stream().reduce(0, Integer::sum);

        return sum % 10 == 0;
    }

    public static void main(String[] args) {
        System.out.println(CardValidation.isValid("4539 1488 0343 6467"));
    }
}
