Feature: Busca Github

  @active
  Scenario: Busca por usuario
    Given Eu estou no site "http://github.com"
    When Eu procuro por "cucumber"
    And Eu clico no link com descricao "cucumber/cucumber"
    Then Eu deveria encontrar um link com descricao "cucumber"

  Scenario: Busca por projeto
    Given Eu estou no site "http://github.com"
    When Eu procuro por "cucumber"
    Then Eu deveria encontrar um link com descricao "cucumber / cucumber"
