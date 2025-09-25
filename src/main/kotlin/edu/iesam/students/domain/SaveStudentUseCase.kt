package edu.iesam.students.domain

class SaveStudentUseCase(val studentRepository: StudentRepository) {

    operator fun invoke(student: Student) {
        if (student.name.isEmpty()) {
            throw IllegalArgumentException("Student name cannot empty")
        }
        if (student.exp.isEmpty()) {
            throw IllegalArgumentException("Student exp cannot empty")
        }
        studentRepository.save(student)
    }

}