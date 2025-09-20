package edu.iesam.students.domain.data.local.remote

import edu.iesam.students.domain.StudentRepository
import edu.iesam.students.domain.Student

class StudentMemLocalDataSource {

    private val dataSource: MutableMap<String, Student> = mutableMapOf()

    fun save(student: Student) {
        dataSource.put(student.exp, student)
    }

}