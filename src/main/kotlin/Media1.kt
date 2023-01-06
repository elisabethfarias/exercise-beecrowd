fun mediaPonderada(a: Float, b: Float) : String {
    val media = ((a * 3.5f) + (b * 7.5f)) / (3.5f + 7.5f)
    return String.format("%.5f", media)
}