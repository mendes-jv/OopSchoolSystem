import courses.Course
import students.Student

fun main() {

    //Declaring variables
    val john = Student("John", "Hill", 7, 99.99)
    val lana = Student("Lana", "Flintstones", 8, 60.0)
    val lucas = Student("Lucas", "White", 8, 70.0, 2537491)
    val logic = Course("Logic and Programming I", "Fred", 8)
    val studentAddList: Array<Student?> = arrayOf(lucas, lana)

    //Calling methods
    john.printFullName()
    john.changeYearIfApproved()
    println(john.getYear())
    logic.enroll(john)
    logic.countStudents()
    logic.enroll(studentAddList)
    logic.countStudents()
    logic.unEnroll(lucas)
    logic.countStudents()

    //Testing a method that search students in courses
    try {
        logic.searchStudent(lucas)
    } catch(e: Exception) {
        println(e.message)
    }

}