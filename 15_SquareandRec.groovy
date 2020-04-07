class Shape {
    static void main (String[] args){
        
        def rec = new Rectangle(3,4)
        def squ = new Square(4,4)

        println "RECTANGLE"
        println "The area is : " + rec.getArea()
        println "The perimeter is : " + rec.getPeri()
        println "SQUARE"
        println "The area is : " + squ.getArea()
        println "The perimeter is : " + squ.getPeri()
    }
}

class Rectangle {

    def len
    def bre
    def peri
    def area

   Rectangle(l,b){
       len = l 
       bre = b 
       peri = 2*(l+b)
       area = l*b 
   }

   def getArea(){
       return (area)
   }

   def getPeri(){
       return (peri)
   }

}

class Square extends Rectangle {

    Square(x,y) {
        super(x,y)
    }

}