

fun main(args : Array<String>) {
    val number:Int
    println("Hello, введите любое число")
    do {
        val input = readLine()?:""
        val numberNullable: Int? = input.toIntOrNull()
        if (numberNullable!=null) {
            number = numberNullable
            break
        }
        println("Вы ввели не число")

    }while (true)
    val list = addNumsToList(number)
    printPositive(list)
    filter(list)

}

fun addNumsToList(num:Int):MutableList<Int>{
    println("Вы ввели $num")
    var list = mutableListOf<Int>()

    println("Введите числа или exit/e чтобы прекратить ввод")
    do {
        val input = readLine()?:""
        if (input.equals("e", true) || input.equals("exit", true))
            break
        val number: Int = input.toIntOrNull() ?: continue
        list.add(number)

    }while (true)



    print("Вы ввели: ")
    list.forEach { n->print("$n ") }
    println()
    return list
}


fun printPositive(list:MutableList<Int>){
    print( "Среди них положительным числами будут: ")
    list.forEach { n-> if (n>=0) print("$n ") }
    println()
}

fun filter(list: MutableList<Int>) {
    println("Среди них четные числа будут: ")
    list.filter { it%2 == 0 }.forEach { n -> print("$n ") }
    println()
}


/*
val localList = addNumToList(number)

print("Вы ввели: ")


for (i in localList.indices){
    print(localList[i])
    if (i<localList.size - 1) print(", ")
    else print("\n")
}
*/