package co.s4n.traits

/**+
 * Trait de felino, un felino tiene color y un sonido
 */
trait Felino {
  val color: String
  val sonido: String
}

/**
 * La clase Leon tiene a diferencia de los demás felinos tiene un tamaño de melena
 *
 * @param tamañoMelena Tamaño de Melena
 * @param color Color del felino
 * @param sonido Sonido que produce
 */
case class Leon(val tamañoMelena: Double, override val color: String, override val sonido: String) extends Felino

/**
 * clase Tigre
 *
 * @param color Color del felino
 * @param sonido Sonido que produce
 */
case class Tigre(override val color: String, override val sonido: String) extends Felino

/**
 * Clase jaguar
 *
 * @param color Color del felino
 * @param sonido Sonido que produce
 */
case class Jaguar(override val color: String, override val sonido: String) extends Felino

/**
 * Clase gato a diferencia de los demás felinos el gato tiene comida favorita
 *
 * @param comidaFavorita Comida favorita
 * @param color Color del felino
 * @param sonido Sonido que produce
 */
case class Gato(val comidaFavorita: String, override val color: String, override val sonido: String) extends Felino