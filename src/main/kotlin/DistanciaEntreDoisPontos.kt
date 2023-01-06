fun distanciaEntreDoisPontos(x1: Float, y1: Float, x2: Float, y2: Float) : String {

    val distancia = Math.sqrt(Math.pow(x2.toDouble() - x1.toDouble(), 2.0) + Math.pow(y2.toDouble() - y1.toDouble(), 2.0))

    return String.format("%.4f", distancia)
}