class Sportsman {
    fun callWaterCourier(watterCourier: WatterCourier) {
        watterCourier.bringWater()
    }

    inline fun callWaterCourier(bringWater: () -> Unit) { // наглядный пример оптимизации с помощью inline fun
        // если бы функция не была встроенной - под капотом бы как раз создавался анонимный класс, как в предыдущем методе
        bringWater()
    }
}