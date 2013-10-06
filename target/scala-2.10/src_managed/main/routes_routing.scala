// @SOURCE:C:/Users/User1/Desktop/PlayResponsiveKamanu/conf/routes
// @HASH:ee450690f73a6491cb2fd828bac8c4769abbef3e
// @DATE:Wed Oct 02 04:53:24 HST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_pueo1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pueo"))))
        

// @LINE:8
private[this] lazy val controllers_Application_aukahi2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("aukahi"))))
        

// @LINE:9
private[this] lazy val controllers_Application_kamanu3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("kamanu"))))
        

// @LINE:10
private[this] lazy val controllers_Application_store4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("store"))))
        

// @LINE:11
private[this] lazy val controllers_Application_about5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
        

// @LINE:14
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pueo""","""controllers.Application.pueo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """aukahi""","""controllers.Application.aukahi()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """kamanu""","""controllers.Application.kamanu()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """store""","""controllers.Application.store()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""controllers.Application.about()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_pueo1(params) => {
   call { 
        invokeHandler(controllers.Application.pueo(), HandlerDef(this, "controllers.Application", "pueo", Nil,"GET", """""", Routes.prefix + """pueo"""))
   }
}
        

// @LINE:8
case controllers_Application_aukahi2(params) => {
   call { 
        invokeHandler(controllers.Application.aukahi(), HandlerDef(this, "controllers.Application", "aukahi", Nil,"GET", """""", Routes.prefix + """aukahi"""))
   }
}
        

// @LINE:9
case controllers_Application_kamanu3(params) => {
   call { 
        invokeHandler(controllers.Application.kamanu(), HandlerDef(this, "controllers.Application", "kamanu", Nil,"GET", """""", Routes.prefix + """kamanu"""))
   }
}
        

// @LINE:10
case controllers_Application_store4(params) => {
   call { 
        invokeHandler(controllers.Application.store(), HandlerDef(this, "controllers.Application", "store", Nil,"GET", """""", Routes.prefix + """store"""))
   }
}
        

// @LINE:11
case controllers_Application_about5(params) => {
   call { 
        invokeHandler(controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Nil,"GET", """""", Routes.prefix + """about"""))
   }
}
        

// @LINE:14
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     