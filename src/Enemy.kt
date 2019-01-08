package newProject

open class Enemy(val name: String, var HP: Int, var lives: Int){

    open fun takeDamage(damage: Int) {
        val remainingHP = HP - damage

        if(remainingHP > 0 && lives > 0) {
            println("$name took $damage damage")
            HP = remainingHP
        }
        else {
            lives -= 1
            if(lives > 0) {
                println("$name lost a life!")
            } else {
                println("You defeated $name!")
            }
        }
    }

    override fun toString(): String {
        return """
            ENEMY INFORMATION
            -----------------

            name : $name
            HP : $HP
            lives : $lives


        """.trimIndent()
    }
}