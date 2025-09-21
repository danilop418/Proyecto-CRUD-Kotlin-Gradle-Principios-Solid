package edu.iesam.students.data

import edu.iesam.students.data.remote.StudentApiRemoteDataSource
import edu.iesam.students.domain.Student
import edu.iesam.students.domain.StudentRepository
import edu.iesam.students.domain.data.local.remote.StudentMemLocalDataSource
import edu.iesam.students.domain.data.local.remote.StudentXmlLocalDataSource

class StudentDataRepository(
    private val xmlLocalDataSource: StudentXmlLocalDataSource,
    private val memLocalDataSource: StudentMemLocalDataSource,
    private val apiRemoteDataSource: StudentApiRemoteDataSource
) : StudentRepository {

    override fun save(student: Student) {
        if (memLocalDataSource.exist(student)) {

        } else {

        }
    }
}