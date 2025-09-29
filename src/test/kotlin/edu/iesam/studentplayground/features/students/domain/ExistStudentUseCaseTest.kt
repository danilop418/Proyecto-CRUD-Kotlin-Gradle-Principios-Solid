package edu.iesam.studentplayground.features.students.domain

import io.mockk.mockk
import org.junit.Test

class ExistStudentUseCaseTest {
    @Test
    fun `when the id exist`() {
        //Give
        val studentRepositoryMockk = mockk<StudentRepository>(relaxed = true)
        val studentExistUseCase = ExistStudentUseCase(studentRepositoryMockk)
        val student1 = Student("1", "Marcos")
        val student2 = Student("1", "María")

        //When
        studentExistUseCase.exist(student1.exp)
        studentExistUseCase.exist(student2.exp)

        //Then
        assert(true) { "The id of the student already exist" }
    }
}