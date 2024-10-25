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
        double proc3 = (deposit3 * 7) / 100;
        double deposit3WithProc = deposit3 + proc3;
        int mount3 = 0;
        double total3 = 0;
        while (total3 < 12_000_000) {
            mount3 += 6;
            total3 += deposit3WithProc * 6;
            String total3Result = String.format("%.2f", total3);
            System.out.println("Месяц " + mount3 + " сумма накоплений " + total3Result + " рублей");
        }

        var taskSix = ("Задача №6");
        System.out.println(taskSix);
        double deposit4 = 15000;
        double proc4 = (deposit4 * 7) / 100;
        double deposit4WithProc = deposit4 + proc4;
        int mount4 = 0;
        double total4 = 0;
        while (mount4 < 108) {
            mount4 += 6;
            total4 += deposit4WithProc * 6;
            String total4Result = String.format("%.2f", total4);
            System.out.println("Месяц " + mount4 + " сумма накоплений " + total4Result + " рублей");
        }

        var taskSeven = ("Задача №7");
        System.out.println(taskSeven);
        int d = 1;
        while (d < 31) {
            d++;
            if (d % 7 == 0) {
                System.out.println("Сегодня пятница, " + d + " -е число. Необходимо подготовить отчет");
            }
        }
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


