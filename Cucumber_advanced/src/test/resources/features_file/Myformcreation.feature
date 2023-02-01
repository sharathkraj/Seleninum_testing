Feature: forms creation in mycontactform webpage
Scenario: the new article creations
	Given the users is logged in sucessfully in mycontactform home page
	When the user click the new form in homepage
	And the use enter the new form wizard
	And enter the form details
	Then should see the created form
		