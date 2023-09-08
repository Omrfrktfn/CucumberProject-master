@aa
Feature: US 18 teacher testi
  Scenario: TC 01 teacher notlari gorebilmeli guncelleyebilmeli silebimeli

    Given kullanici ana sayfaya gider
    Then TEACHER GIRISI YAPAR
    When TEACHER DERS SECER
    And TEACHER OGRENCI SECER
    And TEACHER DONEM SECER
    And TEACHER DEVAMSIZLIK-MIDTERM EXAM-FINAL EXAM-INFO NOTU GIRER(INFO NOTU HARF RAKAM VE OZEL ISARET ICEREBILMELI)
    When teacher name lessonname ansentee midterm and final exam note info note ve average bilgilerini gorebilir
    And Edit Student info Midterm Exam inputu "90" olarak guncellenir.
    And Edit Student info Final Exam inputu "90" olarak guncellenir.
    And teacher delete butonunun gorunurlugunu kontrol eder
    And student info list kapatilir