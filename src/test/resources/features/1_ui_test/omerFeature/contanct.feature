Feature:Contact

  Background: browser
    Given kullanici omer "baseUrl" sayfasina gider
    When kullanici login butonuna tiklar
    Then kullanici omer usarname girer
    Then kullanici omer password girer
    And kullanici omer user name login butonuna tiklar
    And kullanici sigin-login oldugunu dogrular
    And kullanici omer menu secegine tiklar
    And kullanici Contact Get All secegine tiklar
