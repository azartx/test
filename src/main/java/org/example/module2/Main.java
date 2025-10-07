package org.example.module2;

public class Main {

    public static void main(String[] args) {
        // 1. Переменные
        int calculationResult = 0;

        calculationResult = calculationResult + 10;

        System.out.println("1. " + calculationResult);

        calculationResult += 100;

        System.out.println("2. " + calculationResult);

        calculationResult -= 50;

        System.out.println("3. " + calculationResult);

        final int someDigit = 1;

        // ----------------------------------------------

        // 2. Типы данных

        // 2.1. Примитивные
        // Целочисленные
        byte a = 1; // (8 bit) -128 .. 127
        short b = 1; // (16 bit) -32768 до 32767
        int c = 1; // (32 bit) -2 147 483 648 до 2 147 483 647
        long d = 1L; // (64 bit) Очень длинные числа



        // Дробные
        float e = 0.5F;
        double f = 0.5;

        // Символьные
        char g = 'ᴥ'; // Один символ в одинарных кавычках. Целая строка - это набор из символов.

        // Логические
        boolean IsQweChanged = false; // Принимает в себя только значения false либо true (истина/ложь)

        // 2.2. Объектные
        String i = "Строка, являющаяся набором символов. Объявляется в двойных кавычках";

        TestClass j = new TestClass(); // Любой класс в проекте является отдельным объектным типом.

        j.printSomeName();

        // ---------------------------------------------------------

        // 3. Операторы
        // + | Сложение
        // - | Вычитание
        // / | Деление
        // * | Умножение
        // % | Остаток от деления
        // = | Равно (оператор результата)
        // == | Приравнивается (логическая проверка)
        // != | НЕ равно
        // <= | Меньше или равно
        // >= | Больше или равно
        // && | И
        // || | ИЛИ

        // ---------------------------------------------------------

        // 4. Область видимости
        // Операторы видимости - public, private, protected, package-private
        int helloWorld = 1; // public внутри функции

//        System.out.println(j.visibleText);
//        System.out.println(j.invisibleText);
    }
}
