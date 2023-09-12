@us01
Feature: US01/Aday öğrenciler sisteme kayıt olabilmelidir(Register)

  Background: browser
    Given kullanici omer "baseUrl" sayfasina gider
    Given kullanici omer register butonuna tiklar

  @us01tc01
  Scenario Outline: TC01
    When kullanici name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    And kullanici omer kayit yapildigini dogrular
    Examples:
      | name  | surname | birth_place | phone_number | gender | birth_day  | ssn         | username | password   |
      | Aniee | kent    | New York    | 507 542 2135 | male   | 01.01.1997 | 494-66-7696 | sergio   | Sergio.123 |

     #@pass

  @us01tc02
  Scenario Outline: TC02 (Sayisal ifadeli name kabul ediyor !!!)
    When kullanici sayisal ifadeli name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    And kullanici omer kayit yapildigini dogrular
    Examples:
      | name | surname | birth_place | phone_number | gender | birth_day  | ssn         | username | password    |
      | 9787 | kent    | New York    | 507 542 2135 | male   | 01.01.1997 | 494-66-7696 | 12394    | Sergio.1234 |

     #@fail

  @us01tc03
  Scenario Outline: TC03 (Cinsiyet secme islemi yapilmadiginda uyari vermiyor)
    When kullanici cinsiyet secmeden name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    And kullanici omer kayit yapildigini dogrular
    Examples:
      | name   | surname | birth_place | phone_number | gender | birth_day  | ssn         | username | password   |
      | lugano | kent    | New York    | 507 542 2135 | -      | 01.01.1997 | 494-66-7696 | lugano   | Lugano.123 |

     #@fail

  @us01tc04
  Scenario Outline: TC04 (Kullanici_register_olurken_name_kutusu_invalid_deger_kabul_etmemeli)
    When kullanici invalid degerli name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    And kullanici omer kayit yapildigini dogrular
    Examples:
      | name | surname | birth_place | phone_number | gender | birth_day  | ssn         | username | password    |
      |      | kentt   | New York    | 507 542 2135 | male   | 01.01.1997 | 494-66-7696 | Kent     | Sergio.1234 |

    #@pass

  @us01tc05
  Scenario Outline: TC05 (Kullanici_register_olurken_surname_kutusu_invalid_değer_kabul_etmemeli)
    When kullanici invalid degerli surname name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    And kullanici omer kayit yapildigini dogrular
    Examples:
      | name  | surname | birth_place | phone_number | gender | birth_day  | ssn         | username | password    |
      | kentt |         | New York    | 507 542 2135 | male   | 01.01.1997 | 494-66-7696 | Kent     | Sergio.1234 |

    #@pass

  @us01tc06
  Scenario Outline: TC06 (Kullanici_register_olurken_birth_place_kutusu_invalid_deger_kabul_etmemeli)
    When kullanici invalid degerli birth place name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    And kullanici omer kayit yapildigini dogrular
    Examples:
      | name  | surname | birth_place | phone_number | gender | birth_day  | ssn         | username | password    |
      | kentt | souza   |             | 507 542 2135 | male   | 01.01.1997 | 494-66-7696 | Kent     | Sergio.1234 |

    #@pass

  @us01tc07
  Scenario Outline: TC07 (Kullanici_register_olurken_phone_kutusu_invalid_deger_kabul_etmemeli)
    When kullanici invalid degerli phone number name "<name>", surname "<surname>",birth_place "<birth_place>", phone_number "<phone_number>",gender "<gender>", birth_day "<birth_day>",ssn "<ssn>",username "<username>",password"<password>"
    And kullanici omer kayit yapildigini dogrular
    Examples:
      | name  | surname | birth_place | phone_number | gender | birth_day  | ssn         | username | password    |
      | kentt | souza   | Arizona     |              | male   | 01.01.1997 | 494-66-7696 | Kent     | Sergio.1234 |

    #@pass