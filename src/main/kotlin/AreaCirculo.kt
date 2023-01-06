fun areaCirculo(raio: Double) : String {
    val pi = 3.14159
    val area =  pi * (raio*raio)
    return String.format("%.4f", area)
}