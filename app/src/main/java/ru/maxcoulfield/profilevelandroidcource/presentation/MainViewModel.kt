package ru.maxcoulfield.profilevelandroidcource.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.maxcoulfield.profilevelandroidcource.data.ShopListRepositoryImpl
import ru.maxcoulfield.profilevelandroidcource.domain.shoplist.*

class MainViewModel : ViewModel() {

    // data
    private val repository = ShopListRepositoryImpl()
    val shopList = MutableLiveData<List<ShoppingItem>>()

    // shop list
    private val getShopList = GetShopListUseCase(repository)

    // shop list item
    private val getShopListItemByIdUseCase = GetShopListItemByIdUseCase(repository)
    private val editShopListItemUseCase = EditShopListItemUseCase(repository)
    private val removeShopListItemByIdUseCase = RemoveShopListItemByIdUseCase(repository)
    private val addShopListItemUseCase = AddShopListItemUseCase(repository)

    fun getShopList() {
        shopList.value = getShopList.getShopList()
    }

    fun editShopListItem(shoppingItem: ShoppingItem){
        val newState = shoppingItem.copy(_isEnable = !shoppingItem._isEnable)
    }

}