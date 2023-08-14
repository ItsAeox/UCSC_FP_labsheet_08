@main def Question_03: Unit = {
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    println(formatNames(name1, toUpper))
    println(formatNames(name2, toUpper))
    println(formatNames(name3, toLower))
    println(formatNames(name4, toLower))
}

val formatNames: (String, String => String) => String = (name, formatter) => formatter(name)

val toUpper: String => String = str => str.toUpperCase()

val toLower: String => String = str => str.toLowerCase()