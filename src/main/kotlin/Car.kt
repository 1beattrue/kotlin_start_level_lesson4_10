class Car(override var name: String = "Машина") : Transport(name) { // переопределение свойства: val -> var

    val startEngine: Boolean
        get() {
            println("Запускаю двигатель...")
            return true
        }

    override fun drive() {
        if (startEngine) println("Машина едет...")
        else println("Машина не заведена")
    }
}