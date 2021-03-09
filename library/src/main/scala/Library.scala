package se.woodenstake

object Library {
  def getAClass(name: String) = Class.forName(name)
}