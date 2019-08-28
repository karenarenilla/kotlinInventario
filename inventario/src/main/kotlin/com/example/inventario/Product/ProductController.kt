package com.example.inventario.Product

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/product")
class ProductController(protected val productService: ProductServiceImpl) {

    @GetMapping()
    fun findAll(): List<Product>{
        return this.productService.findAll()
    }

    @PostMapping()
    fun create(@RequestBody product: Product): Product{
        return this.productService.create(product)
    }
}