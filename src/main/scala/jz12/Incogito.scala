package jz12

import dispatch._
import net.liftweb.json._
import org.joda.time.DateTime
import xml.Unparsed

object Json {
  def apply[A](f:JValue => A) = f compose parse
  
  implicit val formats = DefaultFormats
}

import Json.formats

object Incogito {
  def fromUrl(base:String) = 
    Http(url(base) <:< Map("Accept" -> "application/json") >- Json(_.extract[Incogito]))   
}

case class Incogito(events:List[Event])

case class Event(selfUrl:String, id:String, name:String, labels:List[Label], blurb:String, levels:List[Level]){
  lazy val sessions =
    Http(url(selfUrl + "/sessions") <:< Map("Accept" -> "application/json") >- Json(_.extract[Sessions]))
}

case class Sessions(sessions:List[Session])

case class Session(id: String,
                   format: String,
                   level: Level,
                   labels: List[Label],
                   room: String,
                   title: String,
                   speakers: List[Speaker],
                   selfUri: String,
                   bodyHtml: String, 
                   start:Time, 
                   end:Time){
  
  def body = Unparsed(bodyHtml)
}

case class Speaker(name:String, bioHtml:String, photoUrl:String){
  def bio = Unparsed(bioHtml)
}

case class Label(id:String, displayName:String, iconUrl:String)

case class Level(id:String, displayName:String, iconUrl:String)

case class Time(year:Int, month:Int, day:Int, hour:Int, minute:Int){
  lazy val date = new DateTime(year, month, day, hour, minute)
}
