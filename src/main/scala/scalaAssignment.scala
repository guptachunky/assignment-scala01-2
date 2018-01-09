class scalaAssignment {


  def stringInterpolation(myList: scala.List[Int]): Unit = {
    for (i <- myList) {
      println(s" ${myList.indexOf(i)} = $i")

    }
  }


  def maxNumber(myList: scala.List[Int]) :Int = {
    val myList = List(1, 5, 2, 9, 7)
    var maxVar = Integer.MIN_VALUE;
    for (i <- myList) {
      if (i > maxVar) {
        maxVar = i;
      }

    }
    maxVar
  }


  def fibonacci(num: Int): Int = {
    if (num == 0) {
      0
    }
    else if (num == 1) {
      1
    }
    else {
      fibonacci(num - 1) + fibonacci(num - 2)
    }

  }


  def sumOfNumbers(num: Int, sum: Int): Int = {
    if (num == 1) {
      sum
    }
    else {
      sumOfNumbers(num - 1, sum * num)
    }

  }


}

object scalaAssignment extends App {
  val myList=List(10,20,30,40,50)
  val obj = new scalaAssignment
  obj.stringInterpolation(myList)
  val max=obj.maxNumber(myList)
  println(s"maximum number = $max")
  val num=10;
  val fib = obj.fibonacci(num)
  println(s"fibinaaci number at $num position = $fib")
  val Limit=10
  var sumNum=obj.sumOfNumbers(Limit,1)
  println(s"sum of Numbers till $limit= $sumNum")
}
