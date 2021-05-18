Feature: Feature name

    Dog Facts
    Scenario: Get dog facts

        Given I am a client
        When I do a GET on http://dog-api.kinduff.com/api/facts
        Then I should get 1 dog fact

