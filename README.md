quicklearn
==========
Doc Version of ReadMe at:
https://docs.google.com/document/d/1TGtZbR0P7CNiwvJHQ9vJ8uOAnjZ5WYUbdop8PCDGkb0/edit?usp=sharing

Overview of QuickLearn
  QuickLearn App is a tool that students use during math lessons to provide the instructor with feedback related to the lesson being taught. Students are prompted three times (beginning, middle & end) of the lesson. Each prompt prompt students to answer a multiple choice and free response (numeric or text) question. Additionally, students answer two Likert scale questions relating to their perceived understanding of the lesson being taught and rate at which the lesson is being taught. Results from QuickLearn can be used to measure the level of student learning at multiple points during the lesson or over a period time such as a book chapter or summative unit. Results can also be used to guide instruction daily meet the needs of the students.

Required Android Permissions
  QuickLearn requires mobile network/wifi access to send user data (answers to QuickLearn survey) to the remote server database.

Required Web Services, e.g., GIS, Google, etc., 
  Quicklearn requires the online database to store user data which is hosted by Amazon.

Required, built-in, features/devices: GPS, Camera, Gallery, Contacts, SMS, etc. 
  QuickLearn does not use any devices

Testing procedures (emulators, device tests, unit tests, etc.)
  QuickLearn was tested primarily using Eclipse emulator using Android library 4.2.2. The Online component (still under development) is available at http://student-survey.elasticbeanstalk.com/
  
Screenshots
  See doc version
  
Known bugs, limitations, and problems
  Current limitations include that QuickLearn only runs on newer android devices using build 4.2.2 or higher which excludes many potential users. The app does not support cross platform usage yet which prevents users from switch from using the Android version to the Online version.
Set of features to be implemented or next steps
  The next generation will include a login (with student number & password) to the Online version to enable cross platform usage. Future versions will also include the ability to create new dynamic questions making it easier to tweak/add questions on the fly as needed.

License and contributors
  QuickLearn was developed by Yousef.Abed@cgu.edu and David.Hodgin@cgu.edu to fulfil project requirement for IST380 at Claremont Graduate University (Summer 2013). Contributors should be contacted before using or distributing any part/whole piece of QuickLearn.
