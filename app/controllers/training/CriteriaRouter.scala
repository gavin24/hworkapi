package controllers.training

import javax.inject.Inject

import controllers.common.util.MailController
import play.api.routing.Router.Routes
import play.api.routing.SimpleRouter
import play.api.routing.sird._
/**
 * Created by gavin.ackerman on 2016-12-04.
 */
class CriteriaRouter @Inject()
(criteriaController: CriteriaController)
  extends SimpleRouter {
  override def routes: Routes = {
    case GET(p"/criteria/$org") =>
      criteriaController.getCriteriaById(org)
    case POST(p"/criteria/create") =>
      criteriaController.createOrUpdate
  }
}