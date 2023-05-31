package com.example.roomdatabase

import android.app.Application
import com.example.roomdatabase.data.ItemRoomDatabase


class RoomDataBase : Application() {
    // Using by lazy so the database is only created when needed
    // rather than when the application starts
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}
