package ru.maxcoulfield.profilevelandroidcource.domain.shoplist

class GetShopListItemById(private val shopList: ShopList) {
    fun getShopListItemById(id: Int): ShoppingItem {
        return shopList.getShopListItemById(id)
    }
}