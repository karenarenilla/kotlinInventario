package com.example.inventario.Product

interface ProductService {
    fun findOne(code: String): Product
    fun findAll(): List<Product>
    fun create(product: Product): Product
    fun update(code: String, product: Product)
    fun delete(code: String)
}