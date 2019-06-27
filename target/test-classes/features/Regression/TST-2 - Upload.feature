Feature: TST-2: Upload Sample

	@Regression
	Scenario Outline: 1: Upload Images
		Given user opens browser
		When user enters the "<username>" and "<password>" for the login credentials
		Then user is on "Facebook" page
		When user decides to create a new post
		And user puts "Test Upload" as the text contents for the post
		And user selects "C:\\Users\\Jerome.Amores\\Downloads\\1.PNG" as the photo/video to be uploaded
		And user selects "C:\\Users\\Jerome.Amores\\Downloads\\2.PNG" as the photo/video to be uploaded
		And user selects "C:\\Users\\Jerome.Amores\\Downloads\\3.PNG" as the photo/video to be uploaded
		And user shares the new post
		Then user sees the new "Test Upload" post with the photos/videos

		Examples: 
			| username                       | password       |
			| bahalakasabuhaymo530@gmail.com | fakeaccount123 |

	@Regression
	Scenario Outline: 2: Delete Recently Uploaded Images
		Given user opens browser
		When user enters the "<username>" and "<password>" for the login credentials
		Then user is on "Facebook" page
		When user decides to delete the new "Test Upload" post with the photos/videos
		Then user sees the delete post confirmation message
		When user confirms the deletion of the post
		Then user does not see the new "Test Upload" post with the photos/videos

		Examples: 
			| username                       | password       |
			| bahalakasabuhaymo530@gmail.com | fakeaccount123 |
