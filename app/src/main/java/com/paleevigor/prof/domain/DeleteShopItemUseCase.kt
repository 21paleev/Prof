package com.paleevigor.prof.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deliteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}