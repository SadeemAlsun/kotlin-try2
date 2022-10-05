package com.example.firsttry

fun main() {
var GPA=arrayListOf(5.0 ,3.9,4.7,4.2,3.6)
    var sums = 0.0
for(index in 0..GPA.size-1){
    sums += GPA[index]
    println(sums)
}
    var total = sums/GPA.size
    println("The total AVG of the student GPA is : $total")
}
