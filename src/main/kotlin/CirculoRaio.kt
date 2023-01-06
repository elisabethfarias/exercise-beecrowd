fun circuloRaio(raio: Float) : String {
    val pi = 3.14159
    val area = pi * (raio * raio)

    return String.format("%.3f", area)
}