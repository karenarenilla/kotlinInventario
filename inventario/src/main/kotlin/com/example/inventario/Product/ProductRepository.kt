package com.example.inventario.Product

import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, String> {
    fun findByCode(code: String): Product
}