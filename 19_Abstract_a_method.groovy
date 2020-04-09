class example {
    static void main(String[] args){
        def sub1 = new subclass()
        sub1.a_method()
        sub1.non_abstract()        
    }
}

abstract class Abstract_class { 
   public Abstract_class() {
       println "This is constructor of abstract class"
   } 
   abstract void a_method();
   void non_abstract(){
       println "This is a normal method of abstract class"
   }
}

class subclass extends Abstract_class {
    void a_method(){
        println "This is an abstract method"
    }
}


