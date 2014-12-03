package controllers

import play.api.mvc.{ Action, Controller }

object Application extends Controller {
  def index = Action {
    Ok(views.html.index("The Morgantown Multi-User Dungeon"))
  }

  def features = Action {
    Ok(views.html.features("Feature List"))
  }

  def screenshots = Action {
    Ok(views.html.screenshots("Screenshots"))
  }

  def announcements = Action {
    Ok(views.html.announcements("Announcements"))
  }

  def aboutUs = Action {
    Ok(views.html.aboutUs("About the Developers"))
  }
  
  def projectSummary = Action {
    Ok(views.html.projectSummary("Project Summary"))
  }
}