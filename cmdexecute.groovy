def command = "git rev-parse --abbrev-ref HEAD"
def proc = command.execute()
proc.waitFor()
println "process exit value:${proc.exitValue()}"
println "Error:${proc.err.text}"
println "output:${proc.in.text}"
