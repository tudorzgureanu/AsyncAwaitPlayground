package com.ted.playground.async

import org.scalatest.{AsyncFunSuite, Matchers}

class AsyncFailedFuturesSamplesTest extends AsyncFunSuite with Matchers {

  import AsyncFailedFuturesSamples._

  test("first future failed") {
    recoverToExceptionIf[Exception](failedFutureComputation1).map { ex =>
      ex.getMessage shouldBe "the future is not bright"
    }
  }

  test("second future failed") {
    recoverToExceptionIf[Exception](failedFutureComputation2).map { ex =>
      ex.getMessage shouldBe "the future is not bright"
    }
  }

}
