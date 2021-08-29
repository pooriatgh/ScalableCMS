
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""

    """),format.raw/*5.5*/("""<h2>Comet Clock</h2>
    <div>
        <div><a href=""""),_display_(/*7.24*/routes/*7.30*/.ScalaCometController.index()),format.raw/*7.59*/("""">Scala Comet</a></div>
    </div>


    <h2>Server Sent Event Clock</h2>
    <div>
        <div><a href=""""),_display_(/*13.24*/routes/*13.30*/.ScalaEventSourceController.index()),format.raw/*13.65*/("""">Scala EventSource</a></div>
    </div>
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: bf393b33052d6a274dd86de7d49cf9914734bea8
                  MATRIX: 722->1|818->4|845->6|856->10|894->12|926->18|1006->72|1020->78|1069->107|1203->214|1218->220|1274->255|1346->297
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|31->7|31->7|31->7|37->13|37->13|37->13|39->15
                  -- GENERATED --
              */
          