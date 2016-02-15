package controllers

import play.api.mvc.{Action, Controller}

class Index extends Controller {

  def index = Action {
    Ok(views.html.angular())
  }
}
