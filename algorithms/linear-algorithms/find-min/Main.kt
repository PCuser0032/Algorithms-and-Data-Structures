fun main(args: Array<String>) {

    val arr: IntArray = intArrayOf(1, 10, 0, 0, 5, 109, 1, 2000, 70, 2, 909, 674, 1, 0)

    var min: Int = arr[0]

    for (i in 1..<arr.size) {

        if (arr[i] < min) {

            min = arr[i]
        }
    }

    println("Array: { ${arr.joinToString()} }")

    print("Min value in array is $min")
}