package com.ted.playground.async

import scala.async.Async._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object AsyncAPIComparison {

  val future1: Future[Int] = Future.successful(40)
  val future2: Future[Int] = Future.successful(2)

  val asyncComputation = async {
    await(future1) + await(future2)
  }

  val forComprehensionComputation =
    for {
      res1 <- future1
      res2 <- future2
    } yield res1 + res2

  val futureAPIComputation =
    future1.flatMap { res1 =>
      future2.map { res2 =>
        res1 + res2
      }
    }

}
