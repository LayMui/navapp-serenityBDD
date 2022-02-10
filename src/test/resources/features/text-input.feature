Feature: Text Input
  In order to enter text into the TextInput component
  As a QA tester Jan
  Jan wants to see how text is entered into TextInput component
  
    Background: 
      Given Jan is at the app

@test
  Scenario Outline: Text Input
    When he want to enter text to the text input "<text>"
    Then he is able to see text entered

   Examples:
    | text      |
    | 12345678  | 
 
