import kotlin.math.sqrt

/**
 * Equilateral Triangle extends Triangle and only has one variable
 *
 * @param _name: name of the shape
 * @param _x: value of the single side
 */
class EquilateralTriangle(_name : String, var x: Double = 9.0) : Triangle(_name, x, x, x) {

    /**
     * Sets the dimension of the side 'x'
     *
     * @param x: value of the single side
     */
    fun setDimensions(x : Double){
        this.x = x
    }

    /**
     * Prints dimension of 'x'
     *
     * This method displays the value side 'x' has
     */
    override fun printDimension() {
        println("x: $x")
    }

    /**
     * Calculates the Area of the Equilateral Triangle
     *
     * @return (sqrt(3.0) / 4) * x * x
     */
    override fun getArea(): Double {
        return (sqrt(3.0) / 4) * x * x

    }

}