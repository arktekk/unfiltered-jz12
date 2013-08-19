package jz

object Run extends App {
  unfiltered.jetty.Http(8080)
    .filter(new Jz)
    .run()
}
