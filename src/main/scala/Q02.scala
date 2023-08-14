@main def Question_02: Unit = {
    print("Enter an integer: ")
    val input = scala.io.StdIn.readInt()

    numberCheck(input)
}

val numberCheck: Int => Unit =  (input: Int) =>  {
    if (input <= 0){
        println("Negative/Zero Input is given.")
    }
    if (input % 2 == 0){
        print("Even number is given.")
    } else {
        print("Odd Number is given.")
    }
}