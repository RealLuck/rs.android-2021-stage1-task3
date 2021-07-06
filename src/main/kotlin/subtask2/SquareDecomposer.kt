package subtask2


import kotlin.math.pow

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val sum = number.toDouble().pow(2.0)
        return calculate(sum, number)?.toTypedArray()
    }

    fun calculate(squareNumber: Double, number: Int): ArrayList<Int>? {
        if (squareNumber < 0.0) return null
        if (squareNumber == 0.0) return arrayListOf()

        var list: ArrayList<Int>? = null
        var number = number
        while (list == null && number > 1) {
            number--
            val newSquareNumber = squareNumber - number.toDouble().pow(2.0)
            list = calculate(newSquareNumber, number)
        }
        list?.add(number)
        return list
    }

}
