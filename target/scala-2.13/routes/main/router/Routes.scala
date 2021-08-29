// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:10
  ScalaCometController_0: controllers.ScalaCometController,
  // @LINE:13
  ScalaEventSourceController_3: controllers.ScalaEventSourceController,
  // @LINE:17
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:10
    ScalaCometController_0: controllers.ScalaCometController,
    // @LINE:13
    ScalaEventSourceController_3: controllers.ScalaEventSourceController,
    // @LINE:17
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, ScalaCometController_0, ScalaEventSourceController_3, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, ScalaCometController_0, ScalaEventSourceController_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tweets""", """controllers.HomeController.tweets()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scala/comet""", """controllers.ScalaCometController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scala/comet/liveClock""", """controllers.ScalaCometController.streamClock()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scala/eventSource""", """controllers.ScalaEventSourceController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """scala/eventSource/liveClock""", """controllers.ScalaEventSourceController.streamClock()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_tweets1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tweets")))
  )
  private[this] lazy val controllers_HomeController_tweets1_invoker = createInvoker(
    HomeController_2.tweets(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tweets",
      Nil,
      "GET",
      this.prefix + """tweets""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ScalaCometController_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scala/comet")))
  )
  private[this] lazy val controllers_ScalaCometController_index2_invoker = createInvoker(
    ScalaCometController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScalaCometController",
      "index",
      Nil,
      "GET",
      this.prefix + """scala/comet""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ScalaCometController_streamClock3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scala/comet/liveClock")))
  )
  private[this] lazy val controllers_ScalaCometController_streamClock3_invoker = createInvoker(
    ScalaCometController_0.streamClock(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScalaCometController",
      "streamClock",
      Nil,
      "GET",
      this.prefix + """scala/comet/liveClock""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ScalaEventSourceController_index4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scala/eventSource")))
  )
  private[this] lazy val controllers_ScalaEventSourceController_index4_invoker = createInvoker(
    ScalaEventSourceController_3.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScalaEventSourceController",
      "index",
      Nil,
      "GET",
      this.prefix + """scala/eventSource""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ScalaEventSourceController_streamClock5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("scala/eventSource/liveClock")))
  )
  private[this] lazy val controllers_ScalaEventSourceController_streamClock5_invoker = createInvoker(
    ScalaEventSourceController_3.streamClock(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ScalaEventSourceController",
      "streamClock",
      Nil,
      "GET",
      this.prefix + """scala/eventSource/liveClock""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Assets_at6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index())
      }
  
    // @LINE:8
    case controllers_HomeController_tweets1_route(params@_) =>
      call { 
        controllers_HomeController_tweets1_invoker.call(HomeController_2.tweets())
      }
  
    // @LINE:10
    case controllers_ScalaCometController_index2_route(params@_) =>
      call { 
        controllers_ScalaCometController_index2_invoker.call(ScalaCometController_0.index())
      }
  
    // @LINE:11
    case controllers_ScalaCometController_streamClock3_route(params@_) =>
      call { 
        controllers_ScalaCometController_streamClock3_invoker.call(ScalaCometController_0.streamClock())
      }
  
    // @LINE:13
    case controllers_ScalaEventSourceController_index4_route(params@_) =>
      call { 
        controllers_ScalaEventSourceController_index4_invoker.call(ScalaEventSourceController_3.index())
      }
  
    // @LINE:14
    case controllers_ScalaEventSourceController_streamClock5_route(params@_) =>
      call { 
        controllers_ScalaEventSourceController_streamClock5_invoker.call(ScalaEventSourceController_3.streamClock())
      }
  
    // @LINE:17
    case controllers_Assets_at6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(Assets_1.at(path, file))
      }
  }
}
