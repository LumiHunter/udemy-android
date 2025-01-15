package com.deegolabs.mvvm

data class CounterModel(var count:Int)

// 레포지토리(저장소): 나머지 애플리케이션에 데이터가 접근하는 클린 API 처럼 동작하는 디자인패턴.
// API: Application Programming Interface -> A set of definitions and protocols to build and integrate application software.
// Remote API와 같은 데이터 소스와 로컬 데이터베이스 그리고 인 메모리 캐시 간의 중재자
// 레포지토리는 모든 데이터 관련 로직임.
class CounterRepository {
    private var _counter = CounterModel(0)

    fun getCounter() = _counter  // counter 자체는 private 키워드 뒤에 숨어 있어, 바깥에서 접근하려면 getCounter()를 써야함

    fun incrementCounter() {
        _counter.count++
    }

    fun derementCounter() {
        _counter.count--
    }
}