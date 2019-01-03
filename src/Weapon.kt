package newProject

class Weapon(var name: String = "Fist", var damageInflicted: Int = 1) {

    fun show(){
        println("""
            Weapon : $name
            Damage Inflicted : $damageInflicted
        """)
    }

    override fun toString(): String {
        return """
            weapon : $name
            damage : $damageInflicted
        """
    }
}