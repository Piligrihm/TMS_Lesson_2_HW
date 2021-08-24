/**
 * 1. Создать класс.
 * В методе main объявить три переменные типа int и присвоить первой числовое значение,
 * вторая переменная равна первой переменной увеличенной на 3, а третья переменная равна сумме первых двух.
 * Вывести результат на консоль.
 *
 * @author Alex Shutovich
 */

public class Task_01 {
    public static void main(String[] args) {
        int varOne = 7;
        int varTwo = varOne * 3;
        int varThree = varOne + varTwo;

        System.out.println("The first variable is = " + varOne);
        System.out.println("The second variable is = " + varTwo);
        System.out.println("The third one is = " + varThree);
    }
}
