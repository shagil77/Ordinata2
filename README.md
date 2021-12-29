# Ordinata
A Notes and Password Managing App  


OBJECTIVE We will be creating an android application which helps to take notes at any time and helps to generate a very strong password for the security of a user’s account and makes them available whenever they need. It's going to have two major functionalities at the same time.  


FEATURES AND THEIR FUNCTIONS  

Firebase and Authentication: Declare the dependency for the Firebase Authentication Android library in our module ( app-level ) Gradle file ( usually app/build.gradle ). To use an authentication provider, we need to enable it in the Firebase console. Go to the Sign-in Method page in the Firebase Authentication section to enable Email/Password sign-in and any other identity providers you want for our app. After this we should be able to develop the Login feature of our application and also integrate Firebase authentication for the same. 

Login, Sign-up and Forgot Password Activities: These activities have been created using the Email Authentication feature of Firebase.

Home Activity: Now we will create an activity where there will be able to see all our created notes. Create a new component called App-Bar in note activity. Add the necessary code in the xml and java files so that all the work is done accurately. We will use Recycleview to show notes as mentioned earlier. Then we will upload all the notes for the current user in a document created on Cloud Firestore, and populate the RecyclerView with notes from Cloud Firestore data for a particular user.

Create Note Activity: Where the user will enter the title and description of his Notes/Passwords and save it.

Each Note/Password will additionally have a functionality of Edit, View and Delete.

All the xml files are available in res>layouts.

All java files are available in java/com/example/ordinata.
