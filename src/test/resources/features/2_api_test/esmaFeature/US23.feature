Feature: US23 Vice Dean Hesabı Oluşturma

@apiusyirmiuc
  Scenario: Admin, Vice Dean hesabı olusturur
    Given Vice Dean eklemek icin Post request hazirligi yapilir usyirmiuc
    And Gonderilecek Vice Dean bilgileri hazirlanir usyirmiuc
    When Vice Dean eklemek icin Post request gonderilir usyirmiuc
    Then Vice Dean bilgileri dogrulanir usyirmiuc


     # | Key          | Value        |
     # | Name         | Cucumber1    |
     # | Surname      | Cucumber1    |
     # | Birth Place  | Cucumber1    |
      #| Gender       | Female       |
     # | Birthday     | 12/12/1998   |
     # | Phone Number | 738-953-4934 |
     # | SSN       | 300-38-3204 |
     # | User Name | whatever  |
     # | Password | Cucumber1 |




