package com.example.cleanarchitecture.domain

data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val isEnabled: Boolean
)