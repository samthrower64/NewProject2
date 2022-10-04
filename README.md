# What Have I learned Today?

### Firstly
Learned most of the basic syntax for using Scala, including Tuples. We went into further detail regarding the sizes of each datatype, ranging from 64bit to 8bit - Strings excluded as they depend on how long you make them!. We explained the importance of proper syntax within Scala, looking at the similarities to Java as well as the differences. Together, we also looked at the importance of certain syntax within Scala, so that we would be in tune with it when coding in the future.

### Then
We went on to learn about _Variables_, _Type Declaration_ as well as _Immutable/Mutable variables_

### After That
We learned about simple mathematical functions, as well as creating a program that returned if a number was __odd__ or __even__

### Post-Lunch Break
We then went to talk about ___For___ Loops, ___While___ Loops, ___If/Else conditionals___ as well as the ForEach function.

#### Extras I found on Google
I found out how to store a user input and also reference the variable it is store in within a String as well as an output/println
See below:
```
case object MatchNumbers extends App{
  println("Type Your Number: ")
  var a: Int = scala.io.StdIn.readInt
  a = (a%2)
  //find remainder of users input divided by two, set as new variable
  a match {
    case 0=>println(s"Your number is divisible by 2, giving remainder $a")
    case 1=>println(s"Your number is not divisible by 2, giving remainder $a")
    case 2=>println(s"Your number is not divisible by 2, giving remainder $a")
    case 3=>println(s"Your number is not divisible by 2, giving remainder $a")
  }
}
```
