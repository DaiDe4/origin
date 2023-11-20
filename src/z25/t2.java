package z25;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class t2 {
    public static class AllTasks {

        public static boolean isThatStr(String s) {
            return s.equals("abcdefghijklmnopqrstuv18340");
        }

        public static ArrayList<String> findRubEurUsd(String s) {
            Pattern p = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");
            Matcher m = p.matcher(s);
            ArrayList<String> ans = new ArrayList<>();
            while (m.find()) {
                ans.add(m.group());
            }
            return ans;
        }

        public static boolean hasDigitPlus(String s) {
            return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
        }

        public static boolean isDate(String s) {
            Matcher m = Pattern.compile(
                    "((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))"
            ).matcher(s);
            return m.find() && m.group().equals(s);
        }

        public static boolean checkEmail(String s) {
            Matcher m = Pattern.compile(
                    "^([a-zA-Z0-9_\\-]+)@([a-zA-Z0-9_\\-]+)\\.([a-zA-Z]{2,5})$"
            ).matcher(s);
            return m.find() && m.group().equals(s);
        }

        public static boolean checkPass(String s) {
            return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
        }

        public static void main(String[] args) {
            System.out.println("2");
            System.out.println(isThatStr("abcdefghijklmnopqrstuv18340"));
            System.out.println(isThatStr("abcdefghijklmnoasdfasdpqrstuv18340"));
            System.out.println();

            System.out.println("1");
            System.out.println(findRubEurUsd(" Aboba Ferma ererererererere25.98 USD Sobaka, 44 ERR"));
            System.out.println(findRubEurUsd("44 ERR 25 RUB, "));
            System.out.println(findRubEurUsd("0.004 EU. 0.4 EUr, 0.4 EUR"));
            System.out.println();

            System.out.println("2");
            System.out.println(hasDigitPlus("(1 + 8) – 9 / 4"));
            System.out.println(hasDigitPlus("6 / 5 – 2 * 9"));
            System.out.println();

            System.out.println("3");
            System.out.println(isDate("29/02/2000"));
            System.out.println(isDate("30/04/2003"));
            System.out.println(isDate("01/01/2003"));
            System.out.println(isDate("29/02/2001"));
            System.out.println(isDate("30-04-2003"));
            System.out.println(isDate("1/1/1899"));
            System.out.println();

            System.out.println("4");
            System.out.println(checkEmail("user@example.com"));
            System.out.println(checkEmail("mroot@localhost.ru"));
            System.out.println(checkEmail("myhost@@@com.ru"));
            System.out.println(checkEmail("@my.ru"));
            System.out.println(checkEmail("Julia String."));
            System.out.println();

            System.out.println("5");
            System.out.println(checkPass("F032_Password"));
            System.out.println(checkPass("TrySpy1, smart_pass, A007."));
            System.out.println(checkPass("smart_pass"));
            System.out.println(checkPass("A007"));
        }
    }
}
