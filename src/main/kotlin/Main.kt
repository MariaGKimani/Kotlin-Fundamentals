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
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have ${numberOfMessages} notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}
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


//N.o 4
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

