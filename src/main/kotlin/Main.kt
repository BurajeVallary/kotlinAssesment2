//1 Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.

fun main(){

   val Vowel=vowel("Vallary")
    println(Vowel)

    val come=random("What")
    println(come)

    multiples()


    val account = CurrentAccount("248908oou23", "Vallary Buraje", 769.90)

    account.deposit(500.0)
    account.withdraw(200.0)
    account.details()


    val save= SavingAccount("123YHY90","Violet",123.09)
    save.withdrawals(200)

    save.check(3)

    val take=takePassword("info@questlabs-kenya.com")
    println(take)









}





fun vowel(name: String): Triple<Char, Char, Int> {
    val first = name.first()
    val last = name.last()
    val length = name.length

    return Triple(first, last, length)
}

fun random(name: String): Boolean {
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return name.first() in vowels
}


//2 Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”



    fun multiples() {
        for (b in 1..1000) {
            if (b % 6 == 0 && b % 8 == 0) {
                println("Bingo!")
            } else if (b % 6 == 0) {
                println(b)
            } else if (b % 8 == 0) {
                println( b )
            }
        }



}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false


fun takePassword(password: String): Boolean {
    val long="val2010y"
    val sixteen="val@vb20201buraje87y"
    val word="password"
    val strict=12345678

  return true

}


//4 Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”


class CurrentAccount(var accountNumber:String, val accountName: String, var balance: Double) {

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
        } else {
            println("no")
        }
    }

    fun details() {
        println("Account number  $accountNumber with balance $balance is operated by $accountName")
    }
}


//5 Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal


class SavingAccount(var accountNumber:String, val accountName: String, var balance: Double){
    fun withdrawals(amount:Int){
        if (amount <= balance) {
            balance += amount
        } else {
            println("Your new balance is $balance")
        }
    }

    fun check(num:Int){
        if (num<=4){
            balance+=num
        }else{
            println("You can not withdraw")
        }
    }
}

