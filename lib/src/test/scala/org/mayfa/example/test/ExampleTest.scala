package org.mayfa.example.test

import org.mayfa.example.{JCaseClass, SCaseClass}
import org.scalatest.matchers.Matcher
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ExampleTest extends AnyWordSpec with Matchers {
  "Example" should {
    "SCaseClass" in {
      val sCase = SCaseClass(1, 2)
      sCase.start shouldBe 1
    }

    "JCaseClass" in {
      val jCase = JCaseClass.apply(1, 2)
      jCase match {
        case JCaseClass(s: Integer, e) =>
          s shouldBe 1
          e shouldBe 2
        case _                => fail
      }
    }
  }
}
