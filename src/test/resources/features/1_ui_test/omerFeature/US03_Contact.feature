Feature:US03/Kullanıcılar sayfadan mesaj gönderebilmelidir.(Contact)

  Background: browser
    Given kullanici omer "baseUrl" sayfasina gider
    Given kullanici omer contact butonuna tiklar.


  @us03tc01
  Scenario Outline: TC01
    When kullanici name "<name>", email "<email>",subject "<subject>", message "<message>"
    Then kullanici sendMessage butonuna tiklar
    And kullanici kayit mesaji yapildigini dogrular
    Examples:
      | name     | email         | subject                 | message                      |
      | sammaata | xyz@gmail.com | Kayitlar hakkinda bilgi | yeni kayitlar hakkinda bilgi |

     #PASS

  @us03tc02
  Scenario Outline: TC02 ( "." yazmadan bir email ile mesaj yollama islemi)
    When kullanici name "<name>", email "<email>",subject "<subject>", message "<message>"
    Then kullanici sendMessage butonuna tiklar
    And kullanici kayit mesaji yapildigini dogrular
    Examples:
      | name   | email          | subject                 | message                      |
      | deived | deived45@gmcom | Kayitlar hakkinda bilgi | yeni kayitlar hakkinda bilgi |

     #Fail

  @us03tc03
  Scenario Outline: TC03 (name kismina sayisal ifadeler girer)
    When kullanici name "<name>", email "<email>",subject "<subject>", message "<message>"
    Then kullanici sendMessage butonuna tiklar
    And kullanici kayit mesaji yapildigini dogrular
    Examples:
      | name | email          | subject                 | message                      |
      | 6547 | deived45@gmcom | Kayitlar hakkinda bilgi | yeni kayitlar hakkinda bilgi |

  @us03tc04
  Scenario Outline: TC04 (email kisminda sadece sayisal ifadeler ile mesaj yollama islemi)
    When kullanici name "<name>", email "<email>",subject "<subject>", message "<message>"
    Then kullanici sendMessage butonuna tiklar
    And kullanici kayit mesaji yapildigini dogrular
    Examples:
      | name  | email       | subject   | message      |
      | 65747 | 16546@45646 | 454713456 | 564867654132 |

  @us03tc05
  Scenario Outline: TC05 (kullanici uzun bir mesaj girdigin tab ile yada enter yaptiktan sonra mesaj yollama islemi)
    When kullanici name "<name>", email "<email>",subject "<subject>", message "<message>"
    Then kullanici sendMessage butonuna tiklar
    And kullanici kayit mesaji yapildigini dogrular
    Examples:
      | name | email           | subject                 | message                                                                                                                                        |
      | emly | alaba@gmail.com | Kayitlar hakkinda bilgi | 2023-2024 sezounu icin yeni kayitlar hakkinda bilgi almak istiyorum fsdafdsfdf afdsfasdf dfsadfdsafds fdsasdfsdfdsf sadfdsafds asdf sdafds fsd |


  @us03tc06
  Scenario Outline: TC06 (Kullanici_yourname_kutusunu_boş_biraktiginda_mesaj gönderememeli)
    When kullanici invalid name "<name>", email "<email>",subject "<subject>", message "<message>"
    Then kullanici sendMessage butonuna tiklar
    And kullanici kayit mesaji yapildigini dogrular
    Examples:
      | name | email       | subject | message    |
      |      | 16546@45646 | asdfasd | sfasdfdsaf |

  @us03tc07
  Scenario Outline: TC07 (Kullanici_youremail_kutusunu_boş_biraktiginda_mesaj gönderememeli)
    When kullanici invalid email name "<name>", email "<email>",subject "<subject>", message "<message>"
    Then kullanici sendMessage butonuna tiklar
    And kullanici kayit mesaji yapildigini dogrular
    Examples:
      | name | email | subject | message    |
      | fsa  |       | asdfasd | sfasdfdsaf |

  @us03tc08
  Scenario Outline: TC08 (Kullanici_ayni_mail_adresi_ile_ikinci_mesaji_gönderememeli)
    When kullanici name "<name>", email "<email>",subject "<subject>", message "<message>"
    Then kullanici sendMessage butonuna tiklar
    And kullanici kayit mesaji yapildigini dogrular
    Examples:
      | name      | email               | subject                 | message                      |
      | sammaata  | sammmatta@gmail.com | Kayitlar hakkinda bilgi | yeni kayitlar hakkinda bilgi |
      | sammdcata | sammmatta@gmail.com  | Kayitlar hakkinda bilgi | yeni kayitlar hakkinda bilgi |
    #@fail
