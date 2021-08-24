import java.util.Scanner;

/**
 * 6. Создать класс.
 * В методе main получить введенное с консоли слово и вывести на консоль выражение:
 * введенное слово "и_тут_в_кавычках_должно_быть_введенное_слово".
 *
 * @author Alex Shutovich
 */
public class Task_06 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String typedText = scaner.next();

        System.out.println("Введенное слово: \"" + typedText + "\"");
    }
}
