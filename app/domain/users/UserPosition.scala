package domain.users

import java.util.Date

import play.api.libs.json.Json

/**
  * Created by hashcode on 2016/01/07.
  */
case class PersonPosition(organisationId: String,
                          userId: String,
                          personPositionId: String,
                          statusDate: Date,
                          positionId: String,
                          statusId: String,
                          reason: String
                         )

object PersonPosition {
  implicit val personPosFmt = Json.format[PersonPosition]

}
