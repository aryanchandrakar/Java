# Java
## Javafx
* Write a JavaFX program to create a page with 5 buttons named "red", "green", "blue", "pink", "black", on clicking the button, print the color name in the console. In the same program, add necessary code to change the color of button based on the name of the button. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/javafx/ButtonColor_javafx.java)

* Develop an Air ticket booking Home page by using Text and Button objects (Source, Destination, Depature Date, No.of passengers, Class(Business, First, Economy)with appropriate Layout to describe about the booking. On clicking the button “Book”, display the collected information on the next page. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/javafx/AirTicket_javafx.java)

* Develop a calculator using Javafx. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/javafx/Calculator_javafx.java)

* Develop a javafx program such that it prints message on terminal on click of the button. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/javafx/ClickToHelloTerminal_javafx.java)


## Serialization
* Create a Employee class containing the following fields

        • Name 
        • Employeeld
        • School Name 
        • Emailid 
        • Address
The class have a parametrized constructor for initializing the object. Create an array of three employee objects by getting the input data from the user. Serialize the array of objects to a file by name employee.txt. Deserialize the array of objects from employee.txt and display only those employees who are from SCOPE school and whose address is from vellore to the output. If there are no such employees then display "No such Employees Match the Criteria" message to the user. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/serialization/Employee_Searlized.java)

* Write a Java application that performs the following for a user
The application should maintain the data of various projects in a file.Consider the project class with the data members projectName, projectID, budget, location. The application should provide the option of storing the data pertaining to every Project Object in a file by name project.txt.
The application should throw the following menu options to the user     
   a) Submit project data-Gets the project information for a specific project and writes the data to the file project.txt
   
   b) View Project data - The user should be able to view the data of all projects from the file.
   
The user should be able to perform the above mentioned operations any number of times without exiting the system. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/serialization/Project_Serialized.java)


## Serialization & Collections
* Consider placement senario of the college where the student is registered under a course, having certain GPA and is either placed or not. Develop a program to get input the status of each student as name, CGPA, course registered & placement status and store it in a text file. Further search for the input student name in the text file forhis/her details, and display the course they registered under with their GPA and placement status. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/serialization_collection/Student_placement_Serilization_ArrayList.java)


## Multi-threaded Filehandling
* Create Threads that will perform the following: -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/442df35a5674fab78999fccee83df740ccc5f411/multi_Thread_fileHandling/PrimeFile_File_Multithread.java)

        -> Thread 1 - Writes all prime numbers between 1 and 100 to the file file1.txt
        -> Thread2-Writes all prime numbers between 101 and 200 to the file2.txt
        (Write operations to the files should be paused for 1 second after each write.)
        -> Thread3- Reads and displays prime numbers from file1.txt
        -> Thread4- Reads and displays prime numbers from file2.txt
        Thread and Thread4 should start the read operations after the write operations to the file is complete. 
        (Use DataOutputStream and DatainputStream for the file write and read operations)

* Create threads that will perform the following: -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/442df35a5674fab78999fccee83df740ccc5f411/multi_Thread_fileHandling/StopWords_multifiles.java)

        -> Thread1- Reads all stop words ("a","and","the" are considered as stop words here)from the file file1.txt 
                and displays number of times each stop word occurs in the file.
        -> Thread2- Reads all words other than stop words from the file2.txt and displays number of times the word that start with Character H is part of the file.
        -> Tread3- displays Thanks for using our software to the user after the file read operations in Thread1 and Thread2 is complete.
     Use Scanner object to perform file reads and set the Priority for Thread1 as 3, Thread 2 as 2 and Thread3 as 1 in your code. 


## Mutli-threading
* Demonstrate multithreading by creating two threads, one for printing the odd numbers and the other for printing even numbers with in a given range of your choice. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/multithreading/multithread_oddEven.java)

* Write a java program to create thread that stores a set of unique numbers from 100 to 200, whose sum of digits is a factor of the same number. If the input string is not in the range, raise a user defined exception. Another thread that stores the set of unique numbers from 1 to 100 whose sum of digits is prime number. Both the threads should execute in equal intervals of 10 numbers. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/multithreading/multithread_sumPrimeNnique.java)


## Inter-Thread Communication
* Consider a Course Registration Class given below that has the following data members -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/d00570cced84c720e1a84359ddb2fdce7b026ae2/interthread_comm/CourseRegistration_InterThreadComm.java)

        o CourseName
        o Faculty Name
        o NumberOfSeats
    The class has a parameterized constructor to initialize an object and the following methods(The object is initialized with the given values[Course name-Java Programming, Faculty Name-Hilda, Numerofseats-0])
        
        o Register seat - This method will deduct 1 seat from the Numberofseats
        o Allot_Seats(int Seats) - This method will get the number of Seats to be allocated and add those seats to Numberofseats.
    Create the following threads and demonstrate registration and allocation of seats to the course
        
        -> Thread1 - Will try and register a seat for the Java Programming Course
        -> Thread2 - Will try and register a seat for the Java Programming Course
        -> Thread3 - Will allot 60 seats to the Course
        -> Thread4 - Should print the total remaining Seats after registration is complete.
        -> Thread1 and Thread2 will be in Wait if the value for NumberOfSeats is 0
        -> Threads will notify other threads after alloting the seats

