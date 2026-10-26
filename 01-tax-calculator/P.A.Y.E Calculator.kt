fun main() {
  val grossIncome: Double = 45000.00
  val personalRelief: Double = 2400.00
  var remainingIncome = grossIncome
  var grossTax = 0.0
  val band1Limit = 24000.00
  val band2Limit = 8333.00

  if (remainingIncome > 0) {
    val taxableInBand1 =
        if (remainingIncome <= band1Limit)
            remainingIncome
        else
            band1Limit

    grossTax += taxableInBand1 * 0.10
    remainingIncome -= taxableInBand1
}
  if (remainingIncome > 0) {
    val taxableInBand2 =
        if (remainingIncome <= band2Limit)
            remainingIncome
        else
            band2Limit

    grossTax += taxableInBand2 * 0.25
    remainingIncome -= taxableInBand2
}

  val netTaxPayable =
    if (grossTax > personalRelief)
        grossTax - personalRelief
    else
        0.0
  val netIncome = grossIncome - netTaxPayable

  when {
    grossIncome <= 0.0 -> {
        println("Invalid income entered.")
    }
    else -> {
        println("--- KRA MONTHLY PAYE TAX COMPUTATION ---")
        println("Gross Monthly Income : Ksh $grossIncome")
        println("Gross Tax (Before Relief): Ksh $grossTax")
        println("Less Personal Relief : Ksh $personalRelief")
        println("Final Tax Payable    : Ksh $netTaxPayable")
        println("Net Income (Take-Home): Ksh $netIncome")
    }
}
}
