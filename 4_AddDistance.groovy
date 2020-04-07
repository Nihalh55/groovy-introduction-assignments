class AddDistance {
    private def f1
    private def f2
    private def i1
    private def i2

    def addDistance(){
        def i = (i1+i2)%12
        int f = ((i1+i2)/12)
        f = f + f1 + f2
        return [f,i]
    }

    def setMeas(a,b,x,y){
        f1 = a 
        f2 = x 
        i1 = b 
        i2 = y 
    }

    static void main (String[] args){

        print "Enter 1st feet value: "
        def a = System.in.newReader().readLine() as Integer
        print "Enter 1st inches value: "
        def b = System.in.newReader().readLine() as Integer
        print "Enter 2nd feet value: "
        def x = System.in.newReader().readLine() as Integer
        print "Enter 2nd inches value: "
        def y = System.in.newReader().readLine() as Integer
        def adder = new AddDistance()
        
        adder.setMeas(a,b,x,y)
        def distance = adder.addDistance()
        
        println "Added distance is : " + distance[0] + " feet and " + distance[1] + " inches."
    }


}