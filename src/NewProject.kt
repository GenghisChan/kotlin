package newProject

fun main(args: Array<String>) {

   val chris = Player("chris", 5, 1, 50)
    chris.weapon = Weapon("sword", 12)

    val karla = Player("karla", 5, 2, 100)
    karla.weapon = chris.weapon
    println(karla)
    val spear = Weapon("Spear", 10)
    chris.weapon = spear
    println(chris)

    val redPotion = Loot("red potion", LootType.POTION, 10.00)
    val chainmail = Loot("Chainmail", LootType.ARMOR, 20.00)

    chris.addLoot(chainmail)
    chris.addLoot(redPotion)
    chris.showInventory()
    chris.addLoot(Loot("Cosmos ring", LootType.RING, 100.00))
    chris.showInventory()

    val thanos = Player("thanos", 1, 1000, 50)
    thanos.showInventory()
    chris.dropLoot(redPotion)
    chris.showInventory()
    chris.dropLoot(redPotion)
    chris.dropLoot("Cosmos ring")
    chris.showInventory()

// for ( i in 1..100) {
//  if( i % 15 == 0 ){
//   println("FizzBuzz")
//  } else if (i % 3 == 0) {
//   println("Fizz")
//  } else if ( i % 5 == 0){
//   println("Buzz")
//  } else {
//   println(i)
//  }
// }
}

