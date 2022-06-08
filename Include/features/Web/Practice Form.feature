Feature: Practice Form

  Scenario: Fill out the Practice Form
    Given I open default page
    When I type 'Fajar' on 'Practice Form/TextBox_FirstName'
    And I type 'LESmana' on 'Practice Form/TextBox_LastName'
    And I type 'automation.test@mail.com' on 'Practice Form/TextBox_UserEmail'
    And I click 'Practice Form/RadioButton_Male'
    And I type '087822997784' on 'Practice Form/TextBox_MobileNumber'
    And I click 'Practice Form/TextBox_DateOfBirth'
    And I select option value '6' on 'Practice Form/DatePicker_Month'
    And I select option value '1980' on 'Practice Form/DatePicker_Year'
    And I click 'Practice Form/DatePicker_Day'
    And I type 'Computer' on 'Practice Form/TextBox_Subjects'
    And I send keys TAB on 'Practice Form/TextBox_Subjects'
    And I type 'Economics' on 'Practice Form/TextBox_Subjects'
    And I send keys ENTER on 'Practice Form/TextBox_Subjects'
    And I scroll to element 'Practice Form/TextBox_MobileNumber'
    And I check 'Practice Form/CheckBox_Sports'
    And I check 'Practice Form/CheckBox_Music'
    And I upload file 'C:/Windows/Web/Screen/img100.jpg' on 'Practice Form/Button_Upload'
    And I type 'Jl. Tidak Rata No.84 Bandung' on 'Practice Form/TextArea_CurrentAddress'
    And I click 'Practice Form/DropDownList_State'
    And I click 'Practice Form/DropDownList_State-Option2'
    And I click 'Practice Form/DropDownList_City'
    And I click 'Practice Form/DropDownList_City-Option1'
    And I wait for 5 seconds
    And I take screenshot
    And I submit 'Practice Form/Button_Submit'
    And I wait for 5 seconds
    Then I should see text 'Thanks for submitting the form'
    And I take screenshot
    And I close browser
