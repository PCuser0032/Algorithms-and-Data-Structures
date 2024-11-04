
fun main() {

    val arr: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    var max1: Int = arr[0]
    var max2: Int = arr[1]

    var temp: Int = 0

    for (i in 2..< arr.size - 1) {

        if (max1 < arr[i]) {

            max1 = arr[i]
        }

        if (max2 < arr[i + 1]) {

            max2 = arr[i + 1]
        }

        if (max1 < max2) {

            temp = max1

            max1 = max2
            max2 = temp
        }
    }

    println("Array: { ${arr.joinToString(separator = ", ")} }")

    print("max1 = $max1, max2 = $max2")
}