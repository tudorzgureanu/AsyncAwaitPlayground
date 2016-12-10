package com.ted.playground.async

import scala.concurrent.Future
import scala.async.Async._
import scala.concurrent.ExecutionContext.Implicits.global

object AsyncFailedFuturesSamples {

  val future1 = Future.successful(true)
  val future2 = Future.failed[Boolean](new Exception("the future is not bright"))

  val failedFutureComputation1 = async {
    await(future2) & await(future1) //using strict version as short-circuit version is not supported yet
  }

  val failedFutureComputation2 = async {
    await(future1) & await(future2)
  }
}
