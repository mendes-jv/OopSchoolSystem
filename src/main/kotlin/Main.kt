fun main() {

    val john = Student("John", "Hill", 7, 99.99)
    val lana = Student("Lana", "Flintstones", 8, 60.0)
    val lucas = Student("Lucas", "White", 8, 70.0, 2537491)
    val logic = Course("Logic and Programming I", "Fred", 8)
    val studentAddList: Array<Student?> = arrayOf(lucas, lana)

    john.printFullName()
    john.changeYearIfApproved()
    println(john.year)
    logic.enroll(john)
    logic.countStudents()
    logic.enroll(studentAddList)
    logic.countStudents()
    logic.unEnroll(lucas)
    logic.countStudents()
}