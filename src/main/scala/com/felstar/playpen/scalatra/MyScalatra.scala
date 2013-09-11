package com.felstar.playpen.scalatra

import org.scalatra._
import java.net.URL
import org.scalatra.scalate.ScalateSupport

class MyScalatra extends ScalatraServlet with ScalateSupport {
  get("/") {
    <h1>Hello, world! Me !!!xxx</h1>
  }
   get("/woof") {
    <h1>Woof!!!!!!zzzx</h1>
  }
   /*
   notFound {
    // If no route matches, then try to render a Scaml template
    val templateBase = requestPath match {
      case s if s.endsWith("/") => s + "index"
      case s => s
    }
    val templatePath = "/WEB-INF/scalate/templates/" + templateBase + ".scaml"
    servletContext.getResource(templatePath) match {
      case url: URL => 
        contentType = "text/html"
        templateEngine.layout(templatePath)    
    } 
  }
  * */
  
}
