package jz

import unfiltered.filter.Plan
import unfiltered.response._
import unfiltered.request._
import xml.NodeSeq

class Jz extends Plan {

  val incogito = Incogito.fromUrl("http://javazone.no/incogito10/rest/events")
  
  def intent = {
    case Path("/") => Html5(Bootstrap("Events",
      <ul>{ <li>List Events!</li> }</ul>))
  }
}

object Bootstrap {
  def assets = "http://getbootstrap.com/2.3.2/assets"
  
  def apply(title: String, body: NodeSeq) =
    <html>
      <head>
        <title>
          {title}
        </title>
        <link href={assets+"/css/bootstrap.css"} rel="stylesheet"/>
        <link href={assets+"/css/bootstrap-responsive.css"} rel="stylesheet"/>
      </head>
      <body>
        {body}
        <script src="http://code.jquery.com/jquery-latest.js"> </script>
        <script src={assets+"/js/jquery.js"}> </script>
        <script src={assets+"/js/bootstrap-transition.js"}> </script>
        <script src={assets+"/js/bootstrap-alert.js"}> </script>
        <script src={assets+"/js/bootstrap-modal.js"}> </script>
        <script src={assets+"/js/bootstrap-dropdown.js"}> </script>
        <script src={assets+"/js/bootstrap-scrollspy.js"}> </script>
        <script src={assets+"/js/bootstrap-tab.js"}> </script>
        <script src={assets+"/js/bootstrap-tooltip.js"}> </script>
        <script src={assets+"/js/bootstrap-popover.js"}> </script>
        <script src={assets+"/js/bootstrap-button.js"}> </script>
        <script src={assets+"/js/bootstrap-collapse.js"}> </script>
        <script src={assets+"/js/bootstrap-carousel.js"}> </script>
        <script src={assets+"/js/bootstrap-typeahead.js"}> </script>
        <script src={assets+"/js/bootstrap-affix.js"}> </script>
        <script src={assets+"/js/holder/holder.js"}> </script>
      </body>
    </html>
}


