fun test(a: String): Int = a.length //функция уровня пакета

fun main() {
    //HELLO WORLD ----------------------------------------------
    println("Hello World!")
    val a = "Test"
//  a = "qwerty" ошибка т.к. val
    val b: String = "test" // указание типа
    val c = 1

    var test = "tast" // var - variable
    test = "qwerty"
    var t: String? = "test" // ? - если нужен Null
    t = null
    print(t?.length) //т.к. может быть null

    val x = 4;
    val y = 5;
    val res = a + b;
    println(res)

    val a1 = 123
    val b1 = a1.toString()
    println("test: $test  + ${1 + 1}")

    //управление потоком ----------------------------------------------
    val r = if (a != null) {
        println(true)
        1
    } else {
        println(false)
        2
    }

    val qqq = if (1 > 0) "asd" else "aaa"
    println(qqq)

    val a2: Any = "123" + "456"
    when (a2) {
        "1234567" -> println("Строка")
        123456 -> println("Число")
        is String -> println("String length: ${a2.length}")
        else -> println("Не понятно")
    }

    //циклы ----------------------------------------------
    var i = 1;
    while (i <= 10) {
        print(" " + i++)
    }

    for (i in 10 downTo 1 step 2) {
        print(" " + i)
    }

    repeat(3) { println("Hello") }

    val s: String? = "123"
    val ll = s?.length ?: 0 // Елвис оператор

    //КОЛЛЕКЦИИ ----------------------------------------------
    val list = listOf(1, 2, 3, 4, 5, 12, 23, 34, 45, 56, 78, 898)
    val stringList = listOf<String>()
    println(list[0])

    list.map { it + 1 }.filter { it < 100 }.forEach { println(it) }

    val listInt = mutableListOf<Int>()
    listInt.add(1)
    listInt.add(2)

    val pair = 1 to "qqq"
    val m = mapOf(1 to "111", 2 to "222")
    m.forEach { println("${it.key}: ${it.value}") }

    val mm = mutableMapOf(1 to "q")
    mm[1] = "w"

    val l1 = listOf(1, 2, 3)
    val l2 = listOf("a", "b", "c")

    val lr = l1.zip(l2) { i1, i2 -> "$i2: $i1" }
    println(lr);

    // ФУНКЦИИ ----------------------------------------------
    test("asd")
    test1("qqq", 3)

    try {
        1 / 0
    } catch (e: Exception) {
        println("Exception $e")
        //1/0
    } finally {
        println("Finally")
    }

    val er = try {
        2
    } catch (e: Exception) {
        1
    }
}

// ФУНКЦИИ ----------------------------------------------
fun test1(a: String, b: Int? = null): Int {
    return a.length
}

fun test2(a: String, b: Int): Int {
    return a.length + b
}

fun <T> test3(a: T): T {
    return a
}

