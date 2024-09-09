/**
 * Square with specified length and height
 *
 * @param _name: name of the shape
 * @param length: length of the square
 * @param height: height of the square
 */
class Square(_name : String, var length: Double = 0.0, var height: Double = 0.0) : Shape(_name) {
    /**
     * Sets the dimensions of the square
     *
     * @param length: length of the square
     * @param height: height of the square
     */
    fun setDimension(length : Double, height : Double) {
        this.length = length
        this.height = height
    }

    /**
     * Prints the dimensions of the square
     *
     * This method displays the current length and height of the square
     */
    override fun printDimension() {
        println("length: $length, height: $height")
    }

    /**
     * Calculates area of square
     *
     * @return length * height
     */
    override fun getArea(): Double {
        return length * height
    }
}