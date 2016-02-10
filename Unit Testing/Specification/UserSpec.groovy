package com.im.test

import spock.lang.Specification
import spock.lang.Unroll

class UserSpec extends Specification {
    @Unroll
    def "Full Name "(String firstname, String lastname) {
        given: "User class"
        User user = new User()
        user.setFirstName(firstname)
        user.setLastName(lastname)
        expect:
        user.getFullName() == "sagar shankhala"
        where:
        firstname | lastname
        "sagar"   | "mal"
        null      | "shankhala"
        null      | null
        "sagar"   | null
        "123"     | "shankhala"
        "sagar"   | 123
        "sagar"   | "shankhala"
    }

    @Unroll
    def "display Name"(String fname, String lname, String gender) {
        given: "User class"
        User user = new User()
        user.setFirstName(fname)

        user.setLastName(lname)
        user.gender = gender
        expect:
        user.displayName() == "Mrsagarmal shankhala"
        where:
        fname << ["sagar", null, null, "123", "sagar", "sagarmal"]
        lname << ["mal", "shankhala", null, "shankhala", 123, "shankhala"]
        gender << ["male", "12", "", "female", "Female", "Male",]


    }

    @Unroll
    def "valid password"(String password,Boolean result) {
        given:
        User user = new User();
        user.setPassword(password)
        expect:
        user.isValidPassword(password) == result
        where:
        password << ["sagar", "shankhala", "134","","null",null]
       result <<[true,true,false,false,false,false]
    }

    @Unroll
    def " reset password"() {
        given:
        User user = new User()
        def mockedService = Mock(PasswordEncrypterService)
        mockedService.encrypt(_ as String) << "dummy"

        when:
        String str = user.resetPasswordAndSendEmail()
        then:
        str == "dummy"

    }
    def "Encrypt Password"() {
        setup:
        User user = new User()
        def mockedPasswordEncrypterService = Mock(PasswordEncrypterService)
        user.passwordEncrypterService = mockedPasswordEncrypterService
        String result = mockedPasswordEncrypterService.encrypt(_ as String)
        when:
        String output = user.encyryptPassword(password)

        then:
        output == result

        where:
        password << ["abcd", "abcdefgh"]

    }

    def "Password Reset and Email sent"() {
        setup:
        User user = new User()
        and:
        def mockEmailService = Mock(EmailService)
        user.emailService = mockEmailService

        when:
        user.resetPasswordAndSendEmail()

        then:
        1 * mockEmailService.sendCancellationEmail(user,_ as String)
        user.password !="dummy"
    }
    @Unroll
    def "income group"(Integer income,String groupclass){
             given:
             User user=new User()
             user.incomePerMonth=income
        when:
        String group=user.getIncomeGroup()

        then:
                 group==groupclass
        where:
             income << [5000,11000,null,true,150000]
             groupclass << ["MiddleClass","MiddleClass","Higher MiddleClass","Higher MiddleClasss","Middle"]

    }
  @Unroll
    def "add product to PurchaseList"(List lst)
  {
      given:
      User user=new User()
      Product p=new Product();
      user.purchasedProducts=lst

      expect:
      user.purchase(p)==true
      where:
      lst << [["Grails","hello"],["Java"],"onlyString"]
  }

@Unroll
    def "Remove product from PurchaseList "(List lst)
    {
        given:
        User user=new User()
        Product p=new Product();
        user.purchasedProducts=lst
        expect:
        user.cancelPurchase(p)==true
        where:
        lst << [["Grails","hello"],["Java"],"onlyString"]

    }

    @Unroll
    def "sale product" (Boolean result){
    given:
        Transaction transaction=new Transaction()
        def mockedUser=Mock(User)
        def mockedProduct=Mock(Product)

    mockedUser.balance=110
        mockedProduct.price=80
        mockedUser.purchase(mockedProduct) >> result
        when:
        Boolean re=transaction.sell(mockedProduct , mockedUser)

        then:
           re==result
        where:
         result << [true,true]

    }

}
