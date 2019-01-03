package newProject

class Player(val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {

    var weapon = Weapon()
    private val inventory = ArrayList<Loot>()

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
            $weapon
            """
    }

    fun showInventory(){
        println("$name's Inventory")
        println("")
        println("Items")
        println("-----")
        if(inventory.count() > 0) {
            inventory.forEach { item -> println("$item \n")}
        } else {
            println("Your inventory is empty")
        }
        println("")
        println("===================================")
    }

    fun addLoot(item: Loot) {
        inventory.add(item)
    }

    fun dropLoot(item: Loot) {
        if(inventory.contains(item)){
            inventory.remove(item)
            println("${item.name} has been removed\n")
        } else {
            println("${item.name} not found\n")
        }
    }

    fun dropLoot(name: String): Boolean {
        println("$name has been dropped!")
        return inventory.removeIf { it.name == name}
    }

}