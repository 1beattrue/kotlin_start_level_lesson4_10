fun main() {
    val car: Transport = Car()
    val bike: Transport = Bike()

    if (car is Car) car.name = "Машина 2" // теперь у свойства name класса Car есть setter
    println(car.name)

    // как еще сделать доступным smart cast?

    if (car !is Car) return
    println(car.name) // тут вроде все логично, если car не Car - сюда просто не зайдет

    if (car is Car && car.startEngine) car.drive() // еще способ, если первое условие выполнено - будет проверяться второе

    if (car !is Car || car.startEngine) {
        // а вот это любопытно: или возвращает true, когда хотя бы одно из условий верно
        // если верно первое - второе проверяться не будет -> ошибки не возникнет
        // если первое неверно - значит car является типом Car -> метод вызовется
    }

    // анонимный класс
    travel(object :
        Transport("Автобус") { // если бы Transport был интерфейсом или не содержал бы параметров - можно было бы ничего не указывать в ()
        override fun drive() {
            println("Автобус едет")
        }
    })

    // домашнее задание
    val sportsman = Sportsman()
    sportsman.callWaterCourier(object : WatterCourier {
        override fun bringWater() {
            println("Несу воду...")
        }
    })

    // 4_11
    sportsman.callWaterCourier { println("Несу воду...") } // небольшая оптимизация
}

fun travel(transport: Transport) {
    transport.drive()
}