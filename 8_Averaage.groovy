class Average {
    private def a
    private def b
    private def c

    void setNum(a,b,c){
        this.a = a 
        this.b = b 
        this.c = c
    }

    def getAverage(){
        return (a+b+c)/3
    }

    static void main(String[] args){

        print "Enter 1st value: "
        def a = System.in.newReader().readLine() as Integer
        print "Enter 2nd value: "
        def b = System.in.newReader().readLine() as Integer
        print "Enter 3rd value: "
        def c = System.in.newReader().readLine() as Integer
        def avg = new Average()
        avg.setNum(a,b,c)
        println "Average : " + avg.getAverage()
    }

}