package ru.maxcoulfield.profilevelandroidcource.domain.shoplist

class EditShopListItem(private val shopList: ShopList) {
    fun editShopListItem(item: ShoppingItem){
        shopList.editShopListItem(item)
    }
}