class Course constructor(val courseName: String,
                         val professorName: String,
                         val year:String){

    val studentsList= mutableListOf<Student>()

    fun enroll(student: Student?) {
        if (student != null) {
            studentsList.add(student)
        }
    }

    fun unEnroll(student: Student?) {
        print("Are you sure ou want to remove $student from $courseName?" +
               "\nType \"yes\" to remove or \"no\" to cancel:")
        when (readLine()!!.lowercase()) {
            "yes" -> studentsList.remove(student)
            "no" -> println("$student was not removed.")
        }
    }

    fun countStudents() {
        when (studentsList.size) {
            0 -> println("There isn't students in this , yet.")
            1 -> println("There is only 1 student in this course.")
            else -> println("There are ${studentsList.size} students in this course.")
        }
    }

    fun bestGrade(){
        var bestGradeInCourse = 0.0
        var bestStudentInCourse = ""
        studentsList.forEach {
            if (it.grade > bestGradeInCourse) {
                bestGradeInCourse = it.grade
                bestStudentInCourse = "${it.firstName} ${it.lastName}"
            }
        }
        println("The best grade in the course is: $bestGradeInCourse " +
                "from $bestStudentInCourse.")
    }
}