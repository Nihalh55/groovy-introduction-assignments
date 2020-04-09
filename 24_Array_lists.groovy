class Example {
   static void main(String[] args) {
    println "Creating List"
    def lst = [];
    println "Adding Lion"
    lst.add('Lion');
    println(lst);
    println "Adding Tiger"
    lst.add('Tiger')    
    println(lst);
    println "Adding Elephant"
    lst.add('Elephant')    
    println(lst);


    println "Retrieving lst(1) (second position)"
    println(lst.get(1))

    println "Replacing Tiger with Giraffe"
    lst[1] = "Giraffe"
    println(lst)    

    println "Removing 3rd Element"
    lst.remove(2)
    println(lst)    

    println "Searching for Lion"
    println(lst.find {it == "Lion"})  

    println "Iterating through elements"
    lst.each{
        println "Item: $it"
    }  

   } 
}