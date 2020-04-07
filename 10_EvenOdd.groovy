class EvenOdd {

    void checkEvenOrOdd(n){
        if (n%2==0)
            print "Even"
        else
            print "Odd"
    }

    static void main(String[] args){

        print "Enter value: "
        def a = System.in.newReader().readLine() as Integer
        def evenodd = new EvenOdd()
        evenodd.checkEvenOrOdd(a)
    }
}