public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var taskOne = ("Задача №1");
        System.out.println(taskOne);
        double deposit = 15000;
        double total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total += deposit;
            System.out.println("Месяц " + month++ + ", сумма накоплений равна " + total + " рублей.");
        }
        var taskTwo = ("Задача №2");
        System.out.println(taskTwo);
        int i = 1;
        while (i <= 10) {
            System.out.print(" " + i++);
        }
        System.out.println();
        for (int u = 10; u >= 1; u--) {
            System.out.print(" " + u);
        }
        System.out.println();

        var taskThree = ("Задача №3");
        System.out.println(taskThree);
        int population = 12000000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        int year = 1;
        while (year <= 10) {
            population += population * dif / 1000;
            System.out.println("Год " + year++ + ", численность населения составляет " + population);
        }

        var taskFour = ("Задача №4");
        System.out.println(taskFour);
        double deposit2 = 15000;
        double proc2 = (deposit2 * 7) / 100;
        double deposit2WithProc = deposit2 + proc2;
        int mount2 = 0;
        double total2 = 0;
        while (total2 < 12_000_000) {
            mount2++;
            total2 += deposit2WithProc;
            String total2Result = String.format("%.2f", total2);
            System.out.println("Месяц " + mount2 + " сумма накоплений " + total2Result + " рублей");
        }

        var taskFive = ("Задача №5");
        System.out.println(taskFive);
        double deposit3 = 15000;
        double percent = 7;
        int months = 6;
        double proc3 = (deposit3 * percent) / 100;
        double deposit3WithProc = deposit3 + proc3;
        int mount3 = 0;
        double total3 = 12_000_000;
        for (double sum = deposit3WithProc; sum <= total3; sum++) {
            if (sum % (deposit3WithProc * months) == 0) {
                mount3 += 6;
                String sum1 = String.format("%.2f", sum);
                System.out.println("Месяц " + mount3 + " сумма накоплений " + sum1 + " рублей");
            }
        }

        var taskSix = ("Задача №6");
        System.out.println(taskSix);
        double deposit4 = 15000;
        double percent1 = 7;
        int years = 9;
        double proc4 = (deposit4 * percent1) / 100;
        double deposit4WithProc = deposit4 + proc4;
        double total4 = 0;
        int mountStart = 6;
        int mountEnd = years * 12;
        for (int mount4 = mountStart; mount4 <= mountEnd; mount4++) {
            if (mount4 % 6 == 0) {
                total4 += deposit4WithProc * 6;
                String total4Result = String.format("%.2f", total4);
                System.out.println("Месяц " + mount4 + " сумма накоплений " + total4Result + " рублей");
            }
        }

        var taskSeven = ("Задача №7");
        System.out.println(taskSeven);

        int day = 7;
        do {
            System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет");
            day += 7;
        } while (day <= 31);

        var taskEight = ("Задача №8");
        System.out.println(taskEight);
        int currentYear = 2024;
        int twoHundredYears = currentYear - 200;
        int hundredYears = currentYear + 100;
        for (int y = twoHundredYears; y < hundredYears; y++)
            if (y % 79 == 0) {
                System.out.println("" + y);
            }


    }
}


