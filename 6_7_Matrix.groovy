class Matrix {
    def r 
    def c 
    def matrix

    def setDim(a,b){
        r = a
        c = b
        matrix = new Integer[r][c]
        
        r.times { y ->
            c.times { x ->
                matrix[y][x] = 0
            }
        }
    }

    def getRowCount(){
        return r 
    }
    def getColumnCount(){
        return c 
    }

    void setElementAtPosition(i,j,ele){
        matrix[i][j] = ele
    }

    void displayMatrix(){
        r.times { y ->
            c.times { x ->
                print matrix[y][x] + " " 
            }
            println ""
        }
    }

    def addMatrices(Matrix A, Matrix B){

        def C = new Matrix()
        C.setDim(A.r,A.c)

        if ((A.r == B.r) && (A.c == B.c)){
            (A.r).times { y ->
                (A.c).times { x ->
                    C.setElementAtPosition(y,x,(A.matrix[y][x] + B.matrix[y][x])) 
                }
            }
            println "Added"
        }
        else{
            println "Not addable"
        }
        return C
    }

    def multiplyMatrices(Matrix A, Matrix B){

        def C = new Matrix()
        C.setDim(A.r,B.c)

        if(A.c == B.r){
            
            (A.r).times { y ->
                (B.c).times { x ->
                    (A.c).times { k ->
                        C.setElementAtPosition(y,x,C.matrix[y][x] + (A.matrix[y][k]*B.matrix[k][x]))
                    }
                }
            }
            println "Multiplyable"
        }
        else{
            println "Not Multiplyable"
        }
        return C
    }

    static void main (String[] args){

        def A = new Matrix()
        def B = new Matrix()

        A.setDim(2,2)
        B.setDim(2,2)

        A.setElementAtPosition(0,0,2)
        A.setElementAtPosition(0,1,4)
        A.setElementAtPosition(1,0,1)
        A.setElementAtPosition(1,1,4)

        B.setElementAtPosition(0,0,1)
        B.setElementAtPosition(0,1,4)
        B.setElementAtPosition(1,0,1)
        B.setElementAtPosition(1,1,3)

        def C = A.addMatrices(A,B)
        def D = A.multiplyMatrices(A,B)

        println "Added Matrix : "
        C.displayMatrix()
        println "Multiplied matrix : "
        D.displayMatrix()
    }
}