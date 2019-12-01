open class Pet()

open class Cat(name: String) : Pet()
class KittenMale(name: String) : Cat(name)
class KittenFemale(name: String) : Cat(name)

fun main(args: Array<String>) {
    val pet = Pet()
    node("AnyPet") {

        node("CatMother") {

            node("Kitten1") {

            }
            node("Kitten2") {

            }
        }
    }
}


fun node(name: String, function: () -> Unit) {
    println(name)
}