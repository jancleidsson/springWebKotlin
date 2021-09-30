package com.jss.springWebKotlin.banks.domain.model

data class Bank(
    private val account: String,
    private val trust: Double,
    private val transactionFee: Int
)
