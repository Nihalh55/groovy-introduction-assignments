class Triangle {
    private def s1
    private def s2
    private def s3
    
    def area
    def perimeter

    Triangle(){
        area = 0
        perimeter = 0
    }

    Triangle(a, b, c){
        s1 = a
        s2 = b
        s3 = c
        area = 0
        perimeter = 0
    }

    void calculateAreaAndPerimeter(){
        perimeter = (s1+s2+s3)
        
        def s = perimeter / 2
        area = s*(s-s1)*(s-s2)*(s-s3)
        area = Math.sqrt(area)
    }

    static void main(String[] args){

        def tri = new Triangle(3,4,5)
        tri.calculateAreaAndPerimeter()
        println "Perimeter of the traingle : " + tri.perimeter
        println "Area of the triangle : " + tri.area
    }

}