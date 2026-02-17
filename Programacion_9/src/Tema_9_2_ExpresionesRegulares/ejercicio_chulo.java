package Tema_9_2_ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejercicio_chulo {
    public static void solveEquations(String text) {
    Pattern pattern = Pattern.compile("([x0-9]+([+\\-][x0-9]+)*)=([x0-9]+([+\\-][x0-9]+)*)");
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
        String equation = matcher.group();
        String left = matcher.group(1);
        String right = matcher.group(3);
        int[] leftValues = parseSide(left);
        int[] rightValues = parseSide(right);
        int a = leftValues[0] - rightValues[0];
        int b = rightValues[1] - leftValues[1];
        int solution = b / a;
        System.out.printf("%-25s Solución: %d\n", equation, solution);
    }
}

public static int[] parseSide(String side) {
    Pattern termPattern = Pattern.compile("([+\\-]?)(\\d*)(x?)");
    Matcher termMatcher = termPattern.matcher(side);
    int coefX = 0;
    int constant = 0;
    while (termMatcher.find()) {
        String sign = termMatcher.group(1);
        String number = termMatcher.group(2);
        String x = termMatcher.group(3);
        if (termMatcher.group().isEmpty()) {
            continue;
        }
        int value = number.isEmpty() ? 1 : Integer.parseInt(number);
        if (sign.equals("-")) {
        value *= -1;
        }
        if (!x.isEmpty()) {
            coefX += value;
        } else {
            constant += value;
        }
    }
    return new int[]{coefX, constant};
    }
}
