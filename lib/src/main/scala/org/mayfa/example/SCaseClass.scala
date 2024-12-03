package org.mayfa.example

sealed case class SCaseClass(
  start: Int,
  end: Int
) extends STrait {
  override def name(): String = "SCaseClass"
}
