fun main(args:Array<String>){
    var count=1
    do {
        println("Loop $count")

        if (count==2){
            println("count = $count")
        }
        count++
    }while (count<=5)
    println("Loop has done!")
}