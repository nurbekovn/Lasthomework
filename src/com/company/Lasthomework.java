package com.company;
//      Кайтаруучу метод тузунуз, параметрине бир сан жана
//      сандардын varargs-ын кабыл алсын.
//      Методко биринчи берген аргументинизди экинчи берген аргументтердин
//      ичинен барбы же жокпу текшерип бар болсо true
//      жок болсо false кайтарсын.

//      Создайте метод который берет одно число и varargs целых чисел.
//      Метод должен проверить есть ли такое значение как
//      первый аргумент в varargs,
//      если есть то метод вернет true если нет, то вернет false.
//      static boolean contains(int a, int ... varargs) {


public class Lasthomework {
    public static void main(String[] args) {
        System.out.println(contains(12, 1, 1, 3, 4, 5,123));

    }

    static boolean contains(int a, int... varargs) {
        for (int i : varargs) {
            if (a == i) {
                return true;
            }
        }
        return false;
    }
}
