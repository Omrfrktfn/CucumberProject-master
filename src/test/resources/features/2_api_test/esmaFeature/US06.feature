Feature: US06 Vice Dean Hesabı Oluşturma
@apiusalti
  Scenario: Dean, Vice Dean hesabı olusturur
    Given Vice Dean eklemek icin Post request hazirligi yapilir usalti
    And Gonderilecek Vice Dean bilgileri hazirlanir usalti
    When Vice Dean eklemek icin Post request gonderilir usalti
    Then Vice Dean bilgileri dogrulanir usalti


    #  | Key          | Value        |
     # | Name         | Cucumber1    |
     # | Surname      | Cucumber1    |
     # | Birth Place  | Cucumber1    |
     # | Gender       | Female       |
     # | Birthday     | 12/12/1998   |
      #| Phone Number | 738-953-4934 |
      #| SSN       | 300-38-3204 |
     # | User Name | whatever  |
     # | Password | Cucumber1 |


