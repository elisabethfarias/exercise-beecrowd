fun consumoMedioAutomovel(distancia: Int, totalCombustivel: Double) : String {
    val consumoMedio = distancia / totalCombustivel
    return String.format("%.3f", consumoMedio)
}