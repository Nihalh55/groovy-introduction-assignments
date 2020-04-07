class PerfectNumber {

    def printPerfect(){
        
        def sum

        1001.times{ n ->
            sum = 0
            if (n != 1 && n != 0){
                n.times{ i ->
                    if(i != 0){
                        if(n%i == 0)
                            sum = sum + i
                    }
                }
                if (sum === n)
                    println n 
            }    
        }
    }

    static void main(String[] args){

        def printPerfects = new PerfectNumber()
        printPerfects.printPerfect()
    }
}