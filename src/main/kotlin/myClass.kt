fun main(){
    // object of the class
    var obj1 = Person(name = "mihiri", age = 26)
    obj1.canVot(age = 26)
}

class Person ( var name:String, var age:Int){ //This is a normal Kotlin class with two mutable properties.


    lateinit var profession : String


    fun canVot (age: Int) {
        if (age < 18) {
            println("canvote")
        } else {
            println("cannot vote")
        }

    }}




