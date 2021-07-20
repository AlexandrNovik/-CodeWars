package task
/*
После окончания уроков n групп школьников вышли на улицу и собрались ехать домой к Поликарпу на празднование его дня рождения. Известно, что i-ая группа состоит из si друзей (1 ≤ si ≤ 4), которые не хотят расставаться по пути к Поликарпу. Решено ехать на такси. Каждая машина может вместить не более четырех пассажиров. Какое минимальное количество машин потребуется школьникам, если каждая группа должна целиком находиться в одной из машин такси (но одна машина может вмещать более чем одну группу)?

Входные данные
В первой строке записано целое число n (1 ≤ n ≤ 105) — количество групп школьников. Вторая строка содержит последовательность целых чисел s1, s2, ..., sn (1 ≤ si ≤ 4). Числа записаны через пробел, si — количество ребят в i-ой группе.

Выходные данные
Выведите единственное число — минимальное необходимое количество такси, чтобы отвезти всех ребят к Поликарпу.

Примеры
входные данные
5
1 2 4 3 3
выходные данные
4
входные данные
8
2 3 4 4 2 1 3 1
выходные данные
5
Примечание
В первом тесте возможно следующее распределение по четырем машинам:

третья группа (из четырех школьников),
четвертая группа (из трех школьников),
пятая группа (из трех школьников),
первая и вторая группы (из одного и двух школьников соответственно).
Существуют и другие способы расположиться в четырех машинах.
*/
fun main() {
    readLine()
    var counter = 0
    val arr = readLine()!!.split(" ").map { it.toInt()}.toTypedArray()
    arr.sortDescending()
    var sum = 0
    for (i in arr.indices) {
        // TODO
    }
    println(counter)
}