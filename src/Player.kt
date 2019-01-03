package newProject

class Player(val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {

    var weapon = Weapon()
    val inventory = ArrayList<Loot>()

    fun show(){
        if(lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """"
            name : $name
            lives : $lives
            level : $level
            score : $score
            weapon : ${weapon.name}
            damage : ${weapon.damageInflicted}
            """
    }

    fun showInventory(){
        println("$name's Inventory")
        println("")
        println("Items")
        println("-----")
        inventory.forEach { item -> println(item.name)}
        println("")
        println("===================================")
    }


}