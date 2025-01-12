package com.deegolabs.kotlinbasics

class BankAccount(
    var accountHolder: String,
    var balance: Double
) {
    // public: class 밖에서 호출 가능
    // private: class 내의 함수에서만 접근 가능
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if(amount > balance) {
            println("You don't have the funds to withdraw $$amount")
        } else {
            balance -= amount
            transactionHistory.add("$accountHolder withdrawed $$amount")
        }
    }

    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }

    fun acctBalance() {
        println("$accountHolder's Balance: $$balance")
    }
}