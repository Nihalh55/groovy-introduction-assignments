class Marks {

    String getGrade(m){
        if(m<=40)
            return "F"
        else if (m<=50)
            return "DD"
        else if (m<=60)
            return "CD"
        else if (m<=70)
            return "BC"
        else if (m<=80)
            return "BB"
        else if (m<=90)
            return "AB"
        else if (m<=100)
            return "AA"
        else
            return "No Grade"
    }

    static void main(String[] args){

        print "Enter marks: "
        def a = System.in.newReader().readLine() as Integer
        def markChecker = new Marks()
        println "The grade is : " + markChecker.getGrade(a)
    }
}