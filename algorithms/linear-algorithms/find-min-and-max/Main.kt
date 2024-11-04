fun main(args: Array<String>) {

    val arr: IntArray = intArrayOf(1, 10, 0, 0, 5, 109, 1, 2000, 70, 2, 909, 674, 1, 0)

    var min: Int = arr[0]
    var max: Int = arr[0]

    for (i in 1..<arr.size) {

        if (arr[i] < min) {

            min = arr[i]
        }

        if (arr[i] > max) {

            max = arr[i]
        }
    }

    println("Array:        { ${arr.joinToString()} }")

    println("Sorted array: { ${arr.sorted().joinToString()} }")

    println("Min value in array: $min")

    print("Max value in array: $max")
}