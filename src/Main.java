public class Main {
    public static void main(String[] args) {
        int[] payments = {9000, 1600, 11000, 1200, 8000};
        int total = 0;
        for (int payment : payments) {
            total += payment;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");


        int[] expenses = {9000, 1600, 11000, 1200, 8000};
        int min = expenses[0];
        int max = expenses[0];
        for (int expense : expenses) {
            if (expense < min) {
                min = expense;
            }
            if (expense > max) {
                max = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");



        int[] weeklyExpenses = {120, 1500, 800, 470, 2000};
        double general = 0;
        for (int expense : weeklyExpenses) {
            general += expense;
        }
        double mid = general / 4;
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей");



        char[] FullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseFullName(FullName);
        System.out.println(FullName);
    }
    public static void reverseFullName(char[] array) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while (leftIndex < rightIndex) {
            char temp = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }

}