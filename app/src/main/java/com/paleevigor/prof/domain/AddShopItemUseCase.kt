package com.paleevigor.prof.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopIten(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)
    }
}