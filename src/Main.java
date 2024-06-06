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
        double mid = general / weeklyExpenses.length;
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей");



        char[] fullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < fullName.length / 2; i++) {
            char temp = fullName[i];
            fullName[i] = fullName[fullName.length - 1 - i];
            fullName[fullName.length - 1 - i] = temp;
        }
        System.out.println(fullName);

    }


}