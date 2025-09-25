package edu.iesam.students.domain

import org.junit.Assert.*
import org.junit.Test
import io.mockk.mockk

class SaveStudentUseCaseTest {

    @Test
    fun `when invoke then save student`(){
        //Given
        val studentRepositoryMock = mockk<StudentRepository>(relaxed = true)
        val saveStudentUseCase = SaveStudentUseCase(studentRepositoryMock)
        val student = Student("001","Name")
    }



}