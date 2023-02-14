fun aeraofarectangle (w: Int, h: Int) : Int {
    return w * h
}
fun areaofatrapeziod (a: Int, b: Int, h: Int) : Int {
    return ((.5) * (a + b ) * h).toInt()
}
fun areaofasquare (a: Int) : Int {
    return a * a
}
fun areaofaparallelogram (b: Int, h: Int) : Int {
    return b * h
}
fun main (){
    println("The area of a square is ${areaofasquare(12)}")
    println("The area of a rectangle is ${aeraofarectangle(15,4)}")
    println("The area of a trapezoid is ${areaofatrapeziod(9,19,12)}")
    println("The area of a parallelogram is ${areaofaparallelogram(8,3)}")
}