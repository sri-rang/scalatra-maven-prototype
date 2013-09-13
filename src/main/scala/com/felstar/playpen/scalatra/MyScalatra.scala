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
  
}