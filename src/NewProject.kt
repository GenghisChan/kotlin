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

    val thanos = Enemy("thanos", 10000, 2)

    chris.dropLoot(redPotion)
    chris.showInventory()
    chris.dropLoot(redPotion)
    chris.dropLoot("Cosmos ring")
    chris.showInventory()
    println(thanos)

    thanos.takeDamage(10000)
    println(thanos)

    val swampTroll = Troll("troll")

    println(swampTroll)
    swampTroll.takeDamage(5)
    println(swampTroll)

    val allMight = Player(name = "All might", lives = 2, level = 1000, score = 100000)

    println(allMight)
    allMight.weapon = Weapon(name = "Detroit Smash", damageInflicted = 1_000_000_000)
    println(allMight)

    val babyDracula = Vampire("The Count")
    println(babyDracula)
    babyDracula.takeDamage(10)
    println(babyDracula)

    val adultDracula = VampireKing("Dra COOL la")
    println(adultDracula)

    while(adultDracula.lives > 0) {
     if(adultDracula.dodge()) {
       continue
     }

     if(adultDracula.runAway()) {
      println("${adultDracula.name} ran away")
      break
     } else {
      adultDracula.takeDamage(12)
     }

    }




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

