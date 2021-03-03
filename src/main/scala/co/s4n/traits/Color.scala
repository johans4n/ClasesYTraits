package co.s4n.traits

/**
 * Clase color que se define por tres colores base
 *
 * @param red cantidad de rojo
 * @param green cantidad de green
 * @param blue cantidad de azul
 */
class Color(val red: Int, val green: Int, val blue: Int)

/**
 * Objeto color
 */
object Color {
  /**
   * Constructor de colores
   *
   * @param red cantidad de rojo
   * @param green cantidad de green
   * @param blue cantidad de azul
   * @return Objeto de tipo Color
   */
  def apply(red: Int, green: Int, blue: Int): Color = new Color(red: Int, green: Int, blue: Int)
}

/**
 * Color rojo
 */
object Rojo {

  /**
   * Constructor del color rojo
   *
   * @return Objeto de tipo color
   */
  def apply(): Color = new Color(255, 0, 0)
}

/**
 * Color amarillo
 */
object Amarillo {

  /**
   * Constructor del color Amarillo
   *
   * @return Objeto de tipo color
   */
  def apply(): Color = new Color(255, 255, 0)
}

/**
 * Color rosa
 */
object Rosa {

  /**
   * Constructor del color Rosa
   *
   * @return Objeto de tipo color
   */
  def apply(): Color = new Color(255, 153, 153)
}