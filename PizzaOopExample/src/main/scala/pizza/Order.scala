package pizza

import scala.collection.mutable.ArrayBuffer

class Order (
    val pizzas: ArrayBuffer[Pizza],
    var customer: Customer
) {

    def addPizza(p: Pizza): Unit = {
        pizzas += p
    }

    def removePizza(p: Pizza): Unit = {
        pizzas -= p
    }

    // need to implement these
    def getBasePrice(): Int = ???
    def getTaxes(): Int = ???
    def getTotalPrice(): Int = ???

    def printOrder(): Unit = {
        for (p <- pizzas) {
            println(p)
        }
    }

}
