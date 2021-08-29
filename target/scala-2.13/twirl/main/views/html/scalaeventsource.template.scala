
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

object scalaeventsource extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""

    """),format.raw/*3.5*/("""<h1>Server Sent Event clock</h1>

    <h1 id="clock"></h1>

    <p>
        Clock events are pushed from the Server using a Server Sent Event connection.
    </p>

    <script type="text/javascript" charset="utf-8">

       if (!!window.EventSource) """),format.raw/*13.34*/("""{"""),format.raw/*13.35*/("""
         """),format.raw/*14.10*/("""var stringSource = new EventSource(""""),_display_(/*14.47*/routes/*14.53*/.ScalaEventSourceController.streamClock()),format.raw/*14.94*/("""");
         stringSource.addEventListener('message', function(e) """),format.raw/*15.63*/("""{"""),format.raw/*15.64*/("""
            """),format.raw/*16.13*/("""$('#clock').html(e.data.replace(/(\d)/g, '<span>$1</span>'))
         """),format.raw/*17.10*/("""}"""),format.raw/*17.11*/(""");
       """),format.raw/*18.8*/("""}"""),format.raw/*18.9*/(""" """),format.raw/*18.10*/("""else """),format.raw/*18.15*/("""{"""),format.raw/*18.16*/("""
         """),format.raw/*19.10*/("""$("#clock").html("Sorry. This browser doesn't seem to support Server sent event. Check <a href='http://html5test.com/compare/feature/communication-eventSource.html'>html5test</a> for browser compatibility.");
       """),format.raw/*20.8*/("""}"""),format.raw/*20.9*/("""
    """),format.raw/*21.5*/("""</script>
""")))}),format.raw/*22.2*/("""
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
                  SOURCE: app/views/scalaeventsource.scala.html
                  HASH: 9548ddd9478de6b7989e424d62f50a80a646d728
                  MATRIX: 822->1|833->5|871->7|903->13|1181->263|1210->264|1248->274|1312->311|1327->317|1389->358|1483->424|1512->425|1553->438|1651->508|1680->509|1717->519|1745->520|1774->521|1807->526|1836->527|1874->537|2117->753|2145->754|2177->759|2218->770
                  LINES: 26->1|26->1|26->1|28->3|38->13|38->13|39->14|39->14|39->14|39->14|40->15|40->15|41->16|42->17|42->17|43->18|43->18|43->18|43->18|43->18|44->19|45->20|45->20|46->21|47->22
                  -- GENERATED --
              */
          