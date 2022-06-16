package ru.maxcoulfield.profilevelandroidcource.data

import ru.maxcoulfield.profilevelandroidcource.domain.shoplist.ShopListRepository
import ru.maxcoulfield.profilevelandroidcource.domain.shoplist.ShoppingItem
import java.lang.RuntimeException

class ShopListRepositoryImpl : ShopListRepository {

    var shopListItems = mutableListOf<ShoppingItem>()
    private var autoIncrement = 0

    override fun getShopList(): List<ShoppingItem> {
        return shopListItems
    }

    override fun getShopListItemById(id: Int): ShoppingItem {
        return shopListItems.find { it.getId() == id } ?: throw RuntimeException("Element with id $id was not found")
    }

    override fun editShopListItem(item: ShoppingItem) {
        val oldItem = getShopListItemById(item.getId())
        shopListItems[oldItem.getId()] = item
    }

    override fun removeShopListItemById(id: Int) {
        shopListItems.removeAt(id)
    }

    override fun addShopListItem(item: ShoppingItem) {
        item.setId(autoIncrement++)
        shopListItems.add(item)
    }

    init {
        for (i in 0 until 10){
            val item: ShoppingItem = ShoppingItem(_name = "something")
            addShopListItem(item)
        }
    }
}