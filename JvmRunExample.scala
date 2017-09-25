package org.supalogix

// A simple jvm binary to test the jvm_run task on. Try, e.g.,
// ./pants -ldebug run --jvm-run-jvm-options='-Dfoo=bar' --jvm-run-jvm-program-args="Foo Bar" \\
//   examples/src/scala/org/pantsbuild/example:jvm-run-example


object JvmRunExample {
  def main(args: Array[String]) {
    println("Hello, World")
  }
}