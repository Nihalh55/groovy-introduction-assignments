class Print {
    void print1(String c, int i){
        println "First : " + c + " | Second : " + i
    }

    void print2(int i , String c){
        println "First : " + i + " | Second : " + c
    }

    static void main (String[] args){

        def printer = new Print()
        printer.print1('a',1)
        printer.print2(1,'a')
    }
}