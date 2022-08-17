import java.util.Scanner
import java.util.ArrayList
import java.util.Objects.checkIndex
fun main(args: Array<String>) {
    print("Enter the size of list")
    val scn = Scanner(System.`in`)
    val n: Int = scn.nextInt()
    println("Please enter the names you want to put in the list")
    val scanner=Scanner(System.`in`)
    val listOfNames = mutableListOf<String>()
    for (i in 0 until n){
    var new=scanner.nextLine()
    listOfNames.add(new)
    }

    val filteredList=listOfNames.filter {
        it.contains("b") || it.contains("m") || it.contains("B") || it.contains("M")
    }
    for(i in 0 until n)
    {
        println(filteredList[i].uppercase())
    }

}




