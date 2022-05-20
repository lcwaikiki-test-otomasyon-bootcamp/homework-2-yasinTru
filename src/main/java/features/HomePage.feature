@HomePage
Feature: Home Page

  Scenario: Uyelik kaydi bulunmayan kullanici sepete urun ekler
    Given Siteye girilir
    When Aksesuar kategorisine tiklanir
    Then Aksesuar sayfasina yonlendirilir
    When Erkek butonuna tiklanir
    Then Sayfanin acildigi gorulur



