/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2009, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id:Unknown.scala 6853 2006-03-20 16:58:47 +0100 (Mon, 20 Mar 2006) dubochet $


package scala.dbc.value;


abstract class Unknown extends Value {
  
  val dataType: datatype.Unknown;
  
  def sqlString = error ("An 'ANY' value cannot be represented.");
  
}

object UnknownType {

  def view (obj:value.Unknown): AnyRef = obj.nativeValue;

}
