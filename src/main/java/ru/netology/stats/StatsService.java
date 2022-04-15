package ru.netology.stats;

public class StatsService {


    public int Sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int average(int[] sales) {
        int sum = Sum(sales);
        return sum / sales.length;
    }


    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxMonth]) {
                maxMonth = month;
            }
        }
        return maxMonth + 1;
    }

    public int minMonth(int[] sales) {
        int minMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] <= sales[minMonth]) {
                minMonth = month;
            }
        }
        return minMonth + 1;
    }


    public int countBelowAverage(int[] sales) {
        int average = average(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int countMoreAverage(int[] sales) {
        int average = average(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }


}
//        int january = 8;
//        int february = 15;
//        int march = 13;
//        int april = 15;
//        int may = 17;
//        int june = 20;
//        int july = 19;
//        int august = 20;
//        int september = 7;
//        int october = 14;
//        int november = 14;
//        int dacember = 18;
//
//        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//


