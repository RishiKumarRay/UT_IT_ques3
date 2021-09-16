package validatorTest

import org.scalatest.funsuite.AnyFunSuite
import com.knoldus.models.Employee
import com.knoldus.validator.EmployeeValidator
class employe_validate_Test extends AnyFunSuite{

  val FirstEmployeekaty = Employee("katy", "perry", 32,50000, "Software Consultant", "Knoldus", "katyperry@gmail.com" )
  val SecondEmployeejohn = Employee("john", "wick", 26,30000, "Software Trainee", "Knoldus", "wickjohn43@gmail.com" )
  val ThirdEmployeegoku = Employee("goku", "san", 43,65000, "Sr. Software Engineer", "CTS", "johncena467@gmail.com" )
  val FourthEmployeekevin = Employee("kevin", "tennyson", 22,25000, "Software Consultant", "Knoldus", "kevin?@gmail.com" )


  test("Checking if Employee- employeeOnekaty working in Knoldus(company present in Database) is a valid Employee"){
    val expectResult = true
    val result = (new EmployeeValidator).employeeIsValid(FirstEmployeekaty)
    assert(expectResult == result)
  }


  test("Checking if Employee- employeeTwoLeo working in john(company present in Database) is a valid Employee"){

    val expectResult = true
    val result = (new EmployeeValidator).employeeIsValid(SecondEmployeejohn)
    assert(expectResult == result)
  }


  test("Checking if Employee- employeeThreegoku working in company TCS(company not present in Database) is thus an invalid Employee"){

    val expectResult = false
    val result = (new EmployeeValidator).employeeIsValid(ThirdEmployeegoku)
    assert(expectResult == result)
  }

  test("Checking if Employee- employeeFourkevin working in Knoldus(company present in Database) having invalid Email ID is thus an invalid Employee"){
    val expectResult = false
    val result = (new EmployeeValidator).employeeIsValid(FourthEmployeekevin)
    assert(expectResult == result)
  }

}
