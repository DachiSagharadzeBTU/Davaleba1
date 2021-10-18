import java.io.PipedReader

fun main() {
    var f1 = Fraction(4.0, 8.0)
    var f2 = Fraction(5.0, 6.0)

    println(f1 == f2)

    println(f1)
    println(f2)
    println()
    println("Shekvecili : ${f1.shekveca()}")
    println("Shekvecili : ${f2.shekveca()}")
    println()
    println("Mocemuli wiladebis jamia : ${add(f1,f2)}")
    println("Mocemuli wiladebis namravlia ${Gamravleba(f1,f2)}")
}

class Fraction(n: Double, d: Double) {
    public var numerator: Double = n
    public var denominator: Double = d
    fun pirveli(): Double {
        return numerator
    }

    fun meore(): Double {
    return denominator
}
    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator + other.denominator / denominator == other.numerator) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator / $denominator"

    }
    fun shekveca(): String {
        var i: Double = 1.0
        while (i < denominator) {
            i = i + 1;
            if (denominator % i == 0.0 && numerator % i == 0.0) {
                numerator = numerator / i
                denominator = denominator / i
                i=1.0;
            }
        }
        return "$numerator / $denominator"
    }
}
fun add( f1: Fraction, f2: Fraction):String{
     var Pirv: Fraction = f1
     var Meore: Fraction = f2
    var i: Double = Pirv.meore()
    while (i <= Pirv.meore()*Meore.meore()){
        if (i % Pirv.meore() == 0.0 && i%Meore.meore() == 0.0)
            break
        else i=i+Pirv.meore()
    }
    return "${Pirv.pirveli()*(i/Pirv.meore())+Meore.pirveli()*(i/Meore.meore())} / $i"
}
fun Gamravleba( f1: Fraction, f2: Fraction): String{
    var Pirv: Fraction = f1
    var Meore: Fraction = f2
    return "${Pirv.pirveli() * Meore.pirveli()} / ${Meore.pirveli()*Meore.meore()}"
}