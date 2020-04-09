class example {
    static void main(String[] args){
        def sub1 = new subclass1()
        sub1.message()
        def sub2 = new subclass2()
        sub2.message()
    }
}

abstract class Parent { 
   public Parent() { } 
   abstract void message();
}

class subclass1 extends Parent {
    void message(){
        println "This is the first subclass"
    }
}

class subclass2 extends Parent {
    void message(){
        println "This is the second subclass"
    }
}


