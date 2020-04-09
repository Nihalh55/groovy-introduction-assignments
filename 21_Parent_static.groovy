class example {
    static void main(String[] args){
        def sub1 = new A_class()
        sub1.a_method()
        def sub2 = new B_class()
        sub2.a_method()
        def A_class obj = new B_class() 
        obj.a_method()       
    }
}

class A_class { 
   static void a_method(){
       println "Parent"
   }
}

class B_class extends A_class {
    void B_class(){}
    static void a_method(){
        println "Child"
    }
}

