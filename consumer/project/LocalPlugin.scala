import sbt._
import se.woodenstake.Library
import java.io.File
object LocalPlugin {
  def gen() : Seq[File] = {
    println(s"I can get a class in my Local plugin by Class.forName: ${Class.forName("Foo")}")
    println(s"But it blows up with an indirection, Library.getAClass: ${Library.getAClass("Foo")}")
    Seq.empty
  }
}