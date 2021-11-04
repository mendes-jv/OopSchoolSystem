class Course(val courseName: String,
             val professorName: String,
             val year:Int){

    private val studentsList= mutableListOf<Student?>()

    fun enroll(student: Student?) {
        studentsList.add(student)
        println("Student ${student!!.firstName} ${student.lastName} was added to " +
                "$courseName.")
    }

    fun enroll(student: Array<Student?>?) {
        student!!.forEach {
            studentsList.add(it)
            println("Student ${it!!.firstName} ${it.lastName} was added to " +
                    "$courseName.")
        }
    }

    fun unEnroll(student: Student?) {
        if(studentsList.contains(student)) {
            print("Are you sure ou want to remove Student ${student!!.firstName} " +
                    "${student.lastName} from $courseName?\nType \"yes\" to remove or " +
                    "\"no\" to cancel: ")
            when(readLine()!!.lowercase()) {
                "yes" -> {
                    studentsList.remove(student)
                    println("Student ${student.firstName} ${student.lastName} " +
                            "was removed from $courseName.")
                }
                "no" -> println("Student ${student.firstName} ${student.lastName} " +
                        "was not removed from $courseName.")
                else -> println("Specified command was not found.")
            }
        }
    }

    fun countStudents() {
        when(studentsList.size) {
            0 -> println("There isn't students in this , yet.")
            1 -> println("There is only 1 student in this course.")
            else -> println("There are ${studentsList.size} students in this course.")
        }
    }

    fun bestStudentAndGrade(){
        var bestGrade = studentsList[0]?.grade
        var bestStudent = "${studentsList[0]?.firstName} ${studentsList[0]?.lastName}"
        studentsList.forEach {
            if (it?.grade!! > bestGrade!!) {
                bestGrade = it.grade
                bestStudent = "${it.firstName} ${it.lastName}"
            }
        }
        println("The best grade in the course is $bestGrade " +
                "from $bestStudent.")
    }
}