package students

class Student(private val firstName: String,
              private val lastName: String?) {

    //Declaring attributes
    private var registration = 0
    private var grade = 0.0
    private var year = 1

    //Declaring some constructors
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

    //Method that prints the student's full name
    fun printFullName() {
        println("The student's full name is: $firstName $lastName")
    }

    //Attribute that helps the method below
    private val isApproved: Boolean
        get() {
            return grade >= 60
        }

    //Method that update the student's year if he/she passed in exams
    fun changeYearIfApproved(){
        if(isApproved) {
            year++
            println("Congratulations! You were approved.")
        } else println("Oh no! You failed.")
    }

    //Method that return a student's grade
    fun getGrade(): Double {
        return this.grade
    }

    ////Method that return a student's first name
    fun getName(): String {
        return this.firstName
    }

    //Method that return a student's full name
    fun getFullName(): String {
        return "${this.firstName} ${this.lastName}"
    }

    //Method that return a student's current year
    fun getYear(): Int {
        return this.year
    }
}
