package controllers

import com.ning.http.client.oauth.{ConsumerKey, RequestToken}
import play.api.{Configuration, Play}

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.Future

class HomeController @Inject() (cc: ControllerComponents, config: Configuration)
    extends AbstractController(cc) {

  def index() =
    Action {
      Ok(views.html.index())
    }
  def tweets =
    Action {
      Ok
    }
}
