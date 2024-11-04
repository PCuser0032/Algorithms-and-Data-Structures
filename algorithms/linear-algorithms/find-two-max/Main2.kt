fun main() {

    val s: Solution = Solution()
    val c: Check = Check()

    val arr: Array<Int> = arrayOf(71, 30, 74, 11, 25, 101, 5, 7, 200, 0)
    c.check(arr, s.findTwoMax(arr), Pair(200, 101))
    
    val arr1: Array<Int> = arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0)
    c.check(arr1, s.findTwoMax(arr1), Pair(9, 8))
    
    val arr2: Array<Int> = arrayOf(0, 9, 8, 7, 6, 10101, 4, 3, 2, 1)
    c.check(arr2, s.findTwoMax(arr2), Pair(10101, 9))

    val arr3: Array<Int> = arrayOf(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10)
    c.check(arr3, s.findTwoMax(arr3), Pair(-1, -2))

    val arr4: Array<Int> = arrayOf(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1)
    c.check(arr4, s.findTwoMax(arr4), Pair(-1, -2))

    val arr5: Array<Int> = arrayOf(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4)
    c.check(arr5, s.findTwoMax(arr5), Pair(4, 3))

    val arr6: Array<Int> = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    c.check(arr6, s.findTwoMax(arr6), Pair(0, 0))

    val arr7: Array<Int> = arrayOf(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1)
    c.check(arr7, s.findTwoMax(arr7), Pair(-1, -1))

    val arr8: Array<Int> = arrayOf(-500, -100, -101, -1, -21, -3001, 1)
    c.check(arr8, s.findTwoMax(arr8), Pair(1, -1))
}