package co.s4n.traits

/**
 * Trait de tipo forma
 */
sealed trait Forma {

  /**
   * Método abstracto que define la longitud igual de sus lados
   *
   * @return Perímetro Double
   */
  def perimetro(): Double

  /**
   * Método abstracto que retorna el número de lados de una forma
   *
   * @return Valor entero con el número de lados
   */
  def tamaño(): Double

  /**
   * Esta función retorna el área de una forma
   *
   * @return Area de una forma
   */
  def area(): Double

}

/**
 * Clase Círculo
 *
 * @param radio Radio del círculo
 */
final case class Circulo(val radio: Double) extends Forma {

  override def perimetro(): Double = 2 * math.Pi * this.radio

  override def tamaño(): Double = this.radio * 2

  override def area(): Double = math.Pi * this.radio * this.radio

  override def toString: String = "Un círculo de radio " + this.radio
}

/*----------------------------------------TRAIT RECTÁNGULAR----------------------------------------------------------*/

/**
 * Trait que extiende de forma
 */
trait Rectangular extends Forma {

  override def tamaño(): Double = 4

}

/**
 * Clase cuadrado
 *
 * @param lado Lado del cuadrado
 */
final case class Cuadrado(val lado: Double) extends Rectangular {

  /**
   * Método abstracto que define la longitud igual de sus lados
   *
   * @return Perímetro Double
   */
  override def perimetro(): Double = 4 * this.lado

  /**
   * Esta función retorna el área de una forma
   *
   * @return Area de una forma
   */
  override def area(): Double = this.lado * this.lado

}

/**
 * Clase rectángulo
 *
 * @param lado1 lado 1 del rectángulo
 * @param lado2 lado 2 del rectángulo
 */
final case class Rectangulo(val lado1: Double, val lado2: Double) extends Rectangular {
  /**
   * Método abstracto que define la longitud igual de sus lados
   *
   * @return Perímetro Double
   */
  override def perimetro(): Double = 2 * (lado1 + lado2)

  /**
   * Esta función retorna el área de una forma
   *
   * @return Area de una forma
   */
  override def area(): Double = this.lado1 * this.lado2

  override def toString: String = "Un rectángulo de ancho " + this.lado1 + "cm y largo " + this.lado2 + "cm"

}