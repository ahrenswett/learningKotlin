import java.util.*


fun main(args: Array<String>){
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it?")
    // get the current day of the week
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println(
        //use a when a when must contain an else
        when(day) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "time is frozen"
        }
    )
}