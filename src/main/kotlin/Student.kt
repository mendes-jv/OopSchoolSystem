class Student constructor(val firstName: String, val lastName: String) {

    var registration = 0
    var grade = 0.0
    var year = 0

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

    var isApproved = false
        get() {
            if (grade >= 60) this.isApproved = true
            return field
        }

    fun changeYearIfApproved() {
        if (isApproved) {
            this.year = year++
            println("Congratulations!")
        }
    }


}