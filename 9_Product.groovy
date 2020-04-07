class Product{
    def n1
    def n2
    def product

    def Product(a,b){
        n1  = a
        n2 = b
        product = a*b
    }

    static void main(String[] args){

        print "Enter 1st value: "
        def a = System.in.newReader().readLine() as Integer
        print "Enter 2nd value: "
        def b = System.in.newReader().readLine() as Integer
        def prod = new Product(a,b)
        println "Prouct is : " + prod.product
    }
}