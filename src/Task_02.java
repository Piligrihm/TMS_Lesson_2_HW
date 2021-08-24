/**
 * 2. Создать класс.
 * В методе main объявить четрые переменные типа int и присвоить им произвольные числовые значения.
 * Первая переменная должна быть в двоичном формате, вторая - в восьмеричном, третья - в десячином, четрветая в шестнадцатиричном.
 * Вывести результат на консоль.
 *
 * @author Alex Shutovich
 */

public class Task_02 {
    public static void main(String[] args) {
        int varBin = 0b1101010110;
        int varOct = 023;
        int varDec = 325;
        int varHex = 0x55489;
        Integer str = null;

        System.out.println("Binary system: " + varBin);
        System.out.println("Octal system " + varOct);
        System.out.println("Decimal system: " + varDec);
        System.out.println("Hexadecimal system: " + varHex);
        System.out.println(str.toString(varOct, 8));
    }
}
