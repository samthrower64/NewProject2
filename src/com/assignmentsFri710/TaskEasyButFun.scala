package com.assignmentsFri710

import com.assignmentsFri710.TaskEasyButFun.a

import scala.collection.mutable

class StringIns {
  def randomStringFromCharList(length: Int, chars: Seq[Char]): Unit = {
    val sb = new StringBuilder
    for (i <- 1 to length) {
      val randomNum = util.Random.nextInt(chars.length)
      sb.append(chars(randomNum))
    }
    sb.toString
    println(sb)
  }

  def randomAlphaNumericString(length: Int): Unit = {
    val chars = ('a' to 'z')
    randomStringFromCharList(length, chars)
  }
  def copyString(): Unit = {
    val newString = Array(a)
  }
}

object TaskEasyButFun extends App {
  var a = new StringIns()
  a.randomAlphaNumericString(5)
  a.copyString()
}

/*
given two strings s and t

string t is generated by random shuffling of string s then adding
one more letter to t at a random position

return the letter that was added to t

e.g.
s  = "abcd"
t = "abcde"
output e

length 0-1000
t.length = s.length+1
s and t all lowercase
 */