package controllers

import controllers.models._
import spray.json.{RootJsonFormat, DefaultJsonProtocol}

object ModelJsonProtocol extends DefaultJsonProtocol {
  implicit val appFormat = jsonFormat6(CFApplication)
  implicit val appDetailFormat = jsonFormat7(CFApp)
  implicit val appLogFormat = jsonFormat5(CFAppLog)
  implicit val appEventFormat = jsonFormat8(CFAppEvent)
  implicit val timestampFormat = jsonFormat2(Updated)
}
