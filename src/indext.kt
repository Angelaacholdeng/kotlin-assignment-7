fun main() {
    odd()
    println(name("Achol","Deng","Umutoni"))
    checkDrink(4)
    checkDrink(8)
    checkDrink(50)
     checkNumbers()
        }


fun odd() {
    for (number in 1..100) {
        if(number%2 !=0){
            println(number)
        }
    }
    }

fun name(name1:String,name2:String,name3:String):Int{
    var names=arrayOf(name1,name2,name3)
    var count=0
    for (name in names){
        if(name.length>=5)
            count++
    }
    return count
}
fun checkDrink(age:Int){
    if (age<6){
        println("please have a glass of milk")
    }
    else if (age>6 && age <15){
        println("please have a bottle of fanta orange")
    }
    else{
        println("please have a bottle of coca cola")
}
}
fun checkNumbers(){
    for( n in 1..100){
        if(n%3!=0&&n%5!=0)
        println(n)
        if(n%3==0){
            println("fizz")
        }
         if(n%5==0){
            println("buzz")
        }
          if (n%3==0 && n%5==0){
            println("FizzBuzz")
        }
    }
}














