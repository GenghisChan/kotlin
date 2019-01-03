package newProject

fun main(args: Array<String>) {

   val chris = Player("chris", 5, 1, 50)
    chris.weapon = Weapon("sword", 12)

    val karla = Player("karla", 5, 2, 100)
    karla.weapon = chris.weapon
    karla.show()
    chris.weapon = Weapon("Spear", 10)
    chris.show()


}

