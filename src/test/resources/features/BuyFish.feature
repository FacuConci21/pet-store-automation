
  @BuyFish
  Feature: Buy a little fish
    As user I wish to buy a fish in the Pets Store and call him 'Nemo'

    Scenario: Try to buy a fish Logged-in
      Given beginning on the main page
      When I complete the steps for buy a fish
      Then I see the message "Thank you, your order has been submitted."