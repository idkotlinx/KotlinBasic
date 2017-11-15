fun main(args:Array<String>){
    for (count in 1..10){
        // Continue = Next Looping
        /*
        if (count==4){
            continue
        }
        */

        // Break = End Looping
        if(count==4){
            break
        }

        println("Count : $count")
    }
}