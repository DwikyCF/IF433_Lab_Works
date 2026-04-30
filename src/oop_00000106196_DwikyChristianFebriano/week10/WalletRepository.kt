package oop_00000106196_DwikyChristianFebriano.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun search(predicate: (T) -> Boolean): List<T> {
        return items.filter(predicate)
    }
}

fun <T : Any> findFirst(list: List<T>, predicate: (T) -> Boolean): T? {
    return list.firstOrNull(predicate)
}