package subtask3

import java.lang.Exception

class TelephoneFinder {


    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
            val phone = number.toCharArray()
            for (i in phone) {
               if (!i.isDigit()) return null
            }
            val list = arrayListOf<String>()
            number.forEachIndexed { i, digit ->
                newNumbers(digit).forEach {
                    list.add(number.substring(0, i) + it + number.substring(i + 1))
                }
            }
       return  list.toTypedArray()
    }

    private fun newNumbers(n: Char): Array<Char>{
        return when (n) {
            '0' -> arrayOf('8')
            '1' -> arrayOf('2', '4')
            '2' -> arrayOf('1', '3', '5')
            '3' -> arrayOf('2', '6')
            '4' -> arrayOf('1', '5', '7')
            '5' -> arrayOf('2', '4', '6', '8')
            '6' -> arrayOf('3', '5', '9')
            '7' -> arrayOf('4', '8')
            '8' -> arrayOf('0', '5', '7', '9')
            '9' -> arrayOf('6', '8')
            else -> arrayOf()
        }
    }
}
