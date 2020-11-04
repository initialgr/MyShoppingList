package com.example.myshoppinglist.ui.shoppinglist

import androidx.lifecycle.ViewModel
import com.example.myshoppinglist.data.db.entities.ShoppingItem
import com.example.myshoppinglist.data.repositories.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ShoppingViewModel(
    private val repository : ShoppingRepository
): ViewModel() {

    fun upsert (item : ShoppingItem) = GlobalScope.launch  {
        repository.upsert(item)
    }

    fun delete (item: ShoppingItem) = GlobalScope.launch {
        repository.delete(item)
    }

    fun getAllShoppingItems() = repository.getAllShoppingItems()
}