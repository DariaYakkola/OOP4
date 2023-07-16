package Homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        List<Double> doubleList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            doubleList.add((double) i);
            integerList.add(i + 1);
        }
        System.out.println("Сумма чисел от 1 до 10: " + calc.sum(doubleList));
        System.out.println("Произведение чисел от 1 до 10: " + calc.multi(integerList));
        System.out.println("Частное чисел: " + calc.div(integerList));
        System.out.println("Перевод числа: " + calc.binary(integerList));
    }
}