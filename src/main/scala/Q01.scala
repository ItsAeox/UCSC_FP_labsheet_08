@main def Question_01: Unit = {
    print("Enter the deposit amount: ")
    val depositAmount = scala.io.StdIn.readDouble()

    val interest = calculateInterest(depositAmount)
    print(s"Interest : Rs. $interest")
}

val calculateInterest: Double => Double = (depositAmount: Double) => {
    if (depositAmount <= 20000) {
        depositAmount * 0.02
    } else if (depositAmount <= 200000) {
        depositAmount * 0.04
    } else if (depositAmount <= 2000000) {
        depositAmount * 0.035
    } else {
        depositAmount * 0.065
    }
}



