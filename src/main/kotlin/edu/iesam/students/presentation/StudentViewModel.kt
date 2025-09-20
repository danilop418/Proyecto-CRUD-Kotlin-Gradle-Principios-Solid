package edu.iesam.students.presentation

import edu.iesam.students.domain.SaveStudentUseCase
import edu.iesam.students.domain.Student

class StudentViewModel(private val saveStudentUseCase: SaveStudentUseCase) {

    fun saveClicked(exp: String, name:String){
        saveStudentUseCase.invoke(Student(exp,name))
    }
}