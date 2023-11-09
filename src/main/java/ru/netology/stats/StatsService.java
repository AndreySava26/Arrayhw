package ru.netology.stats;
public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

        }
        return totalSale;

    }

    public long average(long[] sales) {
        long totalSale = sum(sales);
        long averageSale = totalSale / 12;

        return averageSale;
    }


    public int monthMaxiSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[month] <= sales[i]) {
                month = i;

            }
        }
        return month + 1;

    }

    public int MonthMinSales(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMin] >= sales[i]) {
                monthMin = i;

            }
        }
        return monthMin + 1;

    }

    public int monthBelowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale) {
                counter++;
            }
        }
        return counter;


    }

    public int MonthHigherAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale) {
                counter++;
            }
        }
        return counter;


    }

}