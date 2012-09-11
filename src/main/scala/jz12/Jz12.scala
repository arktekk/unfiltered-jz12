package jz12

import unfiltered.filter.Plan
import unfiltered.response._
import unfiltered.request._
import xml.NodeSeq

class Jz12 extends Plan {

  val incogito = Incogito.fromUrl("http://javazone.no/incogito10/rest/events")
  
  def intent = {
    case Path("/") => 
      Html5(Bootstrap("Hello World", <h1>Hello World</h1>))
  }
}

object Bootstrap {
  def apply(title: String, body: NodeSeq) =
    <html>
      <head>
        <title>
          {title}
        </title>
        <link href="/css/bootstrap.min.css" rel="stylesheet"/>
      </head>
      <body>
        {body}<script src="http://code.jquery.com/jquery-latest.js"></script>
        <script src="/js/bootstrap.min.js"></script>
      </body>
    </html>
}


