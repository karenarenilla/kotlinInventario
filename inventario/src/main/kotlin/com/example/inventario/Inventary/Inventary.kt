package com.example.inventario.Inventary

import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

@Entity
@Table(name = "inventary")
data class Inventary(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @Column()
        val lote: String = "",

        @get: NotNull
        @Column()
        val count: Int = 0,

        @Column()
        val dateExpedition: Date = Date(),

        @Column()
        val dateExpiration: Date = Date()){}