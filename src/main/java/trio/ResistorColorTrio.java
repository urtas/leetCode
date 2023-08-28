package trio;

import java.util.HashMap;
import java.util.Map;


class ResistorColorTrio {

    public static String text(Color... input) {
        String result;
        Map<Color, Integer> colorToValue = new HashMap<>();
        colorToValue.put(Color.BLACK, 0);
        colorToValue.put(Color.BROWN, 1);
        colorToValue.put(Color.RED, 2);
        colorToValue.put(Color.ORANGE, 3);
        colorToValue.put(Color.YELLOW, 4);
        colorToValue.put(Color.GREEN, 5);
        colorToValue.put(Color.BLUE, 6);
        colorToValue.put(Color.VIOLET, 7);
        colorToValue.put(Color.GREY, 8);
        colorToValue.put(Color.WHITE, 9);

        Map<Integer, Unit> unitToValue = new HashMap<>();
        unitToValue.put(0, Unit.OHMS);
        unitToValue.put(1, Unit.KILOOHMS);
        unitToValue.put(2, Unit.MEGAOHMS);
        unitToValue.put(3, Unit.GIGAOHMS);
        unitToValue.put(4, Unit.TERAOHMS);
        unitToValue.put(5, Unit.PETAOHMS);
        unitToValue.put(6, Unit.EXAOHMS);

        int firstDigit = colorToValue.get(input[0]);
        int secondDigit = colorToValue.get(input[1]);
        Integer zeroNumber = colorToValue.get(input[2]);
        long pow = Math.round(Math.pow(10, zeroNumber));
        long l = (firstDigit * 10 + secondDigit) * pow;
        int number = 0;
        while (l % 1000 == 0) {
            number ++;
            l = l / 1000;
        }
        Unit unit = unitToValue.get(number);
        result= l + " " + unit.toString().toLowerCase();
        return result;
    }

    public static void main(String[] args) {
        ResistorColorTrio resistorColorTrio = new ResistorColorTrio();
        System.out.println(resistorColorTrio.text(Color.RED, Color.BLACK, Color.RED));
    }
}

enum Color {
    BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
}

enum Unit {
    OHMS, KILOOHMS, MEGAOHMS, GIGAOHMS, TERAOHMS, PETAOHMS, EXAOHMS
}