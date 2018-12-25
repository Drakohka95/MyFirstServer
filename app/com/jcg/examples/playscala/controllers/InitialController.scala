package com.jcg.examples.playscala.controllers

import javax.inject.Inject

import play.api.mvc.InjectedController

class InitialController @Inject() extends InjectedController {

  def initial = Action {
    Ok(com.jcg.examples.playscala.views.html.initial("Вы на стартовой страничке"))
  }

}
