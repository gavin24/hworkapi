package controllers.training

import javax.inject.Inject

import controllers.common.util.MailController
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._

/**
 * Created by gavin.ackerman on 2016-12-04.
 */
class CourseInstructorRouter @Inject()
(courseInstructor: CourseInstructorController)
  extends SimpleRouter {
  override def routes: Routes = {
    case GET(p"/courseinstructor/$org") =>
      courseInstructor.getCourseInstructors(org)
    case POST(p"/courseinstructor/create") =>
      courseInstructor.createOrUpdate
  }
}