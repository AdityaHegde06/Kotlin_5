/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
fun reverseString(input:String):String {

return input.reversed()    
  
}

fun main()
{
       
       val orignal ="Kotlin"
       val reversed = reverseString(orignal)
       println("Orignal : $orignal")
       println("Reversed : $reversed")
}


