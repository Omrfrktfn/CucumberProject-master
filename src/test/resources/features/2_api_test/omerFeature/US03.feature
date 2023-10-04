@US03Api @Api @US03E2E
Feature: Kullanıcılar sayfadan mesaj gönderebilmelidir.


  Scenario Outline: US03 Mesajı doğrula (Api)
    #Tüm mesajlar içinden groovy ile eleme yaparak istediğim mesaja ulaşabilir yada email yada subject ile de request gönderebilirim
    Given Get request ile tum mesajlari al
    Then bodyi dogrula: name="<name>", email="<email>", subject="<subject>", message="<message>", date="<date>"

    Examples:
      | name       | email             | subject | message                     | date       |
      | My Message | johndoe@gmail.com | Urgent  | We have meeting tomorrow!!! | 2023-05-01 |
    #Buraya girdiğim data test classında çağrılan data ile karşılaştırılıp doğrulanacak