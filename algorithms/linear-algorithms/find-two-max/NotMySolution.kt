
// Решение получено через поиск Яндекса: решение получено на основе источников, через сервис "Нейро".
fun main() {

    val arr: Array<Int> = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    var max1: Int = arr[0]
    var max2: Int = arr[1]

    for (i in 2..<arr.size) {

        if (arr[i] > max1) {

            max2 = max1;
            max1 = arr[i];
        } else if (arr[i] > max2 && arr[i] != max1) {

            max2 = arr[i];
        }
    }

    println("Array: { ${arr.joinToString(separator = ", ")} }")

    print("max1 = $max1, max2 = $max2")
}