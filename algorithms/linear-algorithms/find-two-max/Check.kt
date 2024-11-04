class Check {

    fun check(arr: Array<Int>, compare: Pair<Int, Int>, compareTo: Pair<Int, Int>): Unit {

        println("Array: { ${arr.joinToString(separator = ", ")} }")

        val str: String = "compare(max1=\"${compare.first}\",max2=\"${compare.second}\")" + '\n' + "compareTo(max1=\"${compareTo.first}\",max2=\"${compareTo.second}\")" + '\n' + "checkResult(${compare == compareTo})" + '\n'

        println(str)
    }
}