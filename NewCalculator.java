
import java.util.Scanner;

public class NewCalculator {
    public static class Act {
        public static int addition(int x, int y) {
            if ((x > 0 & x < 11) & (y > 0 & y < 11)) {
                return x + y;
            } else {
                return Integer.parseInt(null);
            }
        }

        public static int substraction(int x, int y) {
            if ((x > 0 & x < 11) & (y > 0 & y < 11)) {
                return x - y;
            } else {
                return Integer.parseInt(null);
            }
        }

        public static int division(int x, int y) {
            if ((x > 0 & x < 11) & (y > 0 & y < 11)) {
                return x / y;
            } else {
                return Integer.parseInt(null);
            }
        }

        public static int multiplication(int x, int y) {
            if ((x > 0 & x < 11) & (y > 0 & y < 11)) {
                return x * y;
            } else {
                return Integer.parseInt(null);
            }
        }

        public static int action(int x, int y, String operator) {
            switch (operator) {
                case "+":
                    return addition(x, y);
                case "-":
                    return substraction(x, y);
                case "/":
                    return division(x, y);
                case "*":
                    return multiplication(x, y);
                default:
                    return Integer.parseInt(null);

            }

        }
    }


    public static void main(String arg[]) {
        Act myCalc = new Act();
        int result = 0;
        try (
                Scanner calcScan = new Scanner(System.in);) {

            System.out.println("Введите выражение. Например 2+2 или I+I");

            if (calcScan.findInLine("(-?\\d+\\.?\\d*)?\\s*(\\S)\\s*(-?\\d+\\.?\\d*)")
                    != null) {

                if (calcScan.match().group(1) != null) {
                    Integer nOne = Integer.parseInt(calcScan.match().group(1));
                    Integer nTwo = Integer.parseInt(calcScan.match().group(3));

                    result = myCalc.action(nOne, nTwo, calcScan.match().group(2));

                } else {
                    System.out.println("Ошибка");

                }
                System.out.println("Ответ: " + result);

            } else {
                String calc = calcScan.next();
                if (calc.equals("I+I")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("I-I")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I*I")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("I/I")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("I+II")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("I-II")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I*II")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("I/II")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I+III")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("I-III")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I*III")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("I/III")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I+IV")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("I-IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I*IV")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("I/IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I+V")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("I-V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I*V")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("I/V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I+VI")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("I-VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I*VI")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("I/VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I+VII")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("I-VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I*VII")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("I/VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I+VIII")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("I-VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I*VIII")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("I/VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I+IX")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("I-IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I*IX")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("I/IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I+X")) {
                    System.out.println("Ответ: II");
                } else if (calc.equals("I-X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("I*X")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("I/X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II+I")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("II-I")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("II*I")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("II/I")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("II+II")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("II-II")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II*II")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("II/II")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("II+III")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("II-III")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II*III")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("II/III")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II+IV")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("II-IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II*IV")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("II/IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II+V")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("II-V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II*V")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("II/V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II+VI")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("II-VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II*VI")) {
                    System.out.println("Ответ: XII");
                } else if (calc.equals("II/VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II+VII")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("II-VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II*VII")) {
                    System.out.println("Ответ: XIV ");
                } else if (calc.equals("II/VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II+VIII")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("II-VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II*VIII")) {
                    System.out.println("Ответ: XVI ");
                } else if (calc.equals("II/VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II+IX")) {
                    System.out.println("Ответ: XI ");
                } else if (calc.equals("II-IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II*IX")) {
                    System.out.println("Ответ: XVIII ");
                } else if (calc.equals("II/IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II+X")) {
                    System.out.println("Ответ: XII");
                } else if (calc.equals("II-X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("II*")) {
                    System.out.println("Ответ: XX ");
                } else if (calc.equals("II/X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III+I")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("III-I")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("III*I")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("III/I")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("III+II")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("III-II")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("III*II")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("III/II")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III+III")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("III-III")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III*III")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("III/III")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("III+IV")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("III-IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III*IV")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("III/IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III+V")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("III-V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III*V")) {
                    System.out.println("Ответ: XV ");
                } else if (calc.equals("III/V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III+VI")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("III-VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III*VI")) {
                    System.out.println("Ответ: XVIII ");
                } else if (calc.equals("III/VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III+VII")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("III-VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III*VII")) {
                    System.out.println("Ответ: XXI ");
                } else if (calc.equals("III/VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III+VIII")) {
                    System.out.println("Ответ: XI ");
                } else if (calc.equals("III-VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III*VIII")) {
                    System.out.println("Ответ: XXIV ");
                } else if (calc.equals("III/VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III+IX")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("III-IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III*IX")) {
                    System.out.println("Ответ: XXVII ");
                } else if (calc.equals("III/IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III+X")) {
                    System.out.println("Ответ: XIII");
                } else if (calc.equals("III-X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("III*X")) {
                    System.out.println("Ответ: XXX ");
                } else if (calc.equals("III/X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV+I")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("IV-I")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("IV*I")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("IV/I")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("IV+II")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("IV-II")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("IV*II")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("IV/II")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("IV+III")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("IV-III")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("IV*III")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("IV/III")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV+IV")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("IV-IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV*IV")) {
                    System.out.println("Ответ: XVI ");
                } else if (calc.equals("IV/IV")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("IV+V")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("IV-V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV*V")) {
                    System.out.println("Ответ: XX ");
                } else if (calc.equals("IV/V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV+VI")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("IV-VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV*VI")) {
                    System.out.println("Ответ: XXIV ");
                } else if (calc.equals("IV/VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV+VII")) {
                    System.out.println("Ответ: XI ");
                } else if (calc.equals("IV-VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV*VII")) {
                    System.out.println("Ответ: XXVIII ");
                } else if (calc.equals("IV/VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV+VIII")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("IV-VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV*VIII")) {
                    System.out.println("Ответ: XXXII ");
                } else if (calc.equals("IV/VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV+IX")) {
                    System.out.println("Ответ: XIII ");
                } else if (calc.equals("IV-IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV*IX")) {
                    System.out.println("Ответ: XXXVI ");
                } else if (calc.equals("IV/9")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV+X")) {
                    System.out.println("Ответ: XIV");
                } else if (calc.equals("IV-X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IV*X")) {
                    System.out.println("Ответ: XL ");
                } else if (calc.equals("IV/X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V+I")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("V-I")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("V*I")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("V/I")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("V+II")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("V-II")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("V*II")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("V/II")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V+III")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("V-III")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("V*III")) {
                    System.out.println("Ответ: XV ");
                } else if (calc.equals("V/III")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V+IV")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("V-IV")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("V*IV")) {
                    System.out.println("Ответ: XX ");
                } else if (calc.equals("V/IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V+V")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("V-V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V*V")) {
                    System.out.println("Ответ: 25 ");
                } else if (calc.equals("V/V")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("V+VI")) {
                    System.out.println("Ответ: XI ");
                } else if (calc.equals("V-VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V*VI")) {
                    System.out.println("Ответ: XXX ");
                } else if (calc.equals("V/VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V+VII")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("V-VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V*VII")) {
                    System.out.println("Ответ: XXXV ");
                } else if (calc.equals("V/VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V+VIII")) {
                    System.out.println("Ответ: XIII ");
                } else if (calc.equals("V-VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V*VIII")) {
                    System.out.println("Ответ: XL ");
                } else if (calc.equals("V/VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V+IX")) {
                    System.out.println("Ответ: XIV ");
                } else if (calc.equals("V-IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V*IX")) {
                    System.out.println("Ответ: XLV ");
                } else if (calc.equals("V/IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V+X")) {
                    System.out.println("Ответ: XV");
                } else if (calc.equals("V-X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("V*X")) {
                    System.out.println("Ответ: L ");
                } else if (calc.equals("V/X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI+I")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("VI-I")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("VI*I")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("VI/I")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("VI+II")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("VI-II")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("VI*II")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("VI/II")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("VI+III")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("VI-III")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("VI*III")) {
                    System.out.println("Ответ: XVIII ");
                } else if (calc.equals("VI/III")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("VI+IV")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("VI-IV")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("VI*IV")) {
                    System.out.println("Ответ: XXIV ");
                } else if (calc.equals("VI/IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI+V")) {
                    System.out.println("Ответ: XI ");
                } else if (calc.equals("VI-V")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("VI*V")) {
                    System.out.println("Ответ: XXX ");
                } else if (calc.equals("VI/V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI+VI")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("VI-VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI*VI")) {
                    System.out.println("Ответ: XXXVI ");
                } else if (calc.equals("VI/VI")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("VI+VII")) {
                    System.out.println("Ответ: XIII");
                } else if (calc.equals("VI-VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI*VII")) {
                    System.out.println("Ответ: XLII ");
                } else if (calc.equals("VI/VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI+VIII")) {
                    System.out.println("Ответ: XIV ");
                } else if (calc.equals("VI-VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI*VIII")) {
                    System.out.println("Ответ: XLVIII ");
                } else if (calc.equals("VI/VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI+IX")) {
                    System.out.println("Ответ: XV ");
                } else if (calc.equals("VI-IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI*IX")) {
                    System.out.println("Ответ: LIV ");
                } else if (calc.equals("VI/IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI+X")) {
                    System.out.println("Ответ: XVI");
                } else if (calc.equals("VI-X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VI*X")) {
                    System.out.println("Ответ: LX ");
                } else if (calc.equals("VI/X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII+I")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("VII-I")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("VII*I")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("VII/I")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("VII+II")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("VII-II")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("VII*II")) {
                    System.out.println("XIV");
                } else if (calc.equals("VII/II")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII+III")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("VII-III")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("VII*III")) {
                    System.out.println("Ответ: XXI ");
                } else if (calc.equals("VII/III")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII+IV")) {
                    System.out.println("Ответ: XI ");
                } else if (calc.equals("VII-IV")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("VII*IV")) {
                    System.out.println("Ответ: XXVIII ");
                } else if (calc.equals("VII/IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII+V")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("VII-V")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("VII*V")) {
                    System.out.println("Ответ: XXXV");
                } else if (calc.equals("VII/V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII+VI")) {
                    System.out.println("Ответ: XIV ");
                } else if (calc.equals("VII-VI")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("VII*VI")) {
                    System.out.println("Ответ: XLII ");
                } else if (calc.equals("VII/VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII+VII")) {
                    System.out.println("Ответ: XIV ");
                } else if (calc.equals("VII-VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII*VII")) {
                    System.out.println("Ответ: XLIX ");
                } else if (calc.equals("VII/VII")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("VII+VIII")) {
                    System.out.println("Ответ: XV ");
                } else if (calc.equals("VII-VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII*VIII")) {
                    System.out.println("Ответ: XLVIII ");
                } else if (calc.equals("VII/VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII+IX")) {
                    System.out.println("Ответ: XVI ");
                } else if (calc.equals("VII-IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII*IX")) {
                    System.out.println("Ответ: LXIII ");
                } else if (calc.equals("VII/IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII+X")) {
                    System.out.println("Ответ: XVII");
                } else if (calc.equals("VII-X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VII*X")) {
                    System.out.println("Ответ: LXX ");
                } else if (calc.equals("VII/X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VIII+I")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("VIII-I")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("VIII*I")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("VIII/I")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("VIII+II")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("VIII-II")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("VIII*II")) {
                    System.out.println("Ответ: XVI ");
                } else if (calc.equals("VIII/II")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("VIII+III")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("VIII-III")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("VIII*III")) {
                    System.out.println("Ответ: XXIV ");
                } else if (calc.equals("VIII/III")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VIII+IV")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("VIII-IV")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("VIII*IV")) {
                    System.out.println("Ответ: XXXII ");
                } else if (calc.equals("VIII/IV")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("VIII+V")) {
                    System.out.println("Ответ: XIII ");
                } else if (calc.equals("VIII-V")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("VIII*V")) {
                    System.out.println("Ответ: XXX ");
                } else if (calc.equals("VIII/V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VIII+VI")) {
                    System.out.println("Ответ: XIV ");
                } else if (calc.equals("VIII-VI")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("VIII*VI")) {
                    System.out.println("Ответ: XLVIII ");
                } else if (calc.equals("VIII/VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VIII+VII")) {
                    System.out.println("Ответ: XV ");
                } else if (calc.equals("VIII-VII")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("VIII*VII")) {
                    System.out.println("Ответ: LVI ");
                } else if (calc.equals("VIII/VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VIII+VIII")) {
                    System.out.println("Ответ: XVI ");
                } else if (calc.equals("VIII-VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VIII*VIII")) {
                    System.out.println("Ответ: LXIV ");
                } else if (calc.equals("VIII/VIII")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("VIII+IX")) {
                    System.out.println("Ответ: XVII ");
                } else if (calc.equals("VIII-IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VIII*IX")) {
                    System.out.println("Ответ: LXXII ");
                } else if (calc.equals("VIII/IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VIII+X")) {
                    System.out.println("Ответ: XVIII");
                } else if (calc.equals("VIII-X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("VIII*X")) {
                    System.out.println("Ответ: LXXX ");
                } else if (calc.equals("VIII/X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IX+I")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("IX-I")) {
                    System.out.println("Ответ: VIII ");
                } else if (calc.equals("IX*I")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("IX/I")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("IX+II")) {
                    System.out.println("Ответ: XI ");
                } else if (calc.equals("IX-II")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("IX*II")) {
                    System.out.println("Ответ: XVIII ");
                } else if (calc.equals("IX/II")) {
                    System.out.println("В римских цифрах нет такого значения ");
                } else if (calc.equals("IX+III")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("IX-III")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("IX*III")) {
                    System.out.println("Ответ: XXVII ");
                } else if (calc.equals("IX/III")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("IX+IV")) {
                    System.out.println("Ответ: XIII ");
                } else if (calc.equals("IX-IV")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("IX*IV")) {
                    System.out.println("XXXVI");
                } else if (calc.equals("IX/IV")) {
                    System.out.println("В римских цифрах нет такого значения ");
                } else if (calc.equals("IX+V")) {
                    System.out.println("Ответ: XIV ");
                } else if (calc.equals("IX-V")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("IX*V")) {
                    System.out.println("Ответ: XLV ");
                } else if (calc.equals("IX/V")) {
                    System.out.println("В римских цифрах нет такого значения ");
                } else if (calc.equals("IX+VI")) {
                    System.out.println("Ответ: XV ");
                } else if (calc.equals("IX-VI")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("IX*VI")) {
                    System.out.println("Ответ: XXXVI ");
                } else if (calc.equals("IX/VI")) {
                    System.out.println("В римских цифрах нет такого значения ");
                } else if (calc.equals("IX+VII")) {
                    System.out.println("Ответ: XVI ");
                } else if (calc.equals("IX-VII")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("IX*VII")) {
                    System.out.println("Ответ: LIII ");
                } else if (calc.equals("IX/VII")) {
                    System.out.println("В римских цифрах нет такого значения ");
                } else if (calc.equals("IX+VIII")) {
                    System.out.println("Ответ: XVII ");
                } else if (calc.equals("IX-VIII")) {
                    System.out.println("Ответ: I");
                } else if (calc.equals("IX*VIII")) {
                    System.out.println("Ответ: LXXII ");
                } else if (calc.equals("IX/VIII")) {
                    System.out.println("В римских цифрах нет такого значения ");
                } else if (calc.equals("IX+IX")) {
                    System.out.println("Ответ: XVIII ");
                } else if (calc.equals("IX-IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IX*IX")) {
                    System.out.println("Ответ: LXXXI ");
                } else if (calc.equals("IX/IX")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("IX+X")) {
                    System.out.println("Ответ: XIX");
                } else if (calc.equals("IX-X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("IX*X")) {
                    System.out.println("Ответ: XC ");
                } else if (calc.equals("IX/X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("X+I")) {
                    System.out.println("Ответ: XI");
                } else if (calc.equals("X-I")) {
                    System.out.println("Ответ: IX ");
                } else if (calc.equals("X*I")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("X/I")) {
                    System.out.println("Ответ: X ");
                } else if (calc.equals("X+II")) {
                    System.out.println("Ответ: XII ");
                } else if (calc.equals("X-II")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("X*II")) {
                    System.out.println("Ответ: XX ");
                } else if (calc.equals("X/II")) {
                    System.out.println("Ответ: V ");
                } else if (calc.equals("X+III")) {
                    System.out.println("Ответ: XIII ");
                } else if (calc.equals("X-III")) {
                    System.out.println("Ответ: VII ");
                } else if (calc.equals("X*III")) {
                    System.out.println("Ответ: XXX ");
                } else if (calc.equals("X/III")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("X+IV")) {
                    System.out.println("Ответ: XIV ");
                } else if (calc.equals("X-IV")) {
                    System.out.println("Ответ: VI ");
                } else if (calc.equals("X*IV")) {
                    System.out.println("Ответ: XL ");
                } else if (calc.equals("X/IV")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("X+V")) {
                    System.out.println("Ответ: XV ");
                } else if (calc.equals("X-V")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("X*V")) {
                    System.out.println("Ответ: L ");
                } else if (calc.equals("X/V")) {
                    System.out.println("Ответ: II ");
                } else if (calc.equals("X+VI")) {
                    System.out.println("Ответ: XVI ");
                } else if (calc.equals("X-VI")) {
                    System.out.println("Ответ: IV ");
                } else if (calc.equals("X*VI")) {
                    System.out.println("Ответ: LX ");
                } else if (calc.equals("X/VI")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("X+VII")) {
                    System.out.println("Ответ: XVII ");
                } else if (calc.equals("X-VII")) {
                    System.out.println("Ответ: III ");
                } else if (calc.equals("X*VII")) {
                    System.out.println("Ответ: LXX ");
                } else if (calc.equals("X/VII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("X+VIII")) {
                    System.out.println("Ответ: XVIII ");
                } else if (calc.equals("X-8")) {
                    System.out.println("Ответ: II");
                } else if (calc.equals("X*VIII")) {
                    System.out.println("Ответ: LXXX ");
                } else if (calc.equals("X/VIII")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("X+IX")) {
                    System.out.println("Ответ: XIX ");
                } else if (calc.equals("X-IX")) {
                    System.out.println("Ответ: I ");
                } else if (calc.equals("X*IX")) {
                    System.out.println("Ответ: XC ");
                } else if (calc.equals("X/IX")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("X+X")) {
                    System.out.println("Ответ: XX");
                } else if (calc.equals("X-X")) {
                    System.out.println("В римских цифрах нет такого значения");
                } else if (calc.equals("X*X")) {
                    System.out.println("Ответ: C ");
                } else if (calc.equals("X/X")) {
                    System.out.println("Ответ: I ");
                } else {
                    System.out.println("Ошибка");
                }

            }

        } catch (Exception e) {
            System.out.println("Ошибка");

        }
    }
}
