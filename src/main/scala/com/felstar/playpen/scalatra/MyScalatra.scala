package com.felstar.playpen.scalatra

import org.scalatra._
import java.net.URL
import org.scalatra.scalate.ScalateSupport


class MyScalatra extends ScalatraServlet with ScalateSupport {

  get("/") {
    <html>
     <h1>Hello, world!</h1>
     <a href="woof">Try an SSP Page</a>
	</html>
  }
  
   get("/woof") {
     contentType="text/html"
    ssp("woof.ssp","date" -> new java.util.Date)
  } 
  
  case class Flower(slug: String, name: String) {
    def toXML= <flower name={name}>{slug}</flower>
  }
  
   val all = List(
      Flower("yellow-tulip", "Yellow Tulip"),
      Flower("red-rose", "Red & Rose"),
      Flower("black-rose", "Black Rose"))
   
  get("/flowers"){
     contentType="text/xml"
    <flowers> 
      { all.map(_.toXML) }
     </flowers>
  } 
   
}