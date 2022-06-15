package ru.maxcoulfield.profilevelandroidcource.domain.shoplist

class RemoveShopListItemById(private val shopList: ShopList) {
    fun removeShopListItemById(id: Int) {
        shopList.removeShopListItemById(id)
    }
}