* A famous bakery in Vellore prepares cakes for their customers. The shop makes cake and stacks it up in a vessel, and the customer buys them. The max capacity of the vessel is 10. If the cakes are emptied, customers wait for the baker to prepare new cakes. Develop a program for the given scenario using inter thread communication concept in Java programming. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/d00570cced84c720e1a84359ddb2fdce7b026ae2/interthread_comm/bakery_threadComm.java)


## File Handling
* Write a Java Program to Reverse the Contents of a File and Print it (Use FileInputStream and FileOutputStream) -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/a37e0c01a05081cd44d39c50e7f390694475aa4a/file_handling/DataReverse_FileinputStream.java)

* Write a Java Program to read and write English alphabets(A-Z) into a file and read it from the console(Use Buffered StreamReader and Writer) -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/a37e0c01a05081cd44d39c50e7f390694475aa4a/file_handling/Alphabets_BufferStream.java)


## Inner Class & Packages
* Faculty members have degrees (Here degree is an inner class). For any given faculty member list the number of degr the faculty member has obtained) -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/inner_classPackages/facultyMember_innserClass.java)
        
        - Faculty class should have degree as an inner class 
        - Faculty class-name, employee id and degree 
        - Faculty Method-Display_faculty_data() 
        - Degree class-degree_name, awarded_year, awardedbyuniversity 
        - Degree Method-Display_degree_details
     Input Format:

        Number of Faculty
        Faculty Name1 and id1
        Faculty Name2 and id2
        Enter the number of degree certificates for Faculty1:
        Enter the degree details1:
        Degree
        University Name
        Year of Completion
        Enter the degree details2:
        Degree
        University Name
        Year of Completion
        Enter the number of degree certificates for Faculty2:
        Enter the degree details1:
        Degree
        University Name
        Year of Completion
     Output Format:
     
        Faculty id1 and Name1 and Number of degrees
        Faculty id2 and Name2 and Number of degrees

* Faculty is a class having two data members name and empid. Eligible leave is a nested static class inside faculty class. Eligible leave class will have three static leave categories (EL, ML and CL initialized to 12,20 and 10) and it will have a static method display_leave_categories to display the static variables. Class Eligible leave is common for all faculty objects. Get array of faculty objects from the user and display the leave_categories for all faculty objects along with faculty data back to the user. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/inner_classPackages/leave_category.java)
     Input Format: 
        
        Number of Faculty 
        Name of the Faculty1 
        Faculty id1 
        Name of the 
        Faculty2 Faculty id2
     Output Format:
        
        Name of the Faculty1 
        Faculty idi Values EL, ML and CL of Faculty1 
        Name of the Faculty2 
        Faculty id2 Values EL, ML and CL of Faculty2

* Create an array of 5 3d shape objects. Compute the volume of the five shapes using the concept of upcasting and dynamic polymorphism. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/inner_classPackages/shape_volume_upcasting.java)
     Input Format: 
        
        Enter radius and height of cone 
        Enter the length of cube 
        Enter the radius and height of cylinder 
        Enter the radius of sphere Enter the length, width and height of cuboid 
     Output Format: 
     
        Volume of cone 
        Volume of cube 
        Volume of cylinder 
        Volume of sphere 
        Volume of cuboid

* Create a class student and class guardian. Class student has a composition relationship with guardian class. A student can have many gaurdians (Max 3). For any given student registration number display all the guardian details. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/inner_classPackages/student_guardian_classCompostion.java)

* An employee has multiple instances of addresses. Every address has data members like Street, City, District, State, Country and Zip Code. Demonstrate using Nested classes how you will track the multiple address instances for an employee. The code should display the multiple address objects (nested class objects) for any given employee. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/inner_classPackages/employee_address_nestedClass.java)

* Write a program to demonstrate the knowledge of students in working with user-defined packages and sub-packages. E.g., Within the package named 'primespackage', define a class Primes which includes a method checkFor Prime() for checking if the given number is prime or not. Define another class named TwinPrimes outside of this package which will display all the pairs of prime numbers whose difference is 2. (e.g., within the range 1 to 10, all possible twin prime numbers are (3, 5), (5, 7)). The TwinPrimes class should make use of the checkFor Prime() method in the Primes class. -- [Answer_link 1](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/inner_classPackages/primespackage/Primes.java) [Answer_link 2](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/inner_classPackages/twinprimes/TwinPrimes.java)


