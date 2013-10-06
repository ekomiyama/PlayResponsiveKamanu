
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object Main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.31*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>PlayResponsiveKamanu</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
        
        <!--  Load site-specific customizations after bootstrap. -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/main.css"))),format.raw/*12.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png"))),format.raw/*13.97*/("""">
        
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.2/html5shiv.js"></script>
          <script src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.2.0/respond.js"></script>
        <![endif]-->
    </head>
    <body>
    
     <!-- Responsive navbar -->
  <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <!--  Display three horizontal lines when navbar collapsed. -->
          <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href=""""),_display_(Seq[Any](/*31.40*/routes/*31.46*/.Application.index())),format.raw/*31.66*/(""""><img src=""""),_display_(Seq[Any](/*31.79*/routes/*31.85*/.Assets.at("images/header-logo.jpg"))),format.raw/*31.121*/(""""></a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
          <li class=""""),_display_(Seq[Any](/*35.23*/("active".when(page == "store")))),format.raw/*35.55*/(""""><a href=""""),_display_(Seq[Any](/*35.67*/routes/*35.73*/.Application.store())),format.raw/*35.93*/("""">Store</a></li>
          <li class=""""),_display_(Seq[Any](/*36.23*/("active".when(page == "pueo")))),format.raw/*36.54*/(""""><a href=""""),_display_(Seq[Any](/*36.66*/routes/*36.72*/.Application.pueo())),format.raw/*36.91*/("""">Pueo</a></li>
          <li class=""""),_display_(Seq[Any](/*37.23*/("active".when(page == "aukahi")))),format.raw/*37.56*/(""""><a href=""""),_display_(Seq[Any](/*37.68*/routes/*37.74*/.Application.aukahi())),format.raw/*37.95*/("""">Aukahi</a></li>
          <li class=""""),_display_(Seq[Any](/*38.23*/("active".when(page == "kamanu")))),format.raw/*38.56*/(""""><a href=""""),_display_(Seq[Any](/*38.68*/routes/*38.74*/.Application.kamanu())),format.raw/*38.95*/("""">Kamanu V6</a></li>
          <li class=""""),_display_(Seq[Any](/*39.23*/("active".when(page == "about")))),format.raw/*39.55*/(""""><a href=""""),_display_(Seq[Any](/*39.67*/routes/*39.73*/.Application.about())),format.raw/*39.93*/("""">About</a></li>
        </ul>
      </div>
    </div>
  </div>
      """),_display_(Seq[Any](/*44.8*/content)),format.raw/*44.15*/("""
      <!-- Load Bootstrap JavaScript components. HTMLUnit (used in testing) requires JQuery 1.8.3 or below). -->
      <script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
      <script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    </body>
</html>
"""))}
    }
    
    def render(page:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(page)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (page) => (content) => apply(page)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Oct 02 04:53:24 HST 2013
                    SOURCE: C:/Users/User1/Desktop/PlayResponsiveKamanu/app/views/Main.scala.html
                    HASH: 61bdc05c2d3c928f5f7632e852a1a823cd7252b3
                    MATRIX: 778->1|901->30|1336->429|1351->435|1407->469|1504->530|1519->536|1573->568|2496->1455|2511->1461|2553->1481|2602->1494|2617->1500|2676->1536|2835->1659|2889->1691|2937->1703|2952->1709|2994->1729|3069->1768|3122->1799|3170->1811|3185->1817|3226->1836|3300->1874|3355->1907|3403->1919|3418->1925|3461->1946|3537->1986|3592->2019|3640->2031|3655->2037|3698->2058|3777->2101|3831->2133|3879->2145|3894->2151|3936->2171|4042->2242|4071->2249
                    LINES: 26->1|29->1|40->12|40->12|40->12|41->13|41->13|41->13|59->31|59->31|59->31|59->31|59->31|59->31|63->35|63->35|63->35|63->35|63->35|64->36|64->36|64->36|64->36|64->36|65->37|65->37|65->37|65->37|65->37|66->38|66->38|66->38|66->38|66->38|67->39|67->39|67->39|67->39|67->39|72->44|72->44
                    -- GENERATED --
                */
            