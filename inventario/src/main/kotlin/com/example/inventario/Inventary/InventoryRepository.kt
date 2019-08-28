package com.example.inventario.Inventary

import org.springframework.data.jpa.repository.JpaRepository

interface InventoryRepository: JpaRepository<Inventary, String> {

}