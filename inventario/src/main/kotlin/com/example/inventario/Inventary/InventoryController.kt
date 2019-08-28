package com.example.inventario.Inventary

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/inventary")
class InventoryController(protected val inventoryService: InventoryServiceImpl) {
    @GetMapping()
    fun findAll(): List<Inventary>{
        return this.inventoryService.findAll()
    }

    @PostMapping()
    fun crete(inventory: Inventary): Inventary{
        return this.inventoryService.create(inventory)
    }
}