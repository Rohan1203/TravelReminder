package com.cutm.travelreminder.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EventDao {
    @Insert
    void insertAll(EntityClass entityClass);

    @Query("SELECT * from myTable")
    List<EntityClass> getAllData();

}
