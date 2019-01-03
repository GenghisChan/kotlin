package newProject

class Player(val name: String, var lives: Int = 3, var level: Int = 1, var score: Int = 0) {

    var weapon = Weapon()

    fun show(){
        println(""""
            name : $name
            lives : $lives
            level : $level
            score : $score
            weapon : ${weapon.name}
            damage : ${weapon.damageInflicted}
            """)
    }

}