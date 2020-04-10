class TaxCalculator {

    def salary
    def savings
    def taxIncome
    def tax

    def getSalSav(sal,sav){
        salary = sal
        savings = sav 

        if(sav > 100000)
            taxIncome = salary - 100000
        else
            taxIncome = salary - sav
    }

    def getTax(){
        if(taxIncome <=100000)
            tax = 0
        else if (taxIncome <= 200000)
            tax = 0.1 * (taxIncome-10000)
        else if (taxIncome <= 500000){
            tax = (0.1 * (taxIncome-10000)) + (0.2 * (taxIncome-200000))
        else
           tax = (0.1 * (taxIncome-10000)) + (0.2 * (taxIncome-200000)) + (0.3 * (taxIncome-500000))
        }
    }

    static void main (String[] args){

        print "Enter salary : "
        def sal = System.in.newReader().readLine() as Integer
        print "Enter savings : "
        def sav = System.in.newReader().readLine() as Integer
        def taxer = new TaxCalculator()
        taxer.getSalSav(sal,sav)
        tax.getTax()
        println "Tax : " + tax.tax
    }

}