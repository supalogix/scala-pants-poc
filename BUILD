scala_library(
  name = 'jvm-run-example-lib',
  dependencies = [ ],
  sources = [ 'JvmRunExample.scala' ]
)

jvm_binary(
  name ='jvm-run-example',
  main = 'org.supalogix.JvmRunExample',
  dependencies = [
      ':jvm-run-example-lib'
   ]
)