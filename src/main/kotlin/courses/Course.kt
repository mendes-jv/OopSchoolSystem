package courses

import students.Student
import java.lang.Exception

class Course(private val courseName: String,
             private val professorName: String,
             private val year:Int) {

    ////Declaring attribute
    private val studentsList= mutableListOf<Student?>()

    //Method that add a student to the course's list
    fun enroll(student: Student?) {
        studentsList.add(student)
        println("Student was added to $courseName.")
    }

    //Method that add students to the course's list
    fun enroll(student: Array<Student?>?) {
        student!!.forEach {
            studentsList.add(it)
        }
        println("Students were added to $courseName.")
    }

    //Method that remove a student to the course's list, but ask before do the referred action
    fun unEnroll(student: Student?) {
        if(studentsList.contains(student)) {
            print("Are you sure ou want to remove ${student!!.getFullName()} from $courseName?\nType \"yes\" to remove or \"no\" to cancel: ")
            when(readLine()!!.lowercase()) {
                "yes" -> {
                    studentsList.remove(student)
                    println("Student was removed from $courseName.")
                }
                "no" -> println("Student was not removed from $courseName.")
                else -> println("Specified command was not found.")
            }
        }
    }

    //Method that count how many students are in a course
    fun countStudents() {
        when(studentsList.size) {
            0 -> println("There isn't students in this , yet.")
            1 -> println("There is only 1 student in this course.")
            else -> println("There are ${studentsList.size} students in this course.")
        }
    }

    //Method that shows the best student in a specific course and her/his grade
    fun bestStudentAndGrade(){
        var bestGrade = studentsList[0]?.getGrade()
        var bestStudent = studentsList[0]?.getFullName()
        studentsList.forEach {
            if (it!!.getGrade() > bestGrade!!) {
                bestGrade = it.getGrade()
                bestStudent = it.getFullName()
            }
        }
        println("The best grade in the course is $bestGrade from $bestStudent.")
    }

    //Method that search for a specific student in the course's list
    fun searchStudent(student: Student) {
        if (studentsList.contains(student)) println("Student is subscribed in the course")
        else throw Exception ("ERROR: Student was not found in the course list.")
    }
}