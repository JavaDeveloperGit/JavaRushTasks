package com.javarush.task.task14.task1417;

/**
 * Created by volod on 24.11.2019.
 */
public class USD extends Money {
    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
