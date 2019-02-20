object Application {

  // write your function here

  def calculateBonus (income: Int, bonus: Boolean): String = {
    if (bonus == true) {
      val wage:Int= (income * 1.2).toInt
      s"£$wage"
    }

    else s"£$income"
  }


  def main(args : Array[String]) : Unit = {
    println(calculateBonus(100, true))  // should print £120
    println(calculateBonus(100, false)) // should print £100
  println(calculateBonus(99, true))   // should print £118
}
}