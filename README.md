# Ordinata
A Notes and Password Managing App  


OBJECTIVE We will be creating an android application which helps to take notes at any time and helps to generate a very strong password for the security of a user’s account and makes them available whenever they need. It's going to have two major functionalities at the same time.  


FEATURES AND THEIR FUNCTIONS  
Firebase and Authentication: Declare the dependency for the Firebase Authentication Android library in our module ( app-level ) Gradle file ( usually app/build.gradle ). To use an authentication provider, we need to enable it in the Firebase console. Go to the Sign-in Method page in the Firebase Authentication section to enable Email/Password sign-in and any other identity providers you want for our app. After this we should be able to develop the Login feature of our application and also integrate Firebase authentication for the same. 
Home Activity: Now we will create an activity where there will be two options note and password. Create a new component called App-Bar in note activity. Add the necessary code in the xml and java files so that all the work is done accurately. We will use Listview or Recycleview to show notes as mentioned earlier. Using Listview or Recycleview, we can only show the title of the notes and after clicking on those titles, the rest of the functionality can be done. 
Password Activity: we will create one more activity through which all the passwords will be managed and besides add and delete functionality should work feasibly. We will use Listview or Recycleview to show passwords like notes as mentioned earlier. Using Listview or Recycleview you can only show the field name of the passwords and after clicking on those field names, the rest of the functionality can be done.
