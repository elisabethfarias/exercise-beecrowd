import java.lang.Math.abs

fun maiorAB(a: Int, b: Int, c: Int) : String {
    val maiorAB = (a + b + abs(a - b)) / 2
    val result = (maiorAB + c + abs(maiorAB - c)) / 2

    return "$result eh o maior"

}