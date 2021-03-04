package co.s4n.traits

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FormaSpec extends AnyFlatSpec with Matchers {

  "1. Draw(new Círculo(10) " should " Un círculo de radio 10.0 " in {
    val circulo = Draw(Circulo(10))
    circulo.toString shouldBe "Un círculo de radio 10.0"
  }

  "2. Draw(new Rectangulo(3,4) " should " Un rectangulo de ancho 3.0cm y largo 4.0cm " in {
    val rectangulo = Draw(Rectangulo(3, 4))
    rectangulo.toString shouldBe "Un rectángulo de ancho 3.0cm y largo 4.0cm"
  }

}