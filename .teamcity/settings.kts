import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2021.2"

project {

    vcsRoot(Dd)
    vcsRoot(HttpsGithubComChubatovaTigerChubatovaGradleTestsBackup)

    buildType(A)
    buildType(B)
}

object A : BuildType({
    name = "a"

    steps {
                script {
            name = "nameptch13" //comment
            scriptContent = "ptch3001" //comment
        }
        script {
            name = "nameptch12 (1)"
            scriptContent = "ptch3001"
        }
        script {
            name = "nameptch12"
            scriptContent = "ptch3002"
        }
        script {
            scriptContent = "echo acds"
        }
        script {
            scriptContent = "sss"
        }
        script {
            name = "nameptch"
            scriptContent = "ptch3"
            formatStderrAsError = true
        }
        script {
            name = "nameptch3"
            scriptContent = "ptch3"
            formatStderrAsError = true
        }
        script {
            name = "nameptch5"
            scriptContent = "ptch3"
            formatStderrAsError = true
        }
        script {
            scriptContent = "ыы"
        }
    }
})

object B : BuildType({
    name = "b2"

    steps {
        script {
            scriptContent = "a"
        }
    }
})

object Dd : GitVcsRoot({
    name = "dd"
    url = "dd"
    branch = "master"
    checkoutPolicy = GitVcsRoot.AgentCheckoutPolicy.NO_MIRRORS
})

object HttpsGithubComChubatovaTigerChubatovaGradleTestsBackup : GitVcsRoot({
    name = "https://github.com/ChubatovaTiger/ChubatovaGradleTestsBackup"
    url = "https://github.com/ChubatovaTiger/ChubatovaGradleTestsBackup"
    param("useAlternates", "")
})
