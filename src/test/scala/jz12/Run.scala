package jz12

import java.io.File

object Run extends App {
  unfiltered.jetty.Http(8080)
    .filter(new Jz12)
    .resources(new File("src/main/webapp/").toURI.toURL)
    .run()
}
