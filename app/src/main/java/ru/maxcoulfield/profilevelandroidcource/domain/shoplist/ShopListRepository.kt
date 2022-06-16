package ru.maxcoulfield.profilevelandroidcource.domain.shoplist

interface ShopList {
    fun getShopList(): List<ShoppingItem>

    fun getShopListItemById(id: Int): ShoppingItem

    fun editShopListItem(item: ShoppingItem)

    fun removeShopListItemById(id: Int)

    fun addShopListItem(item: ShoppingItem)
}