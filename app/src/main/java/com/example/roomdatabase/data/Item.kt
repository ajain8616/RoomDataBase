package com.example.roomdatabase.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity data class represents a single row in the database.
 */
@Entity
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "name")
    val itemName: String,
    @ColumnInfo(name = "description")
    val itemDescription: String,
    @ColumnInfo(name = "type")
    val itemType: String,
)
/**
 * Returns the passed in price in currency format.
 */
//fun Item.getFormattedPrice(): String =
//    NumberFormat.getCurrencyInstance().format(itemPrice)