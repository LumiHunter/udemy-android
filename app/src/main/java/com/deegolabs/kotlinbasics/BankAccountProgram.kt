package com.deegolabs.kotlinbasics

fun main() {
    val jieunBankAccount = BankAccount("JiEun", 1234.56)
    val jasonBankAccount = BankAccount("Jason", 1234.56)
    val sarahBankAccount = BankAccount("sarah", 0.0)
    jieunBankAccount.deposit(200.0)
    jieunBankAccount.withdraw(1200.0)
    jieunBankAccount.displayTransactionHistory()
    jieunBankAccount.acctBalance()

    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)
    sarahBankAccount.displayTransactionHistory()
    sarahBankAccount.acctBalance()
}