package com.example.inventario.Product

import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(protected val productRepository: ProductRepository): ProductService {
    override fun findAll(): List<Product> {
       return this.productRepository.findAll()
    }

    override fun findOne(code: String): Product {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun create(product: Product): Product {
        return this.productRepository.save(product)
    }

    override fun update(code: String, product: Product) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(code: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}