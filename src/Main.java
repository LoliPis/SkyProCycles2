public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 1\n");
        //Ex1
        System.out.println("Задание номер один");
        int paymentPerMonth = 15_000;
        int deposit = 0;
        int monthPeriod = 0;
        while (deposit <= 2_459_000) {
            deposit = deposit + paymentPerMonth;
            monthPeriod++;
            System.out.println("Месяц " + monthPeriod + ", сумма накоплений равна " + deposit + "рублей");
        }
        //Ex2
        System.out.println("\nЗадание номер два");
        int i  = 1;
        for (;i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10;i > 0; i--) {
            System.out.print(i + " ");
        }
        //Ex3
        System.out.println("\nЗадание номер три");
        int population = 12_000_000;
        int bornPerYearOn1000Pepole = 17;
        int diedPerYearOn1000People = 8;
        int yearTerm = 10;
        for  (int j = 1; j <= yearTerm; j++) {
            population  = population + ((population / 1000) * bornPerYearOn1000Pepole) - ((population / 1000) * diedPerYearOn1000People);
            System.out.println("Год " + j + ", численность населения составляет " + population);
        }
        System.out.println("\nДомашнее задание - 2\n");
        //Ex1
        System.out.println("Задание номер один");
        double deposideVasia = 15_000.0;
        int wantedDepositeVasia = 12_000_000;
        double prosentPerMonth = 0.07;
        for (int j = 1; deposideVasia <  wantedDepositeVasia; j++) {
            deposideVasia += deposideVasia * prosentPerMonth;
            System.out.println("Месяц "  + j + ", сумма  накоплений  равна " +  (int)deposideVasia);
        }
        //Ex2
        System.out.println("\nЗадание номер два");
        double deposideVasia2 = 15_000.0;
        for (int j = 1; deposideVasia2 <  wantedDepositeVasia; j++) {
            deposideVasia2 +=  deposideVasia2 * prosentPerMonth;
            if (j % 6 == 0) {
                System.out.println("Месяц "  + j + ", сумма  накоплений  равна " +  (int)deposideVasia2);
            }
        }
        //Ex3
        System.out.println("\nЗадание номер три");
        double deposideVasia3 = 15_000.0;
        int termYearVasia = 9;
        int termMonthVasia = termYearVasia * 12;
        for (int  j = 1; j  <= termMonthVasia; j ++) {
            deposideVasia3 +=  deposideVasia3  * prosentPerMonth;
            if (j %  6 ==  0) {
                System.out.println("Месяц "  + j + ", сумма  накоплений  равна " +  (int)deposideVasia3);
            }
        }
        //Ex4
        System.out.println("\nЗадание номер четыре");
        int firsdayNumb = 2;
        int monthDaysCont = 31;
        for (int  j = firsdayNumb; j <= monthDaysCont;  j += 7) {
            System.out.println("Сегодня пятница," + j + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println("\nДомашнее задание - 3\n");
        //Ex1
        System.out.println("Задание номер один");
        int totalYear = 2022;
        int startPeriodYear = totalYear - 200;
        int finishPeriodYear = totalYear + 100;
        for (int j = 0; j < finishPeriodYear; j += 79) {
            if  (j >=  startPeriodYear  &&  j  <=  finishPeriodYear && j % 79 == 0) {
                System.out.println(j);
            }
        }
        //Ex2
        System.out.println("\nЗадание номер два");
        for (int j = 1; j <= 10; j++) {
            System.out.println("2 * " + j + " = " + 2 * j);
        }
        //Ex4 дополнительные задания
        System.out.println("\nЗадание номер четыре");
        String numbDevidedThree = "ping";
        String numbDevidedFife = "pong";
        for (int j = 1; j <= 30; j++) {
            if (j % 3 == 0) {
                if (j % 5 == 0) {
                    System.out.println(j + ": " + numbDevidedThree + " " + numbDevidedFife);
                } else {
                    System.out.println(j + ": " + numbDevidedThree);
                  }
            } else if (j % 5 == 0) {
                System.out.println(j + ": " + numbDevidedFife);
              } else {
                System.out.println(j + ": ");
                }
        }
        //Ex5 дополнительные задания
        System.out.println("\nЗадание номер пять");
        int firstNumb = 0;
        int secondNumb = 1;
        int fibonachiNumbCount = 10;
        int thirdNumb = 0;
        System.out.printf("%d %d ", firstNumb, secondNumb);
        for (int j = 2; j < fibonachiNumbCount; j++) {
            thirdNumb = firstNumb + secondNumb;
            firstNumb = secondNumb;
            secondNumb = thirdNumb;
            System.out.printf("%d ", thirdNumb);

        }
    }
}