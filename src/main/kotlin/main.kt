fun main() {

    for(r in 1..12){
        println()
        for(c in 1..12){
            if(c*r<10){
                print(" ")
            }
            if(c*r<100){
                print(" ")
            }
            print(" " + c*r)
        }
    }
}