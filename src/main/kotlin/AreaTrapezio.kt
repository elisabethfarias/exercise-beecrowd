fun areaTrapezio(baseMaior: Float, baseMenor: Float, altura: Float) : String {
    val area = (baseMaior + baseMenor) * altura / 2
    return String.format("%.3f", area)
}