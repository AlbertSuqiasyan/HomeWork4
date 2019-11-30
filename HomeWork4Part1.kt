fun main(args: Array<String>) {
    var arr = IntArray(0)
    arr = arr add 3 // add at to end
    arr = arr add 7 add 1
    arr = arr add 9 add 6 add 8
//    arr = arr insert 5 at 2 // insert 5 into position 3
    arr `remove at` 3 // set to 0 at position 3
    arr `remove at` 1
    arr print 2..5
    println()
}

private infix fun IntArray.print(intRange: IntRange) {
    var tempArr = this
    for (number in intRange) {
        print(tempArr[number])
    }
}

private infix fun IntArray.`remove at`(i: Int): IntArray {
    var tempArr = this
    tempArr[i] = 0
    return tempArr
}

infix fun IntArray.add(s: Int): IntArray {
    var tempArr = IntArray(this.size + 1)
    tempArr[size] = s
    for (element in 0 until size) {
        tempArr[element] = this[element]
    }
    return tempArr
}
