package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        val a = array[0]
        val n = array[1]
        var k = 0
        var combinations = 0.0
        for (i in 1..n) {
            combinations = factorial(n) / (factorial(n - i) * factorial(i))
            k = i
            if (combinations == a.toDouble()) break
        }
        return if (combinations < a.toDouble()) null else k
    }

    fun factorial(num: Int): Double {
        var result = 1.0
        for (i in 2..num) result *= i
        return result
    }
}
