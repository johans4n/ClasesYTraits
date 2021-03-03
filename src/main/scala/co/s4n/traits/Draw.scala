package co.s4n.traits

/**
 * Objeto draw
 */
object Draw extends App {
  /**
   * Método apply recibe una forma y obtiene el tostring dependiendo del tipo de forma
   *
   * @param forma Forma a recibir
   * @return Metodo to string que se deriva del tipo de forma
   */
  def apply(forma: Forma): String = forma.toString
}