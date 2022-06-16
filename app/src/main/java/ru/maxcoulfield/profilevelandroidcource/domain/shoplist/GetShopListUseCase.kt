package ru.maxcoulfield.profilevelandroidcource.domain.shoplist

class GetShopList(private val shopList: ShopList) {
    fun getShopList(): List<ShoppingItem> {
        return shopList.getShopList()
    }
}