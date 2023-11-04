public class Main {
    public static void main(String[] args) {
        String phrase = "Пример текста";

        final int num = 10;

        String word = "слово";

        String result = num + " " + word;

        System.out.println("Значение переменной phrase: " + phrase);
        System.out.println("Значение константы num: " + num);
        System.out.println("Значение переменной word: " + word);
        System.out.println("Результат конкатенации: " + result);

        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
    }
}
