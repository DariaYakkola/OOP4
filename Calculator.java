package Homework;

import java.util.*;

public class Calculator {

    /**
     * @param numbers массив чисел
     * @return numbers - массив чисел
     * @apiNote Написать класс канкулятор принимающий List целочисленных значений, возвращающий
     * сумму элементов коллекции (метод sum)
     */
    public Double sum(List<? extends Number> numbers) {
        Double res = 0.0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }

    /**
     * @param numbers список чисел для умножения List
     * @return Результат умножения Integer
     * @apiNote Умножение целых чисел
     */
    public Integer multi(List<? extends Number> numbers) {
        Integer res = 1;
        for (Number number : numbers) {
            res = res * number.intValue();
        }
        return res;
    }

    /**
     * @param numbers список чисел для деления List<Integer>
     * @return Результат деления в формате String и округлением до 3 знаков
     * @apiNote Делит 2 рандомных числа из последовательности
     */
    public String div(List<Integer> numbers) {
        Random random = new Random();
        Integer number1 = numbers.get(random.nextInt(numbers.size()));
        Integer number2 = numbers.get(random.nextInt(numbers.size()));
        System.out.println("Делим число " + number1 + " на число " + number2);
        Double res = (double) number1 / number2;
        return String.format("%.3f", res);
    }

    /**
     * @param numbers список чисел для перевода List<Integer>
     * @return результат перевода в формате List
     * @apiNote Переводит рандомное число из десятичной сисемы в доичную
     */
    public List<? extends Number> binary(List<Integer> numbers) {
        Random random = new Random();
        List<Integer> res = new ArrayList<>();
        Integer number1 = numbers.get(random.nextInt(numbers.size()));
        System.out.println("Число для перевода: " + number1);
        while (number1 >= 1) {
            if (number1 % 2 == 1) {
                res.add(1);
            } else {
                res.add(0);
            }
            number1 = number1 / 2;
        }
        Collections.reverse(res);
        return res;
    }
}