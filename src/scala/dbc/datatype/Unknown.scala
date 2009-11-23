/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2009, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id: Unknown.scala 16894 2009-01-13 13:09:41Z cunei $


package scala.dbc.datatype;


/** The SQL type for a truth value. */
class Unknown extends DataType {
  
  def isEquivalent(datatype: DataType) = datatype match {
    case dt: Unknown =>
      nativeTypeId == dt.nativeTypeId
    case _ =>
      false
  }

  def isSubtypeOf(datatype: DataType) = true;

  type NativeType = AnyRef;
  val nativeTypeId = DataType.OBJECT;

  /** A SQL-99 compliant string representation of the type. */
  override def sqlString: java.lang.String =
    error("The 'UNKNOWN' data type cannot be represented.");

}