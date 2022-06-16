package ru.maxcoulfield.profilevelandroidcource.domain.shoplist

class AddShopListItem(private val shopList: ShopList) {
    fun addShopListItem(item: ShoppingItem) {
        shopList.addShopListItem(item)
    }
}