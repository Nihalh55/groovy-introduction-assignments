class AddAmount {

    def amount 

    AddAmount(){
        amount = 50
    }

    AddAmount(money){
        amount = 50 + money
    }

    static void main (String[] args){

        def piggieBank1 = new AddAmount()
        println "Initial amount : " + piggieBank1.amount
        def piggieBank2 = new AddAmount(30)
        println "After adding, new amount : " + piggieBank2.amount
    }
}