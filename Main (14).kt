/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

//playing with the strings
fun main() {
    
    //Get the user name full anme
    println("Enter your full name (First Last):")
    val fullName = readLine() ?:""
    
    //SPLIT NAME INTO PARTS
    
    val nameParts = fullName.split(" ")
    val firstName = nameParts.getOrNull(0)?:""
    val lastName = nameParts.getOrNull(1)?:""
    
    
    
    
    //CONVERT TO UPPERCASE
    
    val upperCase = fullName.uppercase()
    
    //CONVERT TO LOWERCASE
    val lowerCaseName= fullName.lowercase()
    
    
   // Additional outputs
    println("Uppercase: $upperCase")
    println("Lowercase: $lowerCaseName")
    
    
    //extract and display  first and last nameParts
    println("First Name: $firstName ")
    println("Last Name : $lastName")
    
    //DISPLAY IN FORMATED WAY LAST NAME AND FIRSTNAME 
    
    val formattedName = "$lastName,$firstName"
    println("Formatted Name: $formattedName")
    
    
    
       //DISPLAY INTIALS
       
       
       val intials = "${firstName.firstOrNull() ?: ""} ${lastName.firstOrNull() ?: ""}"
      println("Initials: $initials")
       }
