import scala.io.BufferedSource

/**
  * Created by sal on 26/05/17.
  */
object Main extends App {

  def split(inp:String):List[String] = {
    inp.split(",").toList.map(_.trim)
  }

  val bufferedSource: BufferedSource = new BufferedSource( getClass.getResourceAsStream("/rocca0.csv"))

  for (line <- bufferedSource.getLines()) {
    println(split(line).toString())
  }


}