## Inheritance & Interface
* Write a program to create three classes Vehicle and Car and Truck. Car and Truck class is.. inherited from Vehicle class. Write a method "show in all three classes to display the Vehicle, Car and truck details. Write suitable constructors. Use super and super wherever necessary. Use atleast 2 instance variables in every class. Also, include a method in Car class to list out all the Cars which give mileage >30. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/inheritance_interface/vehicle_car_truck.java)

* Write an interface called Exam with a method Pass that returns the total marks. Write another interface called Classify with a method Average (int total) which returns a string. Write a Class called Result which implements both Exam and Classify. The Pass method should get the marks from the user and finds the total marks and return. The Division method calculate the average marks and return "First” if the average is 60 or more, "SECOND" when average is 50 or more but below 60, "NO DIVISION" when average is less than 50. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/inheritance_interface/Exam_pass_avg_division.java)

* Write an abstract class special with an abstract method double Process (double P.double R). Create a subclass Discount and implement the Process method with the following formula: net=P-P*R/100. Return the Process method with the following formula: total=P+P*R/100. Return the total. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/498fd5da18d486816505c83d49d5c6964a508ae1/inheritance_interface/discount.java)


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
* Write a java program for the following:Make an arraylist containing a few Strings. Sort it by -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/2e80979261154f1bb65b2e353d89752aa6b0d3fd/collections/String_ArrayList_collection.java)

        • Length (i.e., shortest to longest) 
        • Reverse length (i.e., longest to shortest) 
        • Alphabetically by the first character only 
        • Strings that contain "e" first, everything else second. For now, put the code directly in the Lambda 

* Write a java program using Lambda to "capitalize" a string. Change the first letter of each word in the string to upper case (if it is not already upper case). For example, a capitalized version of "vellore institute of technology" is "Vellore Institute Of Technology". Write a method named printCapitalized that will print a capitalized version of a string to standard output. The string to be printed should be a parameter to the method. Test your method with a main routine that gets a line of input from the user and applies the method to it. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/2e80979261154f1bb65b2e353d89752aa6b0d3fd/collections/CapitalizeFirstChar_Lambda_Collection.java)

* Write a java program to create class Books with the data members book name, author, price, type(fiction, comic, cooking). Use input methods to get the input values. Create three array list (fiction, comic and cooking). -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/2e80979261154f1bb65b2e353d89752aa6b0d3fd/collections/Fiction_ArrayList_Collection.java)

       a. Depending upon the type of the book, insert the book object into the respective list. 
       b. Display the list of books in each type. 
       c. Sort the list of books in each list with respect to their book name. 
       d. Display the min and max priced books of each list.

* Assume only a maximum of 3 courses can be registered by a student for week end semester classes. Create a hashmap 'h1' with 'n' key-value pairs where keys are the names of students and values are the courses registered by them. Create another hashmap 'h2' with 'm'key-value pairs where keys are the names of courses offered for B.Tech and values are the names of faculty handling the courses. Write appropriate code to -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/2e80979261154f1bb65b2e353d89752aa6b0d3fd/collections/courseFaculty_HashMap.java)

        - Add or remove a student from h1 
        - Iterate over the maps and display the key-value pairs stored in them 
        - Given a student name, fetch the names of all those who teach him/her Eg, if the elements of h1 are
        | Stud name     | Course Registered  |
        | ------------- |-------------------:|
        | A             | Python, maths, C   |
        | B             | C, C++             |
        | C             | physics, chemistry |
        -------------------------------------
        | Course name   | Faculty           |
        | ------------- |------------------:|
        | C             | aaa               |
        | C++           | bbb               |
        | Java          | ccc               |
        | Python        | ddd               |
        --> For student B, it has to display the faculty aaa & bbb.


## Exception Handling
* Create a program to take input from user as 1/2/3, if user enters 1, display info about Arithmetic Exception, 2 and 3 for Null pointer exception and Array index out of bound exception, respectively. Use, Try, Catch block for each exception individually. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/4b951229781119f4872733d52708b7ed6f9b81b5/exception_handling/userInput_tryCatch.java)

* Professors are allowed to enter marks for students. Professors can enter only marks between 0 and 100. Anything entered below 0 or above 100 is considered to be an exception.
Write a program that receives an array of marks from Professor. If the marks fail to satisfy the criteria then handle them as exceptions. Apply Exception handling where ever necessary in this program. -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/4b951229781119f4872733d52708b7ed6f9b81b5/exception_handling/professorMarksException.java)

* Create a user defined exception class by extending exception class to handle two kind of scenario, where 
            
            (1) input cannot be zero or negative. 
            (2) input cannot be in the range 50 to 100 
  Throw object of user defined exception class and handle it by using nested try block with specific exceptions catch block. Also define finally block in the program.  -- [Answer_link](https://github.com/aryanchandrakar/Java/blob/4b951229781119f4872733d52708b7ed6f9b81b5/exception_handling/senarioExceptionCatch.java)


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
