package com.example.myshoppinglist.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myshoppinglist.data.db.entities.ShoppingItem

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(item : ShoppingItem)

    @Delete
    fun delete(item : ShoppingItem)

    @Query ("SELECT * FROM shopping_items")
    fun getAllShoppingItems() : LiveData<List<ShoppingItem>>

}