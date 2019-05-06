package lectures.oo

import java.util.Date
import java.sql.{Date => SqlDate}

import playground.PrinceCharming


object PackageAndImport extends App {

  // can access class within same package without importing
  val writer = new Writer("Daniel", "", 2019)

  // don't need to import
  val cinderella = new playground.Cinderella

  sayHello
  println(SPEED_OF_LIGHT)

  val princeCharming = new PrinceCharming

  val d = new Date
  val sqlD = new SqlDate(1L)


}
