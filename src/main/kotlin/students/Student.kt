package students

class Student(private val firstName: String,
              private val lastName: String?) {

    private var registration = 0
    private var grade = 0.0
    private var year = 1

    constructor(firstName: String,
                lastName: String,
                year: Int,
                grade: Double):
            this(firstName, lastName) {
                this.year = year
                this.grade = grade
            }

    constructor(firstName: String,
                lastName: String,
                year: Int,
                grade: Double,
                registration: Int):
            this(firstName, lastName, year, grade) {
                this.registration = registration
    }

    fun printFullName() {
        println("The student's full name is: $firstName $lastName")
    }

    private val isApproved: Boolean
        get() {
            return grade >= 60
        }

    fun changeYearIfApproved(){
        if(isApproved) {
            year++
            println("Congratulations! You were approved.")
        } else println("Oh no! You failed.")
    }

    fun getGrade(): Double {
        return this.grade
    }

    fun getName(): String {
        return this.firstName
    }

    fun getFullName(): String {
        return "${this.firstName} ${this.lastName}"
    }

    fun getYear(): Int {
        return this.year
    }
}
