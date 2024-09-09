// import the math library to use square root
import kotlin.math.sqrt

/**
 * Triangle with 3 specified side lengths
 *
 * @param _name: name of the shape
 * @param a: one side of the triangle
 * @param b: one side of the triangle
 * @param c: one side of the triangle
 */
open class Triangle(_name : String, var a: Double = 0.0, var b: Double = 0.0, var c: Double = 0.0) : Shape(_name ) {

    /**
     * Sets dimensions of triangle
     *
     * @param a: one side of the triangle
     * @param b: one side of the triangle
     * @param c: one side of the triangle
     */
    fun setDimensions(a: Double, b: Double, c: Double) {
        this.a = a
        this.b = b
        this.c = c
    }

    /**
     * Prints the dimensions of the triangle
     *
     * This method displays the current value of each side
     */
    override fun printDimension() {
        println("a: $a, b: $b, c: $c")
    }

    /**
     * Calculates Area of Triangle
     *
     * @return sqrt(s * (s - a) * (s - b) * (s - c))
     * If condition is false, 0.0 will be displayed as an incorrect value
     */
    override fun getArea(): Double {
        val s = (a + b + c) / 2.0
        // return an if statement for the sqrt(square root) formula
        return if(a + b > c && a + c > b && b + c > a)
            sqrt(s * (s - a) * (s - b) * (s - c))
        else
            0.0
    }
}