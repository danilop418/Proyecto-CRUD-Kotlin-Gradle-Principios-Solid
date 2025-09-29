package edu.iesam.studentplayground.features.students.domain

class SaveStudentUseCase(val studentRepository: StudentRepository) {

    fun save(student: Student) {
        if (student.exp.isEmpty() || student.exp.isBlank()){
            throw IllegalArgumentException("The expedient cannot is empty")
        }
        if (student.name.isEmpty() || student.name.isBlank()){
            throw IllegalArgumentException("The name cannot is empty")
        }
        studentRepository.save(student)
    }

}