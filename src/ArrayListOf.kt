fun main(args: Array<String>) {
    val arrayList = arrayListOf(1,2,3)
    print("ArrayList array : ")
    for (item in arrayList) {
        print("$item")
    }
    print("\n")

    arrayList +=9
    print("Tambahkan elemen 9 dalam arraylist : ")
    println(arrayList)

    arrayList.reverse()
    print("Reverse arrayList : ")
    println(arrayList)

    arrayList -= (1..5)
    print("Add range in arrayList : ")
    println(arrayList)
}