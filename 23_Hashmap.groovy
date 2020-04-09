class Example { 
   static void main(String[] args) { 
      def mp = [1 : "Red", 2 : "Blue"] 
      println "Size of Hashmap mp:"
      println(mp.size()); 
      def mp_2 = mp
      println "Copying map from mp to mp_2"
      println "Size of Hashmap mp_2:"
      println(mp_2.size())
      println "Removing mappings from mp"
      mp.remove(1)
      mp.remove(2)
      println "New size of mp"
      println(mp.size())
      println "Checking if mp is empty:"
      println(mp.isEmpty())

   } 
}