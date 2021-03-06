package task

/*
C. Уникальное число
ограничение по времени на тест2 секунды
ограничение по памяти на тест256 мегабайт
вводстандартный ввод
выводстандартный вывод
Вам задано натуральное число 𝑥. Найдите наименьшее натуральное число, у которого сумма цифр равна 𝑥 и все цифры различны.

Входные данные
В первой строке находится одно целое число 𝑡 (1≤𝑡≤50) — количество наборов входных данных. Далее следуют 𝑡 наборов входных данных.

Каждый набор входных данных состоит из одного натурального числа 𝑥 (1≤𝑥≤50).

Выходные данные
Выведите 𝑡 ответов на наборы входных данных:

если натуральное число, у которого сумма цифр равна 𝑥 и все цифры различны существует, то выведите наименьшее такое число;
В противном случае выведите -1.
Пример
входные данные
4
1
5
15
50
выходные данные
1
5
69
-1

*/
fun main() {
    val n = readLine()!!.toInt()
    val numberArray = Array(n) { 0 }
    val outArray = Array(n) { 0 }
    for (i in 0 until n) {
        numberArray[i] = readLine()!!.toInt()
    }
    for (i in numberArray.indices) {
        val x = numberArray[i]
        if (x >= 50) {
            outArray[i] = -1
            continue
        }
        if (x < 10) {
            outArray[i] = x
            continue
        }
        val sum = 0
        var last = 9
        while (last > 0 && sum < x) {
            // TODO
        }
    }
}