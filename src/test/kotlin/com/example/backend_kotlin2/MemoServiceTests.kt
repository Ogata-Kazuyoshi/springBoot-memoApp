package com.example.backend_kotlin2

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class MemoServiceTests {
    private lateinit var service: MemoService
    private var repository = MemoRepositoryTestDouble()

    @Test
    fun `it should call repository`(){
        //given


        //when
        service.getMemos()

        //then
        Assertions.assertThat(repository.findAll_isCalled).isTrue()

    }
}