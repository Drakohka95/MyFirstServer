package com.jcg.examples.playscala.controllers


import javax.inject.Inject

import play.api.mvc.InjectedController

class HelloWorldController @Inject() extends InjectedController {

  def helloworld = Action {
    Ok(com.jcg.examples.playscala.views.html.helloworld("Dear JCG Readers, Welcome to HelloWorld!"))
  }

}

