fun media2(a: Double, b: Double, c: Double) : String {
    val media = ((a * 2) + (b * 3) + (c * 5)) / (2 + 3 + 5)
    return String.format("%.1f", media)

}