package org.zonghan.oo

/**
  * Created by wuzonghan on 17/2/14.
  */
object Classes {
  def main(args: Array[String]):Unit = {
    val pt = new Point(1, 2)
    println(pt)
    pt.move(10, 10)
    println(pt)
  }
}