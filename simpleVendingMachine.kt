package SimpleVendingMachine
import java.util.Scanner
fun main() {
        val sn = Scanner(System.`in`)
        var option : Int
        println("Welcome")
    do {
        print("1. pepsi -> $2\n2. coca cola -> $3\n3. redbull -. $4\n4. fanta -> $3\n5. sting -> $3\n")
        println("Choose from menu ::")
        val choice = sn.nextInt()
        vendingMachine(choice)
        println("Do you want to continue ? if yes press 0 else press 1")
        option = sn.nextInt()
        if(option == 1){
            println("Thank You for purchasing :)")
        }
    }while (option==0)
}
fun  vendingMachine(c : Int){
    val sn = Scanner(System.`in`)
    //setting the stock of all the products
    var pepsiStock = 5
    var cocacolaStock = 5
    var resbullStock = 5
    var fantaStock = 5
    var stingStock = 5

    //Asking user to enter the amount
    println("Enter the amount : ")
    var amt = sn.nextInt()
    var result : Int
    //checking for the choice of user
    if(c == 1){ // this choice is for pepsi
        println("Available stock of pepsi is $pepsiStock")
        pepsiStock--
        if(pepsiStock == 0){
            println("Out of Stock sry :(")
        }
        else {
            if (amt > 2) {
                result = amt - 2
                println("Here is your balance : $$result")
            } else if (amt == 2) {
                println("your balance is : $0")
            } else {
                println("Insufficient amount !!!")
            }
        }
    }
    else if(c == 2){ // this choice is for coca cola
        println("Available stock of coca cola is $cocacolaStock")
        cocacolaStock--
        if(cocacolaStock == 0){
            println("Out of Stock sry :(")
        }
        else {
            if (amt > 3) {
                result = amt - 3
                println("Here is your balance : $$result")
            } else if (amt == 3) {
                println("your balance is : $0")
            } else {
                println("Insufficient amount !!!")
            }
        }
    }
    else if(c == 3){ // this choice is for redbull
        println("Available stock of redbull is $resbullStock")
        resbullStock--
        if(resbullStock == 0){
            println("Out of Stock sry :(")
        }
        else {
            if (amt > 4) {
                result = amt - 4
                println("Here is your balance : $$result")
            } else if (amt == 4) {
                println("your balance is : $0")
            } else {
                println("Insufficient amount !!!")
            }
        }
    }
    else if(c == 4){ // this choice is for fanta
        println("Available stock of fanta is $fantaStock")
        fantaStock--
        if(fantaStock == 0){
            println("Out of Stock sry :(")
        }
        else {
            if (amt > 3) {
                result = amt - 3
                println("Here is your balance : $$result")
            } else if (amt == 3) {
                println("your balance is : $0")
            } else {
                println("Insufficient amount !!!")
            }
        }
    }
    else if(c == 5){ // this choice is for sting
        println("Available stock of sting is $stingStock")
        stingStock--
        if(stingStock == 0){
            println("Out of Stock sry :(")
        }
        else {
            if (amt > 3) {
                result = amt - 3
                println("Here is your balance : $$result")
            } else if (amt == 3) {
                println("your balance is : $0")
            } else {
                println("Insufficient amount !!!")
            }
        }
    }
    else{
        println("invalid input pls try again !!!")
    }

}
