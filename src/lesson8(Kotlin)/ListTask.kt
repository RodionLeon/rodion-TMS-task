package `lesson8(Kotlin)`

fun main() {
    var setOfNumber: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    var number: Int = 1271


    /**
     * Средняя (3 балла)
     *
     * В заданном списке list каждый элемент, кроме первого, заменить
     * суммой данного элемента и всех предыдущих.
     * Например: 1, 2, 3, 4 -> 1, 3, 6, 10.
     * Пустой список не следует изменять. Вернуть изменённый список.
     *
     * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
     */
    fun accumulate(list: MutableList<Int>): MutableList<Int> {
        var sum = 0
        for (i in list.indices) {
            list[i] = list[i] + sum
            sum = list[i]
        }
        return list
    }

    /**
     * Средняя (3 балла)
     *
     * Разложить заданное натуральное число n > 1 на простые множители.
     * Результат разложения вернуть в виде списка множителей, например 75 -> (3, 5, 5).
     * Множители в списке должны располагаться по возрастанию.
     */
    fun factorize(n: Int): ArrayList<Int> {
        var simpleMultiplierList: ArrayList<Int> = arrayListOf()
        var temp: Int = n
        var i: Int = 2
        for (i in i..n) {
            if (temp / i is Int && temp % i == 0) {
                temp /= i
                simpleMultiplierList.add(i)
                if (temp % i == 0) {
                    simpleMultiplierList.add(i)
                }
            }
        }

        return simpleMultiplierList
    }


    println(accumulate(setOfNumber))
    println(factorize(number))

}