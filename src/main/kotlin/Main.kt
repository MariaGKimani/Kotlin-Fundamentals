import java.time.Year

fun main() {
    printNotificationSummary(51)
    printNotificationSummary(101)

    ticketPrice(23)
    ticketPrice(8)
    ticketPrice(56)
    ticketPrice(67)
    ticketPrice(167)
    var song = Song("Isabella","Sautisol",2017,43)
    song.playsong()
    song.pc()


    //area of rectangle
    var rectangle =Rectangle(45,10.0)
    rectangle.calc()
//Class Woman
    var woman = Woman("Mariagoretti",22)
    woman.wom()

    //
    space("  I LOVE KOTLIN    ")
    space("    I LOVE KOTLIN    ")

    //var people= Person("Alvince",21,"tennis", " println("Name:$name")")
    reverse("Maria")
    rev(arrayOf(23,4,5,39,56,35))

    numb2(arrayOf(54,33,22,1,66,45,32,12))
}

//N.O 1(Developer Android)
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have ${numberOfMessages} notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}
//N.O 2(Developer android)
fun ticketPrice(people: Int){
   if (people <= 12 ){
        println("The movie ticket price for a person aged $people is $15")
    }else if (people >=13 && people <= 60){
        println("The movie ticket for a person aged $people is $30")
    }else if (people >=61 && people <= 100){
        println("The movie ticket price for a person aged $people is $20")
    }else{
        println("-1")
    }
}


//N.o 3(Developer android)
class Song( var title: String, var artist: String,var year: Int, var playCount: Int){
    fun playsong(){
        println("$title performed by $artist, was released in $year")
    }
    fun pc(){
        if(playCount < 1000){
            println("unpopular")
        }else{
            println("popular")
        }
    }
}
//N.O 5(Developer Android)
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
       println("Name:$name")
        println("Age:$age")
        println("Likes to play $hobby .Doesn't have a referrer")
    }
}

//N.O 6
//Create a class called Rectangle with properties width and height. Write a method to calculate the area of the rectangle in Kotlin.
class Rectangle(val width: Int,val height: Double){
    fun calc(){
        println(width*height)
    }
}
//N.O 7
//Create a class called Woman with properties name and age. Write a method to print out the woman's name and age in Kotlin.
class Woman(val name: String,val age: Int){
    fun wom(){
        println("My name is $name and i am $age years old")
    }

}
//N.O 8
//Write a Kotlin program to remove all the white spaces from a given string.
fun space(num1: String){
    println(num1.trim())
    //println(num1.trimStart())
    //println(num1.trimEnd())
}
//N.O 9
// Write a Kotlin program to reverse a given string.
fun reverse(npm: String){
    println(npm.reversed())
}
//write a Kotlin program to reverse an array of int
fun rev( x: Array<Int>){
    println(x.reversed())
}


//N.0 10
//Create a class called BankAccount with properties balance and accountNumber. Write methods to deposit and withdraw money from the account in Kotlin.
class BankAccount (val balance: Int,val accountNumber: Int){
    fun deposit(){

    }
    fun withdraw(){

    }
}

//N.O 11
//Write a Kotlin program to count the number of vowels in a given string
fun vowel(){
    val vowels = "i love kotlin"
}


//N.O 12
//Given an array of strings, write a program in Kotlin to find the longest string in the array.



//N.O 13
//Write a program in Kotlin to find the sum of all the even numbers in an array of integers.





//N.O 14
//Given an array of integers, write a program in Kotlin to find the secondlargest number
fun seclargest(){
    var arr = arrayOf(12,3,45,65,44,120,88)
}



//N.O 15
// Write a Kotlin program to sort an array of integers in ascending order.
fun numb2(numss: Array<Int>){
    println(numss.sortedArray().contentToString())
}
//N.O 16
//Given an array of strings, write a program in Kotlin to find the longest string in the array.
