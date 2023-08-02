abstract class Transport(open val name: String) { // ключевое слово open для переопределения свойства
    abstract fun drive()
}