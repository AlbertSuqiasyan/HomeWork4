open class Pet(name: String) {
    val children = mutableListOf<Pet>()
    fun makeChild(name: String,childScope: Pet.() -> Unit): Pet {
        val pet = Pet("MotherPet")
        pet.childScope()
        children.add(pet)
        return pet
    }
}

open class Cat(val name: String) : Pet(name)

fun main(args: Array<String>) {

    val motherPet = node("AnyPet") {
        this.children.add(this)
        this.makeChild("Kitty"){
            this.children.add(this)
            this.makeChild("evenMoreKitty"){
                this.children.add(this)
            }
            this.makeChild("Kitty2"){
                this.children.add(this)
                this.makeChild("evenMoreKitty2"){
                }
            }
            this.makeChild("Cat"){
                this.children.add(this)
            }
        }
    }
}
