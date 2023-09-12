Feature:US02/Admin Guest User List

  Background: browser
    Given kullanici omer "baseUrl" sayfasina gider
    When kullanici omer login butonuna tiklar
    Then kullanici omer usarname girer
    Then kullanici omer password girer
    And kullanici omer user name login butonuna tiklar
    And kullanici sigin-login oldugunu dogrular
    And kullanici omer menu secegine tiklar
    And kullanici omer Guest User secegine tiklar
    And kullanici Guest User list sayfasini gorur

  @us02tc01
  Scenario: TC01_Admin_guest_user_bilgilerini_gorur
    And Admin Guest User List, Name, Phone Number, SSN, User Name bilgilerini gorur

  @us02tc01
  Scenario: TC02_Admin_guest_user_bilgilerini_siler
    Then kullanici Guest user list bilgilerini delete butonuna tiklayarak siler
    And kullanici silindigini dogrular