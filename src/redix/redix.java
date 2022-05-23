package redix;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class redix {
//    Необходимо реализовать функцию:
//    на вход функция получает строку  с произвольным многострочным текстом;
//    нужно при помощи регулярного выражения определить все url, которые встречаются в тексте;
//    в одной строке предполагается наличие как мусорного текста, так и url;
//    нужно найти все url и печатать их в консоль по мере нахождения;
//    url должны печататься в консоль в том же порядке, что и в исходном тексте;
//    для выполнения задачи требуется использовать регулярное выражение.
//    По сравнению с другими задачами на строки добавлен дополнительно импорт:

    public static void main(String[] args) {
        String str = "rhrthr https://stepik.org edtrhert r113223@12 https://wererwg.ru erwg3rg@123009https\n" +
                "rhrthr http://sfrgeee.org/ewfef/wqewrg\n" +
                "5476y65yyyyyh$%&$\n" +
                "https://makedreamprofits.ru/?utm_source=ewqee&utm_medium=qew";

      //  Pattern p = Pattern.compile("https");
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern
                .compile(
                        "(http://|https://){1}[\\w\\.\\-/:\\#\\?\\=\\&\\;\\%\\~\\+]+",
                        Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            list.add(matcher.group());
        }
        System.out.println(list);

    }
}
