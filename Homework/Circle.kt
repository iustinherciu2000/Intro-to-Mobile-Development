// import the math library to use PI
import kotlin.math.PI

/**
 * Circle with radius
 *
 * @param _name: name of the shape
 * @param radius: value of the radius
 */
class Circle (_name : String, var radius: Double = 0.0) : Shape(_name) {

    /**
     * Sets the dimension of the radius
     *
     * @param radius: value of the radius
     */
    fun setDimensions(radius : Double){
        this.radius = radius
    }

    /**
     * Prints the value of the radius
     *
     * This method displays the side of the radius
     */
    override fun printDimension() {
        println("radius: $radius")
    }

    /**
     * Calculates Area of Circle
     *
     * @return PI * radius * radius
     */
    override fun getArea(): Double {
        // Circle Area: π * r^2
        return PI * radius * radius
    }
}