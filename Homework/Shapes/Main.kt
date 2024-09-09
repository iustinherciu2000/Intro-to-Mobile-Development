fun main(){

    // create an instance of each class and store each in a variable of type Shape
    val square : Shape = Square("Square", 5.0, 5.0 )
    val triangle : Shape = Triangle("Triangle", 33.0, 44.0, 52.0 )
    val circle : Shape = Circle("Circle", 789.0 )
    val eqTriangle : Shape = EquilateralTriangle("Equilateral Triangle", 3.8782)

    // print name, dimensions, and area for each object

    /**
     * Prints the details of Square such as name, dimensions, and area
     */
    println("Name: ${square.name}")
    square.printDimension()
    println("Area: ${square.getArea()}")

    // space
    println()

    /**
     * Prints the details of Triangle such as name, dimensions, and area
     */
    println("Name: ${triangle.name}")
    triangle.printDimension()
    println("Area: ${triangle.getArea()}")

    // space
    println()

    /**
     * Prints the details of Circle such as name, dimensions, and area
     */
    println("Name: ${circle.name}")
    circle.printDimension()
    println("Area: ${circle.getArea()}")

    // space
    println()

    /**
     * Prints the details of Equilateral Triangle such as name, dimensions, and area
     */
    println("Name: ${eqTriangle.name}")
    eqTriangle.printDimension()
    println("Area: ${eqTriangle.getArea()}")


}