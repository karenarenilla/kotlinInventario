package com.example.inventario.Inventary

import org.springframework.stereotype.Service

@Service
class InventoryServiceImpl(protected val inventoryRepository: InventoryRepository): InventoryService {
    override fun findAll(): List<Inventary> {
        return this.inventoryRepository.findAll()
    }

    override fun create(inventory: Inventary): Inventary {
        return this.inventoryRepository.save(inventory)
    }

}