class example {
    static void main(String[] args){
        def sub1 = new Square()
        sub1.r_message()
        sub1.message()
    }
}

class Shape { 
   public Shape() { } 
   public void message(){
       println "This is Shape"
   }
}

class Rectangle extends Shape {
    public void r_message(){
        println "This is Rectangular Shape"
    }
}

class Circle extends Shape {
    public void c_message(){
        println "This is Circular Shape"
    }
}


class Square extends Rectangle {
    public void s_message(){
        println "Square is a Rectangle"
    }
}
