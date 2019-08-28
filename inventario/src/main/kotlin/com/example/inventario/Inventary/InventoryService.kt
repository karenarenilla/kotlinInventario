package com.example.inventario.Inventary

interface InventoryService {
    fun findAll(): List<Inventary>
    fun create(inventory: Inventary): Inventary

}