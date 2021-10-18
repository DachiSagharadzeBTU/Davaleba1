import kotlin.math.sqrt

fun main(){

    var a = Point(3.0, -12.0)
    var b = Point(7.0, 7.0)
    println("Kordinatebi1 : ${a.toString()}")
    println("Kordinatebi2 : ${b.toString()}")
    println()
    println("Kordinatebi1 ${a.equals(a)}")
    println("Kordinatebi2 ${b.equals(b)}")
    println()
    println("$a INTO ${a.reverse()}")
    println("$b INTO ${b.reverse()}")
    println()
    println("Mocemul wertilebs shoris mandzilia ${Mandzili(a,b)}")
}

class Point(private var x:Double,private var y:Double){
    fun pirveli(): Double{
        return x
    }
    fun meore(): Double{
        return y
    }
    override fun toString(): String {
        return "x -> $x  y -> $y"
    }

    override fun equals(other: Any?): Boolean {
        return (x==y)
    }
    fun reverse():String{
        x=-x
        y=-y
        return "x:$x && y:$y"
    }
}
fun Mandzili(a: Point, b: Point) :String{
    var j: Double = a.meore() - b.meore()
    var k: Double = a.pirveli() - b.pirveli()
    if (j<0) j=-j
    if (k<0) k=-k
    return "fesvi ${j*j+k*k}-dan == ${sqrt(j*j+k*k)}"
}
