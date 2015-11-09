package math.collatz

class Collatz(val debug : Boolean = false) {
  var max = 0
  def stop(n : Int) : Int = {
    if (n > max) max = n
    if (debug) print(n)
    if (n == 1) return 1
    if (debug) print(",")
    if (n % 2 == 1) {
      1 + stop(3*n+1)
    } else {
      1 + stop(n/2)
    }
  }
}

object Collatz {
  def main(args : Array[String]) = {
    val dbg = if (args.isEmpty) false else args(0) == "debug"
    for (n <- 1 to 1024) {
      var collatz = new Collatz(dbg);
      print("C(" + n + ")")
      if (dbg) print("=(")
      var stop = collatz.stop(n)
      if (dbg) print(")")
      println("=" + stop + ", max=" + collatz.max)
    }
  }
}