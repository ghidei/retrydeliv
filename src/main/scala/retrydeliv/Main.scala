package retrydeliv

object Main extends App {

  val retryDeliv = new RetryDeliv
  retryDeliv.run()

  def verifyCorrectness(): Boolean = {
    retryDeliv.verifyPostWithoutAssert()
  }

}