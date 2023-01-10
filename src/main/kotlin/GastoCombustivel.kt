fun gastoCombustivel(gasto: Int, velocidade: Int) : String{
    val distancia = gasto * velocidade
    val totalLitroGasto = distancia / 12

    return String.format("%.3f", totalLitroGasto)
}