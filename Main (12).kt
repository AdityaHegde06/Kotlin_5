/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Sywift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//EXERCISE 1 :DISPLAYING  ARRAY DATA IN LISTVIEW
fun main() {

//DEFINE ARRAYM OF ITEMS

 val fruits = arrayOf("Apple","Bananna","Cherry", "Data","Blueberry")
 
 val adapter =  arrayAdapter(this, android.R.layout.simple_list_item_1, fruits)
 listView.adapter = adapter
    
    
    
}
