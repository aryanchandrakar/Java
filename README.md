# Java
## Class-Objects, Static & Abstracts
* Consider the class for a course given below
    Data Members
      o Course Name 
      o Course ID 
      o Course Type (UE, PE or PC)
      o Offered By (School that offers the course) 
    Methods
      o Set_course Details()  -  Method to set data for the object 
      o search_course Details() - Method receives an array of course objects and searches them 
      o display_course Details() - display the count of courses based on course type.
Create an array of five course objects by reading the data from the user. Use the static method search_course Details() to read the array of course objects and count the number of UE, PE and PC courses in the array of course objects. Display the count of UE, PE and PC courses using the display_course Details() method. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/479834f2ab32c61a222fae76ac4528a98b3bca43/ClassObjects_Static_Abstract/course_in_array.java) 

* Consider the class for a mobile phone given below

        Data Members
            o Model Name 
            o Company Name 
            o Price 
            o Year of Manufacture
        Methods
            o set_mobileDetails() - Method to set data for the object 
            o sort_mobileDetails() - Method receives an array of mobile phone objects and sorts them 
            o display_mobileDetails() - display the data inside the array of objects.
Create an array of five mobile phone objects by reading the data from the user. Use the static method sort_mobileDetails to read the array of mobile objects and sort them according to the company name. Display the sorted array of objects using the display_mobileDetails Method. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/6bb3f77d546c95535f8728dc3c6e5bc487b51ac7/ClassObjects_Static_Abstract/mobile_phone_details.java)

* Sphere, Cylinder, Cone and Cube are classes that inherit from the abstract class shape. Shape has an abstract method compute_volume(). Demonstrate with code on how dynamic polymorphism and upcasting can be used to compute the volume of the different shapes. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/6bb3f77d546c95535f8728dc3c6e5bc487b51ac7/ClassObjects_Static_Abstract/volume_polymorphism_upcasting.java)


## Collections



## String & Arrays
* Write a Method that receives a jagged array containing marks scored by a student in various semesters. For instance the marks in the jagged array are as shown below

            40 80 30 99 
            20 55 
            31 44 55 67 
            87 45 66
Receive the jagged array in a method and write code to display the number of subjects the student has passed (marks >= 40) and the number of subjects the student has failed (marks <40). __Use an enhanced for loop in the code__ -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/6bb3f77d546c95535f8728dc3c6e5bc487b51ac7/Strings/jagged_array.java)

* Read a sentence from the user and display the count of the word VIT used in the sentence. If the word VIT is not present in the sentence then display the message "No such word in the Sentence" Message -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/6bb3f77d546c95535f8728dc3c6e5bc487b51ac7/Strings/countword.java)

* Read an array of 5 Registration Numbers from the user. Display the count of students who are from SCOPE and SENSE school by processing the registration numbers. The registration numbers of students from SCOPE school will contain BCE to be part of the registra number and the registration numbers of students from SENSE school will contain BEC to be part of the registration numbers. If the user doesn't enter any registration number corresponding to SCOPE or SENSE school then display the message that "There are no Students from SCOPE and SENSE school" -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/6bb3f77d546c95535f8728dc3c6e5bc487b51ac7/Strings/school.java)

        Sample registration numbers for SCOPE School - 11BCE2333, 12BCE9877 
        Sample registration numbers for SENSE School - 11BEC4423, 12BEC7655

* Read an array of names from the user. The input name format is Dr. Bontu, Dr. Gladys, Dr. Kavitha. Read search name from the user. The user may enter just the name like Bontu, Gladys and Kavitha . Check if the name entered by the user is present in the array of names If the name is found then display "Name Found" or else displayName not Found". -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/6bb3f77d546c95535f8728dc3c6e5bc487b51ac7/Strings/searchname.java)

* Read username and password. Check if any three characters of the username in the same order is present in the password. If yes then display weak password to the user. For instance if the user name is test and password is rest. Since three characters est is from the user name is present in the password we should display weak password to the user. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/6bb3f77d546c95535f8728dc3c6e5bc487b51ac7/Strings/usernamepassword.java)

* Accept username, password and confirm password and perform the following
        
        * Check if the username and password is empty 
        * Password should be minimum 8 characters in length 
        * Check if the password contains the username 
        * Check if the password matches the confirm password
        
* Reverse every word in a string and display the result to the user (If Input is satish teaches Java then output should be hsitas sehcaet ava) -- [Answer_link 1](https://github.com/aryanchandrakar/Java/blob/6bb3f77d546c95535f8728dc3c6e5bc487b51ac7/Strings/reverse1.java), [Answer_link 2](https://github.com/aryanchandrakar/Java/blob/6bb3f77d546c95535f8728dc3c6e5bc487b51ac7/Strings/reverse.java)

* Read a string and represent that in binary. Convert the string to hexadecimal characters and convert the hexadecimal characters to binary. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/6bb3f77d546c95535f8728dc3c6e5bc487b51ac7/Strings/hexabin.java)
