import kotlin.math.abs


fun main(){
    fun ageDescription(age: Int): String {

        if (age == 1){
             return "$age год"
        }
        else if (age % 10  in 2 ..4 ){
            return "$age года"
        }
        else
            return "$age лет"
    }
    fun minDivisor(n: Int): Int{
        var i = 1
        while (i <= n/2){
            i +=  1
            if (n % i == 0){
                return i
            }
    }
        return n
    }
    fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {
        var A : Boolean = r >= a
        var B : Boolean = r >= b
        var C : Boolean = r >= c
        var D : Boolean = s >= a
        var E : Boolean = s >= b
        var F : Boolean = s >= c
        if(A and D) return true
        if(A and E) return true
        if(A and F) return true
        if(B and E) return true
        if(B and F) return true
        if(C and D) return true
        if(C and E) return true

       return false
    }
    fun sin(x: Double, eps: Double): Double{
        var sinx: Double = x
        var y: Double = x
        var i = 1
        var znack = -1

        while (abs(y) > abs(eps)) {
            y = y * (x * x) / ((i + 1) * (i + 2))
            sinx += znack * y
            i += 2
            znack = -znack
        }

            return sinx
    }
    fun rookOrBishopThreatens(
            kingX: Int, kingY: Int,
            rookX: Int, rookY: Int,
            bishopX: Int, bishopY: Int
    ): Int {
        var result = 0
        if (kingX == rookX) {
            result += 1
        } else if (kingY == rookY) {
            result += 1
        }
        if (abs(kingX - bishopX) == abs(kingY - bishopY)){
            result += 2
        }
        return result
    }





    println(ageDescription(196))
    println(minDivisor(17))
    println(brickPasses(2,9,3,4,4,))
    println(sin(3.456,1E-2))
    println(rookOrBishopThreatens(7,6,8,1,4,4))
}




