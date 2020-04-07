class FibboSeq{
    def f0
    def f1

    FibboSeq(){
        f1 = 1
        f0 = 0
    }

    int getNthTerm(n){
        if(n <= 0)
            return f0
        else if(n == 1)
            return f1
        else
            return getNthTerm(n-1) + getNthTerm(n-2)
    }

    static void main(String[] args){

        print "Enter n: "
        def a = System.in.newReader().readLine() as Integer
        def fibboGen = new FibboSeq()
        println "The term is : " + fibboGen.getNthTerm(a)
    }

}