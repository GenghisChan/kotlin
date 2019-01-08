package newProject

import kotlin.random.Random

class VampireKing(name: String) : Vampire(name) {
    init {
        HP = 100
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean {
        return lives < 2
    }

    fun dodge(): Boolean {
        val chance = Random.nextInt(6)

        if(chance > 3) {
            println("$name dodged!")
            return true
        }

        return false
    }
}