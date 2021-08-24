/**
 * 3. Создать класс.
 * В методе main объявить две переменные типа int и присвоить им произвольные числовые значения.
 * Для первой переменной вызвать операцию инкремента, для второй переменной вызвать операцию декримента.
 * Результаты вывести на консоль.
 *
 * @author Alex Shutovich
 */

public class Task_03 {
    public static void main(String[] args) {
        int varOne = 45;
        int varTwo = 47;
        System.out.println("The first variable = " + varOne + "\nThe second one = " + varTwo);
        varOne++;
        varTwo--;
        System.out.println("The first variable after increment = " + varOne + "\nThe second variable after decrement = " + varTwo);

    }
}
