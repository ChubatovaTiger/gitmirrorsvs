package Gitmirrors.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Gitmirrors_HttpsGithubComChubatovaTigerGitmirrorsvs : GitVcsRoot({
    uuid = "68f3d82c-2d21-4a09-a749-b5cc02b8f8e3"
    name = "https://github.com/ChubatovaTiger/gitmirrorsvs"
    url = "https://github.com/ChubatovaTiger/gitmirrorsvs"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "ChubatovaTiger"
        password = "credentialsJSON:e9eab552-f6b1-45b6-b57d-f4fc4b21e93c"
    }
})
