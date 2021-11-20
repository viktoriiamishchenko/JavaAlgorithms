public class Task_19_1 {
    //Напишите метод, который выводит строковый параметр  n раз и показывает количество символов в новой строке.

    public static void main (String str, int n) {
        if (n > 1 && str.length() > 0) {
            str = str.repeat(n);
            System.out.println(str + "" + str.length());
        }
    }
}
