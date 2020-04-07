class Factorial {

    int fact(n){
        if (n == 0 || n ==1)
            return 1
        else
            return n * fact(n-1)
    }

    static void main (String[] args){

        print "Enter value: "
        def a = System.in.newReader().readLine() as Integer
        def fact = new Factorial()
        println "Factorial is  : " + fact.fact(a)
    }
}