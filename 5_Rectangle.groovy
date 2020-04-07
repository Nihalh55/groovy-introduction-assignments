class Rectangle {
    private def len
    private def bre

    void setDim(Integer l, Integer b){
        len = l 
        bre = b 
    }

    def getArea(){
        return (len*bre)
    }

    static void main(String[] args){

        print "Length of rectangle : "
        def l = System.in.newReader().readLine() as Integer
        print "Breadth of rectangle : "
        def b = System.in.newReader().readLine() as Integer
        def rec = new Rectangle()
        rec.setDim(l,b)
        println "Area of the rectangle : " + rec.getArea()
    }

}