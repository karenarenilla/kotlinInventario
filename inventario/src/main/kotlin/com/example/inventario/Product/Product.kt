package com.example.inventario.Product

import javax.persistence.*
import javax.validation.constraints.NotEmpty

@Entity
@Table(name = "product")
data class Product(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        @get: NotEmpty
        @get: Column(name = "code")
        @Column(unique = true)
        val code: String = "",
        @get: NotEmpty
        @get: Column(name = "description")
        val description: String = "",
        @get: NotEmpty
        @get: Column(name = "category")
        val category: String = "",
        @get: NotEmpty
        @get: Column(name = "subcategory")
        val subcategory: String = ""){

}