fun salarioBonus(salarioFixo: Double, totalVendas: Double) : String {
    val comissao  = totalVendas * 0.15
    val result = comissao + salarioFixo

    return  String.format("%.2f", result)
